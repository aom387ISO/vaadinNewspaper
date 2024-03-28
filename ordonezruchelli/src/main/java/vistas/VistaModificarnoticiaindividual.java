package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-modificarnoticiaindividual")
@JsModule("./src/vista-modificarnoticiaindividual.ts")
public class VistaModificarnoticiaindividual extends LitTemplate {

    @Id("tituloNoticia")
	private TextField tituloNoticia;
	@Id("imagenes")
	private TextField imagenes;
	@Id("tematica")
	private TextField tematica;
	@Id("noticia")
	private TextField noticia;
	@Id("resumen")
	private TextField resumen;
	@Id("cambiarNoticia")
	private Button cambiarNoticia;
	@Id("eliminarNoticia")
	private Button eliminarNoticia;
	@Id("volverGestion")
	private Button volverGestion;

	public VistaModificarnoticiaindividual() {
        // You can initialise any data required for the connected UI components here.
    }

}