package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBuscarnoticiadenosuscrito;

public class Buscar_noticia_de_no_suscrito  extends VistaBuscarnoticiadenosuscrito{
	public Usuario_no_suscrito _usuario_no_suscrito;
	public Listado_noticias_cortadas _listado_noticias_cortadas;
	
	public Buscar_noticia_de_no_suscrito (Usuario_no_suscrito _usuario_no_suscrito) {
		super();
		this._usuario_no_suscrito = _usuario_no_suscrito;
		
		_listado_noticias_cortadas = new Listado_noticias_cortadas(_usuario_no_suscrito);
		this.getAccederNoticiaBusquedaNoSuscrito().addClickListener(event->{
			this._usuario_no_suscrito.getNoticiasPortada().as(VerticalLayout.class).removeAll();
			Listado_noticias_cortadas();
		});		
	}

	public void Listado_noticias_cortadas() {
		this._usuario_no_suscrito.getNoticiasPortada().as(VerticalLayout.class).add(_listado_noticias_cortadas);
	}
}