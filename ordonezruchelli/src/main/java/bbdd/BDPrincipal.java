package bbdd;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BDPrincipal implements iUsuario_suscrito, iUsuario_general, iPeriodista, iEditor, iUsuario_no_suscrito {
	public BD_Fotos _bd_fot = new BD_Fotos();
	public BD_Editores _bd_edit = new BD_Editores();
	public BD_Usuarios_suscritos _bd_u_sus = new BD_Usuarios_suscritos();
	public BD_Comentarios _bd_comen = new BD_Comentarios();
	public BD_Periodistas _bd_per = new BD_Periodistas();
	public Bd_Noticias _bd_not = new Bd_Noticias();
	public BD_Secciones _bd_sec = new BD_Secciones();
	public BD_Tematicas _bd_tem = new BD_Tematicas();

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

	public void crearNoticia(String aTitulo, Foto aImagenes, Tematica aTematica, String aCuerpo, String aResumen) {
		try {
			_bd_not.crearNoticia(aTitulo, null, null, aCuerpo, aResumen);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void cambiarDatosNoticia(String aTitulo, BD_Fotos aImagenes, BD_Tematicas aTematica, String aCuerpo,
			String aResumen) {
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

	public void anadirNoticiaSeccion(int aIdNoticia, String aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarNoticiaSeccion(int aIdNoticia, String aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void crearSeccion(String aNombreSeccion) {
		try {
			_bd_sec.crearSeccion(aNombreSeccion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void anadirAportada(String aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void cambiarPosicion(String aIdSeccion, int aNuevaPosicion) {
		throw new UnsupportedOperationException();
	}

	public void cambiarNombreSeccion(String aIdSeccion, String aNuevoNombreSeccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarSeccion(String aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public Usuario_suscrito login(String aCorreo, String aContrasena) {
		try {
			_bd_u_sus.login(aCorreo, aContrasena);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Periodista loginPeriodista(String aCorreo, String aContrasena) {
		try {
			_bd_per.loginPeriodista(aCorreo, aContrasena);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Usuario_suscrito registrarse(String aCorreo, String aContrasena, String aApodo, String aDni, Foto aFoto,
			String aNumeroTarjeta, String aCaducidad, String aCvv) {
		try {
			_bd_u_sus.registrarse(aCorreo, aContrasena, aApodo, aDni, null, aNumeroTarjeta, aCaducidad, aCvv);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void anadirAportada(String aAIdSeccion, int aIdNoticia) {
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

	@Override
	public Editor loginEditor(String aCorreo, String aContrasena) {
		try {
			_bd_edit.loginEditor(aCorreo, aContrasena);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}

}