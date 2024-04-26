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

	tabla.Usuario _usuario;


	public MainView MainView;
	public Usuario_general(MainView MainView, tabla.Usuario usuario) {
		this.MainView=MainView;
		this._usuario = usuario;
		this.getPerfil().add(_usuario.getApodo());
				
		//Componente estático Buscar Noticia
		_buscar = new Buscar_noticia(this);
		this._buscar.getListadoBusqueda().setVisible(false);
		Buscar_noticia();
		
		_ver_noticia = new Ver_noticia(this);
		this.getVerNoticia().addClickListener(event->{
			this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this.MainView.remove(_ver_noticia);
			this.MainView.remove(_visualizar_seccion);
			this.MainView.remove(_personalizar_perfil);
			Ver_noticia();
		});		
		
		_visualizar_seccion = new Visualizar_seccion(this);
		this.getVerSeccion().addClickListener(event->{
			this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this.MainView.remove(_ver_noticia);
			this.MainView.remove(_visualizar_seccion);
			this.MainView.remove(_personalizar_perfil);
			Visualizar_seccion();
		});		
		
		_personalizar_perfil = new Personalizar_perfil(this, usuario);
		this.getPersonalizar().addClickListener(event->{
			this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this.MainView.remove(_ver_noticia);
			this.MainView.remove(_visualizar_seccion);
			this.MainView.remove(_personalizar_perfil);
			Personalizar_perfil();
		});	
		
	}
	
	public void Ver_noticia() {
		this.getNoticiasBanner().as(VerticalLayout.class).add(_ver_noticia);
	}

	public void Buscar_noticia() {
		this.getBannerGeneral().add(_buscar);
	}

	public void Visualizar_seccion() {
		this.getNoticiasBanner().as(VerticalLayout.class).add(_visualizar_seccion);
	}

	public void Personalizar_perfil() {
		this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this.getNoticiasBanner().as(VerticalLayout.class).add(_personalizar_perfil);
	}	
	
}