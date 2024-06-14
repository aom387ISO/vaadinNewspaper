package interfaz;

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
//		_iusuarioSuscrito.registrarse(this.getNuevoCorreo().getValue(), this.getNuevaPassword().getValue(), this.getNuevoApodo().getValue(), this.getNuevoDNI().getValue(), this.getNuevaFoto().getValue(), this.getAnadirTarjeta().getValue(), this.getAnadirFechaCaducidad().getValue(), this.getAnadirCVV().getValue());
		_iusuarioSuscrito.registrarse(this.getNuevoCorreo().getValue(), this.getNuevaPassword().getValue(), this.getNuevoApodo().getValue(), this.getNuevoDNI().getValue(), null, this.getAnadirTarjeta().getValue(), this.getAnadirFechaCaducidad().getValue(), this.getAnadirCVV().getValue());

	}

	public void Enviar_correo() {
		throw new UnsupportedOperationException();
	}
}