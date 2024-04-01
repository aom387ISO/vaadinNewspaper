package interfaz;

import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse{
	//	private event _completar_registro;
	public Gestor_correo _gestor_correo;
	public Iniciar_sesion _iniciar_sesion;
	
	public Registrarse(Iniciar_sesion iniciar_sesion, Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._iniciar_sesion = iniciar_sesion;
		this._iniciar_sesion._usuario_no_suscrito = usuarioNoSuscrito;
	}

	public void Completar_registro() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_correo() {
		throw new UnsupportedOperationException();
	}
}