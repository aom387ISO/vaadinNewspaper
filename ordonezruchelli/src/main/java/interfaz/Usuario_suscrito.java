package interfaz;

public class Usuario_suscrito extends Usuario_general {
	public Personalizar_perfil_de_Usuario_suscrito _personalizar_perfil_de_Usuario_suscrito;
	
	public Usuario_suscrito(proyectoMDS.MainView MainView) {
		super(MainView);
		this.getGestionPeriodista().setVisible(false);
		this.getGestionEditor().setVisible(false);
		this.getPersonalizar().setVisible(false);
	}
	
	public void Personalizar_perfil_de_Usuario_suscrito() {
		throw new UnsupportedOperationException();
	}
	
}