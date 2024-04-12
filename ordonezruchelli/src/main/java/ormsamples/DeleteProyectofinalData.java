/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectofinalData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = tabla.ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			tabla.Noticia ltablaNoticia = tabla.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Delete the persistent object
			tabla.NoticiaDAO.delete(ltablaNoticia);
			tabla.Usuario ltablaUsuario = tabla.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			tabla.UsuarioDAO.delete(ltablaUsuario);
			tabla.Periodista ltablaPeriodista = tabla.PeriodistaDAO.loadPeriodistaByQuery(null, null);
			// Delete the persistent object
			tabla.PeriodistaDAO.delete(ltablaPeriodista);
			tabla.Usuario_suscrito ltablaUsuario_suscrito = tabla.Usuario_suscritoDAO.loadUsuario_suscritoByQuery(null, null);
			// Delete the persistent object
			tabla.Usuario_suscritoDAO.delete(ltablaUsuario_suscrito);
			tabla.Editor ltablaEditor = tabla.EditorDAO.loadEditorByQuery(null, null);
			// Delete the persistent object
			tabla.EditorDAO.delete(ltablaEditor);
			tabla.Comentario ltablaComentario = tabla.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			tabla.ComentarioDAO.delete(ltablaComentario);
			tabla.Seccion ltablaSeccion = tabla.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			tabla.SeccionDAO.delete(ltablaSeccion);
			tabla.Tematica ltablaTematica = tabla.TematicaDAO.loadTematicaByQuery(null, null);
			// Delete the persistent object
			tabla.TematicaDAO.delete(ltablaTematica);
			tabla.Foto ltablaFoto = tabla.FotoDAO.loadFotoByQuery(null, null);
			// Delete the persistent object
			tabla.FotoDAO.delete(ltablaFoto);
			tabla.ValoracionNoticia ltablaValoracionNoticia = tabla.ValoracionNoticiaDAO.loadValoracionNoticiaByQuery(null, null);
			// Delete the persistent object
			tabla.ValoracionNoticiaDAO.delete(ltablaValoracionNoticia);
			tabla.ValoracionComentario ltablaValoracionComentario = tabla.ValoracionComentarioDAO.loadValoracionComentarioByQuery(null, null);
			// Delete the persistent object
			tabla.ValoracionComentarioDAO.delete(ltablaValoracionComentario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectofinalData deleteProyectofinalData = new DeleteProyectofinalData();
			try {
				deleteProyectofinalData.deleteTestData();
			}
			finally {
				tabla.ProyectofinalPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
