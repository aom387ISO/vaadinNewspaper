package interfaz;

import vistas.VistaUsuarionosuscrito;
import proyectoMDS.MainView;

public class Usuario_no_suscrito extends VistaUsuarionosuscrito{
	
	public Ver_seccion_de_Usuario_no_suscrito _ver_seccion_de_Usuario_no_suscrito;
	public Ver_noticia_cortada _ver_noticia_cortada;
	public Iniciar_sesion _iniciar_sesion;
	public Buscar_noticia_de_no_suscrito _buscar_noticia_de_no_suscrito;
	public MainView MainView;
	
	public Usuario_no_suscrito(MainView MainView) {
		this.MainView=MainView;
		_iniciar_sesion = new Iniciar_sesion(this);
		this.getIniciarSesion().addClickListener(event->{
			this.MainView.removeAll();
			Iniciar_sesion();
		});
	}
	
	public void Ver_seccion_de_Usuario_no_suscrito() {
		throw new UnsupportedOperationException();
	}

	public void Ver_noticia_cortada() {
		throw new UnsupportedOperationException();
	}

	public void Iniciar_sesion() {
		this.MainView.add(_iniciar_sesion);
	}

	public void Buscar_noticia_de_no_suscrito() {
		throw new UnsupportedOperationException();
	}


	
}