package interfaz;

public class Lista_comentarios_valorables_item extends Lista_de_comentarios_generico_item {
	//	private event _dar_me_gusta_a_comentario;
	//	private event _dar_no_me_gusta_a_comentario;
	public Lista_comentarios_valorables _lista_comentarios_valorables;
	public Comentar _comentar;
	public Lista_de_comentarios_generico _lista_de_comentarios_generico;
	tabla.Comentario _comentario;
	public Lista_comentarios_valorables_item(Lista_de_comentarios_generico padre, tabla.Comentario comentario) {
		super(padre, comentario);
		
		this._comentario = comentario;
		this.getEliminar().setVisible(false);
	}

	public void Dar_me_gusta_a_comentario() {
		throw new UnsupportedOperationException();
	}

	public void Comentar() {
		throw new UnsupportedOperationException();
	}

	public void Dar_no_me_gusta_a_comentario() {
		throw new UnsupportedOperationException();
	}
}