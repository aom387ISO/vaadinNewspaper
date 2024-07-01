package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listado_secciones_cortadas extends Listado_de_secciones_generico {
	public Ver_seccion_de_Usuario_no_suscrito _ver_seccion_de_Usuario_no_suscrito;
	public Vector<Listado_secciones_cortadas_item> _item = new Vector<Listado_secciones_cortadas_item>();
	
	public Listado_secciones_cortadas(Ver_seccion_de_Usuario_no_suscrito verSeccionDeUsuarioNoSuscrito, Usuario_no_suscrito usuarioNoSuscrito) {
	    super();
	    this._ver_seccion_de_Usuario_no_suscrito = verSeccionDeUsuarioNoSuscrito;
	    if (this._ver_seccion_de_Usuario_no_suscrito != null) {
	        this._ver_seccion_de_Usuario_no_suscrito._usuario_no_suscrito = usuarioNoSuscrito;
	    }
	    
	}
	public void cargarSecciones(bbdd.Seccion [] secciones)  {
        for (bbdd.Seccion seccion : secciones) {
        	Listado_secciones_cortadas_item item = new Listado_secciones_cortadas_item(this, seccion);
            _item.add(item);
            this.getBanner().add(item);
//            this._ver_seccion_de_Usuario_no_suscrito._usuario_no_suscrito.getParaNoticias().add(item);
        }
	}
}