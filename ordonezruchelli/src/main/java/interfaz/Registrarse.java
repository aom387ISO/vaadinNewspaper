package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_suscrito;
import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse {
	// private event _completar_registro;
	public Gestor_correo _gestor_correo;
	public Iniciar_sesion _iniciar_sesion;
	iUsuario_suscrito _iusuarioSuscrito = new BDPrincipal();

	public Registrarse(Iniciar_sesion iniciar_sesion) {
		super();
		this._iniciar_sesion = iniciar_sesion;
		this.getTerminarSuscripcion().addClickListener(event -> Completar_registro());

	}

	public void Completar_registro() {
	    String correo = this.getNuevoCorreo().getValue();
	    String password = this.getNuevaPassword().getValue();
	    String apodo = this.getNuevoApodo().getValue();
	    String dni = this.getNuevoDNI().getValue();
	    String nTarjeta = this.getAnadirTarjeta().getValue();
	    String fechaCaducidad = this.getAnadirFechaCaducidad().getValue();
	    String cvv = this.getAnadirCVV().getValue();

	    if (!validarCampos(correo, password, dni, nTarjeta, fechaCaducidad, cvv)) {
	        Notification.show("Todos los campos son obligatorios")
	            .addThemeVariants(NotificationVariant.LUMO_ERROR);
	        return;
	    }

	    if (!validarPassword(password)) {
	        Notification.show("La contraseña debe tener al menos 8 caracteres, un número, una mayúscula y una minúscula").addThemeVariants(NotificationVariant.LUMO_ERROR);
	        return;
	    }

	    _iusuarioSuscrito.registrarse(correo, password, apodo, dni, null, nTarjeta, fechaCaducidad, cvv);
	    this._iniciar_sesion._usuario_no_suscrito.getNoticiasPortada().as(VerticalLayout.class).removeAll();
	    this._iniciar_sesion._usuario_no_suscrito.getNoticiasPortada().as(VerticalLayout.class).add(_iniciar_sesion);
	}

	private boolean validarPassword(String password) {
	    if (password.length() < 8) return false;
	    if (!password.chars().anyMatch(Character::isDigit)) return false;
	    if (!password.chars().anyMatch(Character::isUpperCase)) return false;
	    if (!password.chars().anyMatch(Character::isLowerCase)) return false;
	    return true;
	}
//Se mira mejor por isEmpty para comprobar que todos los campos estén rellenos en vez de mirar si no son nulos para que funcione correctamente.
	private boolean validarCampos(String correo, String password, String dni, String nTarjeta, String fechaCaducidad, String cvv) {
	    return !correo.isEmpty() && !password.isEmpty() && !dni.isEmpty() && !nTarjeta.isEmpty() && !fechaCaducidad.isEmpty() && !cvv.isEmpty();
	}



	public void Enviar_correo() {
		throw new UnsupportedOperationException();
	}
}