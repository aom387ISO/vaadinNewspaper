package interfaz;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import bbdd.BDPrincipal;
import bbdd.NoticiaDAO;
import bbdd.ProyectofinalPersistentManager;
import bbdd.iEditor;
import vistas.VistaAnadirnoticiaaseccion;

public class Anadir_noticia_a_seccion  extends VistaAnadirnoticiaaseccion{
//	private event _anadir_noticia;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	public Listado_de_secciones _listado_de_secciones;
	public Lista_de_noticias_que_no_estan_en__la_seccion _lista_de_noticias_que_no_estan_en__la_seccion;
	iEditor ieditor = new BDPrincipal();

	public Anadir_noticia_a_seccion (Gestionar_noticia_en_seccion gestionar_noticia_en_seccion) {
		super();
		this._gestionar_noticia_en_seccion = gestionar_noticia_en_seccion;
		
        getAnadirNoticiaSeccion().addClickListener(event -> Anadir_noticia());
	
		_listado_de_secciones = new Listado_de_secciones(_gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor);
		Listado_de_secciones();		

		_lista_de_noticias_que_no_estan_en__la_seccion = new Lista_de_noticias_que_no_estan_en__la_seccion(_gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor);		
		Lista_de_noticias_que_no_estan_en__la_seccion();

	}
	
	public void Listado_de_secciones() {
		this.getGeneralAnadir().add(_listado_de_secciones);
	}

	public void Lista_de_noticias_que_no_estan_en__la_seccion() {
		this.getGeneralAnadir().add(_lista_de_noticias_que_no_estan_en__la_seccion);
	}

	public void Anadir_noticia() {
		String idSeccion = (String) this.getSeccion().getValue();
		bbdd.Noticia noticia = (bbdd.Noticia) this.getNoticia().getValue();
		if ((idSeccion != null) && (noticia.getIdNoticia() != -1)) {
			ieditor.anadirNoticiaSeccion(noticia.getIdNoticia(), idSeccion);
			Notification.show("Noticia añadida a seccion");
			}
	}
}