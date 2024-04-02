package interfaz;

import vistas.VistaAnadirnoticiaaseccion;

public class Anadir_noticia_a_seccion  extends VistaAnadirnoticiaaseccion{
//	private event _anadir_noticia;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	public Listado_de_secciones _listado_de_secciones;
	public Lista_de_noticias_que_no_estan_en__la_seccion _lista_de_noticias_que_no_estan_en__la_seccion;

	public Anadir_noticia_a_seccion (Editor editor) {
		super();
		this._gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor = editor;
	}
	
	public void Listado_de_secciones() {
		throw new UnsupportedOperationException();
	}

	public void Lista_de_noticias_que_no_estan_en__la_seccion() {
		throw new UnsupportedOperationException();
	}

	public void Anadir_noticia() {
		throw new UnsupportedOperationException();
	}
}