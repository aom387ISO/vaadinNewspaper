package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;
import vistas.VistaVernoticia;

public class Ver_noticia extends VistaVernoticia {
	// private event _dar_me_gusta_noticia;
	// private event _dar_no_me_gusta_noticia;
	public Usuario_general _usuario_general;
	public Listado_de_noticias_item _listado_de_noticias;
	public Noticias_en_busqueda_item _noticias_en_busqueda;
	public Ver_comentarios _ver_comentarios;
	iUsuario_general _iUsuario_general = new BDPrincipal();
	bbdd.Noticia _noticia;
	
	public Ver_noticia(Usuario_general usuarioGeneral) {
		super();
		this._usuario_general = usuarioGeneral;
		if (_listado_de_noticias != null) {
			this._listado_de_noticias.getMeGusta().addClickListener(event -> Dar_me_gusta_noticia());
			this._listado_de_noticias.getNoMeGusta().addClickListener(event -> Dar_no_me_gusta_noticia());
			this._ver_comentarios = new Ver_comentarios(usuarioGeneral, _noticia);
			this._ver_comentarios.getVerComentarios().addClickListener(event -> Ver_comentarios());

		}
		this.getBannerPortada().as(VerticalLayout.class).removeAll();
		Listado_de_noticias lista = new Listado_de_noticias(_usuario_general);
		for (bbdd.Noticia noticiaPortada : _iUsuario_general.cargarNoticiasPorSeccionPortada()) {
			Listado_de_noticias_item item = new Listado_de_noticias_item(lista, noticiaPortada);
			this._listado_de_noticias = item;
			this._listado_de_noticias._listado_de_noticias = lista;
			this.getBannerPortada().as(VerticalLayout.class).add(item);
		}
	}
	
	public Ver_noticia(Usuario_general usuarioGeneral, bbdd.Noticia noticia) {
		super();
		this._usuario_general = usuarioGeneral;
		this._noticia = noticia;
        _listado_de_noticias = new Listado_de_noticias_item(this, noticia);
		if (_listado_de_noticias != null) {
			this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_listado_de_noticias);
			this._usuario_general.getParaNoticias().removeAll();
			this._usuario_general.getParaNoticias().add(_listado_de_noticias);
			this._listado_de_noticias.getMeGusta().addClickListener(event -> Dar_me_gusta_noticia());
			this._listado_de_noticias.getNoMeGusta().addClickListener(event -> Dar_no_me_gusta_noticia());
			this._ver_comentarios = new Ver_comentarios(usuarioGeneral, noticia);
			this._ver_comentarios.getVerComentarios().addClickListener(event -> Ver_comentarios());

		}
	}
	public void Ver_comentarios() {
		System.out.println("hola");
//		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_ver_comentarios);
	}

	public void Dar_me_gusta_noticia() {
		bbdd.Usuario usuario = _usuario_general._usuario;
		_iUsuario_general.gustarNoticia(_noticia.getIdNoticia(), usuario.getIdUsuario());
	
//		_iUsuario_general.gustarNoticia(this._listado_de_noticias._noticia.getIdNoticia(), usuario.getIdUsuario());
	}

	public void Dar_no_me_gusta_noticia() {
		bbdd.Usuario usuario = _usuario_general._usuario;
		_iUsuario_general.noGustarNoticia(_noticia.getIdNoticia(), usuario.getIdUsuario());
	
//		_iUsuario_general.noGustarNoticia(this._listado_de_noticias._noticia.getIdNoticia(), usuario.getIdUsuario());
	}
}