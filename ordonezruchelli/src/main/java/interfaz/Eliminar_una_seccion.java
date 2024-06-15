package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iEditor;
import vistas.VistaEliminarunaseccion;

public class Eliminar_una_seccion extends VistaEliminarunaseccion {
	// private event _confirmar_eliminar;
	public Gestionar_seccion _gestionar_seccion;
	public Listado_de_secciones _listado_de_secciones;
	iEditor _ieditor = new BDPrincipal();

	public Eliminar_una_seccion(Gestionar_seccion gestionar_seccion) {
		super();
		this._gestionar_seccion = gestionar_seccion;

		_listado_de_secciones = new Listado_de_secciones(_gestionar_seccion._gestion_seccion._gestionar._editor);
		Listado_de_secciones();
		this._gestionar_seccion.getEliminarSeccion().addClickListener(event -> Confirmar_eliminar());
	}

	public void Listado_de_secciones() {
		this.getEliminarLayout().as(VerticalLayout.class).add(_listado_de_secciones);
	}

	public void Confirmar_eliminar() {
		if (this.getSecciones().getValue() != null) {
			_ieditor.eliminarSeccion(this.getSecciones().getValue());
			this._gestionar_seccion._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this._gestionar_seccion._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_seccion);
		}
	}
}