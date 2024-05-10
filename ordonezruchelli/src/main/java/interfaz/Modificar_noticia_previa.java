package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaModificarnoticiaprevia;

public class Modificar_noticia_previa extends VistaModificarnoticiaprevia{
	public Gestionar_noticia _gestionar_noticia;
	public Noticias_propias _noticias_propias;

	public Modificar_noticia_previa(Gestionar_noticia gestionar_noticia) {
	    super();
	    this._gestionar_noticia = gestionar_noticia;
//	    this._gestionar_noticia._periodista = periodista;
	    
	    _noticias_propias = new Noticias_propias(this);
		this.getModificarNoticiaPrevia().addClickListener(event->{
			this._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Noticias_propias();
		});
	}

	
	public void Noticias_propias() {
		this._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).add(_noticias_propias);
	}
}