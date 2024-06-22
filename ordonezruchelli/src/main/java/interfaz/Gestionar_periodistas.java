package interfaz;

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iEditor;
import vistas.VistaGestionarperiodistas;

public class Gestionar_periodistas extends VistaGestionarperiodistas {
	// private event _dar_de_baja_periodista;
	// private event _dar_de_alta_periodista;
	// private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar _gestionar;
	public Lista_de_periodistas _lista_de_periodistas;
	public Introducir_datos_de_periodista _introducir_datos_de_periodista;
	iEditor _iEditor = new BDPrincipal();

	public Gestionar_periodistas(Gestionar gestionar) {
		super();
		this._gestionar = gestionar;
//		this._gestionar._editor = gestionar;

		_lista_de_periodistas = new Lista_de_periodistas(this);
		Lista_de_periodistas();
//		
		this._introducir_datos_de_periodista = new Introducir_datos_de_periodista(this);
		this._introducir_datos_de_periodista.getDarAltaPeriodista().addClickListener(event -> Dar_alta_periodista());
		Introducir_datos_de_periodista();

		this.getVolverGestion().addClickListener(event -> {
			this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Volver_a_la_gestion_desde_gestion_portada();
		});
        this.getBajaPeriodista().addClickListener(event -> Dar_de_baja_periodista());

	}

	  public void Lista_de_periodistas() {
	        try {
	            bbdd.Periodista[] periodistas = _iEditor.cargarPeriodistas();
	            _lista_de_periodistas.cargarPeriodistas(periodistas);
	            this.getPeriodistasLayout().add(_lista_de_periodistas);

	            List<String> apodos = java.util.Arrays.stream(periodistas).map(bbdd.Periodista::getApodo)
	                                                  .collect(Collectors.toList());
	            this.getPeriodistaCombo().setItems(apodos);
	        } catch (Exception e) {
	            e.printStackTrace();
		        Notification notification = Notification.show("No se han cargado los periodistas");
		        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);	        }
	    }

	    public void Dar_de_baja_periodista() {
	        String selectedApodo = this.getPeriodistaCombo().getValue();
	        Notification notification = null;
	        if (selectedApodo != null && !selectedApodo.isEmpty()) {
	            bbdd.Periodista periodista = _iEditor.buscarPeriodistaPorApodo(selectedApodo);
	            if (periodista != null) {
	                _iEditor.eliminarPeriodista(periodista.getIdUsuario());
			        notification = Notification.show("Periodista deshabilitado con éxito");
			        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
	                Lista_de_periodistas();
	            } else {
			        notification = Notification.show("Periodista no encontrado");
			        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
	            }
	        } else {
		        notification = Notification.show("No se ha seleccionado ningún periodista");
		        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);

	        }
	    }
	public void Introducir_datos_de_periodista() {
		this.getGestionarLayout().as(VerticalLayout.class).add(_introducir_datos_de_periodista);
	}

	public void Dar_alta_periodista() {
		String correo = this._introducir_datos_de_periodista.getCorreoPeriodista().getValue();
		String contrasena = this._introducir_datos_de_periodista.getContrasenaPeriodista().getValue();
		String apodo = this._introducir_datos_de_periodista.getApodoPeriodista().getValue();
		String dni = this._introducir_datos_de_periodista.getDniPeriodista().getValue();
		String foto = this._introducir_datos_de_periodista.getFotoPeriodista().getValue();

		if (correo.isEmpty() || contrasena.isEmpty() || apodo.isEmpty() || dni.isEmpty()) {
			Notification.show("Todos los campos son obligatorios", 3000, Notification.Position.MIDDLE);
			return;
		} else {
			_iEditor.crearPeriodista(correo, contrasena, apodo, dni, null);
		}

	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar);
	}
}