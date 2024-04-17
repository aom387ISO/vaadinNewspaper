package interfaz;

public class Personalizar_perfil_de_Usuario_suscrito extends Personalizar_perfil {
	//	private event _dar_de_baja;
	public Usuario_suscrito _usuario_suscrito;
	
	public Personalizar_perfil_de_Usuario_suscrito(Usuario_suscrito usuarioSuscrito) {
		super(usuarioSuscrito);
		this._usuario_suscrito = usuarioSuscrito;
		this.getCerrarSesion().setVisible(true);
	}

	public void Dar_de_baja() {
		throw new UnsupportedOperationException();
	}
}