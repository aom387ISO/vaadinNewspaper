package bbdd;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
public class BDPrincipal implements iUsuario_suscrito, iUsuario_general, iPeriodista, iEditor, iUsuario_no_suscrito {
	public BD_Fotos _bd_fot;
	public BD_Editores _bd_edit;
	public BD_Usuarios_suscritos _bd_u_sus;
	public BD_Comentarios _bd_comen;
	public BD_Periodistas _bd_per;
	public Bd_Noticias _bd_not;
	public BD_Secciones _bd_sec;
	public BD_Tematicas _bd_tem;

	public void darDeBaja(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void cambiarApodo(String aNuevoApodo) {
		throw new UnsupportedOperationException();
	}

	public void cambiarImagen(BD_Fotos aFoto) {
		throw new UnsupportedOperationException();
	}

	public void gustarNoticia(Bd_Noticias aIdNoticia) {
		throw new UnsupportedOperationException();
	}

	public void noGustarNoticia(int aIdNoticia) {
		throw new UnsupportedOperationException();
	}

	public void comentar(int aIdUsuario, int aIdComentario, String aContenido) {
		throw new UnsupportedOperationException();
	}

	public void gustarComentario(int aIdUsuario, int aIdComentario) {
		throw new UnsupportedOperationException();
	}

	public void noGustarComentario(int aIdUsuario, int aIdComentario) {
		throw new UnsupportedOperationException();
	}

	public void crearNoticia(String aTitulo, BD_Fotos aImagenes, BD_Tematicas aTematica, String aCuerpo, String aResumen) {
		throw new UnsupportedOperationException();
	}

	public void cambiarDatosNoticia(String aTitulo, BD_Fotos aImagenes, BD_Tematicas aTematica, String aCuerpo, String aResumen) {
		throw new UnsupportedOperationException();
	}

	public void eliminarNoticia(int aIdNoticia) {
		throw new UnsupportedOperationException();
	}

	public void crearPeriodista(String aCorreo, String aContrasena, String aApodo, String aDni, BD_Fotos aFoto) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPeriodista(int aPeriodistaId) {
		throw new UnsupportedOperationException();
	}

	public void eliminarComentario(int aIdComentario) {
		throw new UnsupportedOperationException();
	}

	public void anadirNoticiaSeccion(int aIdNoticia, int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarNoticiaSeccion(int aIdNoticia, int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void crearSeccion(String aNombreSeccion) {
		throw new UnsupportedOperationException();
	}

	public void anadirAportada(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void cambiarPosicion(int aIdSeccion, int aNuevaPosicion) {
		throw new UnsupportedOperationException();
	}

	public void cambiarNombreSeccion(String aIdSeccion, String aNuevoNombreSeccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarSeccion(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public BD_Usuarios_suscritos login(String aCorreo, String aContrasena) {
		throw new UnsupportedOperationException();
        
	}

	public BD_Usuarios_suscritos registrarse(String aCorreo, String aContrasena, String aApodo, String aDni, BD_Fotos aFoto, int aNumeroTarjeta, String aCaducidad, int aCvv) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void anadirAportada(int aAIdSeccion, int aIdNoticia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarApodo(String aANuevoApodo, int aIdUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noGustarNoticia(int aAIdNoticia, int aIdUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarImagen(BD_Fotos aAFoto, int aIdUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gustarNoticia(Bd_Noticias aAIdNoticia, int aIdUsuario) {
		// TODO Auto-generated method stub
		
	}

}