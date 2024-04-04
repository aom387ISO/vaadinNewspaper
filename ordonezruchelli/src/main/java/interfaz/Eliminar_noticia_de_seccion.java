package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEliminarnoticiadeseccion;

public class Eliminar_noticia_de_seccion extends VistaEliminarnoticiadeseccion{
	//	private event _confirmar_eliminar_noticia;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	public Listado_de_secciones _listado_de_secciones;
	
	public Eliminar_noticia_de_seccion(Editor editor) {
		super();
		this._gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor = editor;
		
		_listado_de_secciones = new Listado_de_secciones(editor);
		Listado_de_secciones();
	}

	public void Listado_de_secciones() {
		this.getEliminarGeneral().as(VerticalLayout.class).add(_listado_de_secciones);
	}

	public void Confirmar_eliminar_noticia() {
		throw new UnsupportedOperationException();
	}
}