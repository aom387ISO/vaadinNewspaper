package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaModificarnoticiaindividual;
import bbdd.*;
public class Modificar_noticia_individual extends VistaModificarnoticiaindividual {
	// private event _borrar_noticia;
	// private event _enviar_cambios;
	// private event _volver_a_gestion;
	public Elegir_noticia _elegir_noticia;
	iPeriodista _iPeriodista = new BDPrincipal();
    BD_Tematicas _bdTematicas = new BD_Tematicas();

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
		Periodista autor = this._elegir_noticia._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista;
		String tematicaNoticia = this.getTematica().getValue();
		bbdd.Tematica tematica = null;
		try {
			tematica = _bdTematicas.obtenerTematicaPorId(tematicaNoticia);
	        if (tematica == null) {
	            _bdTematicas.crearTematica(tematicaNoticia);
	            tematica = _bdTematicas.obtenerTematicaPorId(tematicaNoticia);
	        }
	        
			_iPeriodista.cambiarDatosNoticia(this._elegir_noticia._noticias_propias._noticia.getIdNoticia(), this.getTituloNoticia().getValue(), null, tematica, this.getNoticia().getValue(), this.getResumen().getValue());

		} catch (PersistentException e) {
			e.printStackTrace();
		}
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