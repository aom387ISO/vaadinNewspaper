package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iPeriodista;
import vistas.VistaModificarnoticiaindividual;

public class Modificar_noticia_individual extends VistaModificarnoticiaindividual {
	// private event _borrar_noticia;
	// private event _enviar_cambios;
	// private event _volver_a_gestion;
	public Elegir_noticia _elegir_noticia;
	iPeriodista _iPeriodista = new BDPrincipal();

	public Modificar_noticia_individual(Periodista periodista) {
		super();
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista = periodista;

		this.getEliminarNoticia().addClickListener(event -> Borrar_noticia());

		this.getCambiarNoticia().addClickListener(event -> Enviar_cambios());

		this.getVolverGestion().addClickListener(event -> Volver_a_gestion());

	}

	public void Borrar_noticia() {
		_iPeriodista.eliminarNoticia(this._elegir_noticia._noticias_propias._noticia.getIdNoticia());
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class)
				.add(this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia);
	}

	public void Enviar_cambios() {
		_iPeriodista.cambiarDatosNoticia(this._elegir_noticia._noticias_propias._noticia.getIdNoticia(), this.getTituloNoticia().getValue(), null, this.getTematica().getValue(), this.getNoticia().getValue(), this.getResumen().getValue());
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class)
				.add(this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia);
	}

	public void Volver_a_gestion() {
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class).removeAll();
		this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista
				.getNoticiasBanner().as(VerticalLayout.class)
				.add(this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia);
	}
}