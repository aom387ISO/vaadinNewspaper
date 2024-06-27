package bbdd;

import bbdd.BDPrincipal;

import java.util.HashSet;
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
				if(!noticia.esta_contenida.contains(seccion)) {
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

	public void anadirAportada(String aIdSeccion, int aIdNoticia) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Noticia noticia = NoticiaDAO.loadNoticiaByORMID(aIdNoticia);
			Seccion seccion = SeccionDAO.loadSeccionByQuery("nombre = 'portada'", null);
			if (noticia != null && seccion != null) {
				seccion.se_encuentra.add(noticia);
				SeccionDAO.save(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void cambiarPosicion(String aIdSeccion, int aIdNoticia, int aNuevaPosicion) throws PersistentException{
//		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
//		try {
//			Noticia noticia = NoticiaDAO.loadNoticiaByORMID(aIdNoticia);
//			Seccion seccion = SeccionDAO.loadSeccionByORMID(aIdSeccion);
//			if (noticia != null && seccion != null) {
//				
//				SeccionDAO.save(seccion);
//				t.commit();
//			}
//		} catch (Exception e) {
//			t.rollback();
//		}
//		ProyectofinalPersistentManager.instance().disposePersistentManager();

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
}
