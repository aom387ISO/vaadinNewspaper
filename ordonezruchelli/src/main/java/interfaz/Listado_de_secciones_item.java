package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;

public class Listado_de_secciones_item extends Listado_de_secciones_generico_item {
	public Listado_de_secciones _listado_de_secciones;
	public Listado_de_noticias _listado_de_noticias;
    private Button button;
	bbdd.Seccion _seccion;
	iUsuario_general _iUsuarioGeneral = new BDPrincipal();
	public Listado_de_secciones_item(Listado_de_secciones_generico _listado_de_secciones_generico, bbdd.Seccion seccion) {
		super(_listado_de_secciones_generico, seccion);
		this._seccion = seccion;
		_listado_de_secciones = (Listado_de_secciones) _listado_de_secciones_generico;
		this.button = new Button(seccion.getNombre(), event -> mostrarNoticiasDeSeccion(seccion));
        if(_listado_de_secciones != null) {
		_listado_de_secciones.getBanner().add(button);
		}
		Listado_de_noticias();
	}

	public void Listado_de_noticias() {
		if(_listado_de_secciones != null && this._listado_de_secciones._visualizar_seccion != null) {
		this._listado_de_noticias = new Listado_de_noticias(this._listado_de_secciones._visualizar_seccion._usuario_general);
		}
	}
	
//    private void mostrarNoticiasDeSeccion(bbdd.Seccion seccion) {
//        if (_listado_de_secciones != null) {
////        if (_listado_de_secciones != null && _listado_de_secciones._visualizar_seccion != null) {
////        	this._listado_de_secciones._visualizar_seccion = new Visualizar_seccion(this);
//            Usuario_general usuarioGeneral = _listado_de_secciones._visualizar_seccion._usuario_general;
//            _listado_de_noticias = new Listado_de_noticias(usuarioGeneral);
//            usuarioGeneral.getNoticiasBanner().as(VerticalLayout.class).removeAll();
//
//            bbdd.Noticia[] noticias = _iUsuarioGeneral.cargarNoticiasContenidasEnSeccion(seccion.getNombre());
//            for (bbdd.Noticia noticia : noticias) {
//                Listado_de_noticias_item item = new Listado_de_noticias_item(usuarioGeneral, _listado_de_noticias, noticia);
//                _listado_de_noticias._item.add(item);
//                usuarioGeneral.getNoticiasBanner().as(VerticalLayout.class).add(item);
//            }
//        }
//    }
    private void mostrarNoticiasDeSeccion(bbdd.Seccion seccion) {
        if (_listado_de_secciones != null && _listado_de_secciones._visualizar_seccion != null) {
            Usuario_general usuarioGeneral = _listado_de_secciones._visualizar_seccion._usuario_general;

            if (_listado_de_noticias == null) {
                _listado_de_noticias = new Listado_de_noticias(usuarioGeneral);
            } else {
                usuarioGeneral.getNoticiasBanner().as(VerticalLayout.class).removeAll();
            }

            bbdd.Noticia[] noticias = _iUsuarioGeneral.cargarNoticiasContenidasEnSeccion(seccion.getNombre());
            for (bbdd.Noticia noticia : noticias) {
                Listado_de_noticias_item item = new Listado_de_noticias_item(usuarioGeneral, _listado_de_noticias, noticia);
                _listado_de_noticias._item.add(item);
                usuarioGeneral.getNoticiasBanner().as(VerticalLayout.class).add(item);
            }
        }
    }
}