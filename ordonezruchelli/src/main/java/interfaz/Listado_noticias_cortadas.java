package interfaz;

import java.util.Vector;

public class Listado_noticias_cortadas extends Listado_de_noticias_generico {
	public Buscar_noticia_de_no_suscrito _buscar_noticia_de_no_suscrito;
	public Listado_secciones_cortadas_item _listado_secciones_cortadas;
	public Vector<Listado_noticias_cortadas_item> _item = new Vector<Listado_noticias_cortadas_item>();
}