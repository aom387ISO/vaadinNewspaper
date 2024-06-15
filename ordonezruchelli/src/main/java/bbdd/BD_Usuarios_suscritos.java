package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

import org.hibernate.resource.transaction.spi.TransactionStatus;
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
					"CorreoElectronico = '" + aCorreo + "' AND Password = '" + aContrasena + "'", null);
			t.commit();
			System.out.println("aquassssssssssssss");
			if (logueado != null) {
				System.out.println("Usuario encontrado: " + logueado.toString());
				t.commit();
			} else {
				System.out.println("Usuario no encontrado con correo: " + aCorreo);
			      if (t.getStatus() != TransactionStatus.COMMITTED) {
	                    t.rollback(); 
	                }			}
			return logueado;

		} catch (Exception e) {
            if (t.getStatus() != TransactionStatus.COMMITTED) {
			t.rollback();
			}

		}
//		ProyectofinalPersistentManager.instance().disposePersistentManager();
		return logueado;
	}

	public void darDeBaja(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_suscrito usuario = Usuario_suscritoDAO.loadUsuario_suscritoByORMID(aIdUsuario);
			if (usuario != null) {
				Usuario_suscritoDAO.deleteAndDissociate(usuario);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();
	}

//Falta implementar el añadir foto
	public Usuario_suscrito registrarse(String aCorreo, String aContrasena, String aApodo, String aDni, Foto aFoto,
			String aNumeroTarjeta, String aCaducidad, String aCvv) throws PersistentException {

		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		Usuario_suscrito usuario = null;
		try {
			usuario = Usuario_suscritoDAO.createUsuario_suscrito();
			usuario.setCorreoElectronico(aCorreo);
			usuario.setPassword(aContrasena);
			usuario.setApodo(aApodo);
			usuario.setDni(aDni);
			usuario.setnTarjeta(aNumeroTarjeta);
			usuario.setFechaCaducidad(aCaducidad);
			usuario.setCvv(aCvv);
			Usuario_suscritoDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();

		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();
		// return usuario;
		return null;
	}
}