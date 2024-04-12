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

public class TematicaDAO {
	public static Tematica loadTematicaByORMID(String idTematica) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadTematicaByORMID(session, idTematica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica getTematicaByORMID(String idTematica) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getTematicaByORMID(session, idTematica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByORMID(String idTematica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadTematicaByORMID(session, idTematica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica getTematicaByORMID(String idTematica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getTematicaByORMID(session, idTematica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByORMID(PersistentSession session, String idTematica) throws PersistentException {
		try {
			return (Tematica) session.load(tabla.Tematica.class, idTematica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica getTematicaByORMID(PersistentSession session, String idTematica) throws PersistentException {
		try {
			return (Tematica) session.get(tabla.Tematica.class, idTematica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByORMID(PersistentSession session, String idTematica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tematica) session.load(tabla.Tematica.class, idTematica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica getTematicaByORMID(PersistentSession session, String idTematica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tematica) session.get(tabla.Tematica.class, idTematica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTematica(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryTematica(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTematica(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryTematica(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica[] listTematicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listTematicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica[] listTematicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listTematicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTematica(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Tematica as Tematica");
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
	
	public static List queryTematica(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Tematica as Tematica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tematica", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica[] listTematicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTematica(session, condition, orderBy);
			return (Tematica[]) list.toArray(new Tematica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica[] listTematicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTematica(session, condition, orderBy, lockMode);
			return (Tematica[]) list.toArray(new Tematica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadTematicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadTematicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tematica[] tematicas = listTematicaByQuery(session, condition, orderBy);
		if (tematicas != null && tematicas.length > 0)
			return tematicas[0];
		else
			return null;
	}
	
	public static Tematica loadTematicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tematica[] tematicas = listTematicaByQuery(session, condition, orderBy, lockMode);
		if (tematicas != null && tematicas.length > 0)
			return tematicas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTematicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateTematicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTematicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateTematicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTematicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Tematica as Tematica");
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
	
	public static java.util.Iterator iterateTematicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Tematica as Tematica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tematica", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica createTematica() {
		return new tabla.Tematica();
	}
	
	public static boolean save(tabla.Tematica tematica) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().saveObject(tematica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tabla.Tematica tematica) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().deleteObject(tematica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Tematica tematica)throws PersistentException {
		try {
			if (tematica.getDa_tematica() != null) {
				tematica.getDa_tematica().setIncluye(null);
			}
			
			tabla.Noticia[] lDa_tematica_as = tematica.da_tematica_a.toArray();
			for(int i = 0; i < lDa_tematica_as.length; i++) {
				lDa_tematica_as[i].incluye.remove(tematica);
			}
			return delete(tematica);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Tematica tematica, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tematica.getDa_tematica() != null) {
				tematica.getDa_tematica().setIncluye(null);
			}
			
			tabla.Noticia[] lDa_tematica_as = tematica.da_tematica_a.toArray();
			for(int i = 0; i < lDa_tematica_as.length; i++) {
				lDa_tematica_as[i].incluye.remove(tematica);
			}
			try {
				session.delete(tematica);
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
	
	public static boolean refresh(tabla.Tematica tematica) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().refresh(tematica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tabla.Tematica tematica) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().evict(tematica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByCriteria(TematicaCriteria tematicaCriteria) {
		Tematica[] tematicas = listTematicaByCriteria(tematicaCriteria);
		if(tematicas == null || tematicas.length == 0) {
			return null;
		}
		return tematicas[0];
	}
	
	public static Tematica[] listTematicaByCriteria(TematicaCriteria tematicaCriteria) {
		return tematicaCriteria.listTematica();
	}
}
