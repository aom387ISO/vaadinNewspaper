package bbdd;

import java.util.Vector;

public class BD_Periodistas {
	public BDPrincipal _bd_prin_per;
	public java.util.Vector<Periodista> _contiene_periodista = new Vector<Periodista>();

	public Periodista loginPeriodista(String aACorreo, String aAContrasena) {
		throw new UnsupportedOperationException();
	}

	public void crearPeriodista(String aACorreo, String aAContrasena, String aAApodo, String aADni, BD_Fotos aAFoto) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPeriodista(int aAPeriodistaID) {
		throw new UnsupportedOperationException();
	}
}