package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import bbdd.BDPrincipal;
import bbdd.iUsuario_suscrito;
import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse {
	// private event _completar_registro;
	public Gestor_correo _gestor_correo;
	public Iniciar_sesion _iniciar_sesion;
	iUsuario_suscrito _iusuarioSuscrito = new BDPrincipal();
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/uploads/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/uploads/";
    private String urlFoto;

	public Registrarse(Iniciar_sesion iniciar_sesion) {
		super();
		this._iniciar_sesion = iniciar_sesion;
		this.getTerminarSuscripcion().addClickListener(event -> Completar_registro());
		createUploadDirectory();

		FileBuffer buffer = new FileBuffer();

		Upload upload = new Upload(buffer);

		upload.setAcceptedFileTypes("image/jpeg", "image/png", "image/gif");
		getLayoutFoto().add(upload);
		upload.addSucceededListener(event -> {
			File uploadedFile = buffer.getFileData().getFile();
			try {
				Path destinationPath = Paths.get(UPLOAD_DIR + event.getFileName());
				Files.move(uploadedFile.toPath(), destinationPath);
				urlFoto = IMAGE_PATH + event.getFileName();
				Notification.show("Image uploaded successfully!");
				Image img = createImageFromFile(IMAGE_PATH + event.getFileName());
				getLayoutFoto().add(img);
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

	public void Completar_registro() {
		String correo = this.getNuevoCorreo().getValue();
		String password = this.getNuevaPassword().getValue();
		String apodo = this.getNuevoApodo().getValue();
		String dni = this.getNuevoDNI().getValue();
		String nTarjeta = this.getAnadirTarjeta().getValue();
		String fechaCaducidad = this.getAnadirFechaCaducidad().getValue();
		String cvv = this.getAnadirCVV().getValue();

		if (!validarCampos(correo, password, dni, nTarjeta, fechaCaducidad, cvv)) {
			Notification.show("Todos los campos son obligatorios").addThemeVariants(NotificationVariant.LUMO_ERROR);
			return;
		}

		if (!validarPassword(password)) {
			Notification
					.show("La contraseña debe tener al menos 8 caracteres, un número, una mayúscula y una minúscula")
					.addThemeVariants(NotificationVariant.LUMO_ERROR);
			return;
		}
		_iusuarioSuscrito.registrarse(correo, password, apodo, dni, null, nTarjeta, fechaCaducidad, cvv);
		
	       bbdd.Usuario usuario = _iusuarioSuscrito.buscarUsuarioPorCorreo(correo);
	        if (usuario != null && urlFoto != null && !urlFoto.isEmpty()) {
	            _iusuarioSuscrito.subirFotoUsuario(usuario.getIdUsuario(), urlFoto);
	        }
		
		this._iniciar_sesion._usuario_no_suscrito.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
		this._iniciar_sesion._usuario_no_suscrito.getBannerNoticiasPortada().as(VerticalLayout.class).add(_iniciar_sesion);

	}

	private boolean validarPassword(String password) {
		if (password.length() < 8)
			return false;
		if (!password.chars().anyMatch(Character::isDigit))
			return false;
		if (!password.chars().anyMatch(Character::isUpperCase))
			return false;
		if (!password.chars().anyMatch(Character::isLowerCase))
			return false;
		return true;
	}

//Se mira mejor por isEmpty para comprobar que todos los campos estén rellenos en vez de mirar si no son nulos para que funcione correctamente.
	private boolean validarCampos(String correo, String password, String dni, String nTarjeta, String fechaCaducidad,
			String cvv) {
		return !correo.isEmpty() && !password.isEmpty() && !dni.isEmpty() && !nTarjeta.isEmpty()
				&& !fechaCaducidad.isEmpty() && !cvv.isEmpty();
	}

	public void Enviar_correo() {
		throw new UnsupportedOperationException();
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