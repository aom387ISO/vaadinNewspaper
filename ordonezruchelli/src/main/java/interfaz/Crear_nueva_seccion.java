package interfaz;

import vistas.VistaCrearnuevaseccion;

public class Crear_nueva_seccion extends VistaCrearnuevaseccion{
	//	private event _insertar_nombre_seccion;
	public Gestionar_seccion _gestionar_seccion;
	public Editor editor;
	
	public Crear_nueva_seccion (Editor editor) {
		super();
		this.editor = editor;
	}

	public void Insertar_nombre_seccion() {
		throw new UnsupportedOperationException();
	}
}