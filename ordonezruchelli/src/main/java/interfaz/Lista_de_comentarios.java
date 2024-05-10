package interfaz;

import java.util.Vector;

public class Lista_de_comentarios extends Lista_de_comentarios_generico {
	public Ir_a_comentarios _ir_a_comentarios;
	public Vector<Lista_de_comentarios_item> _item = new Vector<Lista_de_comentarios_item>();
	
	public Lista_de_comentarios (Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._ir_a_comentarios._ver_noticia_cortada._usuario_no_suscrito = usuarioNoSuscrito;
	}
	
}