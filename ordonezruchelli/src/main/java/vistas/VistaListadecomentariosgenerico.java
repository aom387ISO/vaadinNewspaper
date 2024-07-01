package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-listadecomentariosgenerico")
@JsModule("./src/vista-listadecomentariosgenerico.ts")
public class VistaListadecomentariosgenerico extends LitTemplate {

	public HorizontalLayout getComentariosBaner() {
		return comentariosBaner;
	}

	public void setComentariosBaner(HorizontalLayout comentariosBaner) {
		this.comentariosBaner = comentariosBaner;
	}

	@Id("Comentar")
	private Button comentar;

	@Id("comentariosBaner")
	private HorizontalLayout comentariosBaner;
	public VistaListadecomentariosgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getComentar() {
		return comentar;
	}

	public void setComentar(Button comentar) {
		this.comentar = comentar;
	}


}