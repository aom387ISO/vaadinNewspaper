package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-gestionarnoticiadeseccion")
@JsModule("./src/vista-gestionarnoticiadeseccion.ts")
public class VistaGestionarnoticiadeseccion extends LitTemplate {

    @Id("gestionarNoticiaDeSeccion")
	private Button gestionarNoticiaDeSeccion;

	public VistaGestionarnoticiadeseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}