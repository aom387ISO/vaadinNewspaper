package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Periodistas {
	public BDPrincipal _bd_prin_per;
	public Vector<Periodista> _contiene_periodista = new Vector<Periodista>();

	public Periodista loginPeriodista(String aCorreo, String aContrasena) {
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

	public void crearPeriodista(String aCorreo, String aContrasena, String aApodo, String aDni, BD_Fotos aFoto) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPeriodista(int aPeriodistaID) {
		throw new UnsupportedOperationException();
	}
}