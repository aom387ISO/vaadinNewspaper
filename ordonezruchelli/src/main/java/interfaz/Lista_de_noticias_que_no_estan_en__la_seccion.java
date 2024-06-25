package interfaz;

import java.util.Vector;
import vistas.VistaListadenoticiasquenoestanenlaseccion;

public class Lista_de_noticias_que_no_estan_en__la_seccion extends VistaListadenoticiasquenoestanenlaseccion {
	public Anadir_noticia_a_seccion _anadir_noticia_a_seccion;
	public Vector<Lista_de_noticias_que_no_estan_en__la_seccion_item> _item = new Vector<Lista_de_noticias_que_no_estan_en__la_seccion_item>();

	public Lista_de_noticias_que_no_estan_en__la_seccion(Editor editor) {
		super();
		if (_anadir_noticia_a_seccion != null) {
			this._anadir_noticia_a_seccion._gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor = editor;
		}
	}
	
    public void cargarNoticias(bbdd.Noticia[] noticias) {
        for (bbdd.Noticia noticia : noticias) {
        	Lista_de_noticias_que_no_estan_en__la_seccion_item item = new Lista_de_noticias_que_no_estan_en__la_seccion_item(this, noticia);
            _item.add(item);
        }
    }
}