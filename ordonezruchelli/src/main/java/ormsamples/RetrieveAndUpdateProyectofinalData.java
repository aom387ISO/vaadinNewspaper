/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectofinalData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = bbdd.ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			bbdd.Noticia lbbddNoticia = bbdd.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.NoticiaDAO.save(lbbddNoticia);
			bbdd.Usuario lbbddUsuario = bbdd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.UsuarioDAO.save(lbbddUsuario);
			bbdd.Periodista lbbddPeriodista = bbdd.PeriodistaDAO.loadPeriodistaByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.PeriodistaDAO.save(lbbddPeriodista);
			bbdd.Usuario_suscrito lbbddUsuario_suscrito = bbdd.Usuario_suscritoDAO.loadUsuario_suscritoByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.Usuario_suscritoDAO.save(lbbddUsuario_suscrito);
			bbdd.Editor lbbddEditor = bbdd.EditorDAO.loadEditorByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.EditorDAO.save(lbbddEditor);
			bbdd.Comentario lbbddComentario = bbdd.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.ComentarioDAO.save(lbbddComentario);
			bbdd.Seccion lbbddSeccion = bbdd.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.SeccionDAO.save(lbbddSeccion);
			bbdd.Tematica lbbddTematica = bbdd.TematicaDAO.loadTematicaByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.TematicaDAO.save(lbbddTematica);
			bbdd.Foto lbbddFoto = bbdd.FotoDAO.loadFotoByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.FotoDAO.save(lbbddFoto);
			bbdd.ValoracionNoticia lbbddValoracionNoticia = bbdd.ValoracionNoticiaDAO.loadValoracionNoticiaByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.ValoracionNoticiaDAO.save(lbbddValoracionNoticia);
			bbdd.ValoracionComentario lbbddValoracionComentario = bbdd.ValoracionComentarioDAO.loadValoracionComentarioByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.ValoracionComentarioDAO.save(lbbddValoracionComentario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Noticia by NoticiaCriteria");
		bbdd.NoticiaCriteria lbbddNoticiaCriteria = new bbdd.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddNoticiaCriteria.idNoticia.eq();
		System.out.println(lbbddNoticiaCriteria.uniqueNoticia());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		bbdd.UsuarioCriteria lbbddUsuarioCriteria = new bbdd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddUsuarioCriteria.idUsuario.eq();
		System.out.println(lbbddUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Periodista by PeriodistaCriteria");
		bbdd.PeriodistaCriteria lbbddPeriodistaCriteria = new bbdd.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddPeriodistaCriteria.idUsuario.eq();
		System.out.println(lbbddPeriodistaCriteria.uniquePeriodista());
		
		System.out.println("Retrieving Usuario_suscrito by Usuario_suscritoCriteria");
		bbdd.Usuario_suscritoCriteria lbbddUsuario_suscritoCriteria = new bbdd.Usuario_suscritoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddUsuario_suscritoCriteria.idUsuario.eq();
		System.out.println(lbbddUsuario_suscritoCriteria.uniqueUsuario_suscrito());
		
		System.out.println("Retrieving Editor by EditorCriteria");
		bbdd.EditorCriteria lbbddEditorCriteria = new bbdd.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddEditorCriteria.idUsuario.eq();
		System.out.println(lbbddEditorCriteria.uniqueEditor());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		bbdd.ComentarioCriteria lbbddComentarioCriteria = new bbdd.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddComentarioCriteria.idComentario.eq();
		System.out.println(lbbddComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		bbdd.SeccionCriteria lbbddSeccionCriteria = new bbdd.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddSeccionCriteria.idSeccion.eq();
		System.out.println(lbbddSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Tematica by TematicaCriteria");
		bbdd.TematicaCriteria lbbddTematicaCriteria = new bbdd.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddTematicaCriteria.idTematica.eq();
		System.out.println(lbbddTematicaCriteria.uniqueTematica());
		
		System.out.println("Retrieving Foto by FotoCriteria");
		bbdd.FotoCriteria lbbddFotoCriteria = new bbdd.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddFotoCriteria.idFoto.eq();
		System.out.println(lbbddFotoCriteria.uniqueFoto());
		
		System.out.println("Retrieving ValoracionNoticia by ValoracionNoticiaCriteria");
		bbdd.ValoracionNoticiaCriteria lbbddValoracionNoticiaCriteria = new bbdd.ValoracionNoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddValoracionNoticiaCriteria.idValoracionNoticia.eq();
		System.out.println(lbbddValoracionNoticiaCriteria.uniqueValoracionNoticia());
		
		System.out.println("Retrieving ValoracionComentario by ValoracionComentarioCriteria");
		bbdd.ValoracionComentarioCriteria lbbddValoracionComentarioCriteria = new bbdd.ValoracionComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddValoracionComentarioCriteria.idValoracionComentario.eq();
		System.out.println(lbbddValoracionComentarioCriteria.uniqueValoracionComentario());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectofinalData retrieveAndUpdateProyectofinalData = new RetrieveAndUpdateProyectofinalData();
			try {
				retrieveAndUpdateProyectofinalData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectofinalData.retrieveByCriteria();
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
