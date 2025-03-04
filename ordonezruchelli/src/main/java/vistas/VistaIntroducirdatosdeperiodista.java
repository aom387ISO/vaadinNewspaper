package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

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
	@Id("darAltaPeriodista")
	private Button darAltaPeriodista;
	@Id("layoutFoto")
	private HorizontalLayout layoutFoto;

	public TextField getCorreoPeriodista() {
		return correoPeriodista;
	}

	public void setCorreoPeriodista(TextField correoPeriodista) {
		this.correoPeriodista = correoPeriodista;
	}

	public TextField getContrasenaPeriodista() {
		return contrasenaPeriodista;
	}

	public void setContrasenaPeriodista(TextField contrasenaPeriodista) {
		this.contrasenaPeriodista = contrasenaPeriodista;
	}

	public TextField getApodoPeriodista() {
		return apodoPeriodista;
	}

	public void setApodoPeriodista(TextField apodoPeriodista) {
		this.apodoPeriodista = apodoPeriodista;
	}

	public TextField getDniPeriodista() {
		return dniPeriodista;
	}

	public void setDniPeriodista(TextField dniPeriodista) {
		this.dniPeriodista = dniPeriodista;
	}

	public HorizontalLayout getLayoutFoto() {
		return layoutFoto;
	}

	public void setLayoutFoto(HorizontalLayout layoutFoto) {
		this.layoutFoto = layoutFoto;
	}

	public Button getDarAltaPeriodista() {
		return darAltaPeriodista;
	}

	public void setDarAltaPeriodista(Button darAltaPeriodista) {
		this.darAltaPeriodista = darAltaPeriodista;
	}

	public VistaIntroducirdatosdeperiodista() {
        // You can initialise any data required for the connected UI components here.
    }

}