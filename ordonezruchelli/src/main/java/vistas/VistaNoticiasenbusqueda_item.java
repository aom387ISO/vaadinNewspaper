package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-noticiasenbusqueda_item")
@JsModule("./src/vista-noticiasenbusqueda_item.ts")
public class VistaNoticiasenbusqueda_item extends LitTemplate {

    @Id("nombreNoticiaBusqueda")
	private TextArea nombreNoticiaBusqueda;
	@Id("resumenNoticiaBusqueda")
	private TextArea resumenNoticiaBusqueda;
	@Id("verNoticia")
	private Button verNoticia;

	public TextArea getNombreNoticiaBusqueda() {
		return nombreNoticiaBusqueda;
	}

	public Button getVerNoticia() {
		return verNoticia;
	}

	public void setVerNoticia(Button verNoticia) {
		this.verNoticia = verNoticia;
	}

	public void setNombreNoticiaBusqueda(TextArea nombreNoticiaBusqueda) {
		this.nombreNoticiaBusqueda = nombreNoticiaBusqueda;
	}

	public TextArea getResumenNoticiaBusqueda() {
		return resumenNoticiaBusqueda;
	}

	public void setResumenNoticiaBusqueda(TextArea resumenNoticiaBusqueda) {
		this.resumenNoticiaBusqueda = resumenNoticiaBusqueda;
	}

	public VistaNoticiasenbusqueda_item() {
        // You can initialise any data required for the connected UI components here.
    }

}