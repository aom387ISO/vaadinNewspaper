package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-usuariogeneral")
@JsModule("./src/vista-usuariogeneral.ts")
public class VistaUsuariogeneral extends LitTemplate {

    @Id("gestionEditor")
	private Button gestionEditor;
	@Id("gestionPeriodista")
	private Button gestionPeriodista;
	public TextField getBarraBusqueda() {
		return barraBusqueda;
	}

	public Element getLayoutPersonalizarGeneral() {
		return layoutPersonalizarGeneral;
	}

	public void setLayoutPersonalizarGeneral(Element layoutPersonalizarGeneral) {
		this.layoutPersonalizarGeneral = layoutPersonalizarGeneral;
	}

	public Element getLayoutSeccionSuscrito() {
		return layoutSeccionSuscrito;
	}

	public void setLayoutSeccionSuscrito(Element layoutSeccionSuscrito) {
		this.layoutSeccionSuscrito = layoutSeccionSuscrito;
	}

	public void setBarraBusqueda(TextField barraBusqueda) {
		this.barraBusqueda = barraBusqueda;
	}

	public HorizontalLayout getLayoutBuscarNoticiaSuscrito() {
		return layoutBuscarNoticiaSuscrito;
	}

	public void setLayoutBuscarNoticiaSuscrito(HorizontalLayout layoutBuscarNoticiaSuscrito) {
		this.layoutBuscarNoticiaSuscrito = layoutBuscarNoticiaSuscrito;
	}

	@Id("personalizarSuscrito")
	private Button personalizarSuscrito;
	@Id("verNoticia")
	private Button verNoticia;
	@Id("buscarNoticia")
	private Button buscarNoticia;
	@Id("personalizar")
	private Button personalizar;
	@Id("barraBusqueda")
	private TextField barraBusqueda;
	@Id("verSeccion")
	private Button verSeccion;
	@Id("layoutBuscarNoticiaSuscrito")
	private HorizontalLayout layoutBuscarNoticiaSuscrito;
	public Element getLayoutPersonalizarSuscrito() {
		return layoutPersonalizarSuscrito;
	}

	public void setLayoutPersonalizarSuscrito(Element layoutPersonalizarSuscrito) {
		this.layoutPersonalizarSuscrito = layoutPersonalizarSuscrito;
	}

	public Element getLayoutGestionPeriodista() {
		return layoutGestionPeriodista;
	}

	public void setLayoutGestionPeriodista(Element layoutGestionPeriodista) {
		this.layoutGestionPeriodista = layoutGestionPeriodista;
	}

	public Element getLayoutGestionEditor() {
		return layoutGestionEditor;
	}

	public void setLayoutGestionEditor(Element layoutGestionEditor) {
		this.layoutGestionEditor = layoutGestionEditor;
	}

	@Id("layoutSeccionSuscrito")
	private Element layoutSeccionSuscrito;
	@Id("layoutPersonalizarSuscrito")
	private Element layoutPersonalizarSuscrito;
	@Id("layoutGestionPeriodista")
	private Element layoutGestionPeriodista;
	@Id("layoutGestionEditor")
	private Element layoutGestionEditor;
	@Id("layoutPersonalizarGeneral")
	private Element layoutPersonalizarGeneral;

	public VistaUsuariogeneral() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getGestionEditor() {
		return gestionEditor;
	}

	public void setGestionEditor(Button gestionEditor) {
		this.gestionEditor = gestionEditor;
	}

	public Button getGestionPeriodista() {
		return gestionPeriodista;
	}

	public void setGestionPeriodista(Button gestionPeriodista) {
		this.gestionPeriodista = gestionPeriodista;
	}

	public Button getPersonalizarSuscrito() {
		return personalizarSuscrito;
	}

	public void setPersonalizarSuscrito(Button personalizarSuscrito) {
		this.personalizarSuscrito = personalizarSuscrito;
	}

	public Button getVerNoticia() {
		return verNoticia;
	}

	public void setVerNoticia(Button verNoticia) {
		this.verNoticia = verNoticia;
	}

	public Button getVerSeccion() {
		return verSeccion;
	}

	public void setVerSeccion(Button verSeccion) {
		this.verSeccion = verSeccion;
	}

	public Button getBuscarNoticia() {
		return buscarNoticia;
	}

	public void setBuscarNoticia(Button buscarNoticia) {
		this.buscarNoticia = buscarNoticia;
	}

	public Button getPersonalizar() {
		return personalizar;
	}

	public void setPersonalizar(Button personalizar) {
		this.personalizar = personalizar;
	}

	
}