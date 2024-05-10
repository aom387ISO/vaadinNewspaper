package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarseccion;

public class Gestionar_seccion extends VistaGestionarseccion{
	public Gestion_seccion _gestion_seccion;
	public Crear_nueva_seccion _crear_nueva_seccion;
	public Cambiar_nombre_a_seccion _cambiar_nombre_a_seccion;
	public Eliminar_una_seccion _eliminar_una_seccion;
	
	public Gestionar_seccion (Gestion_seccion gestion_seccion) {
		super();
		this._gestion_seccion = gestion_seccion;
		
		_crear_nueva_seccion = new Crear_nueva_seccion(this);
		this.getAnadirSeccion().addClickListener(event->{
			this._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Crear_nueva_seccion();
		});	
	
		_cambiar_nombre_a_seccion = new Cambiar_nombre_a_seccion(this);
		this.getCambiarNombreSeccion().addClickListener(event->{
			this._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Cambiar_nombre_a_seccion();
		});	
		
		_eliminar_una_seccion = new Eliminar_una_seccion(this);
		this.getEliminarSeccion().addClickListener(event->{
			this._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Eliminar_una_seccion();

		});	
		
	}

	public void Crear_nueva_seccion() {
		this._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_crear_nueva_seccion);
	}

	public void Cambiar_nombre_a_seccion() {
		this._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_cambiar_nombre_a_seccion);
	}

	public void Eliminar_una_seccion() {
		this._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_eliminar_una_seccion);
	}
}