package interfaz;

import vistas.VistaIracomentarios;

public class Ir_a_comentarios extends VistaIracomentarios{
	public Ver_noticia_cortada _ver_noticia_cortada;
	public Lista_de_comentarios _lista_de_comentarios;
	
	public Ir_a_comentarios (Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._lista_de_comentarios.usuarioNoSuscrito = usuarioNoSuscrito;
	}

	public void Lista_de_comentarios() {
		throw new UnsupportedOperationException();
	}
}