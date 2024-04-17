package interfaz;

import proyectoMDS.MainView;
import vistas.VistaPersonalizarperfil;
import interfaz.Usuario_no_suscrito;

public class Personalizar_perfil extends VistaPersonalizarperfil{
	//	private event _cambiar_apodo;
	//	private event _volver_a_portada;
	//	private event _cambiar_imagen;
	//	private event _cerrar_sesion;
	public Usuario_general _usuario_general;
	
	public Personalizar_perfil(Usuario_general usuarioGeneral) {
		super();
		this._usuario_general = usuarioGeneral;
		this.getCerrarSesion().setVisible(false);
		this.getCerrarSesion().addClickListener(event->{
			Cerrar_sesion();
		});
		this.getCambiarApodo().addClickListener(event->{
			this._usuario_general.MainView.removeAll();
			Cambiar_apodo();
		});	
		this.getVolverPortada().addClickListener(event->{
			this._usuario_general.MainView.removeAll();
			Volver_a_portada();
		});	
	}

	public void Cambiar_apodo() {
		throw new UnsupportedOperationException();
	}

	public void Volver_a_portada() {
		Usuario_general usuario_general = new Usuario_general(null);
		this._usuario_general.MainView.add(usuario_general);
	}

	public void Cambiar_imagen() {
		throw new UnsupportedOperationException();
	}

	public void Cerrar_sesion() {
		this._usuario_general.MainView.remove(this);
		Usuario_no_suscrito usuario_no_suscrito = new Usuario_no_suscrito(null);
		this._usuario_general.MainView.add(usuario_no_suscrito);
	}
}