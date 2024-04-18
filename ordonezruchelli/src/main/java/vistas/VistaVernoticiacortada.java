package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-vernoticiacortada")
@JsModule("./src/vista-vernoticiacortada.ts")
public class VistaVernoticiacortada extends LitTemplate {

    @Id("comentariosNoSuscrito")
	private Element comentariosNoSuscrito;

	public VistaVernoticiacortada() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getComentariosNoSuscrito() {
		return comentariosNoSuscrito;
	}

	public void setComentariosNoSuscrito(Element comentariosNoSuscrito) {
		this.comentariosNoSuscrito = comentariosNoSuscrito;
	}

}