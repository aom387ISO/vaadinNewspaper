package interfaz;

import bbdd.Noticia;
import vistas.VistaListadodenoticiasgenerico_item;

public class Listado_de_noticias_generico_item extends VistaListadodenoticiasgenerico_item{
	public Listado_de_noticias_generico _listado_de_noticias_generico;
	
	bbdd.Noticia _noticia;
    public Ver_noticia _ver_noticia;

	public Listado_de_noticias_generico_item(Listado_de_noticias_generico _listado_de_noticias_generico, bbdd.Noticia noticia) {
		super();
		this._noticia = noticia;
		this.getTitulo().setValue(_noticia.getTitulo());
		this.getResumen().setValue(_noticia.getResumen());
		this.getCuerpo().setValue(_noticia.getCuerpo());
		this.getValoracionesPositivas().setValue(Integer.toString(_noticia.getnValoracionesPositivas()));
		this.getValoracionesNegativas().setValue(Integer.toString(_noticia.getnValoracionesNegativas()));
		this._listado_de_noticias_generico = _listado_de_noticias_generico;
        getComentar().addClickListener(event -> verComentarios());
	}

	public Listado_de_noticias_generico_item(Ver_noticia verNoticia, Noticia noticia) {
		super();
		this._noticia = noticia;
		this._ver_noticia = verNoticia;
		this.getTitulo().setValue(_noticia.getTitulo());
		this.getResumen().setValue(_noticia.getResumen());
		this.getCuerpo().setValue(_noticia.getCuerpo());
		this.getValoracionesPositivas().setValue(Integer.toString(_noticia.getnValoracionesPositivas()));
		this.getValoracionesNegativas().setValue(Integer.toString(_noticia.getnValoracionesNegativas()));
		this._listado_de_noticias_generico = _listado_de_noticias_generico;
		
        getComentar().addClickListener(event -> verComentarios());

		}
	
    private void verComentarios() {
        if (_ver_noticia != null) {
            Ver_comentarios verComentarios = new Ver_comentarios(_ver_noticia._usuario_general, _noticia);
            verComentarios._lista_comentarios_valorables = new Lista_comentarios_valorables(_ver_noticia._usuario_general, _noticia);
            getBanner().removeAll();
            getBanner().add(verComentarios._lista_comentarios_valorables);
        }else if(_listado_de_noticias_generico != null) {
            Ver_comentarios verComentarios = new Ver_comentarios(_listado_de_noticias_generico, _noticia);
            verComentarios._lista_comentarios_valorables = new Lista_comentarios_valorables(_ver_noticia._usuario_general, _noticia);
            getBanner().removeAll();
            getBanner().add(verComentarios._lista_comentarios_valorables);
        }
    }
}