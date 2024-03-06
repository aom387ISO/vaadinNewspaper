package interfaz;

import proyectoMDS.MainView;

public class Usuario_general {
	public Ver_noticia _ver_noticia;
	public Buscar_noticia _buscar_noticia;
	public Visualizar_seccion _visualizar_seccion;
	public Personalizar_perfil _personalizar_perfil;

	public MainView MainView;
	public Usuario_general(MainView MainView) {
		this.MainView=MainView;
	}
	
	public void Ver_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Buscar_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Visualizar_seccion() {
		throw new UnsupportedOperationException();
	}

	public void Personalizar_perfil() {
		throw new UnsupportedOperationException();
	}

	public Ver_noticia get_ver_noticia() {
		return _ver_noticia;
	}

	public void set_ver_noticia(Ver_noticia _ver_noticia) {
		this._ver_noticia = _ver_noticia;
	}

	public Buscar_noticia get_buscar_noticia() {
		return _buscar_noticia;
	}

	public void set_buscar_noticia(Buscar_noticia _buscar_noticia) {
		this._buscar_noticia = _buscar_noticia;
	}

	public Visualizar_seccion get_visualizar_seccion() {
		return _visualizar_seccion;
	}

	public void set_visualizar_seccion(Visualizar_seccion _visualizar_seccion) {
		this._visualizar_seccion = _visualizar_seccion;
	}

	public Personalizar_perfil get_personalizar_perfil() {
		return _personalizar_perfil;
	}

	public void set_personalizar_perfil(Personalizar_perfil _personalizar_perfil) {
		this._personalizar_perfil = _personalizar_perfil;
	}

	public MainView getMainView() {
		return MainView;
	}

	public void setMainView(MainView mainView) {
		MainView = mainView;
	}


	
	
}