package bbdd;


public interface iUsuario_no_suscrito {

	public BD_Usuarios_suscritos login(String aCorreo, String aContrasena);

	public BD_Usuarios_suscritos registrarse(String aCorreo, String aContrasena, String aApodo, String aDni, BD_Fotos aFoto, int aNumeroTarjeta, String aCaducidad, int aCvv);
}