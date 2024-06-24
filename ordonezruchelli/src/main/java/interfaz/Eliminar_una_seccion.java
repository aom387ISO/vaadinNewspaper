package interfaz;

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
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
		this.getEliminarSeccion().addClickListener(event -> Confirmar_eliminar());
	}

	public void Listado_de_secciones() {
//		this.getEliminarLayout().as(VerticalLayout.class).add(_listado_de_secciones);
		try {
			bbdd.Seccion[] secciones = _ieditor.cargarSecciones();
			_listado_de_secciones.cargarSecciones(secciones);
            List<String> seccionid = java.util.Arrays.stream(secciones).map(bbdd.Seccion::getIdSeccion)
                    .collect(Collectors.toList());
            this.getSecciones().setItems(seccionid);
		}catch (Exception e) {
            e.printStackTrace();
	        Notification notification = Notification.show("No se han cargado las secciones");
	        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);	
		}
		
	}

	public void Confirmar_eliminar() {
		Notification not = null;
		String seccionEliminar = this.getSecciones().getValue();
		System.out.println(seccionEliminar);
		if (seccionEliminar != null) {
			_ieditor.eliminarSeccion(seccionEliminar);
			this._gestionar_seccion._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this._gestionar_seccion._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_seccion);
	        not = Notification.show("Seccion eliminada con éxito");
	        not.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
		}else {
	        not = Notification.show("Seccion no eliminada");
	        not.addThemeVariants(NotificationVariant.LUMO_ERROR);
		}
	}
}