package interfaz;

import vistas.VistaCrearnuevaseccion;

public class Crear_nueva_seccion extends VistaCrearnuevaseccion{
	//	private event _insertar_nombre_seccion;
	public Gestionar_seccion _gestionar_seccion;
	
	public Crear_nueva_seccion (Gestionar_seccion gestionar_seccion, Editor editor) {
		super();
		this._gestionar_seccion = gestionar_seccion;
		this._gestionar_seccion._gestion_seccion._gestionar._editor = editor;
	}

	public void Insertar_nombre_seccion() {
		throw new UnsupportedOperationException();
	}
}