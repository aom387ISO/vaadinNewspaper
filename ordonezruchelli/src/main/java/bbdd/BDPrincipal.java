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

	public void cambiarApodo(String aANuevoApodo, int aIdUsuario) {
		PersistentTransaction t = null;
		try {
			t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();

			Usuario_suscrito usuario = Usuario_suscritoDAO.getUsuario_suscritoByORMID(aIdUsuario);
			if (usuario != null) {
				usuario.setApodo(aANuevoApodo);
				Usuario_suscritoDAO.save(usuario);
				t.commit();
				return;
			}

			Editor editor = EditorDAO.getEditorByORMID(aIdUsuario);
			if (editor != null) {
				editor.setApodo(aANuevoApodo);
				EditorDAO.save(editor);
				t.commit();
				return;
			}

			Periodista periodista = PeriodistaDAO.getPeriodistaByORMID(aIdUsuario);
			if (periodista != null) {
				periodista.setApodo(aANuevoApodo);
				PeriodistaDAO.save(periodista);
				t.commit();
				return;
			}
			ProyectofinalPersistentManager.instance().disposePersistentManager();

		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}

	public void cambiarImagen(Foto aFoto) {
		throw new UnsupportedOperationException();
	}

	public void gustarNoticia(int aAIdNoticia, int aIdUsuario) {
		try {
			_bd_not.gustarNoticia(aAIdNoticia, aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void noGustarNoticia(int aAIdNoticia, int aIdUsuario) {
		try {
			_bd_not.noGustarNoticia(aAIdNoticia, aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void comentar(int aIdUsuario, int aIdComentario, String aContenido) {
		throw new UnsupportedOperationException();
	}

	public void gustarComentario(int aIdUsuario, int aIdComentario) {
		try {
			_bd_comen.noGustarComentario(aIdUsuario, aIdComentario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void noGustarComentario(int aIdUsuario, int aIdComentario) {
		try {
			_bd_comen.gustarComentario(aIdUsuario, aIdComentario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
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
		try {
			_bd_not.eliminarNoticia(aIdNoticia);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void crearPeriodista(String aCorreo, String aContrasena, String aApodo, String aDni, Foto aFoto) {
		try {
			_bd_per.crearPeriodista(aCorreo, aContrasena, aApodo, aDni, aFoto);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void eliminarPeriodista(int aPeriodistaId) {
		try {
			_bd_per.eliminarPeriodista(aPeriodistaId);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void eliminarComentario(int aIdComentario) {
		try {
			_bd_comen.eliminarComentario(aIdComentario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void anadirNoticiaSeccion(int aIdNoticia, String aIdSeccion) {
		try {
			_bd_sec.anadirNoticiaSeccion(aIdNoticia, aIdSeccion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void eliminarNoticiaSeccion(int aIdNoticia, String aIdSeccion) {
		try {
			_bd_sec.eliminarNoticiaSeccion(aIdNoticia, aIdSeccion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void crearSeccion(String aNombreSeccion) {
		try {
			_bd_sec.crearSeccion(aNombreSeccion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void anadirAportada(String aIdSeccion, int aIdNoticia) {
		try {
			_bd_sec.anadirAportada(aIdSeccion, aIdNoticia);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
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

	public void cambiarImagen(Foto aAFoto, int aIdUsuario) {
		throw new UnsupportedOperationException();

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