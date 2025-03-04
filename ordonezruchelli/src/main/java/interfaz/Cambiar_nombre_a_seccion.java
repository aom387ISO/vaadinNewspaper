package interfaz;

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iEditor;
import vistas.VistaCambiarnombreaseccion;

public class Cambiar_nombre_a_seccion extends VistaCambiarnombreaseccion{
//	private event _insertar_nuevo_nombre;
	public Gestionar_seccion _gestionar_seccion;
	public Listado_de_secciones _listado_de_secciones;
	iEditor _ieditor = new BDPrincipal();
	
	public Cambiar_nombre_a_seccion (Gestionar_seccion gestionar_seccion) {
		super();
		this._gestionar_seccion = gestionar_seccion;
				
		
		_listado_de_secciones = new Listado_de_secciones(_gestionar_seccion._gestion_seccion._gestionar._editor);
		Listado_de_secciones();
		this.getCambiarNombreSeccion().addClickListener(event -> Insertar_nuevo_nombre());

		
	}

	public void Listado_de_secciones() {
//		this.getGeneralAnadir().as(VerticalLayout.class).add(_listado_de_secciones);
		try {
			bbdd.Seccion[] secciones = _ieditor.cargarSecciones();
			_listado_de_secciones.cargarSecciones(secciones);
            List<String> seccionid = java.util.Arrays.stream(secciones).map(bbdd.Seccion::getNombre)
                    .collect(Collectors.toList());
            this.getSeccionBox().setItems(seccionid);
		}catch (Exception e) {
            e.printStackTrace();
	        Notification notification = Notification.show("No se han cargado las secciones");
	        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);	
		}
	}

	public void Insertar_nuevo_nombre() {
		String idSeccion = this.getSeccionBox().getValue();
		String nuevoNombre = this.getNuevoNombreSeccion().getValue();
		if ((idSeccion != null) && (nuevoNombre != null) && !nuevoNombre.isEmpty()) {
			_ieditor.cambiarNombreSeccion(idSeccion, nuevoNombre);
			
			this._gestionar_seccion._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this._gestionar_seccion._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_seccion);

		} 
	}
}