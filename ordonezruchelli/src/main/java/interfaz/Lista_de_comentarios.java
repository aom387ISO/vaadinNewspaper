package interfaz;

import java.util.Vector;

public class Lista_de_comentarios extends Lista_de_comentarios_generico {
	public Ir_a_comentarios _ir_a_comentarios;
	public Vector<Lista_de_comentarios_item> _item = new Vector<Lista_de_comentarios_item>();
	public Usuario_no_suscrito usuarioNoSuscrito;
	
	public Lista_de_comentarios (Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this.usuarioNoSuscrito = usuarioNoSuscrito;
		this.getEliminarComentario().setVisible(false);
		this.getValorarNegativamenteComentario().setVisible(false);
		this.getValorarPositivamenteComentario().setVisible(false);
	}
	
}