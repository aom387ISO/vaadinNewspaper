package interfaz;

import vistas.VistaGestionarnoticiaenseccion;

public class Gestionar_noticia_en_seccion extends VistaGestionarnoticiaenseccion{
//	private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar_noticia_de_seccion _gestionar_noticia_de_seccion;
	public Eliminar_noticia_de_seccion _eliminar_noticia_de_seccion;
	public Anadir_noticia_a_seccion _anadir_noticia_a_seccion;
	
	public Gestionar_noticia_en_seccion(Editor editor) {
		super();
		this._gestionar_noticia_de_seccion._gestionar._editor = editor;
	}

	public void Eliminar_noticia_de_seccion() {
		throw new UnsupportedOperationException();
	}

	public void Anadir_noticia_a_seccion() {
		throw new UnsupportedOperationException();
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		throw new UnsupportedOperationException();
	}
}