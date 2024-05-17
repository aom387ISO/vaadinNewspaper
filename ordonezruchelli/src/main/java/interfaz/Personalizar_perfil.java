package interfaz;

import proyectoMDS.MainView;
import vistas.VistaPersonalizarperfil;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Usuario_no_suscrito;

public class Personalizar_perfil extends VistaPersonalizarperfil{
	//	private event _cambiar_apodo;
	//	private event _volver_a_portada;
	//	private event _cambiar_imagen;
	//	private event _cerrar_sesion;
	public Usuario_general _usuario_general;
	bbdd.Usuario usuario;
	
	public Personalizar_perfil(Usuario_general usuarioGeneral, bbdd.Usuario usuario) {
		super();
		this._usuario_general = usuarioGeneral;
		this.usuario = usuario;
		this.getPerfil().as(VerticalLayout.class).add(this.usuario.getApodo());
		
		this.getBajaUsuarioSuscrito().setVisible(false);
		
		this.getCerrarSesion().addClickListener(event->{
			Cerrar_sesion();
		});
		
		this.getCambiarApodo().addClickListener(event->{
			Cambiar_apodo();
		});	
		
		this.getVolverPortada().addClickListener(event->{
			Volver_a_portada();
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
		this._usuario_general.MainView.removeAll();
		this._usuario_general.MainView.add(_usuario_general.MainView.usuario_no_suscrito);
	}
}