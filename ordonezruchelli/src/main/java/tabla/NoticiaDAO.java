/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package tabla;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class NoticiaDAO {
	public static Noticia loadNoticiaByORMID(int idNoticia) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, idNoticia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int idNoticia) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getNoticiaByORMID(session, idNoticia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(int idNoticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, idNoticia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int idNoticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getNoticiaByORMID(session, idNoticia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int idNoticia) throws PersistentException {
		try {
			return (Noticia) session.load(tabla.Noticia.class, Integer.valueOf(idNoticia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int idNoticia) throws PersistentException {
		try {
			return (Noticia) session.get(tabla.Noticia.class, Integer.valueOf(idNoticia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int idNoticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.load(tabla.Noticia.class, Integer.valueOf(idNoticia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int idNoticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.get(tabla.Noticia.class, Integer.valueOf(idNoticia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy, lockMode);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy, lockMode);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia createNoticia() {
		return new tabla.Noticia();
	}
	
	public static boolean save(tabla.Noticia noticia) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().saveObject(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tabla.Noticia noticia) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().deleteObject(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Noticia noticia)throws PersistentException {
		try {
			if (noticia.getAutor() != null) {
				noticia.getAutor().publica.remove(noticia);
			}
			
			tabla.Seccion[] lEstá_contenidas = noticia.está_contenida.toArray();
			for(int i = 0; i < lEstá_contenidas.length; i++) {
				lEstá_contenidas[i].se_encuentra.remove(noticia);
			}
			tabla.Comentario[] lComentada_pors = noticia.comentada_por.toArray();
			for(int i = 0; i < lComentada_pors.length; i++) {
				lComentada_pors[i].setComenta(null);
			}
			tabla.Tematica[] lIncluyes = noticia.incluye.toArray();
			for(int i = 0; i < lIncluyes.length; i++) {
				lIncluyes[i].da_tematica_a.remove(noticia);
			}
			tabla.Foto[] lContienes = noticia.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].setPertenece(null);
			}
			tabla.ValoracionNoticia[] lValoracionNoticiass = noticia.valoracionNoticias.toArray();
			for(int i = 0; i < lValoracionNoticiass.length; i++) {
				lValoracionNoticiass[i].setUsuario_valora_a(null);
			}
			return delete(noticia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Noticia noticia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (noticia.getAutor() != null) {
				noticia.getAutor().publica.remove(noticia);
			}
			
			tabla.Seccion[] lEstá_contenidas = noticia.está_contenida.toArray();
			for(int i = 0; i < lEstá_contenidas.length; i++) {
				lEstá_contenidas[i].se_encuentra.remove(noticia);
			}
			tabla.Comentario[] lComentada_pors = noticia.comentada_por.toArray();
			for(int i = 0; i < lComentada_pors.length; i++) {
				lComentada_pors[i].setComenta(null);
			}
			tabla.Tematica[] lIncluyes = noticia.incluye.toArray();
			for(int i = 0; i < lIncluyes.length; i++) {
				lIncluyes[i].da_tematica_a.remove(noticia);
			}
			tabla.Foto[] lContienes = noticia.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].setPertenece(null);
			}
			tabla.ValoracionNoticia[] lValoracionNoticiass = noticia.valoracionNoticias.toArray();
			for(int i = 0; i < lValoracionNoticiass.length; i++) {
				lValoracionNoticiass[i].setUsuario_valora_a(null);
			}
			try {
				session.delete(noticia);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(tabla.Noticia noticia) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().refresh(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tabla.Noticia noticia) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().evict(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		Noticia[] noticias = listNoticiaByCriteria(noticiaCriteria);
		if(noticias == null || noticias.length == 0) {
			return null;
		}
		return noticias[0];
	}
	
	public static Noticia[] listNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		return noticiaCriteria.listNoticia();
	}
}
