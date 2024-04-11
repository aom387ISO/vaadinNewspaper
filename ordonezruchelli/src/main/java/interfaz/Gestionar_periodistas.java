package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarperiodistas;

public class Gestionar_periodistas extends VistaGestionarperiodistas{
	//	private event _dar_de_baja_periodista;
	//	private event _dar_de_alta_periodista;
	//	private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar _gestionar;
	public Lista_de_periodistas _lista_de_periodistas;
	public Introducir_datos_de_periodista _introducir_datos_de_periodista;

	public Gestionar_periodistas(Editor editor) {
		super();
		this._gestionar._editor = editor;
		
		_lista_de_periodistas = new Lista_de_periodistas(editor);
		Lista_de_periodistas();
		
		_introducir_datos_de_periodista = new Introducir_datos_de_periodista(editor);
		Introducir_datos_de_periodista();
	}
	
	public void Lista_de_periodistas() {
		this.getPeriodistasLayout().add(_lista_de_periodistas);
	}

	public void Dar_de_baja_periodista() {
		throw new UnsupportedOperationException();
	}

	public void Introducir_datos_de_periodista() {
		this.getGestionarLayout().as(VerticalLayout.class).add(_introducir_datos_de_periodista);
	}

	public void Dar_de_alta_periodista() {
		throw new UnsupportedOperationException();
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		throw new UnsupportedOperationException();
	}
}