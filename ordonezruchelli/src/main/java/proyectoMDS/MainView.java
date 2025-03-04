package proyectoMDS;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.Editor;
import interfaz.Periodista;
import interfaz.Usuario_no_suscrito;
import interfaz.Usuario_suscrito;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

	
    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
//    public MainView(@Autowired GreetService service) {
//
//    	usuario_no_suscrito = new Usuario_no_suscrito(this);
//    	add(usuario_no_suscrito);
//    }
	 public Editor editor;
	 public Periodista periodista;
	 public Usuario_suscrito usuario_suscrito;
	 public Usuario_no_suscrito usuario_no_suscrito;
	 
	 public MainView() {
		 usuario_no_suscrito = new Usuario_no_suscrito(this);
		 add(usuario_no_suscrito);
//		 usuario_suscrito = new Usuario_suscrito(this);
//		 add(usuario_suscrito);
	 }
}
