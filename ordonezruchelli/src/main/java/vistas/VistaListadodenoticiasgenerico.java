package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-listadodenoticiasgenerico")
@JsModule("./src/vista-listadodenoticiasgenerico.ts")
public class VistaListadodenoticiasgenerico extends LitTemplate {

	public HorizontalLayout getBanner() {
		return banner;
	}

	public void setBanner(HorizontalLayout banner) {
		this.banner = banner;
	}

	@Id("banner")
	private HorizontalLayout banner;

	public VistaListadodenoticiasgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

}