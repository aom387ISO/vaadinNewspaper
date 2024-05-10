package interfaz;

import java.util.Vector;

public class Ver_listado_propio_de_noticias extends Listado_de_noticias_generico {
	public Gestionar_noticia _gestionar_noticia;
	public Vector<Ver_listado_propio_de_noticias_item> _item = new Vector<Ver_listado_propio_de_noticias_item>();
	
	public Ver_listado_propio_de_noticias(Gestionar_noticia gestionar_noticia) {
	    super();
	    this._gestionar_noticia = gestionar_noticia;
//	    this._gestionar_noticia._periodista = periodista;
	}

}