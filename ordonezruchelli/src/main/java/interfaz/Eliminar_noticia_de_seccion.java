package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iEditor;
import vistas.VistaEliminarnoticiadeseccion;

public class Eliminar_noticia_de_seccion extends VistaEliminarnoticiadeseccion {
	// private event _confirmar_eliminar_noticia;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	public Listado_de_secciones _listado_de_secciones;
	iEditor _ieditor = new BDPrincipal();

	public Eliminar_noticia_de_seccion(Gestionar_noticia_en_seccion gestionar_noticia_en_seccion) {
		super();
		this._gestionar_noticia_en_seccion = gestionar_noticia_en_seccion;

		_listado_de_secciones = new Listado_de_secciones(
				_gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor);
		Listado_de_secciones();
		this._gestionar_noticia_en_seccion.getEliminarNoticia().addClickListener(event -> Confirmar_eliminar_noticia());

	}

	public void Listado_de_secciones() {
		this.getEliminarGeneral().as(VerticalLayout.class).add(_listado_de_secciones);
	}

	public void Confirmar_eliminar_noticia() {
		int idNoticia = Integer.valueOf(this.getNoticias().getValue());
		if ((idNoticia > -1) && (this.getSecciones().getValue() != null) ) {
			_ieditor.eliminarNoticiaSeccion(idNoticia, this.getSecciones().getValue());

			this._gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner()
					.as(VerticalLayout.class).removeAll();
			this._gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner()
					.as(VerticalLayout.class).add(_gestionar_noticia_en_seccion);
		}
	}
}
