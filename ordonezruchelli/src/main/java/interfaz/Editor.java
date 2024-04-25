package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Editor extends Usuario_general {
	
	public Ver_comentarios_de_Editor _ver_comentarios_de_Editor;
	public Gestionar _gestionar;
	
	tabla.Editor _editor;
	
	public Editor(proyectoMDS.MainView MainView, tabla.Editor editor) {
		super(MainView, editor);
		this._editor = editor;
		this.getGestionPeriodista().setVisible(false);
		this.getPersonalizarSuscrito().setVisible(false);
		
		//Componente estático Gestionar
		this._gestionar = new Gestionar(this);
		this.getGestionEditor().addClickListener(event->{
			this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Gestionar();
		});	
		
		_ver_comentarios_de_Editor = new Ver_comentarios_de_Editor(this);
	}
	
	public void Ver_comentarios_de_Editor() {
		this.getNoticiasBanner().as(VerticalLayout.class).add(_ver_comentarios_de_Editor);;
	}

	public void Gestionar() {
		this.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar);
	}	
	
}