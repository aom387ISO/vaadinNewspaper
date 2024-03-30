package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-personalizarperfil")
@JsModule("./src/vista-personalizarperfil.ts")
public class VistaPersonalizarperfil extends LitTemplate {

    @Id("nuevaImagen")
	private TextField nuevaImagen;
	@Id("cambiarImagen")
	private Button cambiarImagen;
	@Id("nuevoApodo")
	private TextField nuevoApodo;
	@Id("cambiarApodo")
	private Button cambiarApodo;
	@Id("cerrarSesion")
	private Button cerrarSesion;
	@Id("volverPortada")
	private Button volverPortada;
	@Id("bajaUsuarioSuscrito")
	private Button bajaUsuarioSuscrito;

	public VistaPersonalizarperfil() {
        // You can initialise any data required for the connected UI components here.
    }

}