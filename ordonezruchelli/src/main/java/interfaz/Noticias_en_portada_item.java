package interfaz;

import vistas.VistaNoticiasenportada_item;

public class Noticias_en_portada_item extends VistaNoticiasenportada_item{
	//	private event _eliminar_de_portada;
	public Noticias_en_portada _noticias_en_portada;
	public Introducir_nueva_posicion_en_portada _introducir_nueva_posicion_en_portada;

	public Noticias_en_portada_item(Noticias_en_portada _noticias_en_portada) {
		super();
		this._noticias_en_portada = _noticias_en_portada;
	}
	
	public void Eliminar_de_portada() {
		throw new UnsupportedOperationException();
	}

	public void Introducir_nueva_posicion_en_portada() {
		throw new UnsupportedOperationException();
	}
}