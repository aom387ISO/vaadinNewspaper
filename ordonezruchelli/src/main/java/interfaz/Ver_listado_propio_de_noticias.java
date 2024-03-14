package interfaz;

import java.util.Vector;

public class Ver_listado_propio_de_noticias extends Listado_de_noticias_generico {
	public Gestionar_noticia _gestionar_noticia;
	public Vector<Ver_listado_propio_de_noticias_item> _item = new Vector<Ver_listado_propio_de_noticias_item>();
	public Periodista periodista;
	
	public Ver_listado_propio_de_noticias(Periodista periodista) {
		super();
		this.periodista = periodista;
	}
}