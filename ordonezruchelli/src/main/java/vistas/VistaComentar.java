package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-comentar")
@JsModule("./src/vista-comentar.ts")
public class VistaComentar extends LitTemplate {

    @Id("enviarComentario")
	private Button enviarComentario;
	@Id("introducirComentario")
	private TextField introducirComentario;

	public Button getEnviarComentario() {
		return enviarComentario;
	}

	public void setEnviarComentario(Button enviarComentario) {
		this.enviarComentario = enviarComentario;
	}

	public TextField getIntroducirComentario() {
		return introducirComentario;
	}

	public void setIntroducirComentario(TextField introducirComentario) {
		this.introducirComentario = introducirComentario;
	}

	public VistaComentar() {
        // You can initialise any data required for the connected UI components here.
    }

}