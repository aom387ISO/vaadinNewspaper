package interfaz;

public class Listado_de_noticias_item extends Listado_de_noticias_generico_item {

	public Listado_de_noticias _listado_de_noticias;
	public Ver_noticia _ver_noticia;

	public Listado_de_noticias_item(Listado_de_noticias_generico _listado_de_noticias_generico) {
		super(_listado_de_noticias_generico);
		
	}

	public void Ver_noticia() {
		throw new UnsupportedOperationException();
	}
}