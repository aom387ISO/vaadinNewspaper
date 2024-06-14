package bbdd;

public interface iUsuario_suscrito extends iUsuario_general {

	public void darDeBaja(int aAIdUsuario);

	public Usuario_suscrito login(String aACorreo, String aAContrasena);

	public Usuario_suscrito registrarse(String aACorreo, String aAContrasena, String aAApodo, String aADni,
			Foto aAFoto, String aANumeroTarjeta, String aACaducidad, String aACvv);
}