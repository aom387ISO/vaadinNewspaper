package interfaz;

import vistas.VistaListadecomentariosgenerico_item;

public class Lista_de_comentarios_generico_item extends VistaListadecomentariosgenerico_item{
	public Lista_de_comentarios_generico _lista_de_comentarios_generico;
	tabla.Comentario _comentario;

	public Lista_de_comentarios_generico_item(Lista_de_comentarios_generico _lista_de_comentarios_generico,	tabla.Comentario comentario) {
		super();
		this._comentario = comentario;
		this.getContenidoComentario();
//		this.getNombreUsuario().setName(comentario.getAutor());
		this._lista_de_comentarios_generico = _lista_de_comentarios_generico;
	}
}