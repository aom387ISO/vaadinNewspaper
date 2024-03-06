package interfaz;

import proyectoMDS.MainView;

public class Periodista extends Usuario_general {
	public Gestionar_noticia _gestionar_noticia;

	public MainView MainView;
	public Periodista(MainView MainView) {
		super(MainView);
		this.getGestionEditor().setVisible(false);
		this.getPersonalizarSuscrito().setVisible(false);
	}
	
	public void Gestionar_noticia() {
		throw new UnsupportedOperationException();
	}

	
}