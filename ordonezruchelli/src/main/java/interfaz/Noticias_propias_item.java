package interfaz;

public class Noticias_propias_item extends Listado_de_noticias_generico_item {
	public Noticias_propias _noticias_propias;
	public Elegir_noticia _elegir_noticia;
	bbdd.Noticia _noticia;

	public Noticias_propias_item(Listado_de_noticias_generico _listado_de_noticias_generico, bbdd.Noticia noticia) {
		super(_listado_de_noticias_generico, noticia);
		this._noticia = noticia;
	}

	public void Elegir_noticia() {
//		Modificar_noticia_individual modificarNoticia = new Modificar_noticia_individual(_periodista, _noticia.getId());

	}
}