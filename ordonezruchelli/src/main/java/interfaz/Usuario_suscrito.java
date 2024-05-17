package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Usuario_suscrito extends Usuario_general {
	public Personalizar_perfil_de_Usuario_suscrito _personalizar_perfil_de_Usuario_suscrito;
	
	bbdd.Usuario_suscrito _usuario_suscrito;
	
	public Usuario_suscrito(proyectoMDS.MainView MainView, bbdd.Usuario_suscrito usuario_suscrito) {
		super(MainView, usuario_suscrito);
		this._usuario_suscrito = usuario_suscrito;
		
		this.getGestionPeriodista().setVisible(false);
		this.getGestionEditor().setVisible(false);
		this.getPersonalizar().setVisible(false);
		
		
		
		//Componente estático Personalizar de suscrito
//		_personalizar_perfil_de_Usuario_suscrito = new Personalizar_perfil_de_Usuario_suscrito(this);
//		Personalizar_perfil_de_Usuario_suscrito();
		
		_personalizar_perfil_de_Usuario_suscrito = new Personalizar_perfil_de_Usuario_suscrito(this, _usuario_suscrito);
		this.getPersonalizarSuscrito().addClickListener(event->{
//			this.MainView.removeAll();
			this._personalizar_perfil_de_Usuario_suscrito._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this._personalizar_perfil_de_Usuario_suscrito._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_personalizar_perfil_de_Usuario_suscrito);
			Personalizar_perfil_de_Usuario_suscrito();
		});	
	}
	
	public void Personalizar_perfil_de_Usuario_suscrito() {
		this._personalizar_perfil_de_Usuario_suscrito._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._personalizar_perfil_de_Usuario_suscrito._usuario_suscrito.getNoticiasBanner().as(VerticalLayout.class).add(_personalizar_perfil_de_Usuario_suscrito);
	}
	
}