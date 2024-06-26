/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectofinalData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = bbdd.ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			bbdd.Noticia lbbddNoticia = bbdd.NoticiaDAO.createNoticia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene, incluye, comentada_por, esta_contenida, posicionPortada, nValoracionesNegativas, nValoracionesPositivas, autor
			bbdd.NoticiaDAO.save(lbbddNoticia);
			bbdd.Usuario lbbddUsuario = bbdd.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : escribir, tiene_imagen
			bbdd.UsuarioDAO.save(lbbddUsuario);
			bbdd.Periodista lbbddPeriodista = bbdd.PeriodistaDAO.createPeriodista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : publica, estado
			bbdd.PeriodistaDAO.save(lbbddPeriodista);
			bbdd.Usuario_suscrito lbbddUsuario_suscrito = bbdd.Usuario_suscritoDAO.createUsuario_suscrito();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado
			bbdd.Usuario_suscritoDAO.save(lbbddUsuario_suscrito);
			bbdd.Editor lbbddEditor = bbdd.EditorDAO.createEditor();
			// Initialize the properties of the persistent object here
			bbdd.EditorDAO.save(lbbddEditor);
			bbdd.Comentario lbbddComentario = bbdd.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nValoracionesNegativas, nValoracionesPositvas, contenido, autor, comenta
			bbdd.ComentarioDAO.save(lbbddComentario);
			bbdd.Seccion lbbddSeccion = bbdd.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : se_encuentra, nombre, portada, idSeccion
			bbdd.SeccionDAO.save(lbbddSeccion);
			bbdd.Tematica lbbddTematica = bbdd.TematicaDAO.createTematica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : da_tematica_a, idTematica
			bbdd.TematicaDAO.save(lbbddTematica);
			bbdd.Foto lbbddFoto = bbdd.FotoDAO.createFoto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : le_da_imagen_a, pertenece
			bbdd.FotoDAO.save(lbbddFoto);
			bbdd.ValoracionNoticia lbbddValoracionNoticia = bbdd.ValoracionNoticiaDAO.createValoracionNoticia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valoracion
			bbdd.ValoracionNoticiaDAO.save(lbbddValoracionNoticia);
			bbdd.ValoracionComentario lbbddValoracionComentario = bbdd.ValoracionComentarioDAO.createValoracionComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valoracion
			bbdd.ValoracionComentarioDAO.save(lbbddValoracionComentario);
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
				bbdd.ProyectofinalPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
