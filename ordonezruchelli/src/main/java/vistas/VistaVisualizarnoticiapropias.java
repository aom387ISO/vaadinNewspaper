package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-visualizarnoticiapropias")
@JsModule("./src/vista-visualizarnoticiapropias.ts")
public class VistaVisualizarnoticiapropias extends LitTemplate {

    @Id("noticiasPropiasLayout")
	private Element noticiasPropiasLayout;
	@Id("volverGestion")
	private Button volverGestion;

	public Button getVolverGestion() {
		return volverGestion;
	}

	public void setVolverGestion(Button volverGestion) {
		this.volverGestion = volverGestion;
	}

	public VistaVisualizarnoticiapropias() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getNoticiasPropiasLayout() {
		return noticiasPropiasLayout;
	}

	public void setNoticiasPropiasLayout(Element noticiasPropiasLayout) {
		this.noticiasPropiasLayout = noticiasPropiasLayout;
	}

}