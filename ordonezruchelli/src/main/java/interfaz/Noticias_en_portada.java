package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.Noticia;
import vistas.VistaNoticiasenportada;

public class Noticias_en_portada extends VistaNoticiasenportada{
	public Gestionar_portada _gestionar_portada;
	public Vector<Noticias_en_portada_item> _item = new Vector<Noticias_en_portada_item>();
	
	public Noticias_en_portada(Gestionar_portada gestionar_portada) {
		super();
		this._gestionar_portada = gestionar_portada;
//		this._gestionar_portada._gestionar._editor = editor;
	}

	public void cargarNoticias(bbdd.Noticia[] noticias) {
        for (bbdd.Noticia noticia : noticias) {
        	Noticias_en_portada_item item = new Noticias_en_portada_item(this, noticia);
            _item.add(item);
        	this._gestionar_portada.getListaPortadaLayout().as(VerticalLayout.class).add(item);
        }		
	}
}