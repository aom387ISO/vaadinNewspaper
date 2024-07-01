package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Editor extends Usuario_general {
	
	public Ver_comentarios_de_Editor _ver_comentarios_de_Editor;
	public Gestionar _gestionar;
	
	public bbdd.Editor _editor;
	
	public Editor(proyectoMDS.MainView MainView, bbdd.Editor editor) {
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
//		_ver_comentarios_de_Editor = new Ver_comentarios_de_Editor
//		_ver_comentarios_de_Editor = new Ver_comentarios_de_Editor(this, new bbdd.Noticia());
	}
	
	public void Ver_comentarios_de_Editor() {
		this.getParaNoticias().removeAll();
		this.getNoticiasBanner().as(VerticalLayout.class).add(_ver_comentarios_de_Editor);
	}

	public void Gestionar() {
		this.getParaNoticias().removeAll();
		this.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar);
	}	
	
}