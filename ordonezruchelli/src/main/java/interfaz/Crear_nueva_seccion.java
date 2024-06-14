package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import bbdd.BDPrincipal;
import bbdd.iEditor;
import vistas.VistaCrearnuevaseccion;

public class Crear_nueva_seccion extends VistaCrearnuevaseccion{
	//	private event _insertar_nombre_seccion;
	public Gestionar_seccion _gestionar_seccion;
	public Editor _editor;
	iEditor _ieditor = new BDPrincipal();
	public Crear_nueva_seccion (Gestionar_seccion gestionar_seccion) {
		super();
		this._gestionar_seccion = gestionar_seccion;
		this._editor = _gestionar_seccion._gestion_seccion._gestionar._editor;
		this.getAnadirSeccion().addClickListener(event->Insertar_nombre_seccion());
	}

	public void Insertar_nombre_seccion() {
		_ieditor.crearSeccion(this.getNombreSeccion().getValue());
		this._editor._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._editor._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_seccion);
	}
}