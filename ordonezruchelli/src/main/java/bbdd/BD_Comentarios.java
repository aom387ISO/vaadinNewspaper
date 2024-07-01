package bbdd;

import bbdd.BDPrincipal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;

public class BD_Comentarios {
	public BDPrincipal _bd_prin_comen;
	public Vector<Comentario> _contiene_comentario = new Vector<Comentario>();

	public void eliminarComentario(int idComentario) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Comentario comentarioAEliminar = ComentarioDAO.loadComentarioByQuery("idComentario = " + idComentario,
					null);
			if (comentarioAEliminar != null) {
				ComentarioDAO.deleteAndDissociate(comentarioAEliminar);
				Notification.show("Comentario eliminado con éxito").addThemeVariants(NotificationVariant.LUMO_SUCCESS);
			}
			t.commit();
		} catch (Exception e) {
			Notification.show("Comentario no eliminado").addThemeVariants(NotificationVariant.LUMO_ERROR);
			t.rollback();
			
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void comentar(int idUsuario, int idNoticia, String contenido) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario autor = UsuarioDAO.getUsuarioByORMID(idUsuario);
			Noticia noticia = NoticiaDAO.getNoticiaByORMID(idNoticia);

			if (autor != null && noticia != null) {
				Comentario nuevoComentario = ComentarioDAO.createComentario();
				nuevoComentario.setContenido(contenido);
				nuevoComentario.setAutor(autor);
				nuevoComentario.setComenta(noticia);
				nuevoComentario.setnValoracionesPositvas(0);
				nuevoComentario.setnValoracionesNegativas(0);
				nuevoComentario.setORM_Autor(autor);
				nuevoComentario.setORM_Comenta(noticia);
				ComentarioDAO.save(nuevoComentario);
				t.commit();
			} else {
				t.rollback();
				System.out.println("Usuario o Noticia no encontrado.");
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void gustarComentario(int aIdUsuario, int aIdComentario) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
			Comentario comentario = ComentarioDAO.getComentarioByORMID(aIdComentario);

			if (usuario != null && comentario != null) {
				ValoracionComentario valoracionExistente = null;
				for (Object obj : comentario.valoracionComentario.getCollection()) {
					ValoracionComentario val = (ValoracionComentario) obj;
					if (val.getValorado_por().getIdUsuario() == aIdUsuario) {
						valoracionExistente = val;
						break;
					}
				}

				if (valoracionExistente != null) {
					if (valoracionExistente.getValoracion()) {
						ValoracionComentarioDAO.delete(valoracionExistente);
						comentario.setnValoracionesPositvas(comentario.getnValoracionesPositvas() - 1);
					} else {
						valoracionExistente.setValoracion(true);
						ValoracionComentarioDAO.save(valoracionExistente);
						comentario.setnValoracionesNegativas(comentario.getnValoracionesNegativas() - 1);
						comentario.setnValoracionesPositvas(comentario.getnValoracionesPositvas() + 1);
					}
				} else {
					ValoracionComentario nuevaValoracion = new ValoracionComentario();
					nuevaValoracion.setValorado_por(usuario);
					nuevaValoracion.setLe_da_valoracion(comentario);
					nuevaValoracion.setValoracion(true);
					ValoracionComentarioDAO.save(nuevaValoracion);
					comentario.setnValoracionesPositvas(comentario.getnValoracionesPositvas() + 1);
				}

				ComentarioDAO.save(comentario);
			} else {
				System.out.println("Usuario o Comentario no encontrado.");
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void noGustarComentario(int aIdUsuario, int aIdComentario) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
			Comentario comentario = ComentarioDAO.getComentarioByORMID(aIdComentario);

			if (usuario != null && comentario != null) {
				ValoracionComentario valoracionExistente = null;
				for (Object obj : comentario.valoracionComentario.getCollection()) {
					ValoracionComentario val = (ValoracionComentario) obj;
					if (val.getValorado_por().getIdUsuario() == aIdUsuario) {
						valoracionExistente = val;
						break;
					}
				}

				if (valoracionExistente != null) {
					if (!valoracionExistente.getValoracion()) {
						ValoracionComentarioDAO.delete(valoracionExistente);
						comentario.setnValoracionesNegativas(comentario.getnValoracionesNegativas() - 1);
					} else {
						valoracionExistente.setValoracion(false);
						ValoracionComentarioDAO.save(valoracionExistente);
						comentario.setnValoracionesPositvas(comentario.getnValoracionesPositvas() - 1);
						comentario.setnValoracionesNegativas(comentario.getnValoracionesNegativas() + 1);
					}
				} else {
					ValoracionComentario nuevaValoracion = new ValoracionComentario();
					nuevaValoracion.setValorado_por(usuario);
					nuevaValoracion.setLe_da_valoracion(comentario);
					nuevaValoracion.setValoracion(false);
					ValoracionComentarioDAO.save(nuevaValoracion);
					comentario.setnValoracionesNegativas(comentario.getnValoracionesNegativas() + 1);
				}

				ComentarioDAO.save(comentario);
			} else {
				System.out.println("Usuario o Comentario no encontrado.");
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public Comentario[] cargarComentariosNoticia(int idNoticia) throws PersistentException  {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Noticia noticia = NoticiaDAO.getNoticiaByORMID(idNoticia);
			if (noticia != null) {
				List<Comentario> comentarios = new ArrayList<>();
	            ComentarioCriteria criteria = new ComentarioCriteria();
	            Comentario[] comentariosNoticia = ComentarioDAO.listComentarioByCriteria(criteria);
	            
				for(Comentario comentario : comentariosNoticia) {
					if(noticia.comentada_por.contains(comentario))
						comentarios.add(comentario);
				}
				t.commit();
	            return comentarios.toArray(new Comentario[comentarios.size()]);

			} else {
				t.rollback();
				System.out.println("Usuario o Noticia no encontrado.");
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();
        return new Comentario[0];
	}

}