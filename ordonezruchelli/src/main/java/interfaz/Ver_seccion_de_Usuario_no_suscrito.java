package interfaz;

import vistas.VistaVersecciondeusuarionosuscrito;

public class Ver_seccion_de_Usuario_no_suscrito extends VistaVersecciondeusuarionosuscrito{
	public Usuario_no_suscrito _usuario_no_suscrito;
	public Listado_secciones_cortadas _listado_secciones_cortadas;
	
	public Ver_seccion_de_Usuario_no_suscrito(Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._usuario_no_suscrito = usuarioNoSuscrito;
	}

	public void Listado_secciones_cortadas() {
		throw new UnsupportedOperationException();
	}
}