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
	@Id("buscarNoticiaNoSuscrito")
	private Button buscarNoticiaNoSuscrito;
	@Id("barraBusqueda")
	private TextField barraBusqueda;
	@Id("bannerAnuncios")
	private Element bannerAnuncios;
	public TextField getBarraBusqueda() {
		return barraBusqueda;
	}

	public void setBarraBusqueda(TextField barraBusqueda) {
		this.barraBusqueda = barraBusqueda;
	}

	public Element getBannerAnuncios() {
		return bannerAnuncios;
	}

	public void setBannerAnuncios(Element bannerAnuncios) {
		this.bannerAnuncios = bannerAnuncios;
	}

	public HorizontalLayout getLayoutBuscarNoSuscrito() {
		return layoutBuscarNoSuscrito;
	}

	public void setLayoutBuscarNoSuscrito(HorizontalLayout layoutBuscarNoSuscrito) {
		this.layoutBuscarNoSuscrito = layoutBuscarNoSuscrito;
	}

	public HorizontalLayout getLayoutIniciarSesion() {
		return layoutIniciarSesion;
	}

	public void setLayoutIniciarSesion(HorizontalLayout layoutIniciarSesion) {
		this.layoutIniciarSesion = layoutIniciarSesion;
	}

	public HorizontalLayout getLayoutVerSeccionNoSuscrito() {
		return layoutVerSeccionNoSuscrito;
	}

	public void setLayoutVerSeccionNoSuscrito(HorizontalLayout layoutVerSeccionNoSuscrito) {
		this.layoutVerSeccionNoSuscrito = layoutVerSeccionNoSuscrito;
	}

	@Id("layoutBuscarNoSuscrito")
	private HorizontalLayout layoutBuscarNoSuscrito;
	@Id("layoutIniciarSesion")
	private HorizontalLayout layoutIniciarSesion;
	@Id("layoutVerSeccionNoSuscrito")
	private HorizontalLayout layoutVerSeccionNoSuscrito;
	
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

	public Button getBuscarNoticiaNoSuscrito() {
		return buscarNoticiaNoSuscrito;
	}

	public void setBuscarNoticiaNoSuscrito(Button buscarNoticiaNoSuscrito) {
		this.buscarNoticiaNoSuscrito = buscarNoticiaNoSuscrito;
	}

	
}