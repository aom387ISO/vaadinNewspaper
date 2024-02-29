package interfaz;

import java.util.Vector;

public class Listado_de_secciones extends Listado_de_secciones_generico {
	public Visualizar_seccion _visualizar_seccion;
	public Cambiar_nombre_a_seccion _cambiar_nombre_a_seccion;
	public Eliminar_una_seccion _eliminar_una_seccion;
	public Anadir_noticia_a_seccion _anadir_noticia_a_seccion;
	public Eliminar_noticia_de_seccion _eliminar_noticia_de_seccion;
	public Vector<Listado_de_secciones_item> _item = new Vector<Listado_de_secciones_item>();
}