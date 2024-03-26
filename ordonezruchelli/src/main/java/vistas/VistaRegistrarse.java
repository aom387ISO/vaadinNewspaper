package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-registrarse")
@JsModule("./src/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {

    @Id("nuevoCorreo")
	private TextField nuevoCorreo;
	@Id("nuevaPassword")
	private TextField nuevaPassword;
	@Id("nuevoApodo")
	private TextField nuevoApodo;
	@Id("nuevoDNI")
	private TextField nuevoDNI;
	@Id("nuevaFoto")
	private TextField nuevaFoto;
	@Id("anadirFoto")
	private Button anadirFoto;
	@Id("anadirTarjeta")
	private TextField anadirTarjeta;
	@Id("anadirFechaCaducidad")
	private TextField anadirFechaCaducidad;
	@Id("anadirCVV")
	private TextField anadirCVV;
	@Id("terminarSuscripcion")
	private Button terminarSuscripcion;

	public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

	public TextField getNuevoCorreo() {
		return nuevoCorreo;
	}

	public void setNuevoCorreo(TextField nuevoCorreo) {
		this.nuevoCorreo = nuevoCorreo;
	}

	public TextField getNuevaPassword() {
		return nuevaPassword;
	}

	public void setNuevaPassword(TextField nuevaPassword) {
		this.nuevaPassword = nuevaPassword;
	}

	public TextField getNuevoApodo() {
		return nuevoApodo;
	}

	public void setNuevoApodo(TextField nuevoApodo) {
		this.nuevoApodo = nuevoApodo;
	}

	public TextField getNuevoDNI() {
		return nuevoDNI;
	}

	public void setNuevoDNI(TextField nuevoDNI) {
		this.nuevoDNI = nuevoDNI;
	}

	public TextField getNuevaFoto() {
		return nuevaFoto;
	}

	public void setNuevaFoto(TextField nuevaFoto) {
		this.nuevaFoto = nuevaFoto;
	}

	public Button getAnadirFoto() {
		return anadirFoto;
	}

	public void setAnadirFoto(Button anadirFoto) {
		this.anadirFoto = anadirFoto;
	}

	public TextField getAnadirTarjeta() {
		return anadirTarjeta;
	}

	public void setAnadirTarjeta(TextField anadirTarjeta) {
		this.anadirTarjeta = anadirTarjeta;
	}

	public TextField getAnadirFechaCaducidad() {
		return anadirFechaCaducidad;
	}

	public void setAnadirFechaCaducidad(TextField anadirFechaCaducidad) {
		this.anadirFechaCaducidad = anadirFechaCaducidad;
	}

	public TextField getAnadirCVV() {
		return anadirCVV;
	}

	public void setAnadirCVV(TextField anadirCVV) {
		this.anadirCVV = anadirCVV;
	}

	public Button getTerminarSuscripcion() {
		return terminarSuscripcion;
	}

	public void setTerminarSuscripcion(Button terminarSuscripcion) {
		this.terminarSuscripcion = terminarSuscripcion;
	}
	
	

}