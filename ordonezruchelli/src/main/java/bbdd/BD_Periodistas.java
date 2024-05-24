package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

public class BD_Periodistas {
	public BDPrincipal _bd_prin_per;
	public Vector<Periodista> _contiene_periodista = new Vector<Periodista>();

	public Periodista loginPeriodista(String aCorreo, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void crearPeriodista(String aCorreo, String aContrasena, String aApodo, String aDni, BD_Fotos aFoto) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPeriodista(int aPeriodistaID) {
		throw new UnsupportedOperationException();
	}
}