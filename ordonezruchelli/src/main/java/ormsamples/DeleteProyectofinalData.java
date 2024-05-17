/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectofinalData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = bbdd.ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			bbdd.Noticia lbbddNoticia = bbdd.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Delete the persistent object
			bbdd.NoticiaDAO.delete(lbbddNoticia);
			bbdd.Usuario lbbddUsuario = bbdd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			bbdd.UsuarioDAO.delete(lbbddUsuario);
			bbdd.Periodista lbbddPeriodista = bbdd.PeriodistaDAO.loadPeriodistaByQuery(null, null);
			// Delete the persistent object
			bbdd.PeriodistaDAO.delete(lbbddPeriodista);
			bbdd.Usuario_suscrito lbbddUsuario_suscrito = bbdd.Usuario_suscritoDAO.loadUsuario_suscritoByQuery(null, null);
			// Delete the persistent object
			bbdd.Usuario_suscritoDAO.delete(lbbddUsuario_suscrito);
			bbdd.Editor lbbddEditor = bbdd.EditorDAO.loadEditorByQuery(null, null);
			// Delete the persistent object
			bbdd.EditorDAO.delete(lbbddEditor);
			bbdd.Comentario lbbddComentario = bbdd.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			bbdd.ComentarioDAO.delete(lbbddComentario);
			bbdd.Seccion lbbddSeccion = bbdd.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			bbdd.SeccionDAO.delete(lbbddSeccion);
			bbdd.Tematica lbbddTematica = bbdd.TematicaDAO.loadTematicaByQuery(null, null);
			// Delete the persistent object
			bbdd.TematicaDAO.delete(lbbddTematica);
			bbdd.Foto lbbddFoto = bbdd.FotoDAO.loadFotoByQuery(null, null);
			// Delete the persistent object
			bbdd.FotoDAO.delete(lbbddFoto);
			bbdd.ValoracionNoticia lbbddValoracionNoticia = bbdd.ValoracionNoticiaDAO.loadValoracionNoticiaByQuery(null, null);
			// Delete the persistent object
			bbdd.ValoracionNoticiaDAO.delete(lbbddValoracionNoticia);
			bbdd.ValoracionComentario lbbddValoracionComentario = bbdd.ValoracionComentarioDAO.loadValoracionComentarioByQuery(null, null);
			// Delete the persistent object
			bbdd.ValoracionComentarioDAO.delete(lbbddValoracionComentario);
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
				bbdd.ProyectofinalPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
