package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-elegirnoticia")
@JsModule("./src/vista-elegirnoticia.ts")
public class VistaElegirnoticia extends LitTemplate {

    @Id("elegirNoticia")
	private Button elegirNoticia;

	public Button getElegirNoticia() {
		return elegirNoticia;
	}

	public void setElegirNoticia(Button elegirNoticia) {
		this.elegirNoticia = elegirNoticia;
	}

	public VistaElegirnoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}