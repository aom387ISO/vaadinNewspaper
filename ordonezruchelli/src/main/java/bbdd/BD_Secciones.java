package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

public class BD_Secciones {
	public BDPrincipal _bd_prin_sec;
	public Vector<Seccion> _contiene_secciones = new Vector<Seccion>();

	public void anadirNoticiaSeccion(int aIdNoticia, int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarNoticiaSeccion(int aIdNoticia, int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void crearSeccion(String aNombreSeccion) {
		throw new UnsupportedOperationException();
	}

	public void anadirAportada(int aIdSeccion, int aIdNoticia) {
		throw new UnsupportedOperationException();
	}

	public void cambiarPosicion(int aIdSeccion, int aNuevaPosicion) {
		throw new UnsupportedOperationException();
	}

	public void cambiarNombreSeccion(String aIdSeccion, String aNuevoNombreSeccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarSeccion(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}
}