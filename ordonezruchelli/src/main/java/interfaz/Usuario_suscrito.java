package interfaz;
import proyectoMDS.*;
public class Usuario_suscrito extends Usuario_general {
	public Personalizar_perfil_de_Usuario_suscrito _personalizar_perfil_de_Usuario_suscrito;
	
	public MainView MainView;
	public Usuario_suscrito(MainView MainView) {
		super(MainView);
	}
	
	public void Personalizar_perfil_de_Usuario_suscrito() {
		throw new UnsupportedOperationException();
	}

	public Personalizar_perfil_de_Usuario_suscrito get_personalizar_perfil_de_Usuario_suscrito() {
		return _personalizar_perfil_de_Usuario_suscrito;
	}

	public void set_personalizar_perfil_de_Usuario_suscrito(
			Personalizar_perfil_de_Usuario_suscrito _personalizar_perfil_de_Usuario_suscrito) {
		this._personalizar_perfil_de_Usuario_suscrito = _personalizar_perfil_de_Usuario_suscrito;
	}

	public MainView getMainView() {
		return MainView;
	}

	public void setMainView(MainView mainView) {
		MainView = mainView;
	}
	
	
	
}