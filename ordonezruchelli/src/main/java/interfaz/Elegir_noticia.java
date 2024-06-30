package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaElegirnoticia;

public class Elegir_noticia extends VistaElegirnoticia {
	public Noticias_propias_item _noticias_propias;
	public Modificar_noticia_individual _modificar_noticia_individual;

	public Elegir_noticia(Periodista periodista) {
		super();
		this._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista = periodista;
		this.getElegirNoticia().addClickListener(event -> Modificar_noticia_individual());

	}
    public Elegir_noticia(Noticias_propias_item noticias_propias_item) {
        super();
        this._noticias_propias = noticias_propias_item;
    }
	public void Modificar_noticia_individual() {
		this._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).add(_noticias_propias);
	}
}