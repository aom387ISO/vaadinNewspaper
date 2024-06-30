package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-listadodenoticiasgenerico_item")
@JsModule("./src/vista-listadodenoticiasgenerico_item.ts")
public class VistaListadodenoticiasgenerico_item extends LitTemplate {

	@Id("titulo")
	private TextArea titulo;
	public HorizontalLayout getModificarNoticia() {
		return modificarNoticia;
	}

	public HorizontalLayout getBanner() {
		return banner;
	}

	public void setBanner(HorizontalLayout banner) {
		this.banner = banner;
	}

	public void setModificarNoticia(HorizontalLayout modificarNoticia) {
		this.modificarNoticia = modificarNoticia;
	}

	public Button getComentar() {
		return comentar;
	}

	public void setComentar(Button comentar) {
		this.comentar = comentar;
	}

	@Id("resumen")
	private TextArea resumen;
	@Id("cuerpo")
	private TextArea cuerpo;
	@Id("valoracionesPositivas")
	private TextArea valoracionesPositivas;
	@Id("valoracionesNegativas")
	private TextArea valoracionesNegativas;
	@Id("modificarNoticia")
	private HorizontalLayout modificarNoticia;
	@Id("meGusta")
	private Button meGusta;
	@Id("noMeGusta")
	private Button noMeGusta;
	@Id("comentar")
	private Button comentar;
	@Id("banner")
	private HorizontalLayout banner;
	public TextArea getTitulo() {
		return titulo;
	}

	public void setTitulo(TextArea titulo) {
		this.titulo = titulo;
	}

	public TextArea getResumen() {
		return resumen;
	}

	public void setResumen(TextArea resumen) {
		this.resumen = resumen;
	}

	public TextArea getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(TextArea cuerpo) {
		this.cuerpo = cuerpo;
	}

	public TextArea getValoracionesPositivas() {
		return valoracionesPositivas;
	}

	public void setValoracionesPositivas(TextArea valoracionesPositivas) {
		this.valoracionesPositivas = valoracionesPositivas;
	}

	public TextArea getValoracionesNegativas() {
		return valoracionesNegativas;
	}

	public Button getMeGusta() {
		return meGusta;
	}

	public void setMeGusta(Button meGusta) {
		this.meGusta = meGusta;
	}

	public Button getNoMeGusta() {
		return noMeGusta;
	}

	public void setNoMeGusta(Button noMeGusta) {
		this.noMeGusta = noMeGusta;
	}

	public void setValoracionesNegativas(TextArea valoracionesNegativas) {
		this.valoracionesNegativas = valoracionesNegativas;
	}

	public VistaListadodenoticiasgenerico_item() {
        // You can initialise any data required for the connected UI components here.
    }


	
}