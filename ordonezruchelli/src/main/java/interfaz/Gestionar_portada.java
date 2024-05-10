package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarportada;

public class Gestionar_portada extends VistaGestionarportada{
	//	private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar _gestionar;
	public Noticias_en_portada _noticias_en_portada;
	
    public Gestionar_portada(Gestionar gestionar) {
		super();
        this._gestionar = gestionar;
		
		_noticias_en_portada = new Noticias_en_portada(this);
//		Noticias_en_portada();
	}

	public void Noticias_en_portada() {
		this.getListaPortadaLayout().as(VerticalLayout.class).add(_noticias_en_portada);
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		throw new UnsupportedOperationException();
	}
}