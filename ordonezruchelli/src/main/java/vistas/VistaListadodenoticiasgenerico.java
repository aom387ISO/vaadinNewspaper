package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadodenoticiasgenerico")
@JsModule("./src/vista-listadodenoticiasgenerico.ts")
public class VistaListadodenoticiasgenerico extends LitTemplate {

    @Id("cambiarPosicion")
	private Button cambiarPosicion;
	@Id("quitarEnSeccion")
	private Button quitarEnSeccion;
	@Id("gustaNoticia")
	private Button gustaNoticia;
	@Id("noGustaNoticia")
	private Button noGustaNoticia;
	@Id("borrarNoticia")
	private Button borrarNoticia;
	@Id("cambiarDatos")
	private Button cambiarDatos;
	@Id("agregarSeccion")
	private Button agregarSeccion;

	public VistaListadodenoticiasgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

}