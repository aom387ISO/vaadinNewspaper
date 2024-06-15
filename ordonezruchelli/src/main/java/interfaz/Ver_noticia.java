package interfaz;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;
import vistas.VistaVernoticia;

public class Ver_noticia extends VistaVernoticia{
	//	private event _dar_me_gusta_noticia;
	//	private event _dar_no_me_gusta_noticia;
	public Usuario_general _usuario_general;
	public Listado_de_noticias_item _listado_de_noticias;
	public Noticias_en_busqueda_item _noticias_en_busqueda;
	public Ver_comentarios _ver_comentarios;
	iUsuario_general _iUsuario_general = new BDPrincipal();

	public Ver_noticia(Usuario_general usuarioGeneral) {
		super();
		this._usuario_general = usuarioGeneral;
		this._listado_de_noticias.getMegusta().addClickListener(event->Dar_me_gusta_noticia());
		this._listado_de_noticias.getNomegusta().addClickListener(event->Dar_no_me_gusta_noticia());

	}

	public void Ver_comentarios() {
		throw new UnsupportedOperationException();
	}

	public void Dar_me_gusta_noticia() {
//		_iUsuario_general.gustarNoticia(this._listado_de_noticias.getId(), this._usuario_general.get);
	}

	public void Dar_no_me_gusta_noticia() {
		throw new UnsupportedOperationException();
	}
}