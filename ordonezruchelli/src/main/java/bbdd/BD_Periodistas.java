package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Periodistas {
	public BDPrincipal _bd_prin_per;
	public Vector<Periodista> _contiene_periodista = new Vector<Periodista>();

	public Periodista loginPeriodista(String aCorreo, String aContrasena) throws PersistentException {
		Periodista periodista = null;
		PersistentTransaction t = null;
		try {
			t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
			try {
				periodista = PeriodistaDAO.loadPeriodistaByQuery(
						"correoElectronico = '" + aCorreo + "' AND password = '" + aContrasena + "'", null);
				t.commit();
			} catch (Exception e) {
				if (t != null) {
					t.rollback();
				}
				e.printStackTrace();
			} finally {
				ProyectofinalPersistentManager.instance().disposePersistentManager();
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return periodista;
	}

	public void crearPeriodista(String aCorreo, String aContrasena, String aApodo, String aDni, BD_Fotos aFoto)
			throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Periodista periodista = PeriodistaDAO.createPeriodista();
			periodista.setCorreoElectronico(aCorreo);
			periodista.setPassword(aContrasena);
			periodista.setApodo(aApodo);
			periodista.setDni(aDni);
			PeriodistaDAO.save(periodista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();
	}

	public void eliminarPeriodista(int aPeriodistaID) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Periodista periodista = PeriodistaDAO.loadPeriodistaByORMID(aPeriodistaID);
			if (periodista != null) {
				PeriodistaDAO.delete(periodista);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();

		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}
}