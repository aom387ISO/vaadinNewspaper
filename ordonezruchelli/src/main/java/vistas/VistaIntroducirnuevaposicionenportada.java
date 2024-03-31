package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-introducirnuevaposicionenportada")
@JsModule("./src/vista-introducirnuevaposicionenportada.ts")
public class VistaIntroducirnuevaposicionenportada extends LitTemplate {

    @Id("nuevaPosicion")
	private TextField nuevaPosicion;
	@Id("nuevaPosicionBoton")
	private Button nuevaPosicionBoton;

	public TextField getNuevaPosicion() {
		return nuevaPosicion;
	}

	public void setNuevaPosicion(TextField nuevaPosicion) {
		this.nuevaPosicion = nuevaPosicion;
	}

	public Button getNuevaPosicionBoton() {
		return nuevaPosicionBoton;
	}

	public void setNuevaPosicionBoton(Button nuevaPosicionBoton) {
		this.nuevaPosicionBoton = nuevaPosicionBoton;
	}

	public VistaIntroducirnuevaposicionenportada() {
        // You can initialise any data required for the connected UI components here.
    }

}