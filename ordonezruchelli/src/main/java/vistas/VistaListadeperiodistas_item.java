package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadeperiodistas_item")
@JsModule("./src/vista-listadeperiodistas_item.ts")
public class VistaListadeperiodistas_item extends LitTemplate {

    @Id("apodo")
	private TextArea apodo;
	@Id("dni")
	private TextArea dni;
	@Id("estado")
	private TextArea estado;

	public TextArea getApodo() {
		return apodo;
	}

	public void setApodo(TextArea apodo) {
		this.apodo = apodo;
	}

	public TextArea getDni() {
		return dni;
	}

	public void setDni(TextArea dni) {
		this.dni = dni;
	}

	public TextArea getEstado() {
		return estado;
	}

	public void setEstado(TextArea estado) {
		this.estado = estado;
	}

	public VistaListadeperiodistas_item() {
        // You can initialise any data required for the connected UI components here.
    }

}