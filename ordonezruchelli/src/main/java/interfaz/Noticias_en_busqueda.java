package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;
import vistas.VistaNoticiasenbusqueda;
import java.util.List;

public class Noticias_en_busqueda extends VistaNoticiasenbusqueda {
	public Buscar_noticia _buscar_noticia;
	public Vector<Noticias_en_busqueda_item> _item = new Vector<Noticias_en_busqueda_item>();
	iUsuario_general _iUsuarioGeneral = new BDPrincipal();
	
	public Noticias_en_busqueda(Usuario_general usuarioGeneral, String busqueda) {
		super();
		this._buscar_noticia = usuarioGeneral._buscar;
		if (this._buscar_noticia != null) {
			this._buscar_noticia._usuario_general = usuarioGeneral;
            List<bbdd.Noticia> noticias = _iUsuarioGeneral.buscarNoticia(busqueda);
            for (bbdd.Noticia noticia : noticias) {
                Noticias_en_busqueda_item item = new Noticias_en_busqueda_item(this, noticia);
                _item.add(item);
                this._buscar_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(item);
            }
		}
	}
}