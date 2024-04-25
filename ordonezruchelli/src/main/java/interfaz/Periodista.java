package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Periodista extends Usuario_general {
	public Gestionar_noticia _gestionar_noticia;
	tabla.Periodista _periodista;
	
	public Periodista(proyectoMDS.MainView MainView, tabla.Periodista periodista) {
		super(MainView, periodista);
		this._periodista = periodista;
		
		this.getGestionEditor().setVisible(false);
		this.getPersonalizarSuscrito().setVisible(false);
		
		//Componente estático Gestionar Noticia
		this._gestionar_noticia = new Gestionar_noticia(this);
		
		this.getGestionPeriodista().addClickListener(event->{
			this.getNoticiasBanner().as(VerticalLayout.class).removeAll();

			Gestionar_noticia();
		});	
	}
	
	public void Gestionar_noticia() {
		this.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_noticia);
	}

	
}