package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVisualizarnoticiapropias;

public class Visualizar_noticia_propias extends VistaVisualizarnoticiapropias{
	//	private event _volver_a_gestion;
	public Ver_listado_propio_de_noticias_item _ver_listado_propio_de_noticias;
	public Noticias_propias _noticias_propias;
	
	public Visualizar_noticia_propias(Periodista periodista) {
		super();
		this._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista = periodista;
		
		_noticias_propias = new Noticias_propias(periodista);
		Noticias_propias();
	}

	public void Volver_a_gestion() {
		throw new UnsupportedOperationException();
	}

	public void Noticias_propias() {
		this.getNoticiasPropiasLayout().as(VerticalLayout.class).add(_noticias_propias);
	}
}