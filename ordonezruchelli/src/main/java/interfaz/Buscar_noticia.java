package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBuscarnoticia;

public class Buscar_noticia extends VistaBuscarnoticia {
	public Usuario_general _usuario_general;
	public Noticias_en_busqueda _noticias_en_busqueda;
	
	public Buscar_noticia (Usuario_general _usuario_general) {
		super();
		this._usuario_general = _usuario_general;
		
		_noticias_en_busqueda = new Noticias_en_busqueda(_usuario_general);
		this.getAccederNoticiaBusqueda().addClickListener(event->{
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		Noticias_en_busqueda();
		});	
		
	}

	public void Noticias_en_busqueda() {
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_noticias_en_busqueda);
	}
}