package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Div;

@Tag("vista-usuarionosuscrito")
@JsModule("./src/vista-usuarionosuscrito.ts")
public class VistaUsuarionosuscrito extends LitTemplate {

	@Id("verNoticiaCortada")
	private Button verNoticiaCortada;
	@Id("verSeccionNoSuscrito")
	private Button verSeccionNoSuscrito;
	@Id("verAnuncios")
	private Button verAnuncios;
	@Id("iniciarSesion")
	private Button iniciarSesion;
	@Id("buscarNoticiaNoSuscrito")
	private Button buscarNoticiaNoSuscrito;
	@Id("anuncio1")
	private Element anuncio1;
	@Id("anuncio")
	private Div anuncio;
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

	public Button getVerAnuncios() {
		return verAnuncios;
	}

	public void setVerAnuncios(Button verAnuncios) {
		this.verAnuncios = verAnuncios;
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