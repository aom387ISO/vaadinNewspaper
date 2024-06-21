package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasenbusqueda;

public class Noticias_en_busqueda extends VistaNoticiasenbusqueda{
	public Buscar_noticia _buscar_noticia;
	public Vector<Noticias_en_busqueda_item> _item = new Vector<Noticias_en_busqueda_item>();
	
	public Noticias_en_busqueda(Usuario_general usuarioGeneral) {
		super();
		this._buscar_noticia._usuario_general = usuarioGeneral;
        for (int i = 0; i < 10; i++) {
            bbdd.Noticia noticia = new bbdd.Noticia();
            noticia.setTitulo("Noticia " + (i + 1));
            noticia.setResumen("Resumen de la noticia " + (i + 1));
            Noticias_en_busqueda_item item = new Noticias_en_busqueda_item(this, noticia);
            _item.add(item);
            this._buscar_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(item);
        }
	}
}