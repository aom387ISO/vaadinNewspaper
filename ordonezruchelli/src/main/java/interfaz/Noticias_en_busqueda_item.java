package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;
import vistas.VistaNoticiasenbusqueda_item;

public class Noticias_en_busqueda_item extends VistaNoticiasenbusqueda_item{
	public Noticias_en_busqueda _noticias_en_busqueda;
	public Ver_noticia _ver_noticia;
	bbdd.Noticia _noticia;
    iUsuario_general _iUsuario_general = new BDPrincipal();

	public Noticias_en_busqueda_item(Noticias_en_busqueda _noticias_en_busqueda, bbdd.Noticia noticia) {
		super();
		this._noticias_en_busqueda = _noticias_en_busqueda;
		this._noticia = noticia;
		this.getNombreNoticiaBusqueda().setValue(_noticia.getTitulo());
		this.getResumenNoticiaBusqueda().setValue(_noticia.getResumen());

        getVerNoticia().addClickListener(event -> Ver_noticia());
        
		String fotoNoticia = _iUsuario_general.cargarFotoNoticia(_noticia);
        if (fotoNoticia != null && !fotoNoticia.isEmpty()) {
            Image img = createImageFromFile(fotoNoticia);
            getBannerFotos().add(img);
        }
	}
	
	public void Ver_noticia() {
        _ver_noticia = new Ver_noticia(_noticias_en_busqueda._buscar_noticia._usuario_general, _noticia);
        this._noticias_en_busqueda._buscar_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
        this._noticias_en_busqueda._buscar_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_ver_noticia);
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