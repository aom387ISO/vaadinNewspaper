package interfaz;

import vistas.VistaComentar;

public class Comentar extends VistaComentar{
	//	private event _escribir_comentario;
	public Lista_comentarios_valorables_item _lista_comentarios_valorables;
	
	public Comentar (Usuario_general usuarioGeneral) {
		super();
		this._lista_comentarios_valorables._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general = usuarioGeneral;
	}

	public void Escribir_comentario() {
		throw new UnsupportedOperationException();
	}
}