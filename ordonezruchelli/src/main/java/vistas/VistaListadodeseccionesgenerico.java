package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-listadodeseccionesgenerico")
@JsModule("./src/vista-listadodeseccionesgenerico.ts")
public class VistaListadodeseccionesgenerico extends LitTemplate {

	@Id("banner")
	private HorizontalLayout banner;

	public VistaListadodeseccionesgenerico() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getBanner() {
		return banner;
	}

	public void setBanner(HorizontalLayout banner) {
		this.banner = banner;
	}

}