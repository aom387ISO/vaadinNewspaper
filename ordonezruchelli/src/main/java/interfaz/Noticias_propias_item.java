package interfaz;

public class Noticias_propias_item extends Listado_de_noticias_generico_item {
	public Noticias_propias _noticias_propias;
	public Elegir_noticia _elegir_noticia;
	
	public Noticias_propias_item(Listado_de_noticias_generico _listado_de_noticias_generico) {
		super(_listado_de_noticias_generico);
	}

	public void Elegir_noticia() {
		throw new UnsupportedOperationException();
	}
}