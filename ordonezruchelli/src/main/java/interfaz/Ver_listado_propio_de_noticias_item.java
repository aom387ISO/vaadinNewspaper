package interfaz;

public class Ver_listado_propio_de_noticias_item extends Listado_de_noticias_generico_item {
	public Ver_listado_propio_de_noticias _ver_listado_propio_de_noticias;
	public Visualizar_noticia_propias _visualizar_noticia_propias;
	tabla.Noticia _noticia;

	public Ver_listado_propio_de_noticias_item(Listado_de_noticias_generico _listado_de_noticias_generico, tabla.Noticia noticia) {
		super(_listado_de_noticias_generico, noticia);
		this._noticia = noticia;

	}
	
	public void Visualizar_noticia_propias() {
		throw new UnsupportedOperationException();
	}
}