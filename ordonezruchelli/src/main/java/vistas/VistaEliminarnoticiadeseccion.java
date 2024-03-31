package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-eliminarnoticiadeseccion")
@JsModule("./src/vista-eliminarnoticiadeseccion.ts")
public class VistaEliminarnoticiadeseccion extends LitTemplate {

    @Id("eliminarNoticiaSeccion")
	private Button eliminarNoticiaSeccion;
	@Id("secciones")
	private ComboBox<String> secciones;
	@Id("noticias")
	private ComboBox<String> noticias;

	public Button getEliminarNoticiaSeccion() {
		return eliminarNoticiaSeccion;
	}

	public void setEliminarNoticiaSeccion(Button eliminarNoticiaSeccion) {
		this.eliminarNoticiaSeccion = eliminarNoticiaSeccion;
	}

	public ComboBox<String> getSecciones() {
		return secciones;
	}

	public void setSecciones(ComboBox<String> secciones) {
		this.secciones = secciones;
	}

	public ComboBox<String> getNoticias() {
		return noticias;
	}

	public void setNoticias(ComboBox<String> noticias) {
		this.noticias = noticias;
	}

	public VistaEliminarnoticiadeseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}