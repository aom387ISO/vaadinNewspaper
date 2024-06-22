package interfaz;

public class Lista_comentarios_valorables_item extends Lista_de_comentarios_generico_item {
	//	private event _dar_me_gusta_a_comentario;
	//	private event _dar_no_me_gusta_a_comentario;
	public Lista_comentarios_valorables _lista_comentarios_valorables;
	public Comentar _comentar;
	public Lista_de_comentarios_generico _lista_de_comentarios_generico;
	bbdd.Comentario _comentario;

	
	public Lista_comentarios_valorables_item(Lista_de_comentarios_generico padre, bbdd.Comentario comentario) {
		super(padre, comentario);
		
		this._comentario = comentario;
		this.getEliminar().setVisible(false);
	}

	public void Dar_me_gusta_a_comentario() {
		if(this._comentario != null)
			this._lista_comentarios_valorables._ver_comentarios._ver_noticia._iUsuario_general.gustarComentario(this._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general._usuario.getIdUsuario(), this._comentario.getIdComentario());
	}

	public void Comentar() {
		//no se que hace este comentar
	}

	public void Dar_no_me_gusta_a_comentario() {
		if(this._comentario != null)
			this._lista_comentarios_valorables._ver_comentarios._ver_noticia._iUsuario_general.noGustarComentario(this._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general._usuario.getIdUsuario(), this._comentario.getIdComentario());
	}
}