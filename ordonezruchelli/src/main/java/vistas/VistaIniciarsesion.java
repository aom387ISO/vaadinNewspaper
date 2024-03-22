package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-iniciarsesion")
@JsModule("./src/vista-iniciarsesion.ts")
public class VistaIniciarsesion extends LitTemplate {

    @Id("login")
	private TextField login;
	@Id("password")
	private PasswordField password;
	@Id("botonLogin")
	private Button botonLogin;

	public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }

	public TextField getLogin() {
		return login;
	}

	public void setLogin(TextField login) {
		this.login = login;
	}

	public PasswordField getPassword() {
		return password;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}

	public Button getBotonLogin() {
		return botonLogin;
	}

	public void setBotonLogin(Button botonLogin) {
		this.botonLogin = botonLogin;
	}

}