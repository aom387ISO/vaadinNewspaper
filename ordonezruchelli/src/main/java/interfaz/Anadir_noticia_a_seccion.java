package interfaz;

import vistas.VistaAnadirnoticiaaseccion;

public class Anadir_noticia_a_seccion  extends VistaAnadirnoticiaaseccion{
//	private event _anadir_noticia;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	public Listado_de_secciones _listado_de_secciones;
	public Lista_de_noticias_que_no_estan_en__la_seccion _lista_de_noticias_que_no_estan_en__la_seccion;

	public Anadir_noticia_a_seccion (Gestionar_noticia_en_seccion gestionar_noticia_en_seccion, Editor editor) {
		super();
		this._gestionar_noticia_en_seccion = gestionar_noticia_en_seccion;
		this._gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor = editor;
	
		_listado_de_secciones = new Listado_de_secciones(editor);
		Listado_de_secciones();		

		_lista_de_noticias_que_no_estan_en__la_seccion = new Lista_de_noticias_que_no_estan_en__la_seccion(editor);		
		Lista_de_noticias_que_no_estan_en__la_seccion();

	}
	
	public void Listado_de_secciones() {
		this.getGeneralAnadir().add(_listado_de_secciones);
	}

	public void Lista_de_noticias_que_no_estan_en__la_seccion() {
		this.getGeneralAnadir().add(_lista_de_noticias_que_no_estan_en__la_seccion);
	}

	public void Anadir_noticia() {
		throw new UnsupportedOperationException();
	}
}