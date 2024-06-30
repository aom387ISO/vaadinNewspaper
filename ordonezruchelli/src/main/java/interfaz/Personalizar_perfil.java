package interfaz;

import proyectoMDS.MainView;
import vistas.VistaPersonalizarperfil;

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
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import bbdd.BDPrincipal;
import bbdd.Foto;
import bbdd.iUsuario_general;
import interfaz.Usuario_no_suscrito;

public class Personalizar_perfil extends VistaPersonalizarperfil {
	// private event _cambiar_apodo;
	// private event _volver_a_portada;
	// private event _cambiar_imagen;
	// private event _cerrar_sesion;
	public Usuario_general _usuario_general;
	bbdd.Usuario usuario;
	iUsuario_general _iUsuario = new BDPrincipal();
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/uploads/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/uploads/";
    private String urlFoto;

	
	public Personalizar_perfil(Usuario_general usuarioGeneral, bbdd.Usuario usuario) {
		super();
		this._usuario_general = usuarioGeneral;
		this.usuario = usuario;
//		this.getPerfil().as(VerticalLayout.class).add(this.usuario.getApodo());

		this.getBajaUsuarioSuscrito().setVisible(false);

		this.getCerrarSesion().addClickListener(event -> Cerrar_sesion());

		this.getCambiarApodo().addClickListener(event -> Cambiar_apodo());

		this.getVolverPortada().addClickListener(event -> Volver_a_portada());
		
		createUploadDirectory();

		FileBuffer buffer = new FileBuffer();

		Upload upload = new Upload(buffer);

		upload.setAcceptedFileTypes("image/jpeg", "image/png", "image/gif");
		getLayoutFotos().add(upload);
        upload.setUploadButton(new Button("Cambiar Foto"));

		upload.addSucceededListener(event -> {
			File uploadedFile = buffer.getFileData().getFile();
			try {
				Path destinationPath = Paths.get(UPLOAD_DIR + event.getFileName());
				Files.move(uploadedFile.toPath(), destinationPath);
				urlFoto = IMAGE_PATH + event.getFileName();
				Notification.show("Image uploaded successfully!");
				Image img = createImageFromFile(IMAGE_PATH + event.getFileName());
				getLayoutFotos().add(img);
				Cambiar_imagen();
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
		
		String fotoUsuario = _iUsuario.cargarFoto(usuario);
        if (fotoUsuario != null && !fotoUsuario.isEmpty()) {
            Image img = createImageFromFile(fotoUsuario);
            getLayoutFotos().add(img);
        }
		
	}

	public void Cambiar_apodo() {
		_iUsuario.cambiarApodo(this.getNuevoApodo().getValue(), usuario.getIdUsuario());
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_usuario_general._personalizar_perfil);
	}

	public void Volver_a_portada() {
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_usuario_general._ver_noticia);

	}

	public void Cambiar_imagen() {
		_iUsuario.borrarFotoUsuario(usuario.getIdUsuario());
		if(urlFoto != null && !urlFoto.isEmpty()) {
			_iUsuario.subirFotoUsuario(usuario.getIdUsuario(), urlFoto);
			this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_usuario_general._personalizar_perfil);
		}
	}

	public void Cerrar_sesion() {
        Notification notification = Notification.show("Cerrado de sesión con éxito");
        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
		this._usuario_general.MainView.removeAll();
		this._usuario_general.MainView.add(_usuario_general.MainView.usuario_no_suscrito);
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