package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-gestionar")
@JsModule("./src/vista-gestionar.ts")
public class VistaGestionar extends LitTemplate {

    @Id("gestionarSeccion")
	private Button gestionarSeccion;
	@Id("gestionarNoticia")
	private Button gestionarNoticia;
	@Id("gestionarPeriodistas")
	private Button gestionarPeriodistas;
	@Id("gestionarPortada")
	private Button gestionarPortada;

	public Button getGestionarSeccion() {
		return gestionarSeccion;
	}

	public void setGestionarSeccion(Button gestionarSeccion) {
		this.gestionarSeccion = gestionarSeccion;
	}

	public Button getGestionarNoticia() {
		return gestionarNoticia;
	}

	public void setGestionarNoticia(Button gestionarNoticia) {
		this.gestionarNoticia = gestionarNoticia;
	}

	public Button getGestionarPeriodistas() {
		return gestionarPeriodistas;
	}

	public void setGestionarPeriodistas(Button gestionarPeriodistas) {
		this.gestionarPeriodistas = gestionarPeriodistas;
	}

	public Button getGestionarPortada() {
		return gestionarPortada;
	}

	public void setGestionarPortada(Button gestionarPortada) {
		this.gestionarPortada = gestionarPortada;
	}

	public VistaGestionar() {
        // You can initialise any data required for the connected UI components here.
    }

}