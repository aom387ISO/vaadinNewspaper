package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-modificarnoticiaprevia")
@JsModule("./src/vista-modificarnoticiaprevia.ts")
public class VistaModificarnoticiaprevia extends LitTemplate {

    @Id("modificarNoticiaPrevia")
	private Button modificarNoticiaPrevia;

	public VistaModificarnoticiaprevia() {
        // You can initialise any data required for the connected UI components here.
    }

}