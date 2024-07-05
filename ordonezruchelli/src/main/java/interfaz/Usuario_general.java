package interfaz;

import vistas.VistaUsuariogeneral;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;
import proyectoMDS.MainView;

public class Usuario_general extends VistaUsuariogeneral{
	public Ver_noticia _ver_noticia;
	public Buscar_noticia _buscar_noticia;
	public Visualizar_seccion _visualizar_seccion;
	public Personalizar_perfil _personalizar_perfil;
	public Buscar_noticia _buscar;
	public iUsuario_general iUsuarioGeneral = new BDPrincipal();

	bbdd.Usuario _usuario;


	public MainView MainView;
	public Usuario_general(MainView MainView, bbdd.Usuario usuario) {
		this.MainView=MainView;
		this._usuario = usuario;
		//this.getPerfil().add(_usuario.getApodo());
				
		//Componente estático Buscar Noticia
		_buscar = new Buscar_noticia(this);
//		this._buscar.getListadoBusqueda().setVisible(false);
		Buscar_noticia();
		
		_ver_noticia = new Ver_noticia(this);
		this.getVerNoticia().addClickListener(event->{
			this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this.MainView.remove(_ver_noticia);
			this.MainView.remove(_visualizar_seccion);
			this.MainView.remove(_personalizar_perfil);
			this.getParaNoticias().removeAll();
			Ver_noticia();
		});		
		
		_visualizar_seccion = new Visualizar_seccion(this);
		this.getVerSeccion().addClickListener(event->{
			this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this.MainView.remove(_ver_noticia);
			this.MainView.remove(_visualizar_seccion);
			this.MainView.remove(_personalizar_perfil);
			this.getParaNoticias().removeAll();
			Visualizar_seccion();
		});		
		
		_personalizar_perfil = new Personalizar_perfil(this, usuario);
		this.getPersonalizar().addClickListener(event->{
			this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			this.MainView.remove(_ver_noticia);
			this.MainView.remove(_visualizar_seccion);
			this.MainView.remove(_personalizar_perfil);
			this.getParaNoticias().removeAll();
			Personalizar_perfil();
		});	
		
		this.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		Listado_de_noticias lista = new Listado_de_noticias(this);
		for (bbdd.Noticia noticiaPortada : iUsuarioGeneral.cargarNoticiasPorSeccionPortada()) {
			Listado_de_noticias_item item = new Listado_de_noticias_item(this, lista, noticiaPortada);
			this._ver_noticia._listado_de_noticias = item;
			this._ver_noticia._listado_de_noticias._listado_de_noticias = lista;
			this.getNoticiasBanner().as(VerticalLayout.class).add(item);
		}
		
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