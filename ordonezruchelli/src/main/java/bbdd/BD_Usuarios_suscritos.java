package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Usuarios_suscritos {
	public BDPrincipal _bd_prin_u_sus;
	public Vector<Usuario_suscrito> _contiene_usuario_suscrito = new Vector<Usuario_suscrito>();

	public Usuario_suscrito login(String aCorreo, String aContrasena) throws PersistentException {
		Usuario_suscrito logueado = null;
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();

		try {
			logueado = Usuario_suscritoDAO.loadUsuario_suscritoByQuery(
					"correoElectronico = '" + aCorreo + "' AND password = '" + aContrasena + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();

		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();
		return logueado;

	}

	public void darDeBaja(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
//Falta implementar el añadir foto
	public BD_Usuarios_suscritos registrarse(String aCorreo, String aContrasena, String aApodo, String aDni, Foto aFoto,
			int aNumeroTarjeta, String aCaducidad, int aCvv) throws PersistentException {

		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
        Usuario_suscrito usuario = null;
        try {
            usuario = Usuario_suscritoDAO.createUsuario_suscrito();
            usuario.setCorreoElectronico(aCorreo);
            usuario.setPassword(aContrasena);
            usuario.setApodo(aApodo);
            usuario.setDni(aDni);
            usuario.setnTarjeta(String.valueOf(aNumeroTarjeta));
            usuario.setFechaCaducidad(aCaducidad);
            usuario.setCvv(String.valueOf(aCvv));
            Usuario_suscritoDAO.save(usuario);
            t.commit();
        } catch (Exception e) {
                t.rollback();

        }
        ProyectofinalPersistentManager.instance().disposePersistentManager();
        //return usuario;
        return null;
    }
}