package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-gestionarperiodistas")
@JsModule("./src/vista-gestionarperiodistas.ts")
public class VistaGestionarperiodistas extends LitTemplate {

    @Id("bajaPeriodista")
	private Button bajaPeriodista;

	public VistaGestionarperiodistas() {
        // You can initialise any data required for the connected UI components here.
    }

}