package interfaz;

import vistas.VistaUsuarionosuscrito;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;
import bbdd.iUsuario_no_suscrito;
import proyectoMDS.MainView;

public class Usuario_no_suscrito extends VistaUsuarionosuscrito{
	
	public Ver_seccion_de_Usuario_no_suscrito _ver_seccion_de_Usuario_no_suscrito;
	public Ver_noticia_cortada _ver_noticia_cortada;
	public Iniciar_sesion _iniciar_sesion;
	public Buscar_noticia_de_no_suscrito _buscar_noticia_de_no_suscrito;
	public MainView MainView;
	public iUsuario_general iUsuarioGeneral = new BDPrincipal();

	public Usuario_no_suscrito(MainView MainView) {
		this.MainView=MainView;
		_iniciar_sesion = new Iniciar_sesion(this);
		this.getIniciarSesion().addClickListener(event->{
		    this.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
			this.MainView.remove(_iniciar_sesion);
			this.MainView.remove(_ver_noticia_cortada);
			this.MainView.remove(_ver_seccion_de_Usuario_no_suscrito);
			Iniciar_sesion();

		});
		
		_ver_noticia_cortada = new Ver_noticia_cortada(this);
		this.getVerNoticiaCortada().addClickListener(event->{
		    this.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
			this.MainView.remove(_ver_noticia_cortada);
//			this.MainView.remove(_iniciar_sesion);
//			this.MainView.remove(_ver_seccion_de_Usuario_no_suscrito);
			Ver_noticia_cortada();
		});		
		
		
		_ver_seccion_de_Usuario_no_suscrito = new Ver_seccion_de_Usuario_no_suscrito(this);
		this.getVerSeccionNoSuscrito().addClickListener(event->{
		    this.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
			this.MainView.remove(_iniciar_sesion);
			this.MainView.remove(_ver_noticia_cortada);
			this.MainView.remove(_ver_seccion_de_Usuario_no_suscrito);
			Ver_seccion_de_Usuario_no_suscrito();
		});		
		
		
		_buscar_noticia_de_no_suscrito = new Buscar_noticia_de_no_suscrito(this);
//		this._buscar_noticia_de_no_suscrito.getListadoBusqueda().setVisible(false);
		Buscar_noticia_de_no_suscrito();

		
		//Componente estático de ver anuncios.
//		Ver_anuncios _anuncio = new Ver_anuncios(this);
//		this.getBannerAnuncios().as(VerticalLayout.class).add(_anuncio);
		this.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
		List<bbdd.Noticia> lista = new Vector<bbdd.Noticia>();
		for (bbdd.Noticia noticia : iUsuarioGeneral.cargarNoticiasPorSeccionPortada()) {
			lista.add(noticia);
		}
		if(this._ver_noticia_cortada != null && this._ver_noticia_cortada._listado_noticias_cortadas != null){
		this._ver_noticia_cortada._listado_noticias_cortadas._listado_noticias_cortadas = new Listado_noticias_cortadas(this, lista);
		}
	}

	
	public void Ver_seccion_de_Usuario_no_suscrito() {
		this.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
		 this.getBannerNoticiasPortada().as(VerticalLayout.class).add(_ver_seccion_de_Usuario_no_suscrito);
		//	this.MainView.add(_ver_seccion_de_Usuario_no_suscrito);
	}

	public void Ver_noticia_cortada() {
		this.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
//		this.getNoticiasPortada().as(VerticalLayout.class).add(_ver_noticia_cortada);
		this.MainView.add(_ver_noticia_cortada);
	}

	public void Iniciar_sesion() {
		this.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
		 this.getBannerNoticiasPortada().as(VerticalLayout.class).add(_iniciar_sesion);
		//this.MainView.add(_iniciar_sesion);
	}

	public void Buscar_noticia_de_no_suscrito() {
		this.getBanner().add(_buscar_noticia_de_no_suscrito);
	}
	
}