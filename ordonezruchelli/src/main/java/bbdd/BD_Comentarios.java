package bbdd;

import java.util.Vector;

public class BD_Comentarios {
	public BDPrincipal _bd_prin_comen;
	public java.util.Vector<Comentario> _contiene_comentario = new Vector<Comentario>();

	public void eliminarComentario(int aAIdComentario) {
		throw new UnsupportedOperationException();
	}

	public void comentar(int aAIdUsuario, int aAIdComentario, String aAContenido) {
		throw new UnsupportedOperationException();
	}

	public void gustarComentario(int aAIdUsuario, int aAIdComentario) {
		throw new UnsupportedOperationException();
	}

	public void noGustarComentario(int aAIdUsuario, int aAIdComentario) {
		throw new UnsupportedOperationException();
	}
}