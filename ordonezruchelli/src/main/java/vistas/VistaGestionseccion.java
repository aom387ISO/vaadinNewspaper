package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-gestionseccion")
@JsModule("./src/vista-gestionseccion.ts")
public class VistaGestionseccion extends LitTemplate {

    @Id("gestionarSeccion")
	private Button gestionarSeccion;

	public VistaGestionseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}