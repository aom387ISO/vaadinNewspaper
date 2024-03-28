package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-gestionarnoticia")
@JsModule("./src/vista-gestionarnoticia.ts")
public class VistaGestionarnoticia extends LitTemplate {

    @Id("redactarNuevaNoticia")
	private Button redactarNuevaNoticia;
	@Id("modificarNoticiaPrevia")
	private Button modificarNoticiaPrevia;
	@Id("mostrarListadoNoticias")
	private Button mostrarListadoNoticias;

	public VistaGestionarnoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}