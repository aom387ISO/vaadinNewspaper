package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-usuarionosuscrito")
@JsModule("./src/vista-usuarionosuscrito.ts")
public class VistaUsuarionosuscrito extends LitTemplate {

	@Id("verNoticiaCortada")
	private Button verNoticiaCortada;
	@Id("verSeccionNoSuscrito")
	private Button verSeccionNoSuscrito;
	@Id("iniciarSesion")
	private Button iniciarSesion;
	public HorizontalLayout getBanner() {
		return banner;
	}

	public void setBanner(HorizontalLayout banner) {
		this.banner = banner;
	}

	@Id("bannerAnuncios")
	private Element bannerAnuncios;
	@Id("banner")
	private HorizontalLayout banner;
	@Id("buscarNoticiaNoSuscrito")
	private Element buscarNoticiaNoSuscrito;

	public Element getBannerAnuncios() {
		return bannerAnuncios;
	}

	public void setBannerAnuncios(Element bannerAnuncios) {
		this.bannerAnuncios = bannerAnuncios;
	}

	public VistaUsuarionosuscrito() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getVerNoticiaCortada() {
		return verNoticiaCortada;
	}

	public void setVerNoticiaCortada(Button verNoticiaCortada) {
		this.verNoticiaCortada = verNoticiaCortada;
	}

	public Button getVerSeccionNoSuscrito() {
		return verSeccionNoSuscrito;
	}

	public void setVerSeccionNoSuscrito(Button verSeccionNoSuscrito) {
		this.verSeccionNoSuscrito = verSeccionNoSuscrito;
	}

	public Button getIniciarSesion() {
		return iniciarSesion;
	}

	public void setIniciarSesion(Button iniciarSesion) {
		this.iniciarSesion = iniciarSesion;
	}

	public Element getBuscarNoticiaNoSuscrito() {
		return buscarNoticiaNoSuscrito;
	}

	public void setBuscarNoticiaNoSuscrito(Element buscarNoticiaNoSuscrito) {
		this.buscarNoticiaNoSuscrito = buscarNoticiaNoSuscrito;
	}
	
}