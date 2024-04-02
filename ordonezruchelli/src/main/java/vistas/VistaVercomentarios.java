package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-vercomentarios")
@JsModule("./src/vista-vercomentarios.ts")
public class VistaVercomentarios extends LitTemplate {

    @Id("verComentarios")
	private Button verComentarios;

	public VistaVercomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getVerComentarios() {
		return verComentarios;
	}

	public void setVerComentarios(Button verComentarios) {
		this.verComentarios = verComentarios;
	}

}