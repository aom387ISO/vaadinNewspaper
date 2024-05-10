package interfaz;

import java.util.Vector;

import vistas.VistaNoticiasenportada;

public class Noticias_en_portada extends VistaNoticiasenportada{
	public Gestionar_portada _gestionar_portada;
	public Vector<Noticias_en_portada_item> _item = new Vector<Noticias_en_portada_item>();
	
	public Noticias_en_portada(Gestionar_portada gestionar_portada) {
		super();
		this._gestionar_portada = gestionar_portada;
//		this._gestionar_portada._gestionar._editor = editor;
	}
}