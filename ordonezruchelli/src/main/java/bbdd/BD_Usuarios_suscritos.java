package bbdd;
import java.util.Vector;

public class BD_Usuarios_suscritos {
	public BDPrincipal _bd_prin_u_sus;
	public java.util.Vector<Usuario_suscrito> _contiene_usuario_suscrito = new Vector<Usuario_suscrito>();

	public Usuario_suscrito login(String aACorreo, String aAContrasena) {
		throw new UnsupportedOperationException();
	}

	public void darDeBaja(int aAIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public BD_Usuarios_suscritos registrarse(String aACorreo, String aAContrasena, String aAApodo, String aADni, Foto aAFoto, int aANumeroTarjeta, String aACaducidad, int aACvv) {
		throw new UnsupportedOperationException();
	}
}