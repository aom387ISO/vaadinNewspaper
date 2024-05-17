package interfaz;

import vistas.VistaNoticiasenbusqueda_item;

public class Noticias_en_busqueda_item extends VistaNoticiasenbusqueda_item{
	public Noticias_en_busqueda _noticias_en_busqueda;
	public Ver_noticia _ver_noticia;
	bbdd.Noticia _noticia;
	
	public Noticias_en_busqueda_item(Noticias_en_busqueda _noticias_en_busqueda, bbdd.Noticia noticia) {
		super();
		this._noticias_en_busqueda = _noticias_en_busqueda;
		this._noticia = noticia;
		this.getNombreNoticiaBusqueda().setValue(_noticia.getTitulo());
		this.getResumenNoticiaBusqueda().setValue(_noticia.getResumen());
	}
	
	public void Ver_noticia() {
		throw new UnsupportedOperationException();
	}
}