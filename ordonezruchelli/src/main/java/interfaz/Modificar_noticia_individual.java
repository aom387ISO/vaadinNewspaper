package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.orm.PersistentException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import vistas.VistaModificarnoticiaindividual;
import bbdd.*;
public class Modificar_noticia_individual extends VistaModificarnoticiaindividual {
	// private event _borrar_noticia;
	// private event _enviar_cambios;
	// private event _volver_a_gestion;
	public Elegir_noticia _elegir_noticia;
	iPeriodista _iPeriodista = new BDPrincipal();
    BD_Tematicas _bdTematicas = new BD_Tematicas();
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/uploads/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/uploads/";
    private String urlFoto;

	public Modificar_noticia_individual(Periodista periodista, bbdd.Noticia noticia, Noticias_propias_item noticias_propias_item) {
		super();
//		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista = periodista;
		this._elegir_noticia = new Elegir_noticia(noticias_propias_item);
        this.getTituloNoticia().setValue(noticia.getTitulo());
//        this.getImagenes().setValue(noticia.getImagenes());
        this.getNoticia().setValue(noticia.getCuerpo());
        this.getResumen().setValue(noticia.getResumen()); 
		this.getEliminarNoticia().addClickListener(event -> Borrar_noticia());

		this.getCambiarNoticia().addClickListener(event -> Enviar_cambios());

		this.getVolverGestion().addClickListener(event -> Volver_a_gestion());

		createUploadDirectory();

		FileBuffer buffer = new FileBuffer();

		Upload upload = new Upload(buffer);

		upload.setAcceptedFileTypes("image/jpeg", "image/png", "image/gif");
		getBannerImagen().add(upload);
        upload.setUploadButton(new Button("Cambiar Foto"));

		upload.addSucceededListener(event -> {
			File uploadedFile = buffer.getFileData().getFile();
			try {
				Path destinationPath = Paths.get(UPLOAD_DIR + event.getFileName());
				Files.move(uploadedFile.toPath(), destinationPath);
				urlFoto = IMAGE_PATH + event.getFileName();
				Notification.show("Image uploaded successfully!");
				Image img = createImageFromFile(IMAGE_PATH + event.getFileName());
				getBannerImagen().add(img);
			} catch (IOException e) {
				Notification.show("Error saving the image: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
			}
			Notification.show("Image uploaded successfully!");
		});
		upload.addFailedListener(event -> {
			Notification.show("Image upload failed: " + event.getReason().getMessage(), 5000,
					Notification.Position.MIDDLE);
		});
		upload.addFileRejectedListener(event -> {
			Notification.show("File rejected: " + event.getErrorMessage(), 5000, Notification.Position.MIDDLE);
		});
		
	}

	public void Borrar_noticia() {
		_iPeriodista.eliminarNoticia(this._elegir_noticia._noticias_propias._noticia.getIdNoticia());
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class)
				.add(this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia);
	}

	public void Enviar_cambios() {
		Periodista autor = this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista;
		String tematicaNoticia = this.getTematica().getValue();
		bbdd.Tematica tematica = null;
		try {
			tematica = _bdTematicas.obtenerTematicaPorId(tematicaNoticia);
	        if (tematica == null) {
	            _bdTematicas.crearTematica(tematicaNoticia);
	            tematica = _bdTematicas.obtenerTematicaPorId(tematicaNoticia);
	        }
	        
			_iPeriodista.cambiarDatosNoticia(this._elegir_noticia._noticias_propias._noticia.getIdNoticia(), this.getTituloNoticia().getValue(), null, tematica, this.getNoticia().getValue(), this.getResumen().getValue());
			
			if(urlFoto != null && !urlFoto.isEmpty())
			{
				_iPeriodista.cambiarImagenNoticia(this._elegir_noticia._noticias_propias._noticia.getIdNoticia(), urlFoto);
			}			
			
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class)
				.add(this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia);
	}

	public void Volver_a_gestion() {
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class)
				.add(this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia);
	}

	private void createUploadDirectory() {
		Path uploadDirPath = Paths.get(UPLOAD_DIR);
		if (!Files.exists(uploadDirPath)) {
			try {
				Files.createDirectories(uploadDirPath);
			} catch (IOException e) {
				throw new RuntimeException("Could not create upload directory: " + e.getMessage(), e);
			}
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