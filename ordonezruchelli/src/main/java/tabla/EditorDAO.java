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

public class EditorDAO {
	public static Editor loadEditorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadEditorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getEditorByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadEditorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return getEditorByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Editor) session.load(tabla.Editor.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Editor) session.get(tabla.Editor.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Editor) session.load(tabla.Editor.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Editor) session.get(tabla.Editor.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryEditor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return queryEditor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return listEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Editor as Editor");
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
	
	public static List queryEditor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Editor as Editor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Editor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEditor(session, condition, orderBy);
			return (Editor[]) list.toArray(new Editor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEditor(session, condition, orderBy, lockMode);
			return (Editor[]) list.toArray(new Editor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return loadEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Editor[] editors = listEditorByQuery(session, condition, orderBy);
		if (editors != null && editors.length > 0)
			return editors[0];
		else
			return null;
	}
	
	public static Editor loadEditorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Editor[] editors = listEditorByQuery(session, condition, orderBy, lockMode);
		if (editors != null && editors.length > 0)
			return editors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
			return iterateEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Editor as Editor");
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
	
	public static java.util.Iterator iterateEditorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tabla.Editor as Editor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Editor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor createEditor() {
		return new tabla.Editor();
	}
	
	public static boolean save(tabla.Editor editor) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().saveObject(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tabla.Editor editor) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().deleteObject(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Editor editor)throws PersistentException {
		try {
			tabla.Foto[] lTiene_imagens = editor.tiene_imagen.toArray();
			for(int i = 0; i < lTiene_imagens.length; i++) {
				lTiene_imagens[i].setLe_da_imagen_a(null);
			}
			tabla.Comentario[] lEscribirs = editor.escribir.toArray();
			for(int i = 0; i < lEscribirs.length; i++) {
				lEscribirs[i].setAutor(null);
			}
			tabla.ValoracionNoticia[] lValora_as = editor.valora_a.toArray();
			for(int i = 0; i < lValora_as.length; i++) {
				lValora_as[i].setValorada_por(null);
			}
			tabla.ValoracionComentario[] lVa_a_valorars = editor.va_a_valorar.toArray();
			for(int i = 0; i < lVa_a_valorars.length; i++) {
				lVa_a_valorars[i].setValorado_por(null);
			}
			return delete(editor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tabla.Editor editor, org.orm.PersistentSession session)throws PersistentException {
		try {
			tabla.Foto[] lTiene_imagens = editor.tiene_imagen.toArray();
			for(int i = 0; i < lTiene_imagens.length; i++) {
				lTiene_imagens[i].setLe_da_imagen_a(null);
			}
			tabla.Comentario[] lEscribirs = editor.escribir.toArray();
			for(int i = 0; i < lEscribirs.length; i++) {
				lEscribirs[i].setAutor(null);
			}
			tabla.ValoracionNoticia[] lValora_as = editor.valora_a.toArray();
			for(int i = 0; i < lValora_as.length; i++) {
				lValora_as[i].setValorada_por(null);
			}
			tabla.ValoracionComentario[] lVa_a_valorars = editor.va_a_valorar.toArray();
			for(int i = 0; i < lVa_a_valorars.length; i++) {
				lVa_a_valorars[i].setValorado_por(null);
			}
			try {
				session.delete(editor);
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
	
	public static boolean refresh(tabla.Editor editor) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().refresh(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tabla.Editor editor) throws PersistentException {
		try {
			ProyectofinalPersistentManager.instance().getSession().evict(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByCriteria(EditorCriteria editorCriteria) {
		Editor[] editors = listEditorByCriteria(editorCriteria);
		if(editors == null || editors.length == 0) {
			return null;
		}
		return editors[0];
	}
	
	public static Editor[] listEditorByCriteria(EditorCriteria editorCriteria) {
		return editorCriteria.listEditor();
	}
}
