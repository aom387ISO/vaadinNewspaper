package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarnoticiadeseccion;

public class Gestionar_noticia_de_seccion extends VistaGestionarnoticiadeseccion{
	public Gestionar _gestionar;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	
	public Gestionar_noticia_de_seccion(Gestionar gestionar, Editor editor) {
		super();
		this._gestionar = gestionar;
		this._gestionar._editor = editor;
		
		this._gestionar_noticia_en_seccion = new Gestionar_noticia_en_seccion(this, editor);
//		this.getGestionarNoticiaDeSeccion().addClickListener(event->{
//			this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
//			Gestionar_noticia_en_seccion();
//		});	
		
	}

	public void Gestionar_noticia_en_seccion() {
//		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_noticia_en_seccion);
	}
}