package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import bbdd.BDPrincipal;
import bbdd.Noticia;
import bbdd.iUsuario_general;
import vistas.VistaListadodenoticiasgenerico_item;

public class Listado_de_noticias_generico_item extends VistaListadodenoticiasgenerico_item{
	public Listado_de_noticias_generico _listado_de_noticias_generico;
	bbdd.Noticia _noticia;
    public Ver_noticia _ver_noticia;
    iUsuario_general _iUsuario_general = new BDPrincipal();

	public Listado_de_noticias_generico_item(Listado_de_noticias_generico _listado_de_noticias_generico, bbdd.Noticia noticia) {
		super();
		this._noticia = noticia;
		this.getTitulo().setValue(_noticia.getTitulo());
		this.getResumen().setValue(_noticia.getResumen());
		this.getCuerpo().setValue(_noticia.getCuerpo());
		this.getValoracionesPositivas().setValue(Integer.toString(_noticia.getnValoracionesPositivas()));
		this.getValoracionesNegativas().setValue(Integer.toString(_noticia.getnValoracionesNegativas()));
		this._listado_de_noticias_generico = _listado_de_noticias_generico;
        getComentar().addClickListener(event -> verComentarios());
        
		String fotoNoticia = _iUsuario_general.cargarFotoNoticia(_noticia);
        if (fotoNoticia != null && !fotoNoticia.isEmpty()) {
            Image img = createImageFromFile(fotoNoticia);
            getBannerFoto().add(img);
        }
	}
	
	public Listado_de_noticias_generico_item(Ver_noticia verNoticia, Noticia noticia) {
		super();
		this._noticia = noticia;
		this._ver_noticia = verNoticia;
		this.getTitulo().setValue(_noticia.getTitulo());
		this.getResumen().setValue(_noticia.getResumen());
		this.getCuerpo().setValue(_noticia.getCuerpo());
		this.getValoracionesPositivas().setValue(Integer.toString(_noticia.getnValoracionesPositivas()));
		this.getValoracionesNegativas().setValue(Integer.toString(_noticia.getnValoracionesNegativas()));
		this._listado_de_noticias_generico = _listado_de_noticias_generico;
		
        getComentar().addClickListener(event -> verComentarios());

		String fotoNoticia = _iUsuario_general.cargarFotoNoticia(_noticia);
        if (fotoNoticia != null && !fotoNoticia.isEmpty()) {
            Image img = createImageFromFile(fotoNoticia);
            getBannerFoto().add(img);
        }
        
	}
	
    private void verComentarios() {
        if (_ver_noticia != null) {
            Ver_comentarios verComentarios = new Ver_comentarios(_ver_noticia._usuario_general, _noticia);
            verComentarios._lista_comentarios_valorables = new Lista_comentarios_valorables(_ver_noticia._usuario_general, _noticia);
            getBanner().removeAll();
            getBanner().add(verComentarios._lista_comentarios_valorables);
        }else if(_listado_de_noticias_generico != null) {
            Ver_comentarios verComentarios = new Ver_comentarios(_listado_de_noticias_generico, _noticia);
            verComentarios._lista_comentarios_valorables = new Lista_comentarios_valorables(_listado_de_noticias_generico, _noticia);
            getBanner().removeAll();
            getBanner().add(verComentarios._lista_comentarios_valorables);
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