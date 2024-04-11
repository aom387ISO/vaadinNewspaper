package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-versecciondeusuarionosuscrito")
@JsModule("./src/vista-versecciondeusuarionosuscrito.ts")
public class VistaVersecciondeusuarionosuscrito extends LitTemplate {

    @Id("layoutSecciones")
	private Element layoutSecciones;

	public Element getLayoutSecciones() {
		return layoutSecciones;
	}

	public void setLayoutSecciones(Element layoutSecciones) {
		this.layoutSecciones = layoutSecciones;
	}

	public VistaVersecciondeusuarionosuscrito() {
        // You can initialise any data required for the connected UI components here.
    }

}