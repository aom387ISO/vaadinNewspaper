package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-gestionarperiodistas")
@JsModule("./src/vista-gestionarperiodistas.ts")
public class VistaGestionarperiodistas extends LitTemplate {

	@Id("bajaPeriodista")
	private Button bajaPeriodista;
	@Id("gestionarLayout")
	private Element gestionarLayout;
	@Id("periodistasLayout")
	private FormLayout periodistasLayout;
	@Id("volverGestion")
	private Button volverGestion;
	@Id("periodistaCombo")
	private ComboBox<String> periodistaCombo;

	public ComboBox<String> getPeriodistaCombo() {
		return periodistaCombo;
	}

	public void setPeriodistaCombo(ComboBox<String> periodistaCombo) {
		this.periodistaCombo = periodistaCombo;
	}

	public Button getVolverGestion() {
		return volverGestion;
	}

	public void setVolverGestion(Button volverGestion) {
		this.volverGestion = volverGestion;
	}

	public Button getBajaPeriodista() {
		return bajaPeriodista;
	}

	public Element getGestionarLayout() {
		return gestionarLayout;
	}

	public void setGestionarLayout(Element gestionarLayout) {
		this.gestionarLayout = gestionarLayout;
	}

	public void setBajaPeriodista(Button bajaPeriodista) {
		this.bajaPeriodista = bajaPeriodista;
	}

	public FormLayout getPeriodistasLayout() {
		return periodistasLayout;
	}

	public void setPeriodistasLayout(FormLayout periodistasLayout) {
		this.periodistasLayout = periodistasLayout;
	}

	public VistaGestionarperiodistas() {
		// You can initialise any data required for the connected UI components here.
	}

}