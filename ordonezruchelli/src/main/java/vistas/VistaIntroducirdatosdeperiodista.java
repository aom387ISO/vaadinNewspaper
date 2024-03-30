package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-introducirdatosdeperiodista")
@JsModule("./src/vista-introducirdatosdeperiodista.ts")
public class VistaIntroducirdatosdeperiodista extends LitTemplate {

    @Id("correoPeriodista")
	private TextField correoPeriodista;
	@Id("contrasenaPeriodista")
	private TextField contrasenaPeriodista;
	@Id("apodoPeriodista")
	private TextField apodoPeriodista;
	@Id("dniPeriodista")
	private TextField dniPeriodista;
	@Id("fotoPeriodista")
	private TextField fotoPeriodista;
	@Id("anadirFotoPeriodista")
	private Button anadirFotoPeriodista;
	@Id("darAltaPeriodista")
	private Button darAltaPeriodista;

	public VistaIntroducirdatosdeperiodista() {
        // You can initialise any data required for the connected UI components here.
    }

}