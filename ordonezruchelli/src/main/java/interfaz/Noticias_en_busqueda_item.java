package interfaz;

import vistas.VistaNoticiasenbusqueda_item;

public class Noticias_en_busqueda_item extends VistaNoticiasenbusqueda_item{
	public Noticias_en_busqueda _noticias_en_busqueda;
	public Ver_noticia _ver_noticia;
	tabla.Noticia _noticia;
	
	public Noticias_en_busqueda_item(Noticias_en_busqueda _noticias_en_busqueda, tabla.Noticia noticia) {
		super();
		this._noticias_en_busqueda = _noticias_en_busqueda;
		this._noticia = noticia;
	}
	
	public void Ver_noticia() {
		throw new UnsupportedOperationException();
	}
}