/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectofinalData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = tabla.ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			tabla.Noticia ltablaNoticia = tabla.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Update the properties of the persistent object
			tabla.NoticiaDAO.save(ltablaNoticia);
			tabla.Usuario ltablaUsuario = tabla.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			tabla.UsuarioDAO.save(ltablaUsuario);
			tabla.Periodista ltablaPeriodista = tabla.PeriodistaDAO.loadPeriodistaByQuery(null, null);
			// Update the properties of the persistent object
			tabla.PeriodistaDAO.save(ltablaPeriodista);
			tabla.Usuario_suscrito ltablaUsuario_suscrito = tabla.Usuario_suscritoDAO.loadUsuario_suscritoByQuery(null, null);
			// Update the properties of the persistent object
			tabla.Usuario_suscritoDAO.save(ltablaUsuario_suscrito);
			tabla.Editor ltablaEditor = tabla.EditorDAO.loadEditorByQuery(null, null);
			// Update the properties of the persistent object
			tabla.EditorDAO.save(ltablaEditor);
			tabla.Comentario ltablaComentario = tabla.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			tabla.ComentarioDAO.save(ltablaComentario);
			tabla.Seccion ltablaSeccion = tabla.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			tabla.SeccionDAO.save(ltablaSeccion);
			tabla.Tematica ltablaTematica = tabla.TematicaDAO.loadTematicaByQuery(null, null);
			// Update the properties of the persistent object
			tabla.TematicaDAO.save(ltablaTematica);
			tabla.Foto ltablaFoto = tabla.FotoDAO.loadFotoByQuery(null, null);
			// Update the properties of the persistent object
			tabla.FotoDAO.save(ltablaFoto);
			tabla.ValoracionNoticia ltablaValoracionNoticia = tabla.ValoracionNoticiaDAO.loadValoracionNoticiaByQuery(null, null);
			// Update the properties of the persistent object
			tabla.ValoracionNoticiaDAO.save(ltablaValoracionNoticia);
			tabla.ValoracionComentario ltablaValoracionComentario = tabla.ValoracionComentarioDAO.loadValoracionComentarioByQuery(null, null);
			// Update the properties of the persistent object
			tabla.ValoracionComentarioDAO.save(ltablaValoracionComentario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Noticia by NoticiaCriteria");
		tabla.NoticiaCriteria ltablaNoticiaCriteria = new tabla.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaNoticiaCriteria.idNoticia.eq();
		System.out.println(ltablaNoticiaCriteria.uniqueNoticia());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		tabla.UsuarioCriteria ltablaUsuarioCriteria = new tabla.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaUsuarioCriteria.idUsuario.eq();
		System.out.println(ltablaUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Periodista by PeriodistaCriteria");
		tabla.PeriodistaCriteria ltablaPeriodistaCriteria = new tabla.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaPeriodistaCriteria.idUsuario.eq();
		System.out.println(ltablaPeriodistaCriteria.uniquePeriodista());
		
		System.out.println("Retrieving Usuario_suscrito by Usuario_suscritoCriteria");
		tabla.Usuario_suscritoCriteria ltablaUsuario_suscritoCriteria = new tabla.Usuario_suscritoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaUsuario_suscritoCriteria.idUsuario.eq();
		System.out.println(ltablaUsuario_suscritoCriteria.uniqueUsuario_suscrito());
		
		System.out.println("Retrieving Editor by EditorCriteria");
		tabla.EditorCriteria ltablaEditorCriteria = new tabla.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaEditorCriteria.idUsuario.eq();
		System.out.println(ltablaEditorCriteria.uniqueEditor());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		tabla.ComentarioCriteria ltablaComentarioCriteria = new tabla.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaComentarioCriteria.idComentario.eq();
		System.out.println(ltablaComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		tabla.SeccionCriteria ltablaSeccionCriteria = new tabla.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaSeccionCriteria.idSeccion.eq();
		System.out.println(ltablaSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Tematica by TematicaCriteria");
		tabla.TematicaCriteria ltablaTematicaCriteria = new tabla.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaTematicaCriteria.idTematica.eq();
		System.out.println(ltablaTematicaCriteria.uniqueTematica());
		
		System.out.println("Retrieving Foto by FotoCriteria");
		tabla.FotoCriteria ltablaFotoCriteria = new tabla.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaFotoCriteria.idFoto.eq();
		System.out.println(ltablaFotoCriteria.uniqueFoto());
		
		System.out.println("Retrieving ValoracionNoticia by ValoracionNoticiaCriteria");
		tabla.ValoracionNoticiaCriteria ltablaValoracionNoticiaCriteria = new tabla.ValoracionNoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaValoracionNoticiaCriteria.idValoracionNoticia.eq();
		System.out.println(ltablaValoracionNoticiaCriteria.uniqueValoracionNoticia());
		
		System.out.println("Retrieving ValoracionComentario by ValoracionComentarioCriteria");
		tabla.ValoracionComentarioCriteria ltablaValoracionComentarioCriteria = new tabla.ValoracionComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ltablaValoracionComentarioCriteria.idValoracionComentario.eq();
		System.out.println(ltablaValoracionComentarioCriteria.uniqueValoracionComentario());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectofinalData retrieveAndUpdateProyectofinalData = new RetrieveAndUpdateProyectofinalData();
			try {
				retrieveAndUpdateProyectofinalData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectofinalData.retrieveByCriteria();
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
