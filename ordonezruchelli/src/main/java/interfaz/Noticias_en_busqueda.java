package interfaz;

import java.util.Vector;

import vistas.VistaNoticiasenbusqueda;

public class Noticias_en_busqueda extends VistaNoticiasenbusqueda{
	public Buscar_noticia _buscar_noticia;
	public Vector<Noticias_en_busqueda_item> _item = new Vector<Noticias_en_busqueda_item>();
	public Usuario_general usuarioGeneral;
	
	public Noticias_en_busqueda(Usuario_general usuarioGeneral) {
		super();
		this.usuarioGeneral = usuarioGeneral;
	}
}