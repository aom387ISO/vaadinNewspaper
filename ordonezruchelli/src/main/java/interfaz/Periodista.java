package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Periodista extends Usuario_general {
	public Gestionar_noticia _gestionar_noticia;

	public Periodista(proyectoMDS.MainView MainView) {
		super(MainView);
		this.getGestionEditor().setVisible(false);
		this.getPersonalizarSuscrito().setVisible(false);
		
		//Componente estático Gestionar Noticia
		_gestionar_noticia = new Gestionar_noticia(this);
		Gestionar_noticia();
	}
	
	public void Gestionar_noticia() {
		//this.getLayoutGestionPeriodista().as(VerticalLayout.class).add(_gestionar_noticia);
	}

	
}