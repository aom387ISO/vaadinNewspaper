package interfaz;

import vistas.VistaListadenoticiasquenoestanenlaseccion_item;

public class Lista_de_noticias_que_no_estan_en__la_seccion_item extends VistaListadenoticiasquenoestanenlaseccion_item{
	public Lista_de_noticias_que_no_estan_en__la_seccion _lista_de_noticias_que_no_estan_en__la_seccion;
	bbdd.Noticia _noticia;
	public Lista_de_noticias_que_no_estan_en__la_seccion_item(Lista_de_noticias_que_no_estan_en__la_seccion _lista_de_noticias_que_no_estan_en_la_seccion, bbdd.Noticia noticia) {
		super();
		this._noticia = noticia;
		this.getTituloNoticiaSinSeccion().setValue(_noticia.getTitulo());
		this._lista_de_noticias_que_no_estan_en__la_seccion = _lista_de_noticias_que_no_estan_en_la_seccion;
	}
}