package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;

public class Listado_noticias_cortadas extends Listado_de_noticias_generico {
	public Buscar_noticia_de_no_suscrito _buscar_noticia_de_no_suscrito;
	public Listado_secciones_cortadas_item _listado_secciones_cortadas;
	public Vector<Listado_noticias_cortadas_item> _item = new Vector<Listado_noticias_cortadas_item>();
	iUsuario_general _iUsuarioGeneral = new BDPrincipal();

	public Listado_noticias_cortadas(Usuario_no_suscrito usuarioNoSuscrito, List<bbdd.Noticia> listaNoticias) {
		super();
//        	this._buscar_noticia_de_no_suscrito._usuario_no_suscrito = usuarioNoSuscrito;
            for (bbdd.Noticia noticia : listaNoticias) {
            	Listado_noticias_cortadas_item item = new Listado_noticias_cortadas_item(this, noticia);
                _item.add(item);
                usuarioNoSuscrito.getBannerNoticiasPortada().as(VerticalLayout.class).add(item);
//                this._buscar_noticia_de_no_suscrito._usuario_no_suscrito.getNoticiasPortada().as(VerticalLayout.class).add(item);
            }
        	
        	
        
    }
}