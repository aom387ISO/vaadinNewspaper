package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentSession;

public class BD_Comentarios {
	public BDPrincipal _bd_prin_comen;
	public Vector<Comentario> _contiene_comentario = new Vector<Comentario>();

	public void eliminarComentario(int idComentario) {
		_contiene_comentario.removeIf(comentario -> comentario.getIdComentario() == idComentario);
	}

	public void comentar(int idUsuario, int idNoticia, String contenido) {
		Comentario nuevoComentario = new Comentario();
		Usuario autor = new Usuario(idUsuario);
		Noticia noticia = new Noticia(idNoticia);
		nuevoComentario.setContenido(contenido);
		nuevoComentario.setAutor(autor);
		nuevoComentario.setComenta(noticia);
		nuevoComentario.setnValoracionesPositvas(0);
		nuevoComentario.setnValoracionesNegativas(0);
		nuevoComentario.setORM_Autor(autor);
		nuevoComentario.setORM_Comenta(noticia);
		_contiene_comentario.add(nuevoComentario);
	}

	public void gustarComentario(int aIdUsuario, int aIdComentario) {
	    try {
	        PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
	        session.beginTransaction();

	        Usuario usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
	        Comentario comentario = ComentarioDAO.getComentarioByORMID(aIdComentario);

	        if (usuario != null && comentario != null) {
	            // Buscar si ya existe una valoración para este comentario por parte del usuario
	            ValoracionComentario valoracionExistente = null;
	            for (Object obj : comentario.valoracionComentario.getCollection()) {
	                ValoracionComentario val = (ValoracionComentario) obj;
	                if (val.getValorado_por().getIdUsuario() == aIdUsuario) {
	                    valoracionExistente = val;
	                    break;
	                }
	            }

	            if (valoracionExistente != null) {
	                // Si la valoración ya existe, cambia su estado o elimínala
	                if (valoracionExistente.getValoracion()) {
	                    // Si la valoración era positiva, elimínala
	                    ValoracionComentarioDAO.delete(valoracionExistente);
	                    comentario.setnValoracionesPositvas(comentario.getnValoracionesPositvas() - 1);
	                } else {
	                    // Si la valoración era negativa, cámbiala a positiva
	                    valoracionExistente.setValoracion(true);
	                    ValoracionComentarioDAO.save(valoracionExistente);
	                    comentario.setnValoracionesNegativas(comentario.getnValoracionesNegativas() - 1);
	                    comentario.setnValoracionesPositvas(comentario.getnValoracionesPositvas() + 1);
	                }
	            } else {
	                // Si no existe una valoración, crea una nueva valoración positiva
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

	        session.getTransaction().commit();
	    } catch (PersistentException e) {
	        e.printStackTrace();
	    }
	}


	public void noGustarComentario(int aIdUsuario, int aIdComentario) {
	    try {
	        PersistentSession session = ProyectofinalPersistentManager.instance().getSession();
	        session.beginTransaction();

	        Usuario usuario = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
	        Comentario comentario = ComentarioDAO.getComentarioByORMID(aIdComentario);

	        if (usuario != null && comentario != null) {
	            // Buscar si ya existe una valoración para este comentario por parte del usuario
	            ValoracionComentario valoracionExistente = null;
	            for (Object obj : comentario.valoracionComentario.getCollection()) {
	                ValoracionComentario val = (ValoracionComentario) obj;
	                if (val.getValorado_por().getIdUsuario() == aIdUsuario) {
	                    valoracionExistente = val;
	                    break;
	                }
	            }

	            if (valoracionExistente != null) {
	                // Si la valoración ya existe, cambia su estado o elimínala
	                if (!valoracionExistente.getValoracion()) {
	                    // Si la valoración era negativa, elimínala
	                    ValoracionComentarioDAO.delete(valoracionExistente);
	                    comentario.setnValoracionesNegativas(comentario.getnValoracionesNegativas() - 1);
	                } else {
	                    // Si la valoración era positiva, cámbiala a negativa
	                    valoracionExistente.setValoracion(false);
	                    ValoracionComentarioDAO.save(valoracionExistente);
	                    comentario.setnValoracionesPositvas(comentario.getnValoracionesPositvas() - 1);
	                    comentario.setnValoracionesNegativas(comentario.getnValoracionesNegativas() + 1);
	                }
	            } else {
	                // Si no existe una valoración, crea una nueva valoración negativa
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

	        session.getTransaction().commit();
	    } catch (PersistentException e) {
	        e.printStackTrace();
	    }
	}

}