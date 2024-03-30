package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-introducirdatosnoticia")
@JsModule("./src/vista-introducirdatosnoticia.ts")
public class VistaIntroducirdatosnoticia extends LitTemplate {

    @Id("tituloNoticia")
	private TextField tituloNoticia;
	@Id("imagenesNoticia")
	private TextField imagenesNoticia;
	@Id("tematicaNoticia")
	private TextField tematicaNoticia;
	@Id("cuerpoNoticia")
	private TextField cuerpoNoticia;
	@Id("resumenNoticia")
	private TextField resumenNoticia;
	@Id("enviarNoticia")
	private Button enviarNoticia;
	@Id("volverGestionNoticia")
	private Button volverGestionNoticia;

	public VistaIntroducirdatosnoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}