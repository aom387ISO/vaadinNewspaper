package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVernoticiacortada;

public class Ver_noticia_cortada extends VistaVernoticiacortada{
	public Usuario_no_suscrito _usuario_no_suscrito;
	public Listado_noticias_cortadas_item _listado_noticias_cortadas;
	public Ir_a_comentarios _ir_a_comentarios;
	
	public Ver_noticia_cortada(Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._usuario_no_suscrito = usuarioNoSuscrito;
		
		this._ir_a_comentarios = new Ir_a_comentarios(this);
        this.getComentariosNoSuscrito().addAttachListener(event -> {
			this._usuario_no_suscrito.getNoticiasPortada().as(VerticalLayout.class).removeAll();
        	
			Ir_a_comentarios();
        });
	}

	public void Ir_a_comentarios() {
		this._usuario_no_suscrito.getNoticiasPortada().as(VerticalLayout.class).add(_ir_a_comentarios);
		this._usuario_no_suscrito.MainView.add(_ir_a_comentarios);
	}
}