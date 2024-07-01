package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-modificarnoticiaindividual")
@JsModule("./src/vista-modificarnoticiaindividual.ts")
public class VistaModificarnoticiaindividual extends LitTemplate {

    @Id("tituloNoticia")
	private TextField tituloNoticia;
	@Id("tematica")
	private TextField tematica;
	@Id("noticia")
	private TextField noticia;
	@Id("resumen")
	private TextField resumen;
	@Id("cambiarNoticia")
	private Button cambiarNoticia;
	@Id("eliminarNoticia")
	private Button eliminarNoticia;
	@Id("volverGestion")
	private Button volverGestion;
	@Id("bannerImagen")
	private HorizontalLayout bannerImagen;

	public TextField getTituloNoticia() {
		return tituloNoticia;
	}

	public void setTituloNoticia(TextField tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}

	public HorizontalLayout getBannerImagen() {
		return bannerImagen;
	}

	public void setBannerImagen(HorizontalLayout bannerImagen) {
		this.bannerImagen = bannerImagen;
	}

	public TextField getTematica() {
		return tematica;
	}

	public void setTematica(TextField tematica) {
		this.tematica = tematica;
	}

	public TextField getNoticia() {
		return noticia;
	}

	public void setNoticia(TextField noticia) {
		this.noticia = noticia;
	}

	public TextField getResumen() {
		return resumen;
	}

	public void setResumen(TextField resumen) {
		this.resumen = resumen;
	}

	public Button getCambiarNoticia() {
		return cambiarNoticia;
	}

	public void setCambiarNoticia(Button cambiarNoticia) {
		this.cambiarNoticia = cambiarNoticia;
	}

	public Button getEliminarNoticia() {
		return eliminarNoticia;
	}

	public void setEliminarNoticia(Button eliminarNoticia) {
		this.eliminarNoticia = eliminarNoticia;
	}

	public Button getVolverGestion() {
		return volverGestion;
	}

	public void setVolverGestion(Button volverGestion) {
		this.volverGestion = volverGestion;
	}

	public VistaModificarnoticiaindividual() {
        // You can initialise any data required for the connected UI components here.
    }

}