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
	public TextField getNuevaImagen() {
		return nuevaImagen;
	}

	public void setNuevaImagen(TextField nuevaImagen) {
		this.nuevaImagen = nuevaImagen;
	}

	public Button getCambiarImagen() {
		return cambiarImagen;
	}

	public void setCambiarImagen(Button cambiarImagen) {
		this.cambiarImagen = cambiarImagen;
	}

	public TextField getNuevoApodo() {
		return nuevoApodo;
	}

	public void setNuevoApodo(TextField nuevoApodo) {
		this.nuevoApodo = nuevoApodo;
	}

	public Button getCambiarApodo() {
		return cambiarApodo;
	}

	public void setCambiarApodo(Button cambiarApodo) {
		this.cambiarApodo = cambiarApodo;
	}

	public Button getCerrarSesion() {
		return cerrarSesion;
	}

	public void setCerrarSesion(Button cerrarSesion) {
		this.cerrarSesion = cerrarSesion;
	}

	public Button getVolverPortada() {
		return volverPortada;
	}

	public void setVolverPortada(Button volverPortada) {
		this.volverPortada = volverPortada;
	}

	public Button getBajaUsuarioSuscrito() {
		return bajaUsuarioSuscrito;
	}

	public void setBajaUsuarioSuscrito(Button bajaUsuarioSuscrito) {
		this.bajaUsuarioSuscrito = bajaUsuarioSuscrito;
	}

	@Id("volverPortada")
	private Button volverPortada;
	@Id("bajaUsuarioSuscrito")
	private Button bajaUsuarioSuscrito;

	public VistaPersonalizarperfil() {
        // You can initialise any data required for the connected UI components here.
    }

}