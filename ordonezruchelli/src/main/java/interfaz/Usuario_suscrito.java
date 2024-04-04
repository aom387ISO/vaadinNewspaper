package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Usuario_suscrito extends Usuario_general {
	public Personalizar_perfil_de_Usuario_suscrito _personalizar_perfil_de_Usuario_suscrito;
	
	public Usuario_suscrito(proyectoMDS.MainView MainView) {
		super(MainView);
		this.getGestionPeriodista().setVisible(false);
		this.getGestionEditor().setVisible(false);
		this.getPersonalizar().setVisible(false);
		
		//Componente estático Personalizar de suscrito
		_personalizar_perfil_de_Usuario_suscrito = new Personalizar_perfil_de_Usuario_suscrito(this);
		Personalizar_perfil_de_Usuario_suscrito();
	}
	
	public void Personalizar_perfil_de_Usuario_suscrito() {
		this.getLayoutPersonalizarSuscrito().as(VerticalLayout.class).add(_personalizar_perfil_de_Usuario_suscrito);
	}
	
}