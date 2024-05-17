package interfaz;

import vistas.VistaListadodeseccionesgenerico_item;

public class Listado_de_secciones_generico_item extends VistaListadodeseccionesgenerico_item{
	public Listado_de_secciones_generico _listado_de_secciones_generico;
	bbdd.Seccion _seccion;
	
	public Listado_de_secciones_generico_item(Listado_de_secciones_generico _listado_de_secciones_generico,	bbdd.Seccion seccion) {
		super();
		this._seccion = seccion;
		this.getNombreSeccion().setValue(_seccion.getIdSeccion());
		this._listado_de_secciones_generico = _listado_de_secciones_generico;
	}
}