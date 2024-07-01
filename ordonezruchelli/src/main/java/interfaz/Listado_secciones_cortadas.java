package interfaz;

import java.util.Vector;

public class Listado_secciones_cortadas extends Listado_de_secciones_generico {
	public Ver_seccion_de_Usuario_no_suscrito _ver_seccion_de_Usuario_no_suscrito;
	public Vector<Listado_secciones_cortadas_item> _item = new Vector<Listado_secciones_cortadas_item>();
	
	public Listado_secciones_cortadas(Usuario_no_suscrito usuarioNoSuscrito) {
	    super();
	    if (this._ver_seccion_de_Usuario_no_suscrito != null) {
	        this._ver_seccion_de_Usuario_no_suscrito._usuario_no_suscrito = usuarioNoSuscrito;
	    }
	    
	}

}