package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasenbusqueda_item;

public class Noticias_en_busqueda_item extends VistaNoticiasenbusqueda_item{
	public Noticias_en_busqueda _noticias_en_busqueda;
	public Ver_noticia _ver_noticia;
	bbdd.Noticia _noticia;
	
	public Noticias_en_busqueda_item(Noticias_en_busqueda _noticias_en_busqueda, bbdd.Noticia noticia) {
		super();
		this._noticias_en_busqueda = _noticias_en_busqueda;
		this._noticia = noticia;
		this.getNombreNoticiaBusqueda().setValue(_noticia.getTitulo());
		this.getResumenNoticiaBusqueda().setValue(_noticia.getResumen());

        getVerNoticia().addClickListener(event -> Ver_noticia());

	}
	
	public void Ver_noticia() {
        _ver_noticia = new Ver_noticia(_noticias_en_busqueda._buscar_noticia._usuario_general);
        this._noticias_en_busqueda._buscar_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
        this._noticias_en_busqueda._buscar_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_ver_noticia);
	}
}