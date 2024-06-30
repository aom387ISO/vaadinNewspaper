package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

@Tag("vista-buscarnoticia")
@JsModule("./src/vista-buscarnoticia.ts")
public class VistaBuscarnoticia extends LitTemplate {

    @Id("barraBusqueda")
	private TextField barraBusqueda;
	@Id("accederNoticiaBusqueda")
	private Button accederNoticiaBusqueda;


	public TextField getBarraBusqueda() {
		return barraBusqueda;
	}

	public void setBarraBusqueda(TextField barraBusqueda) {
		this.barraBusqueda = barraBusqueda;
	}

	public Button getAccederNoticiaBusqueda() {
		return accederNoticiaBusqueda;
	}

	public void setAccederNoticiaBusqueda(Button accederNoticiaBusqueda) {
		this.accederNoticiaBusqueda = accederNoticiaBusqueda;
	}

	public VistaBuscarnoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}