package interfaz;

public class Lista_de_comentarios_item extends Lista_de_comentarios_generico_item {
	public Lista_de_comentarios _lista_de_comentarios;
	
	public Lista_de_comentarios_item(Lista_de_comentarios_generico padre) {
		super(padre);
		this.getEliminar().setVisible(false);
		this.getMegusta().setVisible(false);
		this.getNomegusta().setVisible(false);
	}
}