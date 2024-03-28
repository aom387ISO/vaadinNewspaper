package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-cambiarnombreaseccion")
@JsModule("./src/vista-cambiarnombreaseccion.ts")
public class VistaCambiarnombreaseccion extends LitTemplate {

    @Id("nuevoNombreSección")
	private TextField nuevoNombreSección;
	@Id("cambiarNombreSeccion")
	private Button cambiarNombreSeccion;

	public VistaCambiarnombreaseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}