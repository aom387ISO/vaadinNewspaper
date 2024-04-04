package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.dom.Element;

@Tag("vista-cambiarnombreaseccion")
@JsModule("./src/vista-cambiarnombreaseccion.ts")
public class VistaCambiarnombreaseccion extends LitTemplate {

    @Id("nuevoNombreSección")
	private TextField nuevoNombreSección;
	@Id("cambiarNombreSeccion")
	private Button cambiarNombreSeccion;
	@Id("seccionBox")
	private ComboBox<String> seccionBox;
	@Id("generalAnadir")
	private Element generalAnadir;
	public Element getGeneralAnadir() {
		return generalAnadir;
	}

	public void setGeneralAnadir(Element generalAnadir) {
		this.generalAnadir = generalAnadir;
	}

	public TextField getNuevoNombreSección() {
		return nuevoNombreSección;
	}

	public void setNuevoNombreSección(TextField nuevoNombreSección) {
		this.nuevoNombreSección = nuevoNombreSección;
	}

	public Button getCambiarNombreSeccion() {
		return cambiarNombreSeccion;
	}

	public void setCambiarNombreSeccion(Button cambiarNombreSeccion) {
		this.cambiarNombreSeccion = cambiarNombreSeccion;
	}

	public ComboBox<String> getSeccionBox() {
		return seccionBox;
	}

	public void setSeccionBox(ComboBox<String> seccionBox) {
		this.seccionBox = seccionBox;
	}

	public VistaCambiarnombreaseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}