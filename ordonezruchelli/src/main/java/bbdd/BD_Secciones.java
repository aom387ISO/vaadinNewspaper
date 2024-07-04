package bbdd;

import bbdd.BDPrincipal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;

public class BD_Secciones {
	public BDPrincipal _bd_prin_sec;
	public Vector<Seccion> _contiene_secciones = new Vector<Seccion>();

	public void anadirNoticiaSeccion(int aIdNoticia, String aIdSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Noticia noticia = NoticiaDAO.loadNoticiaByORMID(aIdNoticia);
			Seccion seccion = SeccionDAO.loadSeccionByQuery("Nombre = '"+aIdSeccion+"'", null);
			if (noticia != null && seccion != null) {
//				seccion.se_encuentra.add(noticia);
				if(!noticia.esta_contenida.contains(seccion) && seccion.getNombre().equals("portada")) {
					anadirAportada(seccion, aIdNoticia);
					Notification.show("Noticia añadida a la portada").addThemeVariants(NotificationVariant.LUMO_SUCCESS);
				}else if(!noticia.esta_contenida.contains(seccion)) {
					noticia.esta_contenida.add(seccion);
					SeccionDAO.save(seccion);
					Notification.show("Noticia añadida a sección").addThemeVariants(NotificationVariant.LUMO_SUCCESS);
					t.commit();
				}else {
					Notification.show("Ya está incluida la noticia").addThemeVariants(NotificationVariant.LUMO_ERROR);
				}
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void eliminarNoticiaSeccion(int aIdNoticia, int aIdSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Noticia noticia = NoticiaDAO.loadNoticiaByORMID(aIdNoticia);
			Seccion seccion = SeccionDAO.loadSeccionByORMID(aIdSeccion);
			if (noticia != null && seccion != null) {
				noticia.esta_contenida.remove(seccion);
				SeccionDAO.save(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void crearSeccion(String aNombreSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Seccion seccion = SeccionDAO.createSeccion();
			SeccionCriteria criteria = new SeccionCriteria();
			Seccion[] secciones = SeccionDAO.listSeccionByCriteria(criteria);
			int id = 0;
			Seccion seccionExistente = SeccionDAO.loadSeccionByQuery("Nombre = '"+aNombreSeccion+"'", null);
	        if (seccionExistente != null) {
	            Notification notification = Notification.show("La sección con el nombre " + aNombreSeccion + " ya existe.");
	            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
	            t.rollback();
	            return;
	        }
	        
			for(Seccion seccionBusqueda : secciones) {
				if(seccionBusqueda.getIdSeccion() == id) {
				id++;
				}else {
					break;
				}
			}
			seccion.setIdSeccion(id);
			seccion.setNombre(aNombreSeccion);
			SeccionDAO.save(seccion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void anadirAportada(Seccion seccion, int aIdNoticia) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Noticia noticia = NoticiaDAO.loadNoticiaByORMID(aIdNoticia);
			if (noticia != null) {
				noticia.esta_contenida.add(seccion);
				int id = noticia.esta_contenida.size();
				noticia.setPosicionPortada(id);
				NoticiaDAO.save(noticia);
				SeccionDAO.save(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void cambiarPosicion(String aIdSeccion, int aIdNoticia, int aNuevaPosicion) throws PersistentException{
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
            Seccion[] secciones = SeccionDAO.listSeccionByQuery("Portada = true", null);

            if (secciones.length == 0) {
                return;
            }
            Seccion portada = secciones[0];

            Noticia noticia = NoticiaDAO.getNoticiaByORMID(aIdNoticia);
            
            
			if (noticia != null) {
				noticia.setPosicionPortada(aNuevaPosicion);
				NoticiaCriteria criteria = new NoticiaCriteria();
				Noticia[] noticias = NoticiaDAO.listNoticiaByCriteria(criteria);
		        List<Noticia> noticiaPortada = new ArrayList<>();
				for(Noticia noticiaBucle : noticias) {
					if(noticia.esta_contenida.contains(portada)) {
						noticiaPortada.add(noticiaBucle);
					}
				}
				noticiaPortada.sort((n1, n2) -> Integer.compare(n1.getPosicionPortada(), n2.getPosicionPortada()));
				noticiaPortada.remove(noticia);
				noticiaPortada.add(aNuevaPosicion - 1, noticia);

			       for (int i = 0; i < noticiaPortada.size(); i++) {
		                Noticia noticiaReordenada = noticiaPortada.get(i);
		                noticiaReordenada.setPosicionPortada(i + 1);
		                NoticiaDAO.save(noticiaReordenada);
		            }
				
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void cambiarNombreSeccion(String aIdSeccion, String aNuevoNombreSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Seccion seccion = SeccionDAO.loadSeccionByQuery("Nombre = '"+aIdSeccion+"'", null);
			if (seccion != null) {
				seccion.setNombre(aNuevoNombreSeccion);
				SeccionDAO.save(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void eliminarSeccion(String aIdSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Seccion seccion = SeccionDAO.loadSeccionByQuery("Nombre = '"+aIdSeccion+"'", null);
			if (seccion != null) {
				SeccionDAO.deleteAndDissociate(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}
	
    public Seccion[] cargarSecciones() throws PersistentException {
        PersistentTransaction t = null;
        try {
        	t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
            SeccionCriteria criteria = new SeccionCriteria();
            Seccion[] secciones = SeccionDAO.listSeccionByCriteria(criteria);
            t.commit();
            return secciones;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
            ProyectofinalPersistentManager.instance().disposePersistentManager();
        
        return new Seccion[0];
    }
    
    
    public Seccion cargarSeccionPorNombre(String nombreSeccion) throws PersistentException {
        PersistentTransaction t = null;
        try {
        	t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
            SeccionCriteria criteria = new SeccionCriteria();
			Seccion seccion = SeccionDAO.loadSeccionByQuery("Nombre = '"+nombreSeccion+"'", null);
            t.commit();
            return seccion;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
            ProyectofinalPersistentManager.instance().disposePersistentManager();
        
        return null;
    }
    
    public void eliminarDePortada(int aIdNoticia)throws PersistentException {
        PersistentTransaction t = null;

    	try {
        	t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();

            Seccion[] secciones = SeccionDAO.listSeccionByQuery("Portada = true", null);

            if (secciones.length == 0) {
                return;
            }
            Seccion portada = secciones[0];

            Noticia noticia = NoticiaDAO.getNoticiaByORMID(aIdNoticia);
            
				if(noticia.esta_contenida.contains(portada)) {
					noticia.esta_contenida.remove(portada);
					noticia.setPosicionPortada(0);
					NoticiaDAO.save(noticia);
					
					NoticiaCriteria criteria = new NoticiaCriteria();
					Noticia[] noticias = NoticiaDAO.listNoticiaByCriteria(criteria);
			        List<Noticia> noticiaPortada = new ArrayList<>();
					for(Noticia noticiaBucle : noticias) {
						if(noticia.esta_contenida.contains(portada)) {
							noticiaPortada.add(noticiaBucle);
						}
					}
				    for (int i = 0; i < noticiaPortada.size(); i++) {
				        Noticia noticiaNuevaPosicion = noticiaPortada.get(i);
				        noticia.setPosicionPortada(i + 1);
				        NoticiaDAO.save(noticiaNuevaPosicion);
				    }
				}
			

			t.commit();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        ProyectofinalPersistentManager.instance().disposePersistentManager();
    }
}
