package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-gestionarseccion")
@JsModule("./src/vista-gestionarseccion.ts")
public class VistaGestionarseccion extends LitTemplate {

    @Id("layoutCrear")
	private Element layoutCrear;
	@Id("layoutEliminar")
	private Element layoutEliminar;
	@Id("layoutCambiar")
	private Element layoutCambiar;

	public Element getLayoutCrear() {
		return layoutCrear;
	}

	public void setLayoutCrear(Element layoutCrear) {
		this.layoutCrear = layoutCrear;
	}

	public Element getLayoutEliminar() {
		return layoutEliminar;
	}

	public void setLayoutEliminar(Element layoutEliminar) {
		this.layoutEliminar = layoutEliminar;
	}

	public Element getLayoutCambiar() {
		return layoutCambiar;
	}

	public void setLayoutCambiar(Element layoutCambiar) {
		this.layoutCambiar = layoutCambiar;
	}

	public VistaGestionarseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}