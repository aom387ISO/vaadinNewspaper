package interfaz;

public class Listado_de_secciones_item extends Listado_de_secciones_generico_item {
	public Listado_de_secciones _listado_de_secciones;
	public Listado_de_noticias _listado_de_noticias;
	
	public Listado_de_secciones_item(Listado_de_secciones_generico _listado_de_secciones_generico) {
		super(_listado_de_secciones_generico);
	}

	public void Listado_de_noticias() {
		throw new UnsupportedOperationException();
	}
}