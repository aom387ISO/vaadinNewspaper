package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarnoticiaenseccion;

public class Gestionar_noticia_en_seccion extends VistaGestionarnoticiaenseccion{
//	private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar_noticia_de_seccion _gestionar_noticia_de_seccion;
	public Eliminar_noticia_de_seccion _eliminar_noticia_de_seccion;
	public Anadir_noticia_a_seccion _anadir_noticia_a_seccion;
	
	public Gestionar_noticia_en_seccion(Gestionar_noticia_de_seccion gestionar_noticia_de_seccion) {
		super();
		this._gestionar_noticia_de_seccion = gestionar_noticia_de_seccion;
		
		_eliminar_noticia_de_seccion = new Eliminar_noticia_de_seccion(this);
		this.getEliminarNoticia().addClickListener(event->{
			this._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Eliminar_noticia_de_seccion();
		});	
		
		_anadir_noticia_a_seccion = new Anadir_noticia_a_seccion(this);
		this.getAnadirNoticia().addClickListener(event->{
			this._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Anadir_noticia_a_seccion();
		});	
		
		this.getVolverGestion().addClickListener(event->{
			this._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Volver_a_la_gestion_desde_gestion_portada();
		});
		}

	public void Eliminar_noticia_de_seccion() {
		this._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_eliminar_noticia_de_seccion);
	}

	public void Anadir_noticia_a_seccion() {
		this._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_anadir_noticia_a_seccion);
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		this._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(new Gestionar (this._gestionar_noticia_de_seccion._gestionar._editor));
	}
}