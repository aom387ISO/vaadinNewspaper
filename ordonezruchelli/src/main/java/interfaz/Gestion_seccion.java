package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionseccion;

public class Gestion_seccion extends VistaGestionseccion{
//	private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar _gestionar;
	public Gestionar_seccion _gestionar_seccion;
	
	public Gestion_seccion (Gestionar gestionar) {
		super();
		this._gestionar = gestionar;
		
		_gestionar_seccion = new Gestionar_seccion(this);
//		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
//		Gestionar_seccion();
		this.getGestionarSeccion().addClickListener(event->{
			this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Gestionar_seccion();
		});
		
		this.getVolver().addClickListener(event->Volver_a_la_gestion_desde_gestion_portada());
		
	}

	public void Gestionar_seccion() {
		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_seccion);
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_seccion);	
		}
}