package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-buscarnoticiadenosuscrito")
@JsModule("./src/vista-buscarnoticiadenosuscrito.ts")
public class VistaBuscarnoticiadenosuscrito extends LitTemplate {

    @Id("accederNoticiaBusquedaNoSuscrito")
	private Button accederNoticiaBusquedaNoSuscrito;

	public VistaBuscarnoticiadenosuscrito() {
        // You can initialise any data required for the connected UI components here.
    }

}