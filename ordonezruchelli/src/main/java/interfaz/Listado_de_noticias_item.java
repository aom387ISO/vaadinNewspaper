package interfaz;

public class Listado_de_noticias_item extends Listado_de_noticias_generico_item {

	public Listado_de_noticias _listado_de_noticias;
	public Ver_noticia _ver_noticia;
	tabla.Noticia _noticia;

	public Listado_de_noticias_item(Listado_de_noticias_generico _listado_de_noticias_generico, tabla.Noticia noticia) {
		super(_listado_de_noticias_generico, noticia);
		this._noticia = noticia;

		
	}

	public void Ver_noticia() {
		throw new UnsupportedOperationException();
	}
}