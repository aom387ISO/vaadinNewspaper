package interfaz;

import vistas.VistaCambiarnombreaseccion;

public class Cambiar_nombre_a_seccion extends VistaCambiarnombreaseccion{
//	private event _insertar_nuevo_nombre;
	public Gestionar_seccion _gestionar_seccion;
	public Listado_de_secciones _listado_de_secciones;
	
	public Cambiar_nombre_a_seccion (Editor editor) {
		super();
		this._gestionar_seccion._gestion_seccion._gestionar._editor = editor;
	}

	public void Listado_de_secciones() {
		throw new UnsupportedOperationException();
	}

	public void Insertar_nuevo_nombre() {
		throw new UnsupportedOperationException();
	}
}