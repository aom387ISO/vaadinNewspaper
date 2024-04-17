package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-veranuncios")
@JsModule("./src/vista-veranuncios.ts")
public class VistaVeranuncios extends LitTemplate {

    

	@Id("anuncioLayout")
	private Element anuncioLayout;

	public Element getAnuncioLayout() {
		return anuncioLayout;
	}

	public void setAnuncioLayout(Element anuncioLayout) {
		this.anuncioLayout = anuncioLayout;
	}

	public VistaVeranuncios() {
        // You can initialise any data required for the connected UI components here.
    }

}