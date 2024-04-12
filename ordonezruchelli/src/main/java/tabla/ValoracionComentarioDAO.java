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

public class ValoracionComentarioDAO {
	public static ValoracionComentario loadValoracionComentarioByORMID(int idValoracionComentario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadValoracionComentarioByORMID(session, idValoracionComentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario getValoracionComentarioByORMID(int idValoracionComentario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getValoracionComentarioByORMID(session, idValoracionComentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario loadValoracionComentarioByORMID(int idValoracionComentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadValoracionComentarioByORMID(session, idValoracionComentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario getValoracionComentarioByORMID(int idValoracionComentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getValoracionComentarioByORMID(session, idValoracionComentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario loadValoracionComentarioByORMID(PersistentSession session, int idValoracionComentario) throws PersistentException {
		try {
			return (ValoracionComentario) session.load(tabla.ValoracionComentario.class, Integer.valueOf(idValoracionComentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario getValoracionComentarioByORMID(PersistentSession session, int idValoracionComentario) throws PersistentException {
		try {
			return (ValoracionComentario) session.get(tabla.ValoracionComentario.class, Integer.valueOf(idValoracionComentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario loadValoracionComentarioByORMID(PersistentSession session, int idValoracionComentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ValoracionComentario) session.load(tabla.ValoracionComentario.class, Integer.valueOf(idValoracionComentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario getValoracionComentarioByORMID(PersistentSession session, int idValoracionComentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ValoracionComentario) session.get(tabla.ValoracionComentario.class, Integer.valueOf(idValoracionComentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracionComentario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryValoracionComentario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracionComentario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryValoracionComentario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario[] listValoracionComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listValoracionComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario[] listValoracionComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listValoracionComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracionComentario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.ValoracionComentario as ValoracionComentario");
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
	
	public static List queryValoracionComentario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.ValoracionComentario as ValoracionComentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ValoracionComentario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario[] listValoracionComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryValoracionComentario(session, condition, orderBy);
			return (ValoracionComentario[]) list.toArray(new ValoracionComentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario[] listValoracionComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryValoracionComentario(session, condition, orderBy, lockMode);
			return (ValoracionComentario[]) list.toArray(new ValoracionComentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario loadValoracionComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadValoracionComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario loadValoracionComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadValoracionComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario loadValoracionComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ValoracionComentario[] valoracionComentarios = listValoracionComentarioByQuery(session, condition, orderBy);
		if (valoracionComentarios != null && valoracionComentarios.length > 0)
			return valoracionComentarios[0];
		else
			return null;
	}
	
	public static ValoracionComentario loadValoracionComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ValoracionComentario[] valoracionComentarios = listValoracionComentarioByQuery(session, condition, orderBy, lockMode);
		if (valoracionComentarios != null && valoracionComentarios.length > 0)
			return valoracionComentarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateValoracionComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateValoracionComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateValoracionComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateValoracionComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateValoracionComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.ValoracionComentario as ValoracionComentario");
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
	
	public static java.util.Iterator iterateValoracionComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.ValoracionComentario as ValoracionComentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ValoracionComentario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario createValoracionComentario() {
		return new tabla.ValoracionComentario();
	}
	
	public static boolean save(tabla.ValoracionComentario valoracionComentario) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().saveObject(valoracionComentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tabla.ValoracionComentario valoracionComentario) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().deleteObject(valoracionComentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.ValoracionComentario valoracionComentario)throws PersistentException {
		try {
			if (valoracionComentario.getLe_da_valoracion() != null) {
				valoracionComentario.getLe_da_valoracion().valoracionComentario.remove(valoracionComentario);
			}
			
			if (valoracionComentario.getValorado_por() != null) {
				valoracionComentario.getValorado_por().va_a_valorar.remove(valoracionComentario);
			}
			
			return delete(valoracionComentario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.ValoracionComentario valoracionComentario, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (valoracionComentario.getLe_da_valoracion() != null) {
				valoracionComentario.getLe_da_valoracion().valoracionComentario.remove(valoracionComentario);
			}
			
			if (valoracionComentario.getValorado_por() != null) {
				valoracionComentario.getValorado_por().va_a_valorar.remove(valoracionComentario);
			}
			
			try {
				session.delete(valoracionComentario);
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
	
	public static boolean refresh(tabla.ValoracionComentario valoracionComentario) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().refresh(valoracionComentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tabla.ValoracionComentario valoracionComentario) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().evict(valoracionComentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ValoracionComentario loadValoracionComentarioByCriteria(ValoracionComentarioCriteria valoracionComentarioCriteria) {
		ValoracionComentario[] valoracionComentarios = listValoracionComentarioByCriteria(valoracionComentarioCriteria);
		if(valoracionComentarios == null || valoracionComentarios.length == 0) {
			return null;
		}
		return valoracionComentarios[0];
	}
	
	public static ValoracionComentario[] listValoracionComentarioByCriteria(ValoracionComentarioCriteria valoracionComentarioCriteria) {
		return valoracionComentarioCriteria.listValoracionComentario();
	}
}
