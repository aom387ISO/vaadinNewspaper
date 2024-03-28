package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

@Tag("vista-eliminarnoticiadeseccion")
@JsModule("./src/vista-eliminarnoticiadeseccion.ts")
public class VistaEliminarnoticiadeseccion extends LitTemplate {

    @Id("eliminarNoticiaSeccion")
	private Button eliminarNoticiaSeccion;

	public VistaEliminarnoticiadeseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}