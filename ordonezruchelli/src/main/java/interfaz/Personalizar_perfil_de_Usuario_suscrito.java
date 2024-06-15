package interfaz;

import bbdd.BDPrincipal;
import bbdd.iUsuario_suscrito;

public class Personalizar_perfil_de_Usuario_suscrito extends Personalizar_perfil {
	//	private event _dar_de_baja;
	public Usuario_suscrito _usuario_suscrito;
	bbdd.Usuario usuario;
	iUsuario_suscrito _iUsuarioSuscrito = new BDPrincipal();
	public Personalizar_perfil_de_Usuario_suscrito(Usuario_suscrito usuarioSuscrito, bbdd.Usuario usuario) {
		super(usuarioSuscrito, usuario);
		this._usuario_suscrito = usuarioSuscrito;
		this.getBajaUsuarioSuscrito().setVisible(true);
		this.getBajaUsuarioSuscrito().addClickListener(event->Dar_de_baja());
		
	}

	public void Dar_de_baja() {
		_iUsuarioSuscrito.darDeBaja(usuario.getIdUsuario());
		this._usuario_general.MainView.removeAll();
		this._usuario_general.MainView.add(_usuario_general.MainView.usuario_no_suscrito);
	}
}