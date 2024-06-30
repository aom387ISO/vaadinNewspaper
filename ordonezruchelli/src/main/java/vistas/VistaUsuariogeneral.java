package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-usuariogeneral")
@JsModule("./src/vista-usuariogeneral.ts")
public class VistaUsuariogeneral extends LitTemplate {

    @Id("gestionEditor")
	private Button gestionEditor;
	@Id("gestionPeriodista")
	private Button gestionPeriodista;

	@Id("personalizarSuscrito")
	private Button personalizarSuscrito;
	@Id("verNoticia")
	private Button verNoticia;
	@Id("personalizar")
	private Button personalizar;
	public Element getNoticiasBanner() {
		return noticiasBanner;
	}


	public HorizontalLayout getParaNoticias() {
		return paraNoticias;
	}


	public void setParaNoticias(HorizontalLayout paraNoticias) {
		this.paraNoticias = paraNoticias;
	}


	public void setNoticiasBanner(Element noticiasBanner) {
		this.noticiasBanner = noticiasBanner;
	}


	public Element getBuscarSuscrito() {
		return buscarSuscrito;
	}


	public HorizontalLayout getPerfil() {
		return perfil;
	}


	public void setPerfil(HorizontalLayout perfil) {
		this.perfil = perfil;
	}


	public void setBuscarSuscrito(Element buscarSuscrito) {
		this.buscarSuscrito = buscarSuscrito;
	}

	@Id("verSeccion")
	private Button verSeccion;
	@Id("bannerGeneral")
	private HorizontalLayout bannerGeneral;
	@Id("buscarSuscrito")
	private Element buscarSuscrito;
	@Id("noticiasBanner")
	private Element noticiasBanner;
	@Id("Perfil")
	private HorizontalLayout perfil;
	@Id("paraNoticias")
	private HorizontalLayout paraNoticias;
	public HorizontalLayout getBannerGeneral() {
		return bannerGeneral;
	}

	public void setBannerGeneral(HorizontalLayout bannerGeneral) {
		this.bannerGeneral = bannerGeneral;
	}


	public VistaUsuariogeneral() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getGestionEditor() {
		return gestionEditor;
	}

	public void setGestionEditor(Button gestionEditor) {
		this.gestionEditor = gestionEditor;
	}

	public Button getGestionPeriodista() {
		return gestionPeriodista;
	}

	public void setGestionPeriodista(Button gestionPeriodista) {
		this.gestionPeriodista = gestionPeriodista;
	}

	public Button getPersonalizarSuscrito() {
		return personalizarSuscrito;
	}

	public void setPersonalizarSuscrito(Button personalizarSuscrito) {
		this.personalizarSuscrito = personalizarSuscrito;
	}

	public Button getVerNoticia() {
		return verNoticia;
	}

	public void setVerNoticia(Button verNoticia) {
		this.verNoticia = verNoticia;
	}

	public Button getVerSeccion() {
		return verSeccion;
	}

	public void setVerSeccion(Button verSeccion) {
		this.verSeccion = verSeccion;
	}

	public Button getPersonalizar() {
		return personalizar;
	}

	public void setPersonalizar(Button personalizar) {
		this.personalizar = personalizar;
	}

	
}