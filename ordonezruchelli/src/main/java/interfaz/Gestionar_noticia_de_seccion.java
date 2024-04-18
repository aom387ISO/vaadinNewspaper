package interfaz;

import vistas.VistaGestionarnoticiadeseccion;

public class Gestionar_noticia_de_seccion extends VistaGestionarnoticiadeseccion{
	public Gestionar _gestionar;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	
	public Gestionar_noticia_de_seccion(Gestionar gestionar, Editor editor) {
		super();
		this._gestionar = gestionar;
		this._gestionar._editor = editor;
		
	}

	public void Gestionar_noticia_en_seccion() {
		throw new UnsupportedOperationException();
	}
}