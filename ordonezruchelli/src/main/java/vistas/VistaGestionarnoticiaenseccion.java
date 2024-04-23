package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.button.Button;

@Tag("vista-gestionarnoticiaenseccion")
@JsModule("./src/vista-gestionarnoticiaenseccion.ts")
public class VistaGestionarnoticiaenseccion extends LitTemplate {

    @Id("layoutGeneral")
	private Element layoutGeneral;
	@Id("layoutForm")
	private FormLayout layoutForm;
	@Id("anadirNoticia")
	private Button anadirNoticia;
	@Id("eliminarNoticia")
	private Button eliminarNoticia;

	public Element getLayoutGeneral() {
		return layoutGeneral;
	}

	public void setLayoutGeneral(Element layoutGeneral) {
		this.layoutGeneral = layoutGeneral;
	}

	public Button getAnadirNoticia() {
		return anadirNoticia;
	}

	public void setAnadirNoticia(Button anadirNoticia) {
		this.anadirNoticia = anadirNoticia;
	}

	public Button getEliminarNoticia() {
		return eliminarNoticia;
	}

	public void setEliminarNoticia(Button eliminarNoticia) {
		this.eliminarNoticia = eliminarNoticia;
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