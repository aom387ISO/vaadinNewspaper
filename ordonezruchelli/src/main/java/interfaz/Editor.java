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
		this._gestionar = new Gestionar(this);
		this.getGestionEditor().addClickListener(event->{
			this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Gestionar();
		});	
		
	}
	
	public void Ver_comentarios_de_Editor() {
		throw new UnsupportedOperationException();
	}

	public void Gestionar() {
		this.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar);
	}	
	
}