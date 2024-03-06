package interfaz;

import proyectoMDS.MainView;

public class Editor extends Usuario_general {
	
	
	public Ver_comentarios_de_Editor _ver_comentarios_de_Editor;
	public Gestionar _gestionar;

	public MainView MainView;
	public Editor(MainView MainView) {
		super(MainView);
	}
	
	
	public void Ver_comentarios_de_Editor() {
		throw new UnsupportedOperationException();
	}

	public void Gestionar() {
		throw new UnsupportedOperationException();
	}


	public Ver_comentarios_de_Editor get_ver_comentarios_de_Editor() {
		return _ver_comentarios_de_Editor;
	}


	public void set_ver_comentarios_de_Editor(Ver_comentarios_de_Editor _ver_comentarios_de_Editor) {
		this._ver_comentarios_de_Editor = _ver_comentarios_de_Editor;
	}


	public Gestionar get_gestionar() {
		return _gestionar;
	}


	public void set_gestionar(Gestionar _gestionar) {
		this._gestionar = _gestionar;
	}


	public MainView getMainView() {
		return MainView;
	}


	public void setMainView(MainView mainView) {
		MainView = mainView;
	}
	
	
	
	
}