/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectofinalData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = tabla.ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			tabla.Noticia ltablaNoticia = tabla.NoticiaDAO.createNoticia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene, incluye, comentada_por, está_contenida, nValoracionesNegativas, nValoracionesPositivas, autor
			tabla.NoticiaDAO.save(ltablaNoticia);
			tabla.Usuario ltablaUsuario = tabla.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : escribir, tiene_imagen
			tabla.UsuarioDAO.save(ltablaUsuario);
			tabla.Periodista ltablaPeriodista = tabla.PeriodistaDAO.createPeriodista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : publica, estado
			tabla.PeriodistaDAO.save(ltablaPeriodista);
			tabla.Usuario_suscrito ltablaUsuario_suscrito = tabla.Usuario_suscritoDAO.createUsuario_suscrito();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado
			tabla.Usuario_suscritoDAO.save(ltablaUsuario_suscrito);
			tabla.Editor ltablaEditor = tabla.EditorDAO.createEditor();
			// Initialize the properties of the persistent object here
			tabla.EditorDAO.save(ltablaEditor);
			tabla.Comentario ltablaComentario = tabla.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nValoracionesNegativas, nValoracionesPositvas, contenido, autor, comenta
			tabla.ComentarioDAO.save(ltablaComentario);
			tabla.Seccion ltablaSeccion = tabla.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : se_encuentra, portada, idSeccion
			tabla.SeccionDAO.save(ltablaSeccion);
			tabla.Tematica ltablaTematica = tabla.TematicaDAO.createTematica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : da_tematica_a, idTematica
			tabla.TematicaDAO.save(ltablaTematica);
			tabla.Foto ltablaFoto = tabla.FotoDAO.createFoto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : le_da_imagen_a, pertenece
			tabla.FotoDAO.save(ltablaFoto);
			tabla.ValoracionNoticia ltablaValoracionNoticia = tabla.ValoracionNoticiaDAO.createValoracionNoticia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valoracion
			tabla.ValoracionNoticiaDAO.save(ltablaValoracionNoticia);
			tabla.ValoracionComentario ltablaValoracionComentario = tabla.ValoracionComentarioDAO.createValoracionComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valoracion
			tabla.ValoracionComentarioDAO.save(ltablaValoracionComentario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectofinalData createProyectofinalData = new CreateProyectofinalData();
			try {
				createProyectofinalData.createTestData();
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
