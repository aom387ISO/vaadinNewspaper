package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadenoticiasquenoestanenlaseccion_item")
@JsModule("./src/vista-listadenoticiasquenoestanenlaseccion_item.ts")
public class VistaListadenoticiasquenoestanenlaseccion_item extends LitTemplate {

    @Id("tituloNoticiaSinSeccion")
	private TextArea tituloNoticiaSinSeccion;

	public TextArea getTituloNoticiaSinSeccion() {
		return tituloNoticiaSinSeccion;
	}

	public void setTituloNoticiaSinSeccion(TextArea tituloNoticiaSinSeccion) {
		this.tituloNoticiaSinSeccion = tituloNoticiaSinSeccion;
	}

	public VistaListadenoticiasquenoestanenlaseccion_item() {
        // You can initialise any data required for the connected UI components here.
    }

}