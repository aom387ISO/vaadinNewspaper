package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-eliminarunaseccion")
@JsModule("./src/vista-eliminarunaseccion.ts")
public class VistaEliminarunaseccion extends LitTemplate {

    @Id("eliminarSeccion")
	private Button eliminarSeccion;
	@Id("secciones")
	private ComboBox<String> secciones;

	public Button getEliminarSeccion() {
		return eliminarSeccion;
	}

	public void setEliminarSeccion(Button eliminarSeccion) {
		this.eliminarSeccion = eliminarSeccion;
	}

	public ComboBox<String> getSecciones() {
		return secciones;
	}

	public void setSecciones(ComboBox<String> secciones) {
		this.secciones = secciones;
	}

	public VistaEliminarunaseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}