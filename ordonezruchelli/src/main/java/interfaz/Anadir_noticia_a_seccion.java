package interfaz;

import java.util.List;
import java.util.stream.Collectors;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;

import bbdd.BDPrincipal;
import bbdd.NoticiaDAO;
import bbdd.ProyectofinalPersistentManager;
import bbdd.iEditor;
import bbdd.iPeriodista;
import bbdd.iUsuario_general;
import vistas.VistaAnadirnoticiaaseccion;

public class Anadir_noticia_a_seccion  extends VistaAnadirnoticiaaseccion{
//	private event _anadir_noticia;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	public Listado_de_secciones _listado_de_secciones;
	public Lista_de_noticias_que_no_estan_en__la_seccion _lista_de_noticias_que_no_estan_en__la_seccion;
	iEditor _ieditor = new BDPrincipal();
	iPeriodista _iperiodista = new BDPrincipal();
	iUsuario_general _iusuariogeneral = new BDPrincipal();

	public Anadir_noticia_a_seccion (Gestionar_noticia_en_seccion gestionar_noticia_en_seccion) {
		super();
		this._gestionar_noticia_en_seccion = gestionar_noticia_en_seccion;
		
        getAnadirNoticiaSeccion().addClickListener(event -> Anadir_noticia());
	
		_listado_de_secciones = new Listado_de_secciones(_gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor);
		Listado_de_secciones();		

		_lista_de_noticias_que_no_estan_en__la_seccion = new Lista_de_noticias_que_no_estan_en__la_seccion(_gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor);		
//		Lista_de_noticias_que_no_estan_en__la_seccion();
		getComboListadoSeccion().addValueChangeListener(event -> {
            String idSeccion = event.getValue();
            if (idSeccion != null) {
                Lista_de_noticias_que_no_estan_en__la_seccion(idSeccion);
            }
        });
		
	}
	
	public void Listado_de_secciones() {
//		this.getGeneralAnadir().add(_listado_de_secciones);
		try {
			bbdd.Seccion[] secciones = _ieditor.cargarSecciones();
			_listado_de_secciones.cargarSecciones(secciones);
            List<String> seccionid = java.util.Arrays.stream(secciones).map(bbdd.Seccion::getIdSeccion)
                    .collect(Collectors.toList());
            this.getComboListadoSeccion().setItems(seccionid);
		}catch (Exception e) {
            e.printStackTrace();
	        Notification notification = Notification.show("No se han cargado las secciones");
	        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);	
		}
	}

	public void Lista_de_noticias_que_no_estan_en__la_seccion(String idSeccion) {
//		this.getGeneralAnadir().add(_lista_de_noticias_que_no_estan_en__la_seccion);
        try {
            bbdd.Noticia[] noticias = _iusuariogeneral.cargarNoticiasNoContenidasEnSeccion(idSeccion);
            _lista_de_noticias_que_no_estan_en__la_seccion.cargarNoticias(noticias);
            List<String> noticia = java.util.Arrays.stream(noticias).map(bbdd.Noticia::getTitulo)
                    .collect(Collectors.toList());
            this.getComboListadoNoticias().setItems(noticia);
        } catch (Exception e) {
            e.printStackTrace();
            Notification notification = Notification.show("No se han cargado las noticias");
            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
        }
	}

    public void Anadir_noticia() {
        String idSeccion = this.getComboListadoSeccion().getValue();
        String tituloNoticia = this.getComboListadoNoticias().getValue();

        if (idSeccion != null && tituloNoticia != null) {
            bbdd.Noticia noticia = _ieditor.obtenerNoticiaPorTitulo(tituloNoticia);
			if (noticia != null) {
			    _ieditor.anadirNoticiaSeccion(noticia.getIdNoticia(), idSeccion);
			}
        } else {
            Notification notification = Notification.show("Seleccione una sección y una noticia");
            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
        }
    }
}