package interfaz;

public class Usuario_suscrito extends Usuario_general {
	public Personalizar_perfil_de_Usuario_suscrito _personalizar_perfil_de_Usuario_suscrito;
	public Buscar_noticia _buscar;
	
	public Usuario_suscrito(proyectoMDS.MainView MainView) {
		super(MainView);
		this.getGestionPeriodista().setVisible(false);
		this.getGestionEditor().setVisible(false);
		this.getPersonalizar().setVisible(false);
		
		//Componente estático Buscar Noticia
		_buscar = new Buscar_noticia(this);
		this.getLayoutBuscarNoticiaSuscrito().add(_buscar);
		
	}
	
	public void Personalizar_perfil_de_Usuario_suscrito() {
		throw new UnsupportedOperationException();
	}
	
}