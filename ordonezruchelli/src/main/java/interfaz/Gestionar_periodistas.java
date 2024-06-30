package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import bbdd.BDPrincipal;
import bbdd.iEditor;
import bbdd.iUsuario_suscrito;
import vistas.VistaGestionarperiodistas;

public class Gestionar_periodistas extends VistaGestionarperiodistas {
	// private event _dar_de_baja_periodista;
	// private event _dar_de_alta_periodista;
	// private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar _gestionar;
	public Lista_de_periodistas _lista_de_periodistas;
	public Introducir_datos_de_periodista _introducir_datos_de_periodista;
	iEditor _iEditor = new BDPrincipal();
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/uploads/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/uploads/";
    private String urlFoto;
    
    
	public Gestionar_periodistas(Gestionar gestionar) {
		super();
		this._gestionar = gestionar;
//		this._gestionar._editor = gestionar;

		_lista_de_periodistas = new Lista_de_periodistas(this);
		Lista_de_periodistas();
//		
		this._introducir_datos_de_periodista = new Introducir_datos_de_periodista(this);
		this._introducir_datos_de_periodista.getDarAltaPeriodista().addClickListener(event -> Dar_alta_periodista());
		Introducir_datos_de_periodista();

		this.getVolverGestion().addClickListener(event -> {
			this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Volver_a_la_gestion_desde_gestion_portada();
		});
        this.getBajaPeriodista().addClickListener(event -> Dar_de_baja_periodista());
		createUploadDirectory();

		FileBuffer buffer = new FileBuffer();

		Upload upload = new Upload(buffer);

		upload.setAcceptedFileTypes("image/jpeg", "image/png", "image/gif");
		this._introducir_datos_de_periodista.getLayoutFoto().add(upload);
		upload.addSucceededListener(event -> {
			File uploadedFile = buffer.getFileData().getFile();
			try {
				Path destinationPath = Paths.get(UPLOAD_DIR + event.getFileName());
				Files.move(uploadedFile.toPath(), destinationPath);
				urlFoto = IMAGE_PATH + event.getFileName();
				Notification.show("Image uploaded successfully!");
				Image img = createImageFromFile(IMAGE_PATH + event.getFileName());
				this._introducir_datos_de_periodista.getLayoutFoto().add(img);
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

	  public void Lista_de_periodistas() {
	        try {
	            bbdd.Periodista[] periodistas = _iEditor.cargarPeriodistas();
	            _lista_de_periodistas.cargarPeriodistas(periodistas);

	            List<String> apodos = java.util.Arrays.stream(periodistas).map(bbdd.Periodista::getApodo)
	                                                  .collect(Collectors.toList());
	            this.getPeriodistaCombo().setItems(apodos);
	        } catch (Exception e) {
	            e.printStackTrace();
		        Notification notification = Notification.show("No se han cargado los periodistas");
		        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);	        
		        }
	    }

	    public void Dar_de_baja_periodista() {
	        String selectedApodo = this.getPeriodistaCombo().getValue();
	        Notification notification = null;
	        if (selectedApodo != null && !selectedApodo.isEmpty()) {
	            bbdd.Periodista periodista = _iEditor.buscarPeriodistaPorApodo(selectedApodo);
	            if (periodista != null) {
	                _iEditor.eliminarPeriodista(periodista.getIdUsuario());
			        notification = Notification.show("Periodista deshabilitado con éxito");
			        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
	                Lista_de_periodistas();
	            } else {
			        notification = Notification.show("Periodista no encontrado");
			        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
	            }
	        } else {
		        notification = Notification.show("No se ha seleccionado ningún periodista");
		        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);

	        }
	    }
	public void Introducir_datos_de_periodista() {
		this.getGestionarLayout().as(VerticalLayout.class).add(_introducir_datos_de_periodista);
	}

	public void Dar_alta_periodista() {
		String correo = this._introducir_datos_de_periodista.getCorreoPeriodista().getValue();
		String contrasena = this._introducir_datos_de_periodista.getContrasenaPeriodista().getValue();
		String apodo = this._introducir_datos_de_periodista.getApodoPeriodista().getValue();
		String dni = this._introducir_datos_de_periodista.getDniPeriodista().getValue();

	    if (!validarCampos(correo, contrasena, dni, apodo)) {
	        Notification.show("Todos los campos son obligatorios")
	            .addThemeVariants(NotificationVariant.LUMO_ERROR);
	        return;
	    }
		
	    if (!validarPassword(contrasena)) {
	        Notification.show("La contraseña debe tener al menos 8 caracteres, un número, una mayúscula y una minúscula")
	        	.addThemeVariants(NotificationVariant.LUMO_ERROR);
	        return;
	    }

		_iEditor.crearPeriodista(correo, contrasena, apodo, dni, null);
		
	    bbdd.Usuario usuario = _iEditor.buscarUsuarioPorCorreo(correo);
	    if (usuario != null && urlFoto != null && !urlFoto.isEmpty()) {
	       	_iEditor.subirFotoUsuario(usuario.getIdUsuario(), urlFoto);
	    }
		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		Volver_a_la_gestion_desde_gestion_portada();
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar);
	}
	
	private boolean validarPassword(String password) {
	    if (password.length() < 8) return false;
	    if (!password.chars().anyMatch(Character::isDigit)) return false;
	    if (!password.chars().anyMatch(Character::isUpperCase)) return false;
	    if (!password.chars().anyMatch(Character::isLowerCase)) return false;
	    return true;
	}
//Se mira mejor por isEmpty para comprobar que todos los campos estén rellenos en vez de mirar si no son nulos para que funcione correctamente.
	private boolean validarCampos(String correo, String password, String dni, String apodo) {
	    return !correo.isEmpty() && !password.isEmpty() && !dni.isEmpty() && !apodo.isEmpty();
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