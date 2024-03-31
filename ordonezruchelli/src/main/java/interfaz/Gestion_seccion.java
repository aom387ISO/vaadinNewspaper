package interfaz;

import vistas.VistaGestionseccion;

public class Gestion_seccion extends VistaGestionseccion{
//	private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar _gestionar;
	public Gestionar_seccion _gestionar_seccion;
	
	public Gestion_seccion (Editor editor) {
		super();
		this._gestionar._editor = editor;
	}

	public void Gestionar_seccion() {
		throw new UnsupportedOperationException();
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		throw new UnsupportedOperationException();
	}
}