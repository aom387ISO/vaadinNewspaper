package interfaz;

public class Ver_comentarios_de_Editor extends Ver_comentarios {
	//	private event _eliminar_comentario;
	public Editor _editor;
	
	public Ver_comentarios_de_Editor(Editor editor) {
		super(editor);
		this._editor = editor;
	}

	public void Eliminar_comentario() {
		throw new UnsupportedOperationException();
	}
}