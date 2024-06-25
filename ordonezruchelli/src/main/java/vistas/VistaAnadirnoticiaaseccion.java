package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-anadirnoticiaaseccion")
@JsModule("./src/vista-anadirnoticiaaseccion.ts")
public class VistaAnadirnoticiaaseccion extends LitTemplate {

    @Id("anadirNoticiaSeccion")
	private Button anadirNoticiaSeccion;
	public HorizontalLayout getGeneralAnadir() {
		return generalAnadir;
	}



	public void setGeneralAnadir(HorizontalLayout generalAnadir) {
		this.generalAnadir = generalAnadir;
	}



	@Id("generalAnadir")
	private HorizontalLayout generalAnadir;
	@Id("comboListadoSeccion")
	private ComboBox<String> comboListadoSeccion;
	@Id("comboListadoNoticias")
	private ComboBox<String> comboListadoNoticias;
	
	public Button getAnadirNoticiaSeccion() {
		return anadirNoticiaSeccion;
	}



	public void setAnadirNoticiaSeccion(Button anadirNoticiaSeccion) {
		this.anadirNoticiaSeccion = anadirNoticiaSeccion;
	}




	public ComboBox<String> getComboListadoSeccion() {
		return comboListadoSeccion;
	}



	public void setComboListadoSeccion(ComboBox<String> comboListadoSeccion) {
		this.comboListadoSeccion = comboListadoSeccion;
	}



	public ComboBox<String> getComboListadoNoticias() {
		return comboListadoNoticias;
	}



	public void setComboListadoNoticias(ComboBox<String> comboListadoNoticias) {
		this.comboListadoNoticias = comboListadoNoticias;
	}



	public VistaAnadirnoticiaaseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}