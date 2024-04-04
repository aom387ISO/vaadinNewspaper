package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.upload.Upload;

@Tag("vista-introducirdatosnoticia")
@JsModule("./src/vista-introducirdatosnoticia.ts")
public class VistaIntroducirdatosnoticia extends LitTemplate {

    @Id("tituloNoticia")
	private TextField tituloNoticia;
	@Id("tematicaNoticia")
	private TextField tematicaNoticia;
	@Id("cuerpoNoticia")
	private TextField cuerpoNoticia;
	@Id("resumenNoticia")
	private TextField resumenNoticia;
	@Id("enviarNoticia")
	private Button enviarNoticia;
	@Id("volverGestionNoticia")
	private Button volverGestionNoticia;
	@Id("imagenesYvideos")
	private Upload imagenesYvideos;

	public TextField getTituloNoticia() {
		return tituloNoticia;
	}

	public void setTituloNoticia(TextField tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}

	public TextField getTematicaNoticia() {
		return tematicaNoticia;
	}

	public void setTematicaNoticia(TextField tematicaNoticia) {
		this.tematicaNoticia = tematicaNoticia;
	}

	public TextField getCuerpoNoticia() {
		return cuerpoNoticia;
	}

	public void setCuerpoNoticia(TextField cuerpoNoticia) {
		this.cuerpoNoticia = cuerpoNoticia;
	}

	public TextField getResumenNoticia() {
		return resumenNoticia;
	}

	public void setResumenNoticia(TextField resumenNoticia) {
		this.resumenNoticia = resumenNoticia;
	}

	public Button getEnviarNoticia() {
		return enviarNoticia;
	}

	public void setEnviarNoticia(Button enviarNoticia) {
		this.enviarNoticia = enviarNoticia;
	}

	public Button getVolverGestionNoticia() {
		return volverGestionNoticia;
	}

	public void setVolverGestionNoticia(Button volverGestionNoticia) {
		this.volverGestionNoticia = volverGestionNoticia;
	}

	public VistaIntroducirdatosnoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}