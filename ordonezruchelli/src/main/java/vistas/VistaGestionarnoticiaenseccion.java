package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.formlayout.FormLayout;

@Tag("vista-gestionarnoticiaenseccion")
@JsModule("./src/vista-gestionarnoticiaenseccion.ts")
public class VistaGestionarnoticiaenseccion extends LitTemplate {

    @Id("layoutGeneral")
	private Element layoutGeneral;
	@Id("layoutForm")
	private FormLayout layoutForm;

	public Element getLayoutGeneral() {
		return layoutGeneral;
	}

	public void setLayoutGeneral(Element layoutGeneral) {
		this.layoutGeneral = layoutGeneral;
	}

	public FormLayout getLayoutForm() {
		return layoutForm;
	}

	public void setLayoutForm(FormLayout layoutForm) {
		this.layoutForm = layoutForm;
	}

	public VistaGestionarnoticiaenseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}