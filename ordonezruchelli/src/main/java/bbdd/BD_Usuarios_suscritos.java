package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

public class BD_Usuarios_suscritos {
	public BDPrincipal _bd_prin_u_sus;
	public Vector<Usuario_suscrito> _contiene_usuario_suscrito = new Vector<Usuario_suscrito>();

	public Usuario_suscrito login(String aCorreo, String aContrasena) {
	    for (Usuario_suscrito usuario : _contiene_usuario_suscrito) {
	    	if(usuario.getCorreoElectronico().equals(aCorreo) && usuario.getPassword().equals(aContrasena)) {
	    		return usuario;
	    	}
	    }
		return null;

	}

	public void darDeBaja(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public BD_Usuarios_suscritos registrarse(String aCorreo, String aContrasena, String aApodo, String aDni, Foto aFoto, int aNumeroTarjeta, String aCaducidad, int aCvv) {
		throw new UnsupportedOperationException();
	}
}