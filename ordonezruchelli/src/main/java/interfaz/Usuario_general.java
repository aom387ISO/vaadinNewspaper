package interfaz;

import vistas.VistaUsuariogeneral;
import proyectoMDS.MainView;

public class Usuario_general extends VistaUsuariogeneral{
	public Ver_noticia _ver_noticia;
	public Buscar_noticia _buscar_noticia;
	public Visualizar_seccion _visualizar_seccion;
	public Personalizar_perfil _personalizar_perfil;

	public MainView MainView;
	public Usuario_general(MainView MainView) {
		this.MainView=MainView;
	}
	
	public void Ver_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Buscar_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Visualizar_seccion() {
		throw new UnsupportedOperationException();
	}

	public void Personalizar_perfil() {
		throw new UnsupportedOperationException();
	}	
	
}