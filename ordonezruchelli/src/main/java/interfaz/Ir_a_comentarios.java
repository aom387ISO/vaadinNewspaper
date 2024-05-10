package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIracomentarios;

public class Ir_a_comentarios extends VistaIracomentarios{
	public Ver_noticia_cortada _ver_noticia_cortada;
	public Lista_de_comentarios _lista_de_comentarios;
	
	public Ir_a_comentarios (Ver_noticia_cortada verNoticiaCortada) {
		super();
	    this._ver_noticia_cortada = verNoticiaCortada;
	    this._lista_de_comentarios = new Lista_de_comentarios(_lista_de_comentarios._ir_a_comentarios._ver_noticia_cortada._usuario_no_suscrito);
		
		_lista_de_comentarios = new Lista_de_comentarios(_lista_de_comentarios._ir_a_comentarios._ver_noticia_cortada._usuario_no_suscrito);
		Lista_de_comentarios();
	}

	public void Lista_de_comentarios() {
		this.getLayoutComentarios().as(VerticalLayout.class).add(_lista_de_comentarios);
	}
}