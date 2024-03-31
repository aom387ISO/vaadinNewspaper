package interfaz;

import vistas.VistaComentar;

public class Comentar extends VistaComentar{
	//	private event _escribir_comentario;
	public Lista_comentarios_valorables_item _lista_comentarios_valorables;
	public Usuario_general usuarioGeneral;
	
	public Comentar (Usuario_general usuarioGeneral) {
		super();
		this.usuarioGeneral = usuarioGeneral;
	}

	public void Escribir_comentario() {
		throw new UnsupportedOperationException();
	}
}