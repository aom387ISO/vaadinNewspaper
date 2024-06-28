package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Noticias_propias_item extends Listado_de_noticias_generico_item {
	public Noticias_propias _noticias_propias;
	public Elegir_noticia _elegir_noticia;
	bbdd.Noticia _noticia;

	public Noticias_propias_item(Noticias_propias _noticias_propias, Listado_de_noticias_generico _listado_de_noticias_generico, bbdd.Noticia noticia) {
		super(_listado_de_noticias_generico, noticia);
		this._noticia = noticia;
        this._noticias_propias = _noticias_propias;
        this._elegir_noticia = new Elegir_noticia(this);
	    Button selectButton = new Button("Modificar", event -> Elegir_noticia());
	    this.getModificarNoticia().add(selectButton);
//        this.add(new Text(noticia.getTitulo()), selectButton);
	}

	public void Elegir_noticia() {
//		Modificar_noticia_individual modificarNoticia = new Modificar_noticia_individual(_periodista, _noticia.getId());
		
		this._elegir_noticia._modificar_noticia_individual = new Modificar_noticia_individual(_noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista, _noticia, this);
        this. _noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
        this._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).add(_elegir_noticia._modificar_noticia_individual);
	}
}