package interfaz;

public class Listado_secciones_cortadas_item extends Listado_de_secciones_generico_item {
	public Listado_secciones_cortadas _listado_secciones_cortadas;
	public Listado_noticias_cortadas _listado_noticias_cortadas;

	public Listado_secciones_cortadas_item(Listado_de_secciones_generico _listado_de_secciones_generico) {
		super(_listado_de_secciones_generico);
	}
	
	public void Listado_noticias_cortadas() {
		throw new UnsupportedOperationException();
	}
}