package bbdd;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;

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
		try {
			_bd_u_sus.darDeBaja(aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}	
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
		        Notification notification = Notification.show("Cambiado apodo con éxito");
		        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
				return;
			}

			Editor editor = EditorDAO.getEditorByORMID(aIdUsuario);
			if (editor != null) {
				editor.setApodo(aANuevoApodo);
				EditorDAO.save(editor);
		        Notification notification = Notification.show("Cambiado apodo con éxito");
		        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
				t.commit();
				return;
			}

			Periodista periodista = PeriodistaDAO.getPeriodistaByORMID(aIdUsuario);
			if (periodista != null) {
				periodista.setApodo(aANuevoApodo);
				PeriodistaDAO.save(periodista);
		        Notification notification = Notification.show("Cambiado apodo con éxito");
		        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
				t.commit();
				return;
			}
			ProyectofinalPersistentManager.instance().disposePersistentManager();

		} catch (PersistentException e) {
			e.printStackTrace();
			Notification notification = Notification.show("No se ha podido cambiar el apodo");
	        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
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
		try {
			_bd_comen.comentar(aIdUsuario, aIdComentario, aContenido);
		}catch (PersistentException e) {
			e.printStackTrace();
		}
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

	public void crearNoticia(String aTitulo, Foto aImagenes, Tematica aTematica, String aCuerpo, String aResumen, Periodista periodista) {
		try {
			_bd_not.crearNoticia(aTitulo, null, aTematica, aCuerpo, aResumen, periodista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void cambiarDatosNoticia(int idNoticia, String aTitulo, Foto aImagenes, Tematica aTematica, String aCuerpo,
			String aResumen) {
		try {
			_bd_not.cambiarDatosNoticia(idNoticia, aTitulo, aImagenes, aTematica, aCuerpo, aResumen);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
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

	public void cambiarPosicion(String aIdSeccion, int aIdNoticia, int aNuevaPosicion) {
		try {
			_bd_sec.cambiarPosicion(aIdSeccion, aIdNoticia, aNuevaPosicion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void cambiarNombreSeccion(String aIdSeccion, String aNuevoNombreSeccion) {
		try {
			_bd_sec.cambiarNombreSeccion(aIdSeccion, aNuevoNombreSeccion);
		} catch(PersistentException e) {
			e.printStackTrace();
		}
	}

	public void eliminarSeccion(String aIdSeccion) {
		try {
			_bd_sec.eliminarSeccion(aIdSeccion);
		} catch(PersistentException e) {
			e.printStackTrace();
		}
	}

	public Usuario_suscrito login(String aCorreo, String aContrasena) {
		Usuario_suscrito usuarioSuscrito = null;
		try {
			usuarioSuscrito = _bd_u_sus.login(aCorreo, aContrasena);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return usuarioSuscrito;
	}

	public Periodista loginPeriodista(String aCorreo, String aContrasena) {
		Periodista editor = null;
		try {
			editor = _bd_per.loginPeriodista(aCorreo, aContrasena);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return editor;
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
		Editor editor = null;
		try {
			editor = _bd_edit.loginEditor(aCorreo, aContrasena);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return editor;
	}

	public Periodista[] cargarPeriodistas() {
        try {
			return _bd_per.cargarPeriodistas();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}

    public Periodista buscarPeriodistaPorApodo(String apodo) {
        try {
            Periodista[] periodistas = PeriodistaDAO.listPeriodistaByQuery("Apodo = '" + apodo + "'", null);
            if (periodistas.length > 0) {
                return periodistas[0];
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }
    
	public Noticia[] cargarNoticias() {
        try {
			return _bd_not.cargarNoticia();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}
    
	public Seccion[] cargarSecciones() {
        try {
			return _bd_sec.cargarSecciones();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}
	public Noticia[] cargarNoticiasPorSeccionPortada() {
        try {
			return _bd_not.cargarNoticiasPorSeccionPortada();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Noticia[] mostrarNoticiasAutor(Periodista periodista) {
		try {
			return _bd_not.mostrarNoticiasAutor(periodista);
		}catch(PersistentException e) {
			e.printStackTrace();
	}
		return null;
	}

	public Noticia[] cargarNoticiasContenidasEnSeccion(String idSeccion) {
		try {
			return _bd_not.cargarNoticiasContenidasEnSeccion(idSeccion);
		}catch(PersistentException e) {
			e.printStackTrace();
	}
		return null;
	}
	
	public Noticia[] cargarNoticiasNoContenidasEnSeccion(String idSeccion) {
		try {
			return _bd_not.cargarNoticiasNoContenidasEnSeccion(idSeccion);
		}catch(PersistentException e) {
			e.printStackTrace();
	}
		return null;
	}

	
	public Noticia obtenerNoticiaPorTitulo(String titulo) {
		try {
			return _bd_not.obtenerNoticiaPorTitulo(titulo);
		}catch(PersistentException e) {
			e.printStackTrace();
	}
		return null;
	}
}