package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-listadecomentariosgenerico_item")
@JsModule("./src/vista-listadecomentariosgenerico_item.ts")
public class VistaListadecomentariosgenerico_item extends LitTemplate {

	public TextArea getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(TextArea nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public TextArea getContenidoComentario() {
		return contenidoComentario;
	}

	public void setContenidoComentario(TextArea contenidoComentario) {
		this.contenidoComentario = contenidoComentario;
	}

	public TextArea getValoracionesPositivasComentario() {
		return valoracionesPositivasComentario;
	}

	public void setValoracionesPositivasComentario(TextArea valoracionesPositivasComentario) {
		this.valoracionesPositivasComentario = valoracionesPositivasComentario;
	}

	public TextArea getValoracionesNegativasComentario() {
		return valoracionesNegativasComentario;
	}

	public void setValoracionesNegativasComentario(TextArea valoracionesNegativasComentario) {
		this.valoracionesNegativasComentario = valoracionesNegativasComentario;
	}

	@Id("MeGusta")
	private Button megusta;
	@Id("NoMeGusta")
	private Button nomegusta;
	@Id("EliminarComentario")
	private Button eliminar;
	@Id("nombreUsuario")
	private TextArea nombreUsuario;
	@Id("contenidoComentario")
	private TextArea contenidoComentario;
	@Id("valoracionesPositivasComentario")
	private TextArea valoracionesPositivasComentario;
	@Id("valoracionesNegativasComentario")
	private TextArea valoracionesNegativasComentario;

	public Button getMegusta() {
		return megusta;
	}

	public void setMegusta(Button megusta) {
		this.megusta = megusta;
	}

	public Button getNomegusta() {
		return nomegusta;
	}

	public void setNomegusta(Button nomegusta) {
		this.nomegusta = nomegusta;
	}

	public Button getEliminar() {
		return eliminar;
	}

	public void setEliminar(Button eliminar) {
		this.eliminar = eliminar;
	}

    
}