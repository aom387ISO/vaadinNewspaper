package interfaz;

import vistas.VistaUsuarionosuscrito;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

public class Usuario_no_suscrito extends VistaUsuarionosuscrito{
	
	public Ver_seccion_de_Usuario_no_suscrito _ver_seccion_de_Usuario_no_suscrito;
	public Ver_noticia_cortada _ver_noticia_cortada;
	public Iniciar_sesion _iniciar_sesion;
	public Buscar_noticia_de_no_suscrito _buscar_noticia_de_no_suscrito;
	public MainView MainView;

	public Usuario_no_suscrito(MainView MainView) {
		this.MainView=MainView;
		_iniciar_sesion = new Iniciar_sesion(this);

		this.getIniciarSesion().addClickListener(event->{
			this.MainView.removeAll();
			Iniciar_sesion();
		});
		
		//Componente estático de iniciar sesión.
		this.getLayoutIniciarSesion().add(_iniciar_sesion);
		
		//Componente estático de buscar noticia.
		_buscar_noticia_de_no_suscrito = new Buscar_noticia_de_no_suscrito(this);
		Buscar_noticia_de_no_suscrito();

		//Componente estático de ver secciones
		_ver_seccion_de_Usuario_no_suscrito = new Ver_seccion_de_Usuario_no_suscrito(this);
		Ver_seccion_de_Usuario_no_suscrito();
		
		//Componente estático de ver anuncios.
		Ver_anuncios _anuncio = new Ver_anuncios(this);
		this.getBannerAnuncios().as(VerticalLayout.class).add(_anuncio);

	}

	
	public void Ver_seccion_de_Usuario_no_suscrito() {
		this.getLayoutVerSeccionNoSuscrito().add(_ver_seccion_de_Usuario_no_suscrito);
	}

	public void Ver_noticia_cortada() {
		throw new UnsupportedOperationException();
	}

	public void Iniciar_sesion() {
		this.MainView.add(_iniciar_sesion);
	}

	public void Buscar_noticia_de_no_suscrito() {
		this.getLayoutBuscarNoSuscrito().add(_buscar_noticia_de_no_suscrito);
		}
	
}