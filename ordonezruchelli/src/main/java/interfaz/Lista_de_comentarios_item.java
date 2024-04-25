package interfaz;

public class Lista_de_comentarios_item extends Lista_de_comentarios_generico_item {
	public Lista_de_comentarios _lista_de_comentarios;
	tabla.Comentario _comentario;

	public Lista_de_comentarios_item(Lista_de_comentarios_generico padre, tabla.Comentario comentario) {
		super(padre, comentario);
		this._comentario = comentario;
		this.getEliminar().setVisible(false);
		this.getMegusta().setVisible(false);
		this.getNomegusta().setVisible(false);
	}
}