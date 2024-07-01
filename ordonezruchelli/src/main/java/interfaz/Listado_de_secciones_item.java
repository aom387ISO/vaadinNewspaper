package interfaz;

public class Listado_de_secciones_item extends Listado_de_secciones_generico_item {
	public Listado_de_secciones _listado_de_secciones;
	public Listado_de_noticias _listado_de_noticias;
	
	bbdd.Seccion _seccion;
	
	public Listado_de_secciones_item(Listado_de_secciones_generico _listado_de_secciones_generico, bbdd.Seccion seccion) {
		super(_listado_de_secciones_generico, seccion);
		this._seccion = seccion;
		Listado_de_noticias();
	}

	public void Listado_de_noticias() {
		if(_listado_de_secciones != null && this._listado_de_secciones._visualizar_seccion != null) {
		this._listado_de_noticias = new Listado_de_noticias(this._listado_de_secciones._visualizar_seccion._usuario_general);
		}
	}
}