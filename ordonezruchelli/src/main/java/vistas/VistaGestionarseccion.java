package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-gestionarseccion")
@JsModule("./src/vista-gestionarseccion.ts")
public class VistaGestionarseccion extends LitTemplate {


	@Id("anadirSeccion")
	private Button anadirSeccion;
	@Id("eliminarSeccion")
	private Button eliminarSeccion;
	@Id("cambiarNombreSeccion")
	private Button cambiarNombreSeccion;

	public Button getAnadirSeccion() {
		return anadirSeccion;
	}

	public void setAnadirSeccion(Button anadirSeccion) {
		this.anadirSeccion = anadirSeccion;
	}

	public Button getEliminarSeccion() {
		return eliminarSeccion;
	}

	public void setEliminarSeccion(Button eliminarSeccion) {
		this.eliminarSeccion = eliminarSeccion;
	}

	public Button getCambiarNombreSeccion() {
		return cambiarNombreSeccion;
	}

	public void setCambiarNombreSeccion(Button cambiarNombreSeccion) {
		this.cambiarNombreSeccion = cambiarNombreSeccion;
	}

	public VistaGestionarseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}