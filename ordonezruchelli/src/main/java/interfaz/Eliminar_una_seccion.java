package interfaz;

import vistas.VistaEliminarunaseccion;

public class Eliminar_una_seccion extends VistaEliminarunaseccion{
	//	private event _confirmar_eliminar;
	public Gestionar_seccion _gestionar_seccion;
	public Listado_de_secciones _listado_de_secciones;
	
	public Eliminar_una_seccion(Editor editor) {
		super();
		this._gestionar_seccion._gestion_seccion._gestionar._editor = editor;
	}

	public void Listado_de_secciones() {
		throw new UnsupportedOperationException();
	}

	public void Confirmar_eliminar() {
		throw new UnsupportedOperationException();
	}
}