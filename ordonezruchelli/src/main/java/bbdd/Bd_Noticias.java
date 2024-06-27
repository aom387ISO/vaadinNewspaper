package bbdd;

import bbdd.BDPrincipal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Bd_Noticias {
	public BDPrincipal _bd_prin_not;
	public Vector<Noticia> _contiene_noticias = new Vector<Noticia>();

	   public void gustarNoticia(int aIdNoticia, int aIdUsuario) throws PersistentException {
	        PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();

	        try {
	            Usuario usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
	            Noticia noticia = NoticiaDAO.getNoticiaByORMID(aIdNoticia);

	            if (usuario != null && noticia != null) {
	                ValoracionNoticia valoracionExistente = null;
	                for (Object obj : noticia.valoracionNoticias.getCollection()) {
	                    ValoracionNoticia val = (ValoracionNoticia) obj;
	                    if (val.getValorada_por().getIdUsuario() == aIdUsuario) {
	                        valoracionExistente = val;
	                        break;
	                    }
	                }

	                if (valoracionExistente != null) {
	                    if (valoracionExistente.getValoracion()) {
	                        ValoracionNoticiaDAO.delete(valoracionExistente);
	                        noticia.setnValoracionesPositivas(noticia.getnValoracionesPositivas() - 1);
	                    } else {
	                        valoracionExistente.setValoracion(true);
	                        ValoracionNoticiaDAO.save(valoracionExistente);
	                        noticia.setnValoracionesNegativas(noticia.getnValoracionesNegativas() - 1);
	                        noticia.setnValoracionesPositivas(noticia.getnValoracionesPositivas() + 1);
	                    }
	                } else {
	                    ValoracionNoticia nuevaValoracion = new ValoracionNoticia();
	                    nuevaValoracion.setValorada_por(usuario);
	                    nuevaValoracion.setUsuario_valora_a(noticia);
	                    nuevaValoracion.setValoracion(true);
	                    ValoracionNoticiaDAO.save(nuevaValoracion);
	                    noticia.setnValoracionesPositivas(noticia.getnValoracionesPositivas() + 1);
	                }

	                NoticiaDAO.save(noticia);
	            } else {
	                System.out.println("Usuario o Noticia no encontrado.");
	            }

	            t.commit();
	        } catch (Exception e) {
	            t.rollback();
	        }
	        ProyectofinalPersistentManager.instance().disposePersistentManager();
	    }

	   public void noGustarNoticia(int aIdNoticia, int aIdUsuario) throws PersistentException {
		    PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();

		    try {
		        Usuario usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
		        Noticia noticia = NoticiaDAO.getNoticiaByORMID(aIdNoticia);

		        if (usuario != null && noticia != null) {
		            ValoracionNoticia valoracionExistente = null;
		            for (Object obj : noticia.valoracionNoticias.getCollection()) {
		                ValoracionNoticia val = (ValoracionNoticia) obj;
		                if (val.getValorada_por().getIdUsuario() == aIdUsuario) {
		                    valoracionExistente = val;
		                    break;
		                }
		            }

		            if (valoracionExistente != null) {
		                if (!valoracionExistente.getValoracion()) {
		                    ValoracionNoticiaDAO.delete(valoracionExistente);
		                    noticia.setnValoracionesNegativas(noticia.getnValoracionesNegativas() - 1);
		                } else {
		                    valoracionExistente.setValoracion(false);
		                    ValoracionNoticiaDAO.save(valoracionExistente);
		                    noticia.setnValoracionesPositivas(noticia.getnValoracionesPositivas() - 1);
		                    noticia.setnValoracionesNegativas(noticia.getnValoracionesNegativas() + 1);
		                }
		            } else {
		                ValoracionNoticia nuevaValoracion = new ValoracionNoticia();
		                nuevaValoracion.setValorada_por(usuario);
		                nuevaValoracion.setUsuario_valora_a(noticia);
		                nuevaValoracion.setValoracion(false);
		                ValoracionNoticiaDAO.save(nuevaValoracion);
		                noticia.setnValoracionesNegativas(noticia.getnValoracionesNegativas() + 1);
		            }

		            NoticiaDAO.save(noticia);
		        } else {
		            System.out.println("Usuario o Noticia no encontrado.");
		        }

		        t.commit();
		    } catch (Exception e) {
		        t.rollback();
		    }
		    ProyectofinalPersistentManager.instance().disposePersistentManager();
		}

	   //Faltaría añadir el autor en el método.
	   public void crearNoticia(String aTitulo, Foto aImagenes, Tematica aTematica, String aCuerpo, String aResumen, Periodista periodista) throws PersistentException {
		    PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		    try {
		    	Noticia noticia = NoticiaDAO.createNoticia();
		    	noticia.setTitulo(aTitulo);
		    	noticia.setCuerpo(aCuerpo);
		    	noticia.setResumen(aResumen);
		    	aTematica.getORM_Da_tematica_a().add(noticia);
//		    	periodista.getORM_Publica().add(noticia);
		    	noticia.setAutor(periodista);
//		        nuevaNoticia.setImagenes(aImagenes);
		    	noticia.setnValoracionesNegativas(0);
		    	noticia.setnValoracionesPositivas(0);
		    	noticia.setORM_Autor(periodista);
	            periodista.getORM_Publica().add(noticia);
		        NoticiaDAO.save(noticia);
		        t.commit();
		    } catch (Exception e) {
		        e.printStackTrace();
		        t.rollback();
		    }
		    ProyectofinalPersistentManager.instance().disposePersistentManager();
		}


	   public void cambiarDatosNoticia(int aIdNoticia, String aTitulo, Foto aImagenes, Tematica aTematica, String aCuerpo, String aResumen) throws PersistentException {
		    PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		    try {
		        Noticia noticia = NoticiaDAO.getNoticiaByORMID(aIdNoticia);
		        if (noticia != null) {
		            noticia.setTitulo(aTitulo);
		            noticia.setCuerpo(aCuerpo);
		            noticia.setResumen(aResumen);
//		            noticia.setImagenes(aImagenes);
//		            noticia.setTematica(aTematica);

		            NoticiaDAO.save(noticia);
		        }
		        t.commit();
		    } catch (Exception e) {
		        t.rollback();
		    }
		    ProyectofinalPersistentManager.instance().disposePersistentManager();
		}

	public void eliminarNoticia(int aIdNoticia) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Noticia noticia = NoticiaDAO.getNoticiaByORMID(aIdNoticia);
			if (noticia != null) {
				NoticiaDAO.deleteAndDissociate(noticia);
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();
	}
	
    public Noticia[] cargarNoticia() throws PersistentException {
        PersistentTransaction t = null;
        try {
        	t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
            NoticiaCriteria criteria = new NoticiaCriteria();
            Noticia[] noticias = NoticiaDAO.listNoticiaByCriteria(criteria);
            t.commit();
            return noticias;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
            ProyectofinalPersistentManager.instance().disposePersistentManager();
        
        return new Noticia[0];
    }
    
    public Noticia[] cargarNoticiasPorSeccionPortada() throws PersistentException {
        PersistentTransaction t = null;

    	try {
        	t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();

            Seccion[] secciones = SeccionDAO.listSeccionByQuery("Portada = true", null);

            if (secciones.length == 0) {
                return new Noticia[0];
            }
            Seccion portada = secciones[0];

	        List<Noticia> noticiaDePortada = new ArrayList<>();
            NoticiaCriteria criteria = new NoticiaCriteria();

            Noticia[] noticias = NoticiaDAO.listNoticiaByCriteria(criteria);
            
			for(Noticia noticia : noticias) {
				if(noticia.esta_contenida.contains(portada)) {
					noticiaDePortada.add(noticia);

				}
			}
	        noticiaDePortada.sort(Comparator.comparingInt(Noticia::getPosicionPortada));

			t.commit();
            return noticiaDePortada.toArray(new Noticia[noticiaDePortada.size()]);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        ProyectofinalPersistentManager.instance().disposePersistentManager();
        
        return new Noticia[0];
    }
    
    public Noticia[] mostrarNoticiasAutor(Periodista periodista) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Integer idPeriodista = periodista.getIdUsuario();
			Periodista autor = PeriodistaDAO.getPeriodistaByORMID(idPeriodista);
			NoticiaCriteria criteria = new NoticiaCriteria();
			Noticia[] noticias = NoticiaDAO.listNoticiaByCriteria(criteria);
	        List<Noticia> noticiaDeAutor = new ArrayList<>();

			for(Noticia noticia : noticias) {
				if(autor.publica.contains(noticia)) {
					noticiaDeAutor.add(noticia);
				}
			}
			System.out.println(idPeriodista);
			t.commit();
            return noticiaDeAutor.toArray(new Noticia[noticiaDeAutor.size()]);
		} catch (Exception e) {
			t.rollback();
		}
			ProyectofinalPersistentManager.instance().disposePersistentManager();
		return null;
	}    
    
    public Noticia[] cargarNoticiasNoContenidasEnSeccion(String nombreSeccion) throws PersistentException {
        PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
        try {
            NoticiaCriteria criteria = new NoticiaCriteria();
            Noticia[] noticias = NoticiaDAO.listNoticiaByCriteria(criteria);
            List<Noticia> noticiasNoContenidas = new ArrayList<>();
			Seccion seccion = SeccionDAO.loadSeccionByQuery("Nombre = '"+nombreSeccion+"'", null);

            for (Noticia noticia : noticias) {
                if(!noticia.esta_contenida.contains(seccion)) {
                    noticiasNoContenidas.add(noticia);
                            
                }
            }

            t.commit();
            return noticiasNoContenidas.toArray(new Noticia[noticiasNoContenidas.size()]);
        } catch (Exception e) {
            t.rollback();
        }
        ProyectofinalPersistentManager.instance().disposePersistentManager();
		return null;

    }

    public Noticia[] cargarNoticiasContenidasEnSeccion(String nombreSeccion) throws PersistentException {
        PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
        try {

            NoticiaCriteria criteria = new NoticiaCriteria();
            Noticia[] noticias = NoticiaDAO.listNoticiaByCriteria(criteria);
            List<Noticia> noticiasContenidas = new ArrayList<>();
			Seccion seccion = SeccionDAO.loadSeccionByQuery("Nombre = '"+nombreSeccion+"'", null);

            for (Noticia noticia : noticias) {
                if(noticia.esta_contenida.contains(seccion)) {
                    noticiasContenidas.add(noticia);
                            
                }
            }

            t.commit();
            return noticiasContenidas.toArray(new Noticia[noticiasContenidas.size()]);
        } catch (Exception e) {
            t.rollback();
        }
        ProyectofinalPersistentManager.instance().disposePersistentManager();
		return null;

    }
    public Noticia obtenerNoticiaPorTitulo(String titulo) throws PersistentException {
        PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
        try {
            Noticia[] noticias = NoticiaDAO.listNoticiaByQuery("Titulo = '" + titulo + "'", null);
            t.commit();
            if (noticias != null && noticias.length > 0) {
                return noticias[0];
            } else {
                return null;
            }
        } catch (Exception e) {
            t.rollback();
        }    
        ProyectofinalPersistentManager.instance().disposePersistentManager();
		return null;

    }

    
}