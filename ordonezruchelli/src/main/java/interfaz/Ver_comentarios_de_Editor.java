package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iEditor;

public class Ver_comentarios_de_Editor extends Ver_comentarios {
	//	private event _eliminar_comentario;
	public Editor _editor;
	bbdd.Noticia _noticia;
	iEditor _iEditor = new BDPrincipal();
	public Ver_comentarios_de_Editor(Editor editor, bbdd.Noticia noticia) {
		super(editor, noticia);
		this._editor = editor;
		this._noticia = noticia;
		
//		this.().addClickListener(event -> Eliminar_comentario());
		
	}

	public void Eliminar_comentario() {
		Integer id = _noticia.getIdNoticia();
		_iEditor.eliminarComentario(id);
		this._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._editor.getNoticiasBanner().as(VerticalLayout.class).add(_editor._gestionar);

	}
	
}