package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-eliminarunaseccion")
@JsModule("./src/vista-eliminarunaseccion.ts")
public class VistaEliminarunaseccion extends LitTemplate {

    @Id("eliminarSeccion")
	private Button eliminarSeccion;

	public VistaEliminarunaseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}