package interfaz;

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iEditor;
import bbdd.iUsuario_general;
import vistas.VistaEliminarnoticiadeseccion;

public class Eliminar_noticia_de_seccion extends VistaEliminarnoticiadeseccion {
	// private event _confirmar_eliminar_noticia;
	public Gestionar_noticia_en_seccion _gestionar_noticia_en_seccion;
	public Listado_de_secciones _listado_de_secciones;
	iEditor _ieditor = new BDPrincipal();
	iUsuario_general _iUsuarioGeneral = new BDPrincipal();
	
	public Eliminar_noticia_de_seccion(Gestionar_noticia_en_seccion gestionar_noticia_en_seccion) {
		super();
		this._gestionar_noticia_en_seccion = gestionar_noticia_en_seccion;

		_listado_de_secciones = new Listado_de_secciones(
				_gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor);
		Listado_de_secciones();
		
	      getSecciones().addValueChangeListener(event -> {
	            String idSeccion = event.getValue();
	            if (idSeccion != null) {
	            	 try {
	                     bbdd.Noticia[] noticias = _ieditor.cargarNoticiasContenidasEnSeccion(idSeccion);
	                     List<String> noticiaTitulos = java.util.Arrays.stream(noticias).map(bbdd.Noticia::getTitulo)
	                             .collect(Collectors.toList());
	                     this.getNoticias().setItems(noticiaTitulos);
	                 } catch (Exception e) {
	                     e.printStackTrace();
	                     Notification notification = Notification.show("No se han cargado las noticias");
	                     notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
	                 }
	            }
	        });
		
		
		getEliminarNoticiaSeccion().addClickListener(event -> Confirmar_eliminar_noticia());

	}

	public void Listado_de_secciones() {
//		this.getEliminarGeneral().as(VerticalLayout.class).add(_listado_de_secciones);
		try {
			bbdd.Seccion[] secciones = _ieditor.cargarSecciones();
			_listado_de_secciones.cargarSecciones(secciones);
            List<String> seccionid = java.util.Arrays.stream(secciones).map(bbdd.Seccion::getNombre)
                    .collect(Collectors.toList());
            this.getSecciones().setItems(seccionid);
		}catch (Exception e) {
            e.printStackTrace();
	        Notification notification = Notification.show("No se han cargado las secciones");
	        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);	
		}
	}

	public void Confirmar_eliminar_noticia() {
			String idSeccion = this.getSecciones().getValue();
	        String tituloNoticia = this.getNoticias().getValue();

	        if (idSeccion != null && tituloNoticia != null) {
	            bbdd.Noticia noticia = _ieditor.obtenerNoticiaPorTitulo(tituloNoticia);
	            bbdd.Seccion seccion = _ieditor.cargarSeccionPorNombre(idSeccion);
	            if (noticia != null) {
	                _ieditor.eliminarNoticiaSeccion(noticia.getIdNoticia(), seccion.getIdSeccion());
	                Notification notification = Notification.show("Noticia eliminada de la sección");
	                notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
	    			this._gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner()
					.as(VerticalLayout.class).removeAll();
	    			this._gestionar_noticia_en_seccion._gestionar_noticia_de_seccion._gestionar._editor.getNoticiasBanner()
					.as(VerticalLayout.class).add(_gestionar_noticia_en_seccion);
	            }
	        } else {
	            Notification notification = Notification.show("Seleccione una sección y una noticia");
	            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
	        }
		
		
		
	}
}
