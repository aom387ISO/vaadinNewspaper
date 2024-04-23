package interfaz;

import vistas.VistaVercomentarios;

public class Ver_comentarios extends VistaVercomentarios{
	public Ver_noticia _ver_noticia;
	public Lista_comentarios_valorables _lista_comentarios_valorables;
	
	public Ver_comentarios(Usuario_general usuarioGeneral) {
		super();
		this._ver_noticia = new Ver_noticia(usuarioGeneral);
		this._ver_noticia._usuario_general = usuarioGeneral;
	}

	public void Lista_comentarios_valorables() {
		throw new UnsupportedOperationException();
	}
}