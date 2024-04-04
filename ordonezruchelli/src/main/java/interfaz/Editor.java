package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Editor extends Usuario_general {
	
	
	public Ver_comentarios_de_Editor _ver_comentarios_de_Editor;
	public Gestionar _gestionar;
	
	public Editor(proyectoMDS.MainView MainView) {
		super(MainView);
		this.getGestionPeriodista().setVisible(false);
		this.getPersonalizarSuscrito().setVisible(false);
		
		//Componente estático Gestionar
		_gestionar = new Gestionar(this);
		Gestionar();
		
	}
	
	public void Ver_comentarios_de_Editor() {
		throw new UnsupportedOperationException();
	}

	public void Gestionar() {
		this.getLayoutGestionEditor().as(VerticalLayout.class).add(_gestionar);
	}	
	
}