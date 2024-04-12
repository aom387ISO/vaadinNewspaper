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
		tabla.Noticia[] tablaNoticias = tabla.NoticiaDAO.listNoticiaByQuery(null, null);
		int length = Math.min(tablaNoticias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaNoticias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		tabla.Usuario[] tablaUsuarios = tabla.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(tablaUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Periodista...");
		tabla.Periodista[] tablaPeriodistas = tabla.PeriodistaDAO.listPeriodistaByQuery(null, null);
		length = Math.min(tablaPeriodistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaPeriodistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_suscrito...");
		tabla.Usuario_suscrito[] tablaUsuario_suscritos = tabla.Usuario_suscritoDAO.listUsuario_suscritoByQuery(null, null);
		length = Math.min(tablaUsuario_suscritos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaUsuario_suscritos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Editor...");
		tabla.Editor[] tablaEditors = tabla.EditorDAO.listEditorByQuery(null, null);
		length = Math.min(tablaEditors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaEditors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		tabla.Comentario[] tablaComentarios = tabla.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(tablaComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		tabla.Seccion[] tablaSeccions = tabla.SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(tablaSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tematica...");
		tabla.Tematica[] tablaTematicas = tabla.TematicaDAO.listTematicaByQuery(null, null);
		length = Math.min(tablaTematicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaTematicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Foto...");
		tabla.Foto[] tablaFotos = tabla.FotoDAO.listFotoByQuery(null, null);
		length = Math.min(tablaFotos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaFotos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ValoracionNoticia...");
		tabla.ValoracionNoticia[] tablaValoracionNoticias = tabla.ValoracionNoticiaDAO.listValoracionNoticiaByQuery(null, null);
		length = Math.min(tablaValoracionNoticias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaValoracionNoticias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ValoracionComentario...");
		tabla.ValoracionComentario[] tablaValoracionComentarios = tabla.ValoracionComentarioDAO.listValoracionComentarioByQuery(null, null);
		length = Math.min(tablaValoracionComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tablaValoracionComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Noticia by Criteria...");
		tabla.NoticiaCriteria ltablaNoticiaCriteria = new tabla.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaNoticiaCriteria.idNoticia.eq();
		ltablaNoticiaCriteria.setMaxResults(ROW_COUNT);
		tabla.Noticia[] tablaNoticias = ltablaNoticiaCriteria.listNoticia();
		int length =tablaNoticias== null ? 0 : Math.min(tablaNoticias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaNoticias[i]);
		}
		System.out.println(length + " Noticia record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		tabla.UsuarioCriteria ltablaUsuarioCriteria = new tabla.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaUsuarioCriteria.idUsuario.eq();
		ltablaUsuarioCriteria.setMaxResults(ROW_COUNT);
		tabla.Usuario[] tablaUsuarios = ltablaUsuarioCriteria.listUsuario();
		length =tablaUsuarios== null ? 0 : Math.min(tablaUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Periodista by Criteria...");
		tabla.PeriodistaCriteria ltablaPeriodistaCriteria = new tabla.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaPeriodistaCriteria.idUsuario.eq();
		ltablaPeriodistaCriteria.setMaxResults(ROW_COUNT);
		tabla.Periodista[] tablaPeriodistas = ltablaPeriodistaCriteria.listPeriodista();
		length =tablaPeriodistas== null ? 0 : Math.min(tablaPeriodistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaPeriodistas[i]);
		}
		System.out.println(length + " Periodista record(s) retrieved."); 
		
		System.out.println("Listing Usuario_suscrito by Criteria...");
		tabla.Usuario_suscritoCriteria ltablaUsuario_suscritoCriteria = new tabla.Usuario_suscritoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaUsuario_suscritoCriteria.idUsuario.eq();
		ltablaUsuario_suscritoCriteria.setMaxResults(ROW_COUNT);
		tabla.Usuario_suscrito[] tablaUsuario_suscritos = ltablaUsuario_suscritoCriteria.listUsuario_suscrito();
		length =tablaUsuario_suscritos== null ? 0 : Math.min(tablaUsuario_suscritos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaUsuario_suscritos[i]);
		}
		System.out.println(length + " Usuario_suscrito record(s) retrieved."); 
		
		System.out.println("Listing Editor by Criteria...");
		tabla.EditorCriteria ltablaEditorCriteria = new tabla.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaEditorCriteria.idUsuario.eq();
		ltablaEditorCriteria.setMaxResults(ROW_COUNT);
		tabla.Editor[] tablaEditors = ltablaEditorCriteria.listEditor();
		length =tablaEditors== null ? 0 : Math.min(tablaEditors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaEditors[i]);
		}
		System.out.println(length + " Editor record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		tabla.ComentarioCriteria ltablaComentarioCriteria = new tabla.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaComentarioCriteria.idComentario.eq();
		ltablaComentarioCriteria.setMaxResults(ROW_COUNT);
		tabla.Comentario[] tablaComentarios = ltablaComentarioCriteria.listComentario();
		length =tablaComentarios== null ? 0 : Math.min(tablaComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		tabla.SeccionCriteria ltablaSeccionCriteria = new tabla.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaSeccionCriteria.idSeccion.eq();
		ltablaSeccionCriteria.setMaxResults(ROW_COUNT);
		tabla.Seccion[] tablaSeccions = ltablaSeccionCriteria.listSeccion();
		length =tablaSeccions== null ? 0 : Math.min(tablaSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Tematica by Criteria...");
		tabla.TematicaCriteria ltablaTematicaCriteria = new tabla.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaTematicaCriteria.idTematica.eq();
		ltablaTematicaCriteria.setMaxResults(ROW_COUNT);
		tabla.Tematica[] tablaTematicas = ltablaTematicaCriteria.listTematica();
		length =tablaTematicas== null ? 0 : Math.min(tablaTematicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaTematicas[i]);
		}
		System.out.println(length + " Tematica record(s) retrieved."); 
		
		System.out.println("Listing Foto by Criteria...");
		tabla.FotoCriteria ltablaFotoCriteria = new tabla.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaFotoCriteria.idFoto.eq();
		ltablaFotoCriteria.setMaxResults(ROW_COUNT);
		tabla.Foto[] tablaFotos = ltablaFotoCriteria.listFoto();
		length =tablaFotos== null ? 0 : Math.min(tablaFotos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaFotos[i]);
		}
		System.out.println(length + " Foto record(s) retrieved."); 
		
		System.out.println("Listing ValoracionNoticia by Criteria...");
		tabla.ValoracionNoticiaCriteria ltablaValoracionNoticiaCriteria = new tabla.ValoracionNoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaValoracionNoticiaCriteria.idValoracionNoticia.eq();
		ltablaValoracionNoticiaCriteria.setMaxResults(ROW_COUNT);
		tabla.ValoracionNoticia[] tablaValoracionNoticias = ltablaValoracionNoticiaCriteria.listValoracionNoticia();
		length =tablaValoracionNoticias== null ? 0 : Math.min(tablaValoracionNoticias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaValoracionNoticias[i]);
		}
		System.out.println(length + " ValoracionNoticia record(s) retrieved."); 
		
		System.out.println("Listing ValoracionComentario by Criteria...");
		tabla.ValoracionComentarioCriteria ltablaValoracionComentarioCriteria = new tabla.ValoracionComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ltablaValoracionComentarioCriteria.idValoracionComentario.eq();
		ltablaValoracionComentarioCriteria.setMaxResults(ROW_COUNT);
		tabla.ValoracionComentario[] tablaValoracionComentarios = ltablaValoracionComentarioCriteria.listValoracionComentario();
		length =tablaValoracionComentarios== null ? 0 : Math.min(tablaValoracionComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tablaValoracionComentarios[i]);
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
				tabla.ProyectofinalPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
