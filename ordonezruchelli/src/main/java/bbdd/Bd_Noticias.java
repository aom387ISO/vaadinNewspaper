package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

public class Bd_Noticias {
	public BDPrincipal _bd_prin_not;
	public Vector<Noticia> _contiene_noticias = new Vector<Noticia>();

	public void gustarNoticia(int aIdNoticia, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void noGustarNoticia(int aIdNoticia, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void crearNoticia(String aTitulo, BD_Fotos aImagenes, BD_Tematicas aTematica, String aCuerpo, String aResumen) {
		throw new UnsupportedOperationException();
	}

	public void cambiarDatosNoticia(String aTitulo, BD_Fotos aImagenes, BD_Tematicas aTematica, String aCuerpo, String aResumen) {
		throw new UnsupportedOperationException();
	}

	public void eliminarNoticia(int aIdNoticia) {
		throw new UnsupportedOperationException();
	}
}