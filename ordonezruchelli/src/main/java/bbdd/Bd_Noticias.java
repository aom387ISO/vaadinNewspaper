package bbdd;
import java.util.Vector;

public class Bd_Noticias {
	public BDPrincipal _bd_prin_not;
	public java.util.Vector<Noticia> _contiene_noticias = new Vector<Noticia>();

	public void gustarNoticia(int aAIdNoticia) {
		throw new UnsupportedOperationException();
	}

	public void noGustarNoticia(int aAIdNoticia) {
		throw new UnsupportedOperationException();
	}

	public void crearNoticia(String aATitulo, BD_Fotos aAImagenes, BD_Tematicas aATematica, String aACuerpo, String aAResumen) {
		throw new UnsupportedOperationException();
	}

	public void cambiarDatosNoticia(String aATitulo, BD_Fotos aAImagenes, BD_Tematicas aATematica, String aACuerpo, String aAResumen) {
		throw new UnsupportedOperationException();
	}

	public void eliminarNoticia(int aAIdNoticia) {
		throw new UnsupportedOperationException();
	}
}