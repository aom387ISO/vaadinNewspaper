package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadecomentariosgenerico")
@JsModule("./src/vista-listadecomentariosgenerico.ts")
public class VistaListadecomentariosgenerico extends LitTemplate {

    @Id("eliminarComentario")
	private Button eliminarComentario;
	@Id("valorarPositivamenteComentario")
	private Button valorarPositivamenteComentario;
	@Id("valorarNegativamenteComentario")
	private Button valorarNegativamenteComentario;

	public VistaListadecomentariosgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getEliminarComentario() {
		return eliminarComentario;
	}

	public void setEliminarComentario(Button eliminarComentario) {
		this.eliminarComentario = eliminarComentario;
	}

	public Button getValorarPositivamenteComentario() {
		return valorarPositivamenteComentario;
	}

	public void setValorarPositivamenteComentario(Button valorarPositivamenteComentario) {
		this.valorarPositivamenteComentario = valorarPositivamenteComentario;
	}

	public Button getValorarNegativamenteComentario() {
		return valorarNegativamenteComentario;
	}

	public void setValorarNegativamenteComentario(Button valorarNegativamenteComentario) {
		this.valorarNegativamenteComentario = valorarNegativamenteComentario;
	}

}