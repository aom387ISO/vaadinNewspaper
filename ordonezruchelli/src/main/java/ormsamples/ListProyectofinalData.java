/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectofinalData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Noticia...");
		bbdd.Noticia[] bbddNoticias = bbdd.NoticiaDAO.listNoticiaByQuery(null, null);
		int length = Math.min(bbddNoticias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddNoticias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		bbdd.Usuario[] bbddUsuarios = bbdd.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(bbddUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Periodista...");
		bbdd.Periodista[] bbddPeriodistas = bbdd.PeriodistaDAO.listPeriodistaByQuery(null, null);
		length = Math.min(bbddPeriodistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddPeriodistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_suscrito...");
		bbdd.Usuario_suscrito[] bbddUsuario_suscritos = bbdd.Usuario_suscritoDAO.listUsuario_suscritoByQuery(null, null);
		length = Math.min(bbddUsuario_suscritos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddUsuario_suscritos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Editor...");
		bbdd.Editor[] bbddEditors = bbdd.EditorDAO.listEditorByQuery(null, null);
		length = Math.min(bbddEditors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddEditors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		bbdd.Comentario[] bbddComentarios = bbdd.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(bbddComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		bbdd.Seccion[] bbddSeccions = bbdd.SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(bbddSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tematica...");
		bbdd.Tematica[] bbddTematicas = bbdd.TematicaDAO.listTematicaByQuery(null, null);
		length = Math.min(bbddTematicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddTematicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Foto...");
		bbdd.Foto[] bbddFotos = bbdd.FotoDAO.listFotoByQuery(null, null);
		length = Math.min(bbddFotos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddFotos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ValoracionNoticia...");
		bbdd.ValoracionNoticia[] bbddValoracionNoticias = bbdd.ValoracionNoticiaDAO.listValoracionNoticiaByQuery(null, null);
		length = Math.min(bbddValoracionNoticias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddValoracionNoticias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ValoracionComentario...");
		bbdd.ValoracionComentario[] bbddValoracionComentarios = bbdd.ValoracionComentarioDAO.listValoracionComentarioByQuery(null, null);
		length = Math.min(bbddValoracionComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddValoracionComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Noticia by Criteria...");
		bbdd.NoticiaCriteria lbbddNoticiaCriteria = new bbdd.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddNoticiaCriteria.idNoticia.eq();
		lbbddNoticiaCriteria.setMaxResults(ROW_COUNT);
		bbdd.Noticia[] bbddNoticias = lbbddNoticiaCriteria.listNoticia();
		int length =bbddNoticias== null ? 0 : Math.min(bbddNoticias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddNoticias[i]);
		}
		System.out.println(length + " Noticia record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		bbdd.UsuarioCriteria lbbddUsuarioCriteria = new bbdd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddUsuarioCriteria.idUsuario.eq();
		lbbddUsuarioCriteria.setMaxResults(ROW_COUNT);
		bbdd.Usuario[] bbddUsuarios = lbbddUsuarioCriteria.listUsuario();
		length =bbddUsuarios== null ? 0 : Math.min(bbddUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Periodista by Criteria...");
		bbdd.PeriodistaCriteria lbbddPeriodistaCriteria = new bbdd.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddPeriodistaCriteria.idUsuario.eq();
		lbbddPeriodistaCriteria.setMaxResults(ROW_COUNT);
		bbdd.Periodista[] bbddPeriodistas = lbbddPeriodistaCriteria.listPeriodista();
		length =bbddPeriodistas== null ? 0 : Math.min(bbddPeriodistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddPeriodistas[i]);
		}
		System.out.println(length + " Periodista record(s) retrieved."); 
		
		System.out.println("Listing Usuario_suscrito by Criteria...");
		bbdd.Usuario_suscritoCriteria lbbddUsuario_suscritoCriteria = new bbdd.Usuario_suscritoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddUsuario_suscritoCriteria.idUsuario.eq();
		lbbddUsuario_suscritoCriteria.setMaxResults(ROW_COUNT);
		bbdd.Usuario_suscrito[] bbddUsuario_suscritos = lbbddUsuario_suscritoCriteria.listUsuario_suscrito();
		length =bbddUsuario_suscritos== null ? 0 : Math.min(bbddUsuario_suscritos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddUsuario_suscritos[i]);
		}
		System.out.println(length + " Usuario_suscrito record(s) retrieved."); 
		
		System.out.println("Listing Editor by Criteria...");
		bbdd.EditorCriteria lbbddEditorCriteria = new bbdd.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddEditorCriteria.idUsuario.eq();
		lbbddEditorCriteria.setMaxResults(ROW_COUNT);
		bbdd.Editor[] bbddEditors = lbbddEditorCriteria.listEditor();
		length =bbddEditors== null ? 0 : Math.min(bbddEditors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddEditors[i]);
		}
		System.out.println(length + " Editor record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		bbdd.ComentarioCriteria lbbddComentarioCriteria = new bbdd.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddComentarioCriteria.idComentario.eq();
		lbbddComentarioCriteria.setMaxResults(ROW_COUNT);
		bbdd.Comentario[] bbddComentarios = lbbddComentarioCriteria.listComentario();
		length =bbddComentarios== null ? 0 : Math.min(bbddComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		bbdd.SeccionCriteria lbbddSeccionCriteria = new bbdd.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddSeccionCriteria.idSeccion.eq();
		lbbddSeccionCriteria.setMaxResults(ROW_COUNT);
		bbdd.Seccion[] bbddSeccions = lbbddSeccionCriteria.listSeccion();
		length =bbddSeccions== null ? 0 : Math.min(bbddSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Tematica by Criteria...");
		bbdd.TematicaCriteria lbbddTematicaCriteria = new bbdd.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddTematicaCriteria.idTematica.eq();
		lbbddTematicaCriteria.setMaxResults(ROW_COUNT);
		bbdd.Tematica[] bbddTematicas = lbbddTematicaCriteria.listTematica();
		length =bbddTematicas== null ? 0 : Math.min(bbddTematicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddTematicas[i]);
		}
		System.out.println(length + " Tematica record(s) retrieved."); 
		
		System.out.println("Listing Foto by Criteria...");
		bbdd.FotoCriteria lbbddFotoCriteria = new bbdd.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddFotoCriteria.idFoto.eq();
		lbbddFotoCriteria.setMaxResults(ROW_COUNT);
		bbdd.Foto[] bbddFotos = lbbddFotoCriteria.listFoto();
		length =bbddFotos== null ? 0 : Math.min(bbddFotos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddFotos[i]);
		}
		System.out.println(length + " Foto record(s) retrieved."); 
		
		System.out.println("Listing ValoracionNoticia by Criteria...");
		bbdd.ValoracionNoticiaCriteria lbbddValoracionNoticiaCriteria = new bbdd.ValoracionNoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddValoracionNoticiaCriteria.idValoracionNoticia.eq();
		lbbddValoracionNoticiaCriteria.setMaxResults(ROW_COUNT);
		bbdd.ValoracionNoticia[] bbddValoracionNoticias = lbbddValoracionNoticiaCriteria.listValoracionNoticia();
		length =bbddValoracionNoticias== null ? 0 : Math.min(bbddValoracionNoticias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddValoracionNoticias[i]);
		}
		System.out.println(length + " ValoracionNoticia record(s) retrieved."); 
		
		System.out.println("Listing ValoracionComentario by Criteria...");
		bbdd.ValoracionComentarioCriteria lbbddValoracionComentarioCriteria = new bbdd.ValoracionComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddValoracionComentarioCriteria.idValoracionComentario.eq();
		lbbddValoracionComentarioCriteria.setMaxResults(ROW_COUNT);
		bbdd.ValoracionComentario[] bbddValoracionComentarios = lbbddValoracionComentarioCriteria.listValoracionComentario();
		length =bbddValoracionComentarios== null ? 0 : Math.min(bbddValoracionComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddValoracionComentarios[i]);
		}
		System.out.println(length + " ValoracionComentario record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectofinalData listProyectofinalData = new ListProyectofinalData();
			try {
				listProyectofinalData.listTestData();
				//listProyectofinalData.listByCriteria();
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
