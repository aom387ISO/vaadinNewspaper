package interfaz;

public class Personalizar_perfil_de_Usuario_suscrito extends Personalizar_perfil {
	//	private event _dar_de_baja;
	public Usuario_suscrito _usuario_suscrito;
	bbdd.Usuario usuario;
	
	public Personalizar_perfil_de_Usuario_suscrito(Usuario_suscrito usuarioSuscrito, bbdd.Usuario usuario) {
		super(usuarioSuscrito, usuario);
		this._usuario_suscrito = usuarioSuscrito;
		this.getBajaUsuarioSuscrito().setVisible(true);
	}

	public void Dar_de_baja() {
		throw new UnsupportedOperationException();
	}
}