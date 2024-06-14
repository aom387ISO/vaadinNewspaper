package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iPeriodista;
import vistas.VistaIntroducirdatosnoticia;

public class Introducir_datos_noticia extends VistaIntroducirdatosnoticia{
	//	private event _enviar_noticia;
	//	private event _volver_a_gestion;
	public Gestionar_noticia _gestionar_noticia;
	iPeriodista _iperodista = new BDPrincipal();
    public Introducir_datos_noticia(Gestionar_noticia gestionar_noticia) {
		super();
        this._gestionar_noticia = gestionar_noticia;
//        this._gestionar_noticia._periodista = periodista;		
		this.getEnviarNoticia().addClickListener(event->Enviar_noticia());
		
		this.getVolverGestionNoticia().addClickListener(event->Volver_a_gestion());
	}

	public void Enviar_noticia() {
		_iperodista.crearNoticia(this.getTituloNoticia().getValue(), null, null, this.getCuerpoNoticia().getValue(), this.getResumenNoticia().getValue());
		
	}

	public void Volver_a_gestion() {
		this._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar_noticia);
	}
}