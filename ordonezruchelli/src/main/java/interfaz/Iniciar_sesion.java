package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import bbdd.*;
import vistas.VistaIniciarsesion;

public class Iniciar_sesion extends VistaIniciarsesion {
	// private event _completar_Iniciar_sesion;
	public Usuario_no_suscrito _usuario_no_suscrito;
	public Gestor_correo _gestor_correo;
	public Registrarse _registrarse;
	iUsuario_suscrito _iusuarioSuscrito = new BDPrincipal();
	iEditor _ieditor = new BDPrincipal();
	iPeriodista _iperiodista = new BDPrincipal();


	public Iniciar_sesion(Usuario_no_suscrito usuario_no_suscrito) {
		super();
		this._usuario_no_suscrito = usuario_no_suscrito;
		this.getBotonLogin().addClickListener(event -> {
			Completar_Iniciar_sesion();
		});

		_registrarse = new Registrarse(this);

		this.getSuscribirseIniciarSesion().addClickListener(event -> {
			this._usuario_no_suscrito.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();

			Registrarse();
		});

	}

	public void Registrarse() {
		this._usuario_no_suscrito.getBannerNoticiasPortada().as(VerticalLayout.class).add(_registrarse);
	}

	public void Completar_Iniciar_sesion() {
		bbdd.Usuario_suscrito _usuarioSuscrito = _iusuarioSuscrito.login(this.getLogin().getValue(),
				this.getPassword().getValue());

		if (_usuarioSuscrito != null) {
            Notification notification = Notification.show("Usuario logueado con éxito");
            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);			_usuario_no_suscrito.MainView.removeAll();
			Usuario_suscrito usuarioSuscrito = new Usuario_suscrito(_usuario_no_suscrito.MainView, _usuarioSuscrito);
			_usuario_no_suscrito.MainView.add(usuarioSuscrito);
			return;
		}
			bbdd.Editor _editor = _ieditor.loginEditor(this.getLogin().getValue(), this.getPassword().getValue());
			if (_editor != null) {
		        Notification notification = Notification.show("Editor logueado con éxito");
		        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
		        _usuario_no_suscrito.MainView.removeAll();
				Editor editor = new Editor(_usuario_no_suscrito.MainView, _editor);
				_usuario_no_suscrito.MainView.add(editor);
				return;
			}
			bbdd.Periodista _periodista = _iperiodista.loginPeriodista(this.getLogin().getValue(),
						this.getPassword().getValue());
			if (_periodista != null) {
			    Notification notification = Notification.show("Periodista logueado con éxito");
		        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
		        _usuario_no_suscrito.MainView.removeAll();
				Periodista periodista = new Periodista(_usuario_no_suscrito.MainView, _periodista);
				_usuario_no_suscrito.MainView.add(periodista);
				return;
			}
			Notification notification = Notification.show("No se ha encontrado el usuario");
	        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);

	}
}