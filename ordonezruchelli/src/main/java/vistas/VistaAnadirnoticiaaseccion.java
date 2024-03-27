package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-anadirnoticiaaseccion")
@JsModule("./src/vista-anadirnoticiaaseccion.ts")
public class VistaAnadirnoticiaaseccion extends LitTemplate {

    @Id("anadirNoticiaSeccion")
	private Button anadirNoticiaSeccion;

	public VistaAnadirnoticiaaseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}