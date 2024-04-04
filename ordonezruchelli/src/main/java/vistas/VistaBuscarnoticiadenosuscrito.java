package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

@Tag("vista-buscarnoticiadenosuscrito")
@JsModule("./src/vista-buscarnoticiadenosuscrito.ts")
public class VistaBuscarnoticiadenosuscrito extends LitTemplate {

    @Id("barraBusquedaUsuarioNoSuscrito")
	private TextField barraBusquedaUsuarioNoSuscrito;
	@Id("accederNoticiaBusquedaNoSuscrito")
	private Button accederNoticiaBusquedaNoSuscrito;
	public Element getListadoBusqueda() {
		return listadoBusqueda;
	}

	public void setListadoBusqueda(Element listadoBusqueda) {
		this.listadoBusqueda = listadoBusqueda;
	}

	@Id("listadoBusqueda")
	private Element listadoBusqueda;

	public TextField getBarraBusquedaUsuarioNoSuscrito() {
		return barraBusquedaUsuarioNoSuscrito;
	}

	public void setBarraBusquedaUsuarioNoSuscrito(TextField barraBusquedaUsuarioNoSuscrito) {
		this.barraBusquedaUsuarioNoSuscrito = barraBusquedaUsuarioNoSuscrito;
	}

	public Button getAccederNoticiaBusquedaNoSuscrito() {
		return accederNoticiaBusquedaNoSuscrito;
	}

	public void setAccederNoticiaBusquedaNoSuscrito(Button accederNoticiaBusquedaNoSuscrito) {
		this.accederNoticiaBusquedaNoSuscrito = accederNoticiaBusquedaNoSuscrito;
	}

	public VistaBuscarnoticiadenosuscrito() {
        // You can initialise any data required for the connected UI components here.
    }

}