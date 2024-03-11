package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadodeseccionesgenerico")
@JsModule("./src/vista-listadodeseccionesgenerico.ts")
public class VistaListadodeseccionesgenerico extends LitTemplate {

    @Id("eliminarSeccion")
	private Button eliminarSeccion;
	@Id("cambiarNombreSeccion")
	private Button cambiarNombreSeccion;

	public VistaListadodeseccionesgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

}