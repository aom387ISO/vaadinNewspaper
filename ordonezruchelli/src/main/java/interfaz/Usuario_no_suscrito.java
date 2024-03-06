package interfaz;

import proyectoMDS.MainView;

public class Usuario_no_suscrito {
	public Ver_seccion_de_Usuario_no_suscrito _ver_seccion_de_Usuario_no_suscrito;
	public Ver_noticia_cortada _ver_noticia_cortada;
	public Iniciar_sesion _iniciar_sesion;
	public Buscar_noticia_de_no_suscrito _buscar_noticia_de_no_suscrito;
	public Ver_anuncios _ver_anuncios;

	public MainView MainView;
	public Usuario_no_suscrito(MainView MainView) {
		this.MainView=MainView;
	}
	
	public void Ver_seccion_de_Usuario_no_suscrito() {
		throw new UnsupportedOperationException();
	}

	public void Ver_noticia_cortada() {
		throw new UnsupportedOperationException();
	}

	public void Iniciar_sesion() {
		throw new UnsupportedOperationException();
	}

	public void Buscar_noticia_de_no_suscrito() {
		throw new UnsupportedOperationException();
	}

	public void Ver_anuncios() {
		throw new UnsupportedOperationException();
	}

	public Ver_seccion_de_Usuario_no_suscrito get_ver_seccion_de_Usuario_no_suscrito() {
		return _ver_seccion_de_Usuario_no_suscrito;
	}

	public void set_ver_seccion_de_Usuario_no_suscrito(
			Ver_seccion_de_Usuario_no_suscrito _ver_seccion_de_Usuario_no_suscrito) {
		this._ver_seccion_de_Usuario_no_suscrito = _ver_seccion_de_Usuario_no_suscrito;
	}

	public Ver_noticia_cortada get_ver_noticia_cortada() {
		return _ver_noticia_cortada;
	}

	public void set_ver_noticia_cortada(Ver_noticia_cortada _ver_noticia_cortada) {
		this._ver_noticia_cortada = _ver_noticia_cortada;
	}

	public Iniciar_sesion get_iniciar_sesion() {
		return _iniciar_sesion;
	}

	public void set_iniciar_sesion(Iniciar_sesion _iniciar_sesion) {
		this._iniciar_sesion = _iniciar_sesion;
	}

	public Buscar_noticia_de_no_suscrito get_buscar_noticia_de_no_suscrito() {
		return _buscar_noticia_de_no_suscrito;
	}

	public void set_buscar_noticia_de_no_suscrito(Buscar_noticia_de_no_suscrito _buscar_noticia_de_no_suscrito) {
		this._buscar_noticia_de_no_suscrito = _buscar_noticia_de_no_suscrito;
	}

	public Ver_anuncios get_ver_anuncios() {
		return _ver_anuncios;
	}

	public void set_ver_anuncios(Ver_anuncios _ver_anuncios) {
		this._ver_anuncios = _ver_anuncios;
	}
	
	
}