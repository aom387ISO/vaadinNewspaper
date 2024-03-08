package interfaz;


public class Periodista extends Usuario_general {
	public Gestionar_noticia _gestionar_noticia;

	public Periodista(proyectoMDS.MainView MainView) {
		super(MainView);
		this.getGestionEditor().setVisible(false);
		this.getPersonalizarSuscrito().setVisible(false);
	}
	
	public void Gestionar_noticia() {
		throw new UnsupportedOperationException();
	}

	
}