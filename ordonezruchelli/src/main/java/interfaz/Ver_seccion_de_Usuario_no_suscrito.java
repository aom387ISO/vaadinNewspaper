package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;
import vistas.VistaVersecciondeusuarionosuscrito;

public class Ver_seccion_de_Usuario_no_suscrito extends VistaVersecciondeusuarionosuscrito{
	public Usuario_no_suscrito _usuario_no_suscrito;
	public Listado_secciones_cortadas _listado_secciones_cortadas;
	iUsuario_general _iUsuario_general = new BDPrincipal();
	public Ver_seccion_de_Usuario_no_suscrito(Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._usuario_no_suscrito = usuarioNoSuscrito;
		
		_listado_secciones_cortadas = new Listado_secciones_cortadas(this, usuarioNoSuscrito);
		Listado_secciones_cortadas();
	}

	public void Listado_secciones_cortadas() {
		this.getLayoutSecciones().as(VerticalLayout.class).removeAll();
		bbdd.Seccion [] seccion = _iUsuario_general.cargarSecciones();
		_listado_secciones_cortadas.cargarSecciones(seccion);
		this.getLayoutSecciones().as(VerticalLayout.class).add(_listado_secciones_cortadas);
	}
}