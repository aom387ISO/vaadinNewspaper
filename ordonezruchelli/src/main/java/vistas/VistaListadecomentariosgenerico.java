package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.dom.Element;

@Tag("vista-listadecomentariosgenerico")
@JsModule("./src/vista-listadecomentariosgenerico.ts")
public class VistaListadecomentariosgenerico extends LitTemplate {

	public Element getComentariosBanner() {
		return comentariosBanner;
	}

	public void setComentariosBanner(Element comentariosBanner) {
		this.comentariosBanner = comentariosBanner;
	}

	@Id("Comentar")
	private Button comentar;

	@Id("itemComentario")
	private Element itemComentario;

	@Id("nuevoComentario")
	private HorizontalLayout nuevoComentario;

	@Id("comentariosBanner")
	private Element comentariosBanner;
	public VistaListadecomentariosgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getComentar() {
		return comentar;
	}

	public void setComentar(Button comentar) {
		this.comentar = comentar;
	}

	public Element getItemComentario() {
		return itemComentario;
	}

	public void setItemComentario(Element itemComentario) {
		this.itemComentario = itemComentario;
	}

	public HorizontalLayout getNuevoComentario() {
		return nuevoComentario;
	}

	public void setNuevoComentario(HorizontalLayout nuevoComentario) {
		this.nuevoComentario = nuevoComentario;
	}


}