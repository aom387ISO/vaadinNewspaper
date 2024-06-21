package interfaz;

import proyectoMDS.MainView;
import vistas.VistaPersonalizarperfil;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.Foto;
import bbdd.iUsuario_general;
import interfaz.Usuario_no_suscrito;

public class Personalizar_perfil extends VistaPersonalizarperfil {
	// private event _cambiar_apodo;
	// private event _volver_a_portada;
	// private event _cambiar_imagen;
	// private event _cerrar_sesion;
	public Usuario_general _usuario_general;
	bbdd.Usuario usuario;
	iUsuario_general _iUsuario = new BDPrincipal();

	public Personalizar_perfil(Usuario_general usuarioGeneral, bbdd.Usuario usuario) {
		super();
		this._usuario_general = usuarioGeneral;
		this.usuario = usuario;
//		this.getPerfil().as(VerticalLayout.class).add(this.usuario.getApodo());

		this.getBajaUsuarioSuscrito().setVisible(false);

		this.getCerrarSesion().addClickListener(event -> Cerrar_sesion());

		this.getCambiarApodo().addClickListener(event -> Cambiar_apodo());

		this.getVolverPortada().addClickListener(event -> Volver_a_portada());
	}

	public void Cambiar_apodo() {
		_iUsuario.cambiarApodo(this.getNuevoApodo().getValue(), usuario.getIdUsuario());
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_usuario_general._personalizar_perfil);
	}

	public void Volver_a_portada() {
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_usuario_general);

	}

	public void Cambiar_imagen() {
		Foto nuevaFoto = new Foto();
		_iUsuario.cambiarImagen(nuevaFoto, usuario.getIdUsuario());
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_usuario_general._personalizar_perfil);
	}

	public void Cerrar_sesion() {
        Notification notification = Notification.show("Cerrado de sesión con éxito");
        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
		this._usuario_general.MainView.removeAll();
		this._usuario_general.MainView.add(_usuario_general.MainView.usuario_no_suscrito);
	}
}