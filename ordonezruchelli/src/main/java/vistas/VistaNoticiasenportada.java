package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

@Tag("vista-noticiasenportada")
@JsModule("./src/vista-noticiasenportada.ts")
public class VistaNoticiasenportada extends LitTemplate {

	@Id("item")
	private Element item;

	public VistaNoticiasenportada() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getItem() {
		return item;
	}

	public void setItem(Element item) {
		this.item = item;
	}
}