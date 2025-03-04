package interfaz;

import java.util.Vector;

public class Listado_de_secciones extends Listado_de_secciones_generico {
	public Visualizar_seccion _visualizar_seccion;
	public Cambiar_nombre_a_seccion _cambiar_nombre_a_seccion;
	public Eliminar_una_seccion _eliminar_una_seccion;
	public Anadir_noticia_a_seccion _anadir_noticia_a_seccion;
	public Eliminar_noticia_de_seccion _eliminar_noticia_de_seccion;
	public Vector<Listado_de_secciones_item> _item = new Vector<Listado_de_secciones_item>();
	
	public Listado_de_secciones(Usuario_general usuarioGeneral) {
		super();
		if(this._visualizar_seccion != null) {
		this._visualizar_seccion._usuario_general = usuarioGeneral;
		}
	}
	public Listado_de_secciones(Visualizar_seccion visualizar_seccion) {
		super();
		this._visualizar_seccion = visualizar_seccion;
		this._visualizar_seccion._usuario_general = visualizar_seccion._usuario_general;
	}
	
    public void cargarSecciones(bbdd.Seccion[] secciones) {
        for (bbdd.Seccion seccion : secciones) {
        	Listado_de_secciones_item item = new Listado_de_secciones_item(this, seccion);
            _item.add(item);
            getBanner().add(item);
        }
    }
}