package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-buscarnoticia")
@JsModule("./src/vista-buscarnoticia.ts")
public class VistaBuscarnoticia extends LitTemplate {

    @Id("accederNoticiaBusqueda")
	private Button accederNoticiaBusqueda;

	public VistaBuscarnoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}