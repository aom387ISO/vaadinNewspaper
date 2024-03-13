package interfaz;

import java.util.Vector;
import vistas.VistaListadodenoticiasgenerico;

public class Listado_de_noticias_generico extends VistaListadodenoticiasgenerico{
	public Vector<Listado_de_noticias_generico_item> _item = new Vector<Listado_de_noticias_generico_item>();
	
	public Listado_de_noticias_generico() {
		super();
	}
}