package interfaz;

import vistas.VistaIntroducirdatosdeperiodista;

public class Introducir_datos_de_periodista extends VistaIntroducirdatosdeperiodista{
	public Gestionar_periodistas _gestionar_periodistas;
	
	public Introducir_datos_de_periodista(Editor editor) {
		super();
		this._gestionar_periodistas._gestionar._editor = editor;
	}
}