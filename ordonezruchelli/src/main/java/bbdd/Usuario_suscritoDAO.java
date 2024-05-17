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
package bbdd;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Usuario_suscritoDAO {
	public static Usuario_suscrito loadUsuario_suscritoByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadUsuario_suscritoByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getUsuario_suscritoByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadUsuario_suscritoByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getUsuario_suscritoByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_suscrito) session.load(bbdd.Usuario_suscrito.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_suscrito) session.get(bbdd.Usuario_suscrito.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_suscrito) session.load(bbdd.Usuario_suscrito.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_suscrito) session.get(bbdd.Usuario_suscrito.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryUsuario_suscrito(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryUsuario_suscrito(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listUsuario_suscritoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_suscrito as Usuario_suscrito");
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
	
	public static List queryUsuario_suscrito(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_suscrito as Usuario_suscrito");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_suscrito", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_suscrito(session, condition, orderBy);
			return (Usuario_suscrito[]) list.toArray(new Usuario_suscrito[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_suscrito(session, condition, orderBy, lockMode);
			return (Usuario_suscrito[]) list.toArray(new Usuario_suscrito[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadUsuario_suscritoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_suscrito[] usuario_suscritos = listUsuario_suscritoByQuery(session, condition, orderBy);
		if (usuario_suscritos != null && usuario_suscritos.length > 0)
			return usuario_suscritos[0];
		else
			return null;
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_suscrito[] usuario_suscritos = listUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		if (usuario_suscritos != null && usuario_suscritos.length > 0)
			return usuario_suscritos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateUsuario_suscritoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_suscrito as Usuario_suscrito");
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
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_suscrito as Usuario_suscrito");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_suscrito", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito createUsuario_suscrito() {
		return new bbdd.Usuario_suscrito();
	}
	
	public static boolean save(bbdd.Usuario_suscrito usuario_suscrito) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().saveObject(usuario_suscrito);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Usuario_suscrito usuario_suscrito) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().deleteObject(usuario_suscrito);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Usuario_suscrito usuario_suscrito)throws PersistentException {
		try {
			bbdd.Foto[] lTiene_imagens = usuario_suscrito.tiene_imagen.toArray();
			for(int i = 0; i < lTiene_imagens.length; i++) {
				lTiene_imagens[i].setLe_da_imagen_a(null);
			}
			bbdd.Comentario[] lEscribirs = usuario_suscrito.escribir.toArray();
			for(int i = 0; i < lEscribirs.length; i++) {
				lEscribirs[i].setAutor(null);
			}
			bbdd.ValoracionNoticia[] lValora_as = usuario_suscrito.valora_a.toArray();
			for(int i = 0; i < lValora_as.length; i++) {
				lValora_as[i].setValorada_por(null);
			}
			bbdd.ValoracionComentario[] lVa_a_valorars = usuario_suscrito.va_a_valorar.toArray();
			for(int i = 0; i < lVa_a_valorars.length; i++) {
				lVa_a_valorars[i].setValorado_por(null);
			}
			return delete(usuario_suscrito);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Usuario_suscrito usuario_suscrito, org.orm.PersistentSession session)throws PersistentException {
		try {
			bbdd.Foto[] lTiene_imagens = usuario_suscrito.tiene_imagen.toArray();
			for(int i = 0; i < lTiene_imagens.length; i++) {
				lTiene_imagens[i].setLe_da_imagen_a(null);
			}
			bbdd.Comentario[] lEscribirs = usuario_suscrito.escribir.toArray();
			for(int i = 0; i < lEscribirs.length; i++) {
				lEscribirs[i].setAutor(null);
			}
			bbdd.ValoracionNoticia[] lValora_as = usuario_suscrito.valora_a.toArray();
			for(int i = 0; i < lValora_as.length; i++) {
				lValora_as[i].setValorada_por(null);
			}
			bbdd.ValoracionComentario[] lVa_a_valorars = usuario_suscrito.va_a_valorar.toArray();
			for(int i = 0; i < lVa_a_valorars.length; i++) {
				lVa_a_valorars[i].setValorado_por(null);
			}
			try {
				session.delete(usuario_suscrito);
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
	
	public static boolean refresh(bbdd.Usuario_suscrito usuario_suscrito) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().refresh(usuario_suscrito);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Usuario_suscrito usuario_suscrito) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().evict(usuario_suscrito);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByCriteria(Usuario_suscritoCriteria usuario_suscritoCriteria) {
		Usuario_suscrito[] usuario_suscritos = listUsuario_suscritoByCriteria(usuario_suscritoCriteria);
		if(usuario_suscritos == null || usuario_suscritos.length == 0) {
			return null;
		}
		return usuario_suscritos[0];
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByCriteria(Usuario_suscritoCriteria usuario_suscritoCriteria) {
		return usuario_suscritoCriteria.listUsuario_suscrito();
	}
}
