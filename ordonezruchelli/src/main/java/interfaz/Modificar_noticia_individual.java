package interfaz;

import vistas.VistaModificarnoticiaindividual;

public class Modificar_noticia_individual extends VistaModificarnoticiaindividual{
	//	private event _borrar_noticia;
	//	private event _enviar_cambios;
	//	private event _volver_a_gestion;
	public Elegir_noticia _elegir_noticia;
	
	public Modificar_noticia_individual(Periodista periodista) {
		super();
		this._elegir_noticia._noticias_propias._noticias_propias.periodista = periodista;
	}

	public void Borrar_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_cambios() {
		throw new UnsupportedOperationException();
	}

	public void Volver_a_gestion() {
		throw new UnsupportedOperationException();
	}
}