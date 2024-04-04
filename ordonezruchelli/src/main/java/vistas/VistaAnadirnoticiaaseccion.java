package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-anadirnoticiaaseccion")
@JsModule("./src/vista-anadirnoticiaaseccion.ts")
public class VistaAnadirnoticiaaseccion extends LitTemplate {

    @Id("anadirNoticiaSeccion")
	private Button anadirNoticiaSeccion;
	@Id("seccion")
	private Select seccion;
	public HorizontalLayout getGeneralAnadir() {
		return generalAnadir;
	}



	public void setGeneralAnadir(HorizontalLayout generalAnadir) {
		this.generalAnadir = generalAnadir;
	}



	@Id("noticia")
	private Select noticia;
	@Id("generalAnadir")
	private HorizontalLayout generalAnadir;
	
	public Button getAnadirNoticiaSeccion() {
		return anadirNoticiaSeccion;
	}



	public void setAnadirNoticiaSeccion(Button anadirNoticiaSeccion) {
		this.anadirNoticiaSeccion = anadirNoticiaSeccion;
	}



	public Select getSeccion() {
		return seccion;
	}



	public void setSeccion(Select seccion) {
		this.seccion = seccion;
	}



	public Select getNoticia() {
		return noticia;
	}



	public void setNoticia(Select noticia) {
		this.noticia = noticia;
	}



	public VistaAnadirnoticiaaseccion() {
        // You can initialise any data required for the connected UI components here.
    }

}