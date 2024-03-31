package interfaz;

import vistas.VistaVernoticiacortada;

public class Ver_noticia_cortada extends VistaVernoticiacortada{
	public Usuario_no_suscrito _usuario_no_suscrito;
	public Listado_noticias_cortadas_item _listado_noticias_cortadas;
	public Ir_a_comentarios _ir_a_comentarios;
	
	public Ver_noticia_cortada(Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._usuario_no_suscrito = usuarioNoSuscrito;
	}

	public void Ir_a_comentarios() {
		throw new UnsupportedOperationException();
	}
}