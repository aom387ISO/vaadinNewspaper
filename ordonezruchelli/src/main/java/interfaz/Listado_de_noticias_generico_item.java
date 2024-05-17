package interfaz;

import vistas.VistaListadodenoticiasgenerico_item;

public class Listado_de_noticias_generico_item extends VistaListadodenoticiasgenerico_item{
	public Listado_de_noticias_generico _listado_de_noticias_generico;
	
	bbdd.Noticia _noticia;
	
	public Listado_de_noticias_generico_item(Listado_de_noticias_generico _listado_de_noticias_generico, bbdd.Noticia noticia) {
		super();
		this._noticia = noticia;
		this.getTitulo().setValue(_noticia.getTitulo());
		this.getResumen().setValue(_noticia.getResumen());
		this.getCuerpo().setValue(_noticia.getCuerpo());
		this.getValoracionesPositivas().setValue(Integer.toString(_noticia.getnValoracionesPositivas()));
		this.getValoracionesNegativas().setValue(Integer.toString(_noticia.getnValoracionesNegativas()));
		this._listado_de_noticias_generico = _listado_de_noticias_generico;
	}
}