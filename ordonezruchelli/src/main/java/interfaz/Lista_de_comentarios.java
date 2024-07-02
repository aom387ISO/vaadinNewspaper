package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_de_comentarios extends Lista_de_comentarios_generico {
	public Ir_a_comentarios _ir_a_comentarios;
	public Vector<Lista_de_comentarios_item> _item = new Vector<Lista_de_comentarios_item>();
	
	public Lista_de_comentarios (Usuario_no_suscrito usuarioNoSuscrito) {
		super();
        if(this._ir_a_comentarios != null) {
            this._ir_a_comentarios._ver_noticia_cortada._usuario_no_suscrito = usuarioNoSuscrito;
            this._ir_a_comentarios.getLayoutComentarios().as(VerticalLayout.class).removeAll();
            for (bbdd.Comentario comentario :this._ir_a_comentarios._ver_noticia_cortada._usuario_no_suscrito.iUsuarioGeneral.cargarComentariosNoticia(this._ir_a_comentarios._ver_noticia_cortada._listado_noticias_cortadas._noticia.getIdNoticia())) {
            	Lista_de_comentarios_item item = new Lista_de_comentarios_item(this, comentario);
            	this._ir_a_comentarios.getLayoutComentarios().as(VerticalLayout.class).add(item);
            }
        }
    }
	   
}
