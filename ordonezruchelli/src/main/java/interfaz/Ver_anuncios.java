package interfaz;

import vistas.VistaVeranuncios;

public class Ver_anuncios extends VistaVeranuncios{
	public Usuario_no_suscrito _usuario_no_suscrito;
	
	public Ver_anuncios(Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._usuario_no_suscrito = usuarioNoSuscrito;
	}
}