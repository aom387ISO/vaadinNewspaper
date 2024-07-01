package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.server.StreamResource;

import bbdd.BDPrincipal;
import bbdd.iEditor;
import vistas.VistaNoticiasenportada_item;

public class Noticias_en_portada_item extends VistaNoticiasenportada_item {
	// private event _eliminar_de_portada;
	public Noticias_en_portada _noticias_en_portada;
	public Introducir_nueva_posicion_en_portada _introducir_nueva_posicion_en_portada;
	bbdd.Noticia _noticia;
	iEditor _ieditor = new BDPrincipal();

	public Noticias_en_portada_item(Noticias_en_portada _noticias_en_portada, bbdd.Noticia noticia) {
		super();
		this._noticias_en_portada = _noticias_en_portada;
		this._noticia = noticia;
		this.getNoticiaPortada().setValue(_noticia.getTitulo());
		this.getResumenNoticiaPortada().setValue(_noticia.getResumen());
		this.getPosicionEnPortada().setValue(String.valueOf(_noticia.getPosicionPortada()));
		
		
		getEliminarDePortada().addClickListener(event -> Eliminar_de_portada());
	    
		getCambiarPosicionBoton().addClickListener(event -> Introducir_nueva_posicion_en_portada());
		
		String fotoNoticia = _ieditor.cargarFotoNoticia(_noticia);
        if (fotoNoticia != null && !fotoNoticia.isEmpty()) {
            Image img = createImageFromFile(fotoNoticia);
            getBannerFotos().add(img);
        }
	}

	public void Eliminar_de_portada() {
		try {
            _ieditor.eliminarDePortada(_noticia.getIdNoticia());
            Notification.show("Noticia eliminada de la portada").addThemeVariants(NotificationVariant.LUMO_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            Notification.show("Error al eliminar la noticia de la portada").addThemeVariants(NotificationVariant.LUMO_ERROR);
        }	
	}

	public void Introducir_nueva_posicion_en_portada() {
		try {
            _ieditor.cambiarPosicion(null, _noticia.getIdNoticia(), Integer.valueOf(this.getNuevaPosicionCuadro().getValue()));
            Notification.show("Noticia cambiada de posición").addThemeVariants(NotificationVariant.LUMO_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            Notification.show("Error al cambiar la posición").addThemeVariants(NotificationVariant.LUMO_ERROR);
        }	
	}
	
	private Image createImageFromFile(String filePath) {
		File file = new File(filePath);
		if (file.exists()) {
			StreamResource resource = new StreamResource(file.getName(), () -> {
				try {
					return new FileInputStream(file);
				} catch (FileNotFoundException e) {
					Notification.show("Error: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
					return null;
				}
			});
			Image image = new Image(resource, "Image not found");
			image.setMaxWidth("500px");
			return image;
		} else {
			Notification.show("File not found: " + filePath, 5000, Notification.Position.MIDDLE);
			return new Image();
		}
	}
}