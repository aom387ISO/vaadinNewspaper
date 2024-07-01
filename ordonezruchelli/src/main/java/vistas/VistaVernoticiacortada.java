package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-vernoticiacortada")
@JsModule("./src/vista-vernoticiacortada.ts")
public class VistaVernoticiacortada extends LitTemplate {

    @Id("comentariosNoSuscrito")
	private Button comentariosNoSuscrito;
	@Id("bannerNoticiasPortada")
	private Element bannerNoticiasPortada;

	public Element getBannerNoticiasPortada() {
		return bannerNoticiasPortada;
	}

	public void setBannerNoticiasPortada(Element bannerNoticiasPortada) {
		this.bannerNoticiasPortada = bannerNoticiasPortada;
	}

	public Button getComentariosNoSuscrito() {
		return comentariosNoSuscrito;
	}

	public void setComentariosNoSuscrito(Button comentariosNoSuscrito) {
		this.comentariosNoSuscrito = comentariosNoSuscrito;
	}

	public VistaVernoticiacortada() {
        // You can initialise any data required for the connected UI components here.
    }

}