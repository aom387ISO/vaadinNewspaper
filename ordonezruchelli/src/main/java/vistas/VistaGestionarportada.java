package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-gestionarportada")
@JsModule("./src/vista-gestionarportada.ts")
public class VistaGestionarportada extends LitTemplate {

    @Id("listaPortadaLayout")
	private Element listaPortadaLayout;
	public Button getVolverParaGestion() {
		return volverParaGestion;
	}

	public void setVolverParaGestion(Button volverParaGestion) {
		this.volverParaGestion = volverParaGestion;
	}

	@Id("volverParaGestion")
	private Button volverParaGestion;

	public Element getListaPortadaLayout() {
		return listaPortadaLayout;
	}

	public void setListaPortadaLayout(Element listaPortadaLayout) {
		this.listaPortadaLayout = listaPortadaLayout;
	}

	public VistaGestionarportada() {
        // You can initialise any data required for the connected UI components here.
    }

}