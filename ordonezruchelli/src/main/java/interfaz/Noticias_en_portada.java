package interfaz;

import java.util.Vector;

import vistas.VistaNoticiasenportada;

public class Noticias_en_portada extends VistaNoticiasenportada{
	public Gestionar_portada _gestionar_portada;
	public Vector<Noticias_en_portada_item> _item = new Vector<Noticias_en_portada_item>();
	public Editor editor;
	
	public Noticias_en_portada(Editor editor) {
		super();
		this.editor = editor;
	}
}