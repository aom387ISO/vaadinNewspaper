package interfaz;

import java.util.Vector;
import vistas.VistaListadeperiodistas;

public class Lista_de_periodistas extends VistaListadeperiodistas{
	public Gestionar_periodistas _gestionar_periodistas;
	public Vector<Lista_de_periodistas_item> _item = new Vector<Lista_de_periodistas_item>();
	public Editor editor;
	
	public Lista_de_periodistas(Editor editor) {
		super();
		this.editor = editor;
	}
}