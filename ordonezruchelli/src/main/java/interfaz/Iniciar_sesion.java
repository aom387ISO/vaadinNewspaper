package interfaz;

import vistas.VistaIniciarsesion;

public class Iniciar_sesion extends VistaIniciarsesion{
	//	private event _completar_Iniciar_sesion;
	public Usuario_no_suscrito _usuario_no_suscrito;
	public Gestor_correo _gestor_correo;
	public Registrarse _registrarse;

	public Iniciar_sesion(Usuario_no_suscrito _usuario_no_suscrito) {
		super();
		this._usuario_no_suscrito = _usuario_no_suscrito;
		
		this.getBotonLogin().addClickListener(event->{
						
			if(this.getLogin().getValue().equals("usuario")) {
				_usuario_no_suscrito.MainView.removeAll();
				Usuario_suscrito usuarioSuscrito = new Usuario_suscrito(_usuario_no_suscrito.MainView);
				_usuario_no_suscrito.MainView.add(usuarioSuscrito);
			}
		});
		_registrarse = new Registrarse(this, _usuario_no_suscrito);

        this.getSuscribirseIniciarSesion().addClickListener(event -> {
        	_usuario_no_suscrito.MainView.removeAll();
        	
			Registrarse();
        });
        
		
	}
	
	public void Registrarse() {
		this._usuario_no_suscrito.MainView.add(_registrarse);
		}

	public void Completar_Iniciar_sesion() {
		throw new UnsupportedOperationException();
	}
}