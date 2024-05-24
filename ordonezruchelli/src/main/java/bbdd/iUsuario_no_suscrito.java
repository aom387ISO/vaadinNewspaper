package bbdd;

public interface iUsuario_no_suscrito {

	public BD_Usuarios_suscritos login(String aACorreo, String aAContrasena);

	public BD_Usuarios_suscritos registrarse(String aACorreo, String aAContrasena, String aAApodo, String aADni, BD_Fotos aAFoto, int aANumeroTarjeta, String aACaducidad, int aACvv);
}