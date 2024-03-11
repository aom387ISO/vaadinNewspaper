package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadeperiodistas")
@JsModule("./src/vista-listadeperiodistas.ts")
public class VistaListadeperiodistas extends LitTemplate {

    @Id("darDeBaja")
	private Button darDeBaja;

	public VistaListadeperiodistas() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getDarDeBaja() {
		return darDeBaja;
	}

	public void setDarDeBaja(Button darDeBaja) {
		this.darDeBaja = darDeBaja;
	}
	
}