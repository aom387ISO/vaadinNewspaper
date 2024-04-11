package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarseccion;

public class Gestionar_seccion extends VistaGestionarseccion{
	public Gestion_seccion _gestion_seccion;
	public Crear_nueva_seccion _crear_nueva_seccion;
	public Cambiar_nombre_a_seccion _cambiar_nombre_a_seccion;
	public Eliminar_una_seccion _eliminar_una_seccion;
	
	public Gestionar_seccion (Editor editor) {
		super();
		this._gestion_seccion._gestionar._editor = editor;
		
		_crear_nueva_seccion = new Crear_nueva_seccion(editor);
		_cambiar_nombre_a_seccion = new Cambiar_nombre_a_seccion(editor);
		_eliminar_una_seccion = new Eliminar_una_seccion(editor);
		
		Crear_nueva_seccion();
		Cambiar_nombre_a_seccion();
		Eliminar_una_seccion();
	}

	public void Crear_nueva_seccion() {
		this.getLayoutCrear().as(VerticalLayout.class).add(_crear_nueva_seccion);
	}

	public void Cambiar_nombre_a_seccion() {
		this.getLayoutCambiar().as(VerticalLayout.class).add(_cambiar_nombre_a_seccion);
	}

	public void Eliminar_una_seccion() {
		this.getLayoutEliminar().as(VerticalLayout.class).add(_eliminar_una_seccion);
	}
}