package interfaz;

import vistas.VistaVisualizarseccion;

public class Visualizar_seccion extends VistaVisualizarseccion{
	public Usuario_general _usuario_general;
	public Listado_de_secciones _listado_de_secciones;
	
	public Visualizar_seccion(Usuario_general usuarioGeneral) {
		super();
		this._usuario_general = usuarioGeneral;
	}

	public void Listado_de_secciones() {
		throw new UnsupportedOperationException();
	}
}