package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadodenoticiasgenerico")
@JsModule("./src/vista-listadodenoticiasgenerico_item.ts")
public class VistaListadodenoticiasgenerico_item extends LitTemplate {

	@Id("MeGusta")
	private Button megusta;
	@Id("NoMeGusta")
	private Button nomegusta;
	
    public VistaListadodenoticiasgenerico_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getMegusta() {
		return megusta;
	}

	public void setMegusta(Button megusta) {
		this.megusta = megusta;
	}

	public Button getNomegusta() {
		return nomegusta;
	}

	public void setNomegusta(Button nomegusta) {
		this.nomegusta = nomegusta;
	}

}