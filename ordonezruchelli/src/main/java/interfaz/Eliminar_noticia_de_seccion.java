package interfaz;

import vistas.VistaEliminarnoticiadeseccion;

public class Eliminar_noticia_de_seccion extends VistaEliminarnoticiadeseccion{
	//	private event _confirmar_eliminar_noticia;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	public Listado_de_secciones _listado_de_secciones;
	public Editor editor;
	
	public Eliminar_noticia_de_seccion(Editor editor) {
		super();
		this.editor = editor;
	}

	public void Listado_de_secciones() {
		throw new UnsupportedOperationException();
	}

	public void Confirmar_eliminar_noticia() {
		throw new UnsupportedOperationException();
	}
}