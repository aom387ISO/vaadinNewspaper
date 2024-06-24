package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.formlayout.FormLayout;

@Tag("vista-visualizarseccion")
@JsModule("./src/vista-visualizarseccion.ts")
public class VistaVisualizarseccion extends LitTemplate {

    @Id("layoutSecciones")
	private Element layoutSecciones;
	public FormLayout getFormSecciones() {
		return formSecciones;
	}

	public void setFormSecciones(FormLayout formSecciones) {
		this.formSecciones = formSecciones;
	}

	@Id("formSecciones")
	private FormLayout formSecciones;

	public Element getLayoutSecciones() {
		return layoutSecciones;
	}

	public void setLayoutSecciones(Element layoutSecciones) {
		this.layoutSecciones = layoutSecciones;
	}

	public VistaVisualizarseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}