package interfaz;

import proyectoMDS.MainView;
import vistas.VistaPersonalizarperfil;

public class Personalizar_perfil extends VistaPersonalizarperfil{
	//	private event _cambiar_apodo;
	//	private event _volver_a_portada;
	//	private event _cambiar_imagen;
	//	private event _cerrar_sesion;
	public Usuario_general _usuario_general;
	
	public Personalizar_perfil(Usuario_general usuarioGeneral) {
		super();
		this._usuario_general = usuarioGeneral;
		
		this.getCerrarSesion().addClickListener(event->{
			Cerrar_sesion();
		});
		
	}

	public void Cambiar_apodo() {
		throw new UnsupportedOperationException();
	}

	public void Volver_a_portada() {
		throw new UnsupportedOperationException();
	}

	public void Cambiar_imagen() {
		throw new UnsupportedOperationException();
	}

	public void Cerrar_sesion() {
		this._usuario_general.MainView.remove(this);
		//MainView.add(MainView.Usuario_no_suscrito);
	}
}