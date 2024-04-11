package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIracomentarios;

public class Ir_a_comentarios extends VistaIracomentarios{
	public Ver_noticia_cortada _ver_noticia_cortada;
	public Lista_de_comentarios _lista_de_comentarios;
	
	public Ir_a_comentarios (Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._lista_de_comentarios.usuarioNoSuscrito = usuarioNoSuscrito;
		
		_lista_de_comentarios = new Lista_de_comentarios(usuarioNoSuscrito);
		Lista_de_comentarios();
	}

	public void Lista_de_comentarios() {
		this.getLayoutComentarios().as(VerticalLayout.class).add(_lista_de_comentarios);
	}
}