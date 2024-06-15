package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iEditor;
import vistas.VistaCambiarnombreaseccion;

public class Cambiar_nombre_a_seccion extends VistaCambiarnombreaseccion{
//	private event _insertar_nuevo_nombre;
	public Gestionar_seccion _gestionar_seccion;
	public Listado_de_secciones _listado_de_secciones;
	iEditor ieditor = new BDPrincipal();
	
	public Cambiar_nombre_a_seccion (Gestionar_seccion gestionar_seccion) {
		super();
		this._gestionar_seccion = gestionar_seccion;
				
		
		_listado_de_secciones = new Listado_de_secciones(_gestionar_seccion._gestion_seccion._gestionar._editor);
		Listado_de_secciones();
		
	}

	public void Listado_de_secciones() {
		this.getGeneralAnadir().as(VerticalLayout.class).add(_listado_de_secciones);
	}

	public void Insertar_nuevo_nombre() {
		String idSeccion = this.getSeccionBox().getValue();
		if ((idSeccion != null) && (this.getNuevoNombreSeccion().getValue() != null)) {
			ieditor.cambiarNombreSeccion(idSeccion, this.getNuevoNombreSeccion().getValue());
			
			this._gestionar_seccion._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this._gestionar_seccion._gestion_seccion._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_seccion);

		} 
	}
}