package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.Noticia;
import bbdd.iUsuario_general;
import vistas.VistaVercomentarios;

public class Ver_comentarios extends VistaVercomentarios {
	public Ver_noticia _ver_noticia;
	public Lista_comentarios_valorables _lista_comentarios_valorables;
	bbdd.Noticia _noticia;
	iUsuario_general _iUsuario_general = new BDPrincipal();
	Listado_de_noticias_generico _listado_de_noticias_generico;
	
	public Ver_comentarios(Usuario_general usuarioGeneral, bbdd.Noticia noticia) {
		super();
		System.out.println("estoy en ver comentarios");
		this._ver_noticia._usuario_general = usuarioGeneral;
		_lista_comentarios_valorables = new Lista_comentarios_valorables(usuarioGeneral, noticia);
		if (_ver_noticia != null) {
			this._noticia = noticia;
			this._ver_noticia._usuario_general = usuarioGeneral;
			this._ver_noticia = new Ver_noticia(usuarioGeneral);
		}
	}
	
	public Ver_comentarios(Listado_de_noticias_generico listado_de_noticias_generico, Noticia noticia) {
		super();
		System.out.println("estoy en ver comentarios");
		this._listado_de_noticias_generico = listado_de_noticias_generico;
		if (_listado_de_noticias_generico != null) {
			this._noticia = noticia;
			}
		}

	public void Lista_comentarios_valorables() {
//		this._ver_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._ver_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_lista_comentarios_valorables);
	}
}