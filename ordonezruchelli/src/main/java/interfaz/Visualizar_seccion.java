package interfaz;

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;
import vistas.VistaVisualizarseccion;

public class Visualizar_seccion extends VistaVisualizarseccion{
	public Usuario_general _usuario_general;
	public Listado_de_secciones _listado_de_secciones;
	iUsuario_general _iUsuario_general = new BDPrincipal();
	public Visualizar_seccion(Usuario_general usuarioGeneral) {
		super();
		this._usuario_general = usuarioGeneral;
		
		_listado_de_secciones = new Listado_de_secciones(this);
		Listado_de_secciones();
	}

	public void Listado_de_secciones() {
	
		try {
			bbdd.Seccion[] secciones = _iUsuario_general.cargarSecciones();
			_listado_de_secciones.cargarSecciones(secciones);
			getLayoutSecciones().as(VerticalLayout.class).add(_listado_de_secciones);

		}catch (Exception e) {
            e.printStackTrace();
	        Notification notification = Notification.show("No se han cargado las secciones");
	        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);	
		}
	}
}