package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

public class BD_Comentarios {
	public BDPrincipal _bd_prin_comen;
	public Vector<Comentario> _contiene_comentario = new Vector<Comentario>();

	public void eliminarComentario(int aIdComentario) {
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
}