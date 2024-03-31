package interfaz;

import vistas.VistaIntroducirnuevaposicionenportada;

public class Introducir_nueva_posicion_en_portada extends VistaIntroducirnuevaposicionenportada{
	//	private event _cambiar_posicion;
	public Noticias_en_portada_item _noticias_en_portada;
	
	public Introducir_nueva_posicion_en_portada (Editor editor) {
		super();
		this._noticias_en_portada._noticias_en_portada.editor = editor;
	}

	public void Cambiar_posicion() {
		throw new UnsupportedOperationException();
	}
}