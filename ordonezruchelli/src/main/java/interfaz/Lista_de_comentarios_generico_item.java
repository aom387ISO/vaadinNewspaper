package interfaz;

import vistas.VistaListadecomentariosgenerico_item;

public class Lista_de_comentarios_generico_item extends VistaListadecomentariosgenerico_item{
	public Lista_de_comentarios_generico _lista_de_comentarios_generico;
	tabla.Comentario _comentario;

	public Lista_de_comentarios_generico_item(Lista_de_comentarios_generico _lista_de_comentarios_generico,	tabla.Comentario comentario) {
		super();
		this._comentario = comentario;
		this.getNombreUsuario().setValue(_comentario.getAutor().getApodo());
		this.getContenidoComentario().setValue(_comentario.getContenido());
		this.getValoracionesPositivasComentario().setValue(Integer.toString(_comentario.getnValoracionesPositvas()));
		this.getValoracionesNegativasComentario().setValue(Integer.toString(_comentario.getnValoracionesNegativas()));
		this._lista_de_comentarios_generico = _lista_de_comentarios_generico;
	}
}