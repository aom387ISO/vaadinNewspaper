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

public class PeriodistaDAO {
	public static Periodista loadPeriodistaByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadPeriodistaByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getPeriodistaByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadPeriodistaByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getPeriodistaByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Periodista) session.load(tabla.Periodista.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Periodista) session.get(tabla.Periodista.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Periodista) session.load(tabla.Periodista.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Periodista) session.get(tabla.Periodista.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryPeriodista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryPeriodista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listPeriodistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listPeriodistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Periodista as Periodista");
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
	
	public static List queryPeriodista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Periodista as Periodista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Periodista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPeriodista(session, condition, orderBy);
			return (Periodista[]) list.toArray(new Periodista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPeriodista(session, condition, orderBy, lockMode);
			return (Periodista[]) list.toArray(new Periodista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadPeriodistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadPeriodistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Periodista[] periodistas = listPeriodistaByQuery(session, condition, orderBy);
		if (periodistas != null && periodistas.length > 0)
			return periodistas[0];
		else
			return null;
	}
	
	public static Periodista loadPeriodistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Periodista[] periodistas = listPeriodistaByQuery(session, condition, orderBy, lockMode);
		if (periodistas != null && periodistas.length > 0)
			return periodistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePeriodistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iteratePeriodistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iteratePeriodistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Periodista as Periodista");
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
	
	public static java.util.Iterator iteratePeriodistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Periodista as Periodista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Periodista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista createPeriodista() {
		return new tabla.Periodista();
	}
	
	public static boolean save(tabla.Periodista periodista) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().saveObject(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tabla.Periodista periodista) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().deleteObject(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Periodista periodista)throws PersistentException {
		try {
			tabla.Noticia[] lPublicas = periodista.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setAutor(null);
			}
			tabla.Foto[] lTiene_imagens = periodista.tiene_imagen.toArray();
			for(int i = 0; i < lTiene_imagens.length; i++) {
				lTiene_imagens[i].setLe_da_imagen_a(null);
			}
			tabla.Comentario[] lEscribirs = periodista.escribir.toArray();
			for(int i = 0; i < lEscribirs.length; i++) {
				lEscribirs[i].setAutor(null);
			}
			tabla.ValoracionNoticia[] lValora_as = periodista.valora_a.toArray();
			for(int i = 0; i < lValora_as.length; i++) {
				lValora_as[i].setValorada_por(null);
			}
			tabla.ValoracionComentario[] lVa_a_valorars = periodista.va_a_valorar.toArray();
			for(int i = 0; i < lVa_a_valorars.length; i++) {
				lVa_a_valorars[i].setValorado_por(null);
			}
			return delete(periodista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Periodista periodista, org.orm.PersistentSession session)throws PersistentException {
		try {
			tabla.Noticia[] lPublicas = periodista.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setAutor(null);
			}
			tabla.Foto[] lTiene_imagens = periodista.tiene_imagen.toArray();
			for(int i = 0; i < lTiene_imagens.length; i++) {
				lTiene_imagens[i].setLe_da_imagen_a(null);
			}
			tabla.Comentario[] lEscribirs = periodista.escribir.toArray();
			for(int i = 0; i < lEscribirs.length; i++) {
				lEscribirs[i].setAutor(null);
			}
			tabla.ValoracionNoticia[] lValora_as = periodista.valora_a.toArray();
			for(int i = 0; i < lValora_as.length; i++) {
				lValora_as[i].setValorada_por(null);
			}
			tabla.ValoracionComentario[] lVa_a_valorars = periodista.va_a_valorar.toArray();
			for(int i = 0; i < lVa_a_valorars.length; i++) {
				lVa_a_valorars[i].setValorado_por(null);
			}
			try {
				session.delete(periodista);
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
	
	public static boolean refresh(tabla.Periodista periodista) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().refresh(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tabla.Periodista periodista) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().evict(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByCriteria(PeriodistaCriteria periodistaCriteria) {
		Periodista[] periodistas = listPeriodistaByCriteria(periodistaCriteria);
		if(periodistas == null || periodistas.length == 0) {
			return null;
		}
		return periodistas[0];
	}
	
	public static Periodista[] listPeriodistaByCriteria(PeriodistaCriteria periodistaCriteria) {
		return periodistaCriteria.listPeriodista();
	}
}
