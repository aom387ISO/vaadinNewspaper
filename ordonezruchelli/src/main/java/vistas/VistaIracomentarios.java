package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-iracomentarios")
@JsModule("./src/vista-iracomentarios.ts")
public class VistaIracomentarios extends LitTemplate {

    @Id("layoutComentarios")
	private Element layoutComentarios;

	public Element getLayoutComentarios() {
		return layoutComentarios;
	}

	public void setLayoutComentarios(Element layoutComentarios) {
		this.layoutComentarios = layoutComentarios;
	}

	public VistaIracomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

}