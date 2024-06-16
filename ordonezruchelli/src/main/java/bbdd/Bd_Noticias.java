package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

import org.hibernate.Hibernate;
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
		System.out.println("Antes del try.");
		    try {
		    	Noticia noticia = NoticiaDAO.createNoticia();
		    	noticia.setTitulo(aTitulo);
		    	noticia.setCuerpo(aCuerpo);
		    	noticia.setResumen(aResumen);
	            
		    	noticia.setAutor(periodista);
//		        nuevaNoticia.setImagenes(aImagenes);
		    	noticia.setnValoracionesNegativas(0);
		    	noticia.setnValoracionesPositivas(0);
		    	noticia.setORM_Autor(periodista);
		        NoticiaDAO.save(noticia);
		        System.out.println("noticiaaaaaaaaaaaaaaa");
		        t.commit();
		    } catch (Exception e) {
		    	System.out.println("Se va al catch");
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
}