package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarnoticiaenseccion;

public class Gestionar_noticia_en_seccion extends VistaGestionarnoticiaenseccion{
//	private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar_noticia_de_seccion _gestionar_noticia_de_seccion;
	public Eliminar_noticia_de_seccion _eliminar_noticia_de_seccion;
	public Anadir_noticia_a_seccion _anadir_noticia_a_seccion;
	
	public Gestionar_noticia_en_seccion(Editor editor) {
		super();
		this._gestionar_noticia_de_seccion._gestionar._editor = editor;
		
		_eliminar_noticia_de_seccion = new Eliminar_noticia_de_seccion(editor);
		Eliminar_noticia_de_seccion();
		
		_anadir_noticia_a_seccion = new Anadir_noticia_a_seccion(editor);
		Anadir_noticia_a_seccion();
	}

	public void Eliminar_noticia_de_seccion() {
		this.getLayoutForm().add(_eliminar_noticia_de_seccion);
	}

	public void Anadir_noticia_a_seccion() {
		this.getLayoutForm().add(_anadir_noticia_a_seccion);
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		throw new UnsupportedOperationException();
	}
}