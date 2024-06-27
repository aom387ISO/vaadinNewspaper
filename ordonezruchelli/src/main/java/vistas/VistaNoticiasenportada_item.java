package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-noticiasenportada_item")
@JsModule("./src/vista-noticiasenportada_item.ts")
public class VistaNoticiasenportada_item extends LitTemplate {

    @Id("cambiarPosicionBoton")
	private Button cambiarPosicionBoton;
	@Id("noticiaPortada")
	private TextArea noticiaPortada;
	@Id("resumenNoticiaPortada")
	private TextArea resumenNoticiaPortada;
	public TextArea getPosicionEnPortada() {
		return posicionEnPortada;
	}

	public void setPosicionEnPortada(TextArea posicionEnPortada) {
		this.posicionEnPortada = posicionEnPortada;
	}

	public TextField getNuevaPosicionCuadro() {
		return nuevaPosicionCuadro;
	}

	public void setNuevaPosicionCuadro(TextField nuevaPosicionCuadro) {
		this.nuevaPosicionCuadro = nuevaPosicionCuadro;
	}

	@Id("eliminarDePortada")
	private Button eliminarDePortada;
	@Id("nuevaPosicionCuadro")
	private TextField nuevaPosicionCuadro;
	@Id("posicionEnPortada")
	private TextArea posicionEnPortada;
	public TextArea getNoticiaPortada() {
		return noticiaPortada;
	}

	public void setNoticiaPortada(TextArea noticiaPortada) {
		this.noticiaPortada = noticiaPortada;
	}

	public TextArea getResumenNoticiaPortada() {
		return resumenNoticiaPortada;
	}

	public void setResumenNoticiaPortada(TextArea resumenNoticiaPortada) {
		this.resumenNoticiaPortada = resumenNoticiaPortada;
	}

	public VistaNoticiasenportada_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getEliminarDePortada() {
		return eliminarDePortada;
	}

	public void setEliminarDePortada(Button eliminarDePortada) {
		this.eliminarDePortada = eliminarDePortada;
	}

	public Button getCambiarPosicionBoton() {
		return cambiarPosicionBoton;
	}

	public void setCambiarPosicionBoton(Button cambiarPosicionBoton) {
		this.cambiarPosicionBoton = cambiarPosicionBoton;
	}
	

}