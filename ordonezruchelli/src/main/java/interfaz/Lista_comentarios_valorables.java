package interfaz;

import java.util.Vector;

import bbdd.BDPrincipal;
import bbdd.Noticia;
import bbdd.iUsuario_general;

public class Lista_comentarios_valorables extends Lista_de_comentarios_generico {
	public Ver_comentarios _ver_comentarios;
	public Vector<Lista_comentarios_valorables_item> _item = new Vector<Lista_comentarios_valorables_item>();
	bbdd.Noticia _noticia;
	iUsuario_general _iUsuario_general = new BDPrincipal();
	public Lista_comentarios_valorables(Usuario_general usuarioGeneral, bbdd.Noticia noticia) {
		super();
		this._ver_comentarios._ver_noticia._usuario_general = usuarioGeneral;
		this._noticia = noticia;
        bbdd.Comentario[] comentarios = _iUsuario_general.cargarComentariosNoticia(this._noticia.getIdNoticia());
        for (bbdd.Comentario comentario : comentarios) {
            Lista_comentarios_valorables_item item = new Lista_comentarios_valorables_item(this, noticia, comentario);
            _item.add(item);
            getComentariosBaner().add(item);
        }
	}

	public Lista_comentarios_valorables(Listado_de_noticias_generico _listado_de_noticias_generico, bbdd.Noticia noticia) {
		super();
		this._noticia = noticia;
        bbdd.Comentario[] comentarios = _iUsuario_general.cargarComentariosNoticia(this._noticia.getIdNoticia());
        for (bbdd.Comentario comentario : comentarios) {
            Lista_comentarios_valorables_item item = new Lista_comentarios_valorables_item(this, noticia, comentario);
            _item.add(item);
            getComentariosBaner().add(item);
        }
        
	}
	
}