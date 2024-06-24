package interfaz;

import java.util.Vector;

import bbdd.BDPrincipal;
import bbdd.iPeriodista;

public class Ver_listado_propio_de_noticias extends Listado_de_noticias_generico {
	public Gestionar_noticia _gestionar_noticia;
	public Vector<Ver_listado_propio_de_noticias_item> _item = new Vector<Ver_listado_propio_de_noticias_item>();
	iPeriodista _iperiodista = new BDPrincipal();
	
	public Ver_listado_propio_de_noticias(Gestionar_noticia gestionar_noticia) {
	    super();
	    this._gestionar_noticia = gestionar_noticia;
//	    this._gestionar_noticia._periodista;
	}

    public void cargarNoticias(bbdd.Noticia[] noticias) {
        for (bbdd.Noticia noticia : noticias) {
        	Ver_listado_propio_de_noticias_item item = new Ver_listado_propio_de_noticias_item(this, noticia);
            _item.add(item);
        }
    }
}