package interfaz;

public class Listado_de_secciones_item extends Listado_de_secciones_generico_item {
	public Listado_de_secciones _listado_de_secciones;
	public Listado_de_noticias _listado_de_noticias;
	
	tabla.Seccion _seccion;
	
	public Listado_de_secciones_item(Listado_de_secciones_generico _listado_de_secciones_generico, tabla.Seccion seccion) {
		super(_listado_de_secciones_generico, seccion);
		this._seccion = seccion;

	}

	public void Listado_de_noticias() {
		throw new UnsupportedOperationException();
	}
}