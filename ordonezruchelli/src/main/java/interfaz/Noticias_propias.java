package interfaz;

import java.util.Vector;

public class Noticias_propias extends Listado_de_noticias_generico {
	public Modificar_noticia_previa _modificar_noticia_previa;
	public Visualizar_noticia_propias _visualizar_noticia_propias;
	public Vector<Noticias_propias_item> _item = new Vector<Noticias_propias_item>();
	
	public Noticias_propias(Periodista periodista) {
		super();
		this._modificar_noticia_previa._gestionar_noticia._periodista = periodista;
	}
}