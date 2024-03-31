package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-crearnuevaseccion")
@JsModule("./src/vista-crearnuevaseccion.ts")
public class VistaCrearnuevaseccion extends LitTemplate {

    @Id("nombreSeccion")
	private TextField nombreSeccion;
	@Id("anadirSeccion")
	private Button anadirSeccion;

	public TextField getNombreSeccion() {
		return nombreSeccion;
	}

	public void setNombreSeccion(TextField nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
	}

	public Button getAnadirSeccion() {
		return anadirSeccion;
	}

	public void setAnadirSeccion(Button anadirSeccion) {
		this.anadirSeccion = anadirSeccion;
	}

	public VistaCrearnuevaseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}