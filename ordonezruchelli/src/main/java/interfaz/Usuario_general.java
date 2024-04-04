package interfaz;

import vistas.VistaUsuariogeneral;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

public class Usuario_general extends VistaUsuariogeneral{
	public Ver_noticia _ver_noticia;
	public Buscar_noticia _buscar_noticia;
	public Visualizar_seccion _visualizar_seccion;
	public Personalizar_perfil _personalizar_perfil;
	public Buscar_noticia _buscar;


	public MainView MainView;
	public Usuario_general(MainView MainView) {
		this.MainView=MainView;
		
		//Componente estático Buscar Noticia
		_buscar = new Buscar_noticia(this);
		this._buscar_noticia.getListadoBusqueda().setVisible(false);
		Buscar_noticia();
		
		//Componente estático para secciones.
//		_visualizar_seccion = new Visualizar_seccion(this);
//		Visualizar_seccion();
//		
//		//Componente estático para personalizar perfil.
//		_personalizar_perfil = new Personalizar_perfil(this);
//		Personalizar_perfil();
	}
	
	public void Ver_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Buscar_noticia() {
		this.getBannerGeneral().add(_buscar);
	}

	public void Visualizar_seccion() {
//		this.getLayoutSeccionSuscrito().as(VerticalLayout.class).add(_visualizar_seccion);
	}

	public void Personalizar_perfil() {
		//this.getLayoutPersonalizarGeneral().as(VerticalLayout.class).add(_personalizar_perfil);
	}	
	
}