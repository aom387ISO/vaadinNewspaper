package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionar;

public class Gestionar extends VistaGestionar{
	public Editor _editor;
	public Gestionar_noticia_de_seccion _gestionar_noticia_de_seccion;
	public Gestionar_periodistas _gestionar_periodistas;
	public Gestionar_portada _gestionar_portada;
	public Gestion_seccion _gestion_seccion;
	
	public Gestionar (Editor editor) {
		super();
		this._editor = editor;
		
		this._gestionar_noticia_de_seccion = new Gestionar_noticia_de_seccion(this);
		this.getGestionarNoticia().addClickListener(event->{
			this._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Gestionar_noticia_de_seccion();
		});	
		
		this._gestionar_periodistas = new Gestionar_periodistas(this);
		this.getGestionarPeriodistas().addClickListener(event->{
			this._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Gestionar_periodistas();
		});	
		
		
		this._gestionar_portada = new Gestionar_portada(this);
		this.getGestionarPortada().addClickListener(event->{
			this._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Gestionar_portada();
		});	
		
		this._gestion_seccion= new Gestion_seccion(this); 
		this.getGestionarSeccion().addClickListener(event->{
			this._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Gestion_seccion();
		});	
		
		
	}

	public void Gestionar_noticia_de_seccion() {
		this._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_noticia_de_seccion);
	}

	public void Gestionar_periodistas() {
		this._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_periodistas);
	}

	public void Gestionar_portada() {
		this._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_portada);
	}

	public void Gestion_seccion() {
		this._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestion_seccion);
	}
}