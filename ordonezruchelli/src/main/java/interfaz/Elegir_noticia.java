package interfaz;

import vistas.VistaElegirnoticia;

public class Elegir_noticia extends VistaElegirnoticia{
	public Noticias_propias_item _noticias_propias;
	public Modificar_noticia_individual _modificar_noticia_individual;
	
	public Elegir_noticia(Periodista periodista) {
		super();
		this._noticias_propias._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista = periodista;
	}
	
	public void Modificar_noticia_individual() {
		throw new UnsupportedOperationException();
	}
}