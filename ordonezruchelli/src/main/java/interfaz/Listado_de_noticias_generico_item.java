package interfaz;

import vistas.VistaListadodenoticiasgenerico_item;

public class Listado_de_noticias_generico_item extends VistaListadodenoticiasgenerico_item{
	public Listado_de_noticias_generico _listado_de_noticias_generico;
	
	tabla.Noticia _noticia;
	
	public Listado_de_noticias_generico_item(Listado_de_noticias_generico _listado_de_noticias_generico, tabla.Noticia noticia) {
		super();
		this._noticia = noticia;
		this._listado_de_noticias_generico = _listado_de_noticias_generico;
	}
}