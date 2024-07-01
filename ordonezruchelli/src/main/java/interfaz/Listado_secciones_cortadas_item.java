package interfaz;

import java.util.List;
import java.util.Vector;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;

public class Listado_secciones_cortadas_item extends Listado_de_secciones_generico_item {
	public Listado_secciones_cortadas _listado_secciones_cortadas;
	public Listado_noticias_cortadas _listado_noticias_cortadas;
	bbdd.Seccion _seccion;
	iUsuario_general _iUsuario_general = new BDPrincipal();
	public Listado_secciones_cortadas_item(Listado_de_secciones_generico _listado_de_secciones_generico, bbdd.Seccion seccion) {
		super(_listado_de_secciones_generico, seccion);
		this._listado_de_secciones_generico = _listado_de_secciones_generico;
		this._listado_secciones_cortadas = (Listado_secciones_cortadas) _listado_de_secciones_generico; 
		this._seccion = seccion;
		
		Listado_noticias_cortadas();
	}
	
	public void Listado_noticias_cortadas() {
		List<bbdd.Noticia> lista = new Vector<bbdd.Noticia>();
		bbdd.Noticia[] noticias = _iUsuario_general.cargarNoticiasContenidasEnSeccion(this._seccion.getNombre());
//		for (bbdd.Noticia noticia : _listado_secciones_cortadas._ver_seccion_de_Usuario_no_suscrito._usuario_no_suscrito.iUsuarioGeneral.cargarNoticiasContenidasEnSeccion(_seccion.getNombre())) {
//			lista.add(noticia);
//		}
		for (bbdd.Noticia noticia : noticias) {
			lista.add(noticia);
		}
		this._listado_noticias_cortadas = new Listado_noticias_cortadas(this, lista);
//		this._listado_noticias_cortadas = new Listado_noticias_cortadas(this._listado_secciones_cortadas._ver_seccion_de_Usuario_no_suscrito._usuario_no_suscrito, lista);
	}
}