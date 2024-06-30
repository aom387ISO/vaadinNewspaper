package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import bbdd.BDPrincipal;
import bbdd.BD_Tematicas;
import bbdd.Noticia;
import bbdd.iPeriodista;
import vistas.VistaIntroducirdatosnoticia;

public class Introducir_datos_noticia extends VistaIntroducirdatosnoticia{
	//	private event _enviar_noticia;
	//	private event _volver_a_gestion;
	public Gestionar_noticia _gestionar_noticia;
	iPeriodista _iperodista = new BDPrincipal();
    BD_Tematicas _bdTematicas = new BD_Tematicas();
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/uploads/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/uploads/";
    private String urlFoto;
	
    public Introducir_datos_noticia(Gestionar_noticia gestionar_noticia) {
		super();
        this._gestionar_noticia = gestionar_noticia;
//        this._gestionar_noticia._periodista = periodista;		
		this.getEnviarNoticia().addClickListener(event->Enviar_noticia());
		
		this.getVolverGestionNoticia().addClickListener(event->Volver_a_gestion());
		createUploadDirectory();

		FileBuffer buffer = new FileBuffer();

		Upload upload = new Upload(buffer);
        upload.setUploadButton(new Button("Introducir Foto"));

		upload.setAcceptedFileTypes("image/jpeg", "image/png", "image/gif");
		getLayoutFotos().add(upload);
		upload.addSucceededListener(event -> {
			File uploadedFile = buffer.getFileData().getFile();
			try {
				Path destinationPath = Paths.get(UPLOAD_DIR + event.getFileName());
				Files.move(uploadedFile.toPath(), destinationPath);
				urlFoto = IMAGE_PATH + event.getFileName();
				Notification.show("Image uploaded successfully!");
				Image img = createImageFromFile(IMAGE_PATH + event.getFileName());
				getLayoutFotos().add(img);
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

	public void Enviar_noticia() {
		bbdd.Periodista autor = _gestionar_noticia._periodista._periodista;
		String tematicaNoticia = this.getTematicaNoticia().getValue();
		bbdd.Tematica tematica = null;
		try {
			tematica = _bdTematicas.obtenerTematicaPorId(tematicaNoticia);
	        if (tematica == null) {
	            _bdTematicas.crearTematica(tematicaNoticia);
	            tematica = _bdTematicas.obtenerTematicaPorId(tematicaNoticia);
	        }
	        
			_iperodista.crearNoticia(this.getTituloNoticia().getValue(), null, tematica, this.getCuerpoNoticia().getValue(), this.getResumenNoticia().getValue(),autor);

			List<Noticia> listaNoticia = _iperodista.buscarNoticia(this.getTituloNoticia().getValue());
	        if (listaNoticia.size() > 0 && urlFoto != null && !urlFoto.isEmpty()) {
	        	bbdd.Noticia noticia = listaNoticia.get(0);
	        	_iperodista.subirFotoNoticia(noticia.getIdNoticia(), urlFoto);
	        }
			
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
	}

	public void Volver_a_gestion() {
		this._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_noticia);
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