package interfaz;

import vistas.VistaGestionarseccion;

public class Gestionar_seccion extends VistaGestionarseccion{
	public Gestion_seccion _gestion_seccion;
	public Crear_nueva_seccion _crear_nueva_seccion;
	public Cambiar_nombre_a_seccion _cambiar_nombre_a_seccion;
	public Eliminar_una_seccion _eliminar_una_seccion;
	
	public Gestionar_seccion (Editor editor) {
		super();
		this._gestion_seccion._gestionar._editor = editor;
	}

	public void Crear_nueva_seccion() {
		throw new UnsupportedOperationException();
	}

	public void Cambiar_nombre_a_seccion() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_una_seccion() {
		throw new UnsupportedOperationException();
	}
}