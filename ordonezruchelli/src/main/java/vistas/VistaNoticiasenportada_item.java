package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;

@Tag("vista-noticiasenportada_item")
@JsModule("./src/vista-noticiasenportada_item.ts")
public class VistaNoticiasenportada_item extends LitTemplate {

    @Id("eliminarDePortada")
	private Button eliminarDePortada;
	
    public VistaNoticiasenportada_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getEliminarDePortada() {
		return eliminarDePortada;
	}

	public void setEliminarDePortada(Button eliminarDePortada) {
		this.eliminarDePortada = eliminarDePortada;
	}

}