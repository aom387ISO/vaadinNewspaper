package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadodeseccionesgenerico_item")
@JsModule("./src/vista-listadodeseccionesgenerico_item.ts")
public class VistaListadodeseccionesgenerico_item extends LitTemplate {

    @Id("nombreSeccion")
	private TextArea nombreSeccion;

	public TextArea getNombreSeccion() {
		return nombreSeccion;
	}

	public void setNombreSeccion(TextArea nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
	}

	public VistaListadodeseccionesgenerico_item() {
        // You can initialise any data required for the connected UI components here.
    }

}