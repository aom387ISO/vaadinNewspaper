package interfaz;

import java.util.Vector;

public class Lista_comentarios_valorables extends Lista_de_comentarios_generico {
	public Ver_comentarios _ver_comentarios;
	public Vector<Lista_comentarios_valorables_item> _item = new Vector<Lista_comentarios_valorables_item>();
	bbdd.Noticia _noticia;
	
	public Lista_comentarios_valorables(Usuario_general usuarioGeneral, bbdd.Noticia noticia) {
		super();
		this._ver_comentarios._ver_noticia._usuario_general = usuarioGeneral;
		this._noticia = noticia;
	}
	
}