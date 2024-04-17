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
		this._buscar.getListadoBusqueda().setVisible(false);
		Buscar_noticia();
		
		_ver_noticia = new Ver_noticia(this);
		this.getVerNoticia().addClickListener(event->{
			this.MainView.removeAll();
			Ver_noticia();
		});		
		
		_visualizar_seccion = new Visualizar_seccion(this);
		this.getVerSeccion().addClickListener(event->{
			this.MainView.removeAll();
			Visualizar_seccion();
		});		
		
		_personalizar_perfil = new Personalizar_perfil(this);
		this.getPersonalizar().addClickListener(event->{
			this.MainView.removeAll();
			Personalizar_perfil();
		});	
		
	}
	
	public void Ver_noticia() {
		this.MainView.add(_ver_noticia);
	}

	public void Buscar_noticia() {
		this.getBannerGeneral().add(_buscar);
	}

	public void Visualizar_seccion() {
		this.MainView.add(_visualizar_seccion);
	}

	public void Personalizar_perfil() {
		this.MainView.add(_personalizar_perfil);
	}	
	
}