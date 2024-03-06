package interfaz;
import proyectoMDS.*;
public class Usuario_suscrito extends Usuario_general {
	public Personalizar_perfil_de_Usuario_suscrito _personalizar_perfil_de_Usuario_suscrito;
	
	public MainView MainView;
	public Usuario_suscrito(MainView MainView) {
		super(MainView);
		this.getGestionPeriodista().setVisible(false);
		this.getGestionEditor().setVisible(false);
	}
	
	public void Personalizar_perfil_de_Usuario_suscrito() {
		throw new UnsupportedOperationException();
	}
	
}