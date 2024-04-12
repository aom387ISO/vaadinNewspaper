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

public class ValoracionNoticiaDAO {
	public static ValoracionNoticia loadValoracionNoticiaByORMID(int idValoracionNoticia) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadValoracionNoticiaByORMID(session, idValoracionNoticia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia getValoracionNoticiaByORMID(int idValoracionNoticia) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getValoracionNoticiaByORMID(session, idValoracionNoticia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia loadValoracionNoticiaByORMID(int idValoracionNoticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadValoracionNoticiaByORMID(session, idValoracionNoticia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia getValoracionNoticiaByORMID(int idValoracionNoticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getValoracionNoticiaByORMID(session, idValoracionNoticia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia loadValoracionNoticiaByORMID(PersistentSession session, int idValoracionNoticia) throws PersistentException {
		try {
			return (ValoracionNoticia) session.load(tabla.ValoracionNoticia.class, Integer.valueOf(idValoracionNoticia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia getValoracionNoticiaByORMID(PersistentSession session, int idValoracionNoticia) throws PersistentException {
		try {
			return (ValoracionNoticia) session.get(tabla.ValoracionNoticia.class, Integer.valueOf(idValoracionNoticia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia loadValoracionNoticiaByORMID(PersistentSession session, int idValoracionNoticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ValoracionNoticia) session.load(tabla.ValoracionNoticia.class, Integer.valueOf(idValoracionNoticia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia getValoracionNoticiaByORMID(PersistentSession session, int idValoracionNoticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ValoracionNoticia) session.get(tabla.ValoracionNoticia.class, Integer.valueOf(idValoracionNoticia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracionNoticia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryValoracionNoticia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracionNoticia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryValoracionNoticia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia[] listValoracionNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listValoracionNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia[] listValoracionNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listValoracionNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracionNoticia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.ValoracionNoticia as ValoracionNoticia");
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
	
	public static List queryValoracionNoticia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.ValoracionNoticia as ValoracionNoticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ValoracionNoticia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia[] listValoracionNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryValoracionNoticia(session, condition, orderBy);
			return (ValoracionNoticia[]) list.toArray(new ValoracionNoticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia[] listValoracionNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryValoracionNoticia(session, condition, orderBy, lockMode);
			return (ValoracionNoticia[]) list.toArray(new ValoracionNoticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia loadValoracionNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadValoracionNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia loadValoracionNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadValoracionNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia loadValoracionNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ValoracionNoticia[] valoracionNoticias = listValoracionNoticiaByQuery(session, condition, orderBy);
		if (valoracionNoticias != null && valoracionNoticias.length > 0)
			return valoracionNoticias[0];
		else
			return null;
	}
	
	public static ValoracionNoticia loadValoracionNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ValoracionNoticia[] valoracionNoticias = listValoracionNoticiaByQuery(session, condition, orderBy, lockMode);
		if (valoracionNoticias != null && valoracionNoticias.length > 0)
			return valoracionNoticias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateValoracionNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateValoracionNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateValoracionNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateValoracionNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateValoracionNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.ValoracionNoticia as ValoracionNoticia");
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
	
	public static java.util.Iterator iterateValoracionNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.ValoracionNoticia as ValoracionNoticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ValoracionNoticia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia createValoracionNoticia() {
		return new tabla.ValoracionNoticia();
	}
	
	public static boolean save(tabla.ValoracionNoticia valoracionNoticia) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().saveObject(valoracionNoticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tabla.ValoracionNoticia valoracionNoticia) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().deleteObject(valoracionNoticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.ValoracionNoticia valoracionNoticia)throws PersistentException {
		try {
			if (valoracionNoticia.getUsuario_valora_a() != null) {
				valoracionNoticia.getUsuario_valora_a().valoracionNoticias.remove(valoracionNoticia);
			}
			
			if (valoracionNoticia.getValorada_por() != null) {
				valoracionNoticia.getValorada_por().valora_a.remove(valoracionNoticia);
			}
			
			return delete(valoracionNoticia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.ValoracionNoticia valoracionNoticia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (valoracionNoticia.getUsuario_valora_a() != null) {
				valoracionNoticia.getUsuario_valora_a().valoracionNoticias.remove(valoracionNoticia);
			}
			
			if (valoracionNoticia.getValorada_por() != null) {
				valoracionNoticia.getValorada_por().valora_a.remove(valoracionNoticia);
			}
			
			try {
				session.delete(valoracionNoticia);
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
	
	public static boolean refresh(tabla.ValoracionNoticia valoracionNoticia) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().refresh(valoracionNoticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tabla.ValoracionNoticia valoracionNoticia) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().evict(valoracionNoticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionNoticia loadValoracionNoticiaByCriteria(ValoracionNoticiaCriteria valoracionNoticiaCriteria) {
		ValoracionNoticia[] valoracionNoticias = listValoracionNoticiaByCriteria(valoracionNoticiaCriteria);
		if(valoracionNoticias == null || valoracionNoticias.length == 0) {
			return null;
		}
		return valoracionNoticias[0];
	}
	
	public static ValoracionNoticia[] listValoracionNoticiaByCriteria(ValoracionNoticiaCriteria valoracionNoticiaCriteria) {
		return valoracionNoticiaCriteria.listValoracionNoticia();
	}
}
