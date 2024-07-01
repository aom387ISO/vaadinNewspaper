package interfaz;

import vistas.VistaIntroducirnuevaposicionenportada;

public class Introducir_nueva_posicion_en_portada extends VistaIntroducirnuevaposicionenportada{
	//	private event _cambiar_posicion;
	public Noticias_en_portada_item _noticias_en_portada;
	bbdd.iEditor ieditor;
	
	public Introducir_nueva_posicion_en_portada (Editor editor) {
		super();
		this._noticias_en_portada._noticias_en_portada._gestionar_portada._gestionar._editor = editor;
	}

	public void Cambiar_posicion() {
		ieditor.cambiarPosicion("portada", _noticias_en_portada._noticia.getIdNoticia(), Integer.valueOf(this.getNuevaPosicion().getValue()));
	}
}