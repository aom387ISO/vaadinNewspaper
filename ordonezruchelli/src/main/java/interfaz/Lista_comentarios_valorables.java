package interfaz;

import java.util.Vector;

public class Lista_comentarios_valorables extends Lista_de_comentarios_generico {
	public Ver_comentarios _ver_comentarios;
	public Vector<Lista_comentarios_valorables_item> _item = new Vector<Lista_comentarios_valorables_item>();
	public Usuario_general usuarioGeneral;
	
	public Lista_comentarios_valorables(Usuario_general usuarioGeneral) {
		super();
		this.usuarioGeneral = usuarioGeneral;
		this.getEliminarComentario().setVisible(false);
	}
	
}