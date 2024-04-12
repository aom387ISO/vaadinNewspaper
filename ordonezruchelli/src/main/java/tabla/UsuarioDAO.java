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

public class UsuarioDAO {
	public static Usuario loadUsuarioByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getUsuarioByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getUsuarioByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario) session.load(tabla.Usuario.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario) session.get(tabla.Usuario.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.load(tabla.Usuario.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.get(tabla.Usuario.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Usuario as Usuario");
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
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy, lockMode);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Usuario as Usuario");
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
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario createUsuario() {
		return new tabla.Usuario();
	}
	
	public static boolean save(tabla.Usuario usuario) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().saveObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tabla.Usuario usuario) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().deleteObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Usuario usuario)throws PersistentException {
		if (usuario instanceof tabla.Periodista) {
			return tabla.PeriodistaDAO.deleteAndDissociate((tabla.Periodista) usuario);
		}
		
		if (usuario instanceof tabla.Usuario_suscrito) {
			return tabla.Usuario_suscritoDAO.deleteAndDissociate((tabla.Usuario_suscrito) usuario);
		}
		
		if (usuario instanceof tabla.Editor) {
			return tabla.EditorDAO.deleteAndDissociate((tabla.Editor) usuario);
		}
		
		try {
			tabla.Foto[] lTiene_imagens = usuario.tiene_imagen.toArray();
			for(int i = 0; i < lTiene_imagens.length; i++) {
				lTiene_imagens[i].setLe_da_imagen_a(null);
			}
			tabla.Comentario[] lEscribirs = usuario.escribir.toArray();
			for(int i = 0; i < lEscribirs.length; i++) {
				lEscribirs[i].setAutor(null);
			}
			tabla.ValoracionNoticia[] lValora_as = usuario.valora_a.toArray();
			for(int i = 0; i < lValora_as.length; i++) {
				lValora_as[i].setValorada_por(null);
			}
			tabla.ValoracionComentario[] lVa_a_valorars = usuario.va_a_valorar.toArray();
			for(int i = 0; i < lVa_a_valorars.length; i++) {
				lVa_a_valorars[i].setValorado_por(null);
			}
			return delete(usuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Usuario usuario, org.orm.PersistentSession session)throws PersistentException {
		if (usuario instanceof tabla.Periodista) {
			return tabla.PeriodistaDAO.deleteAndDissociate((tabla.Periodista) usuario, session);
		}
		
		if (usuario instanceof tabla.Usuario_suscrito) {
			return tabla.Usuario_suscritoDAO.deleteAndDissociate((tabla.Usuario_suscrito) usuario, session);
		}
		
		if (usuario instanceof tabla.Editor) {
			return tabla.EditorDAO.deleteAndDissociate((tabla.Editor) usuario, session);
		}
		
		try {
			tabla.Foto[] lTiene_imagens = usuario.tiene_imagen.toArray();
			for(int i = 0; i < lTiene_imagens.length; i++) {
				lTiene_imagens[i].setLe_da_imagen_a(null);
			}
			tabla.Comentario[] lEscribirs = usuario.escribir.toArray();
			for(int i = 0; i < lEscribirs.length; i++) {
				lEscribirs[i].setAutor(null);
			}
			tabla.ValoracionNoticia[] lValora_as = usuario.valora_a.toArray();
			for(int i = 0; i < lValora_as.length; i++) {
				lValora_as[i].setValorada_por(null);
			}
			tabla.ValoracionComentario[] lVa_a_valorars = usuario.va_a_valorar.toArray();
			for(int i = 0; i < lVa_a_valorars.length; i++) {
				lVa_a_valorars[i].setValorado_por(null);
			}
			try {
				session.delete(usuario);
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
	
	public static boolean refresh(tabla.Usuario usuario) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().refresh(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tabla.Usuario usuario) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().evict(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		Usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
		if(usuarios == null || usuarios.length == 0) {
			return null;
		}
		return usuarios[0];
	}
	
	public static Usuario[] listUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		return usuarioCriteria.listUsuario();
	}
}
