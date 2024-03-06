package interfaz;

import proyectoMDS.MainView;

public class Periodista extends Usuario_general {
	public Gestionar_noticia _gestionar_noticia;

	public MainView MainView;
	public Periodista(MainView MainView) {
		super(MainView);
		
	}
	
	
	public void Gestionar_noticia() {
		throw new UnsupportedOperationException();
	}


	public Gestionar_noticia get_gestionar_noticia() {
		return _gestionar_noticia;
	}


	public void set_gestionar_noticia(Gestionar_noticia _gestionar_noticia) {
		this._gestionar_noticia = _gestionar_noticia;
	}


	public MainView getMainView() {
		return MainView;
	}


	public void setMainView(MainView mainView) {
		MainView = mainView;
	}
	
	
	
	
}