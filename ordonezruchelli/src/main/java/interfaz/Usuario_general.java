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
		Buscar_noticia();
		
		//Componente estático para secciones.
		_visualizar_seccion = new Visualizar_seccion(this);
		Visualizar_seccion();
	}
	
	public void Ver_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Buscar_noticia() {
		this.getLayoutBuscarNoticiaSuscrito().add(_buscar);
	}

	public void Visualizar_seccion() {
		this.getLayoutSeccionSuscrito().as(VerticalLayout.class).add(_visualizar_seccion);
	}

	public void Personalizar_perfil() {
		throw new UnsupportedOperationException();
	}	
	
}