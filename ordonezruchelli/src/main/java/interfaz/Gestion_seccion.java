package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionseccion;

public class Gestion_seccion extends VistaGestionseccion{
//	private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar _gestionar;
	public Gestionar_seccion _gestionar_seccion;
	
	public Gestion_seccion (Gestionar gestionar, Editor editor) {
		super();
		this._gestionar = gestionar;
		this._gestionar._editor = editor;
		
		_gestionar_seccion = new Gestionar_seccion(this, editor);
		this.getGestionarSeccion().addClickListener(event->{
			this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Gestionar_seccion();
		});	
	}

	public void Gestionar_seccion() {
		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_seccion);
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		throw new UnsupportedOperationException();
	}
}