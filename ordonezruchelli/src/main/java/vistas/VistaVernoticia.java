package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-vernoticia")
@JsModule("./src/vista-vernoticia.ts")
public class VistaVernoticia extends LitTemplate {

    @Id("verComentarioGeneral")
	private Element verComentarioGeneral;
	@Id("bannerPortada")
	private Element bannerPortada;

	public Element getBannerPortada() {
		return bannerPortada;
	}

	public void setBannerPortada(Element bannerPortada) {
		this.bannerPortada = bannerPortada;
	}

	public Element getVerComentarioGeneral() {
		return verComentarioGeneral;
	}

	public void setVerComentarioGeneral(Element verComentarioGeneral) {
		this.verComentarioGeneral = verComentarioGeneral;
	}

	public VistaVernoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}