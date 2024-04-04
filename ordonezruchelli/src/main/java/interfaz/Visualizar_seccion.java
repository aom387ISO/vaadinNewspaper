package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVisualizarseccion;

public class Visualizar_seccion extends VistaVisualizarseccion{
	public Usuario_general _usuario_general;
	public Listado_de_secciones _listado_de_secciones;
	
	public Visualizar_seccion(Usuario_general usuarioGeneral) {
		super();
		this._usuario_general = usuarioGeneral;
		
		_listado_de_secciones = new Listado_de_secciones(usuarioGeneral);
		Listado_de_secciones();
	}

	public void Listado_de_secciones() {
		this.getLayoutSecciones().as(VerticalLayout.class).add(_listado_de_secciones);
	}
}