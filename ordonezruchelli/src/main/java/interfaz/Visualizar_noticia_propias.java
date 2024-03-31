package interfaz;

import vistas.VistaVisualizarnoticiapropias;

public class Visualizar_noticia_propias extends VistaVisualizarnoticiapropias{
	//	private event _volver_a_gestion;
	public Ver_listado_propio_de_noticias_item _ver_listado_propio_de_noticias;
	public Noticias_propias _noticias_propias;
	
	public Visualizar_noticia_propias(Periodista periodista) {
		super();
		this._noticias_propias._modificar_noticia_previa._gestionar_noticia._periodista = periodista;
	}

	public void Volver_a_gestion() {
		throw new UnsupportedOperationException();
	}

	public void Noticias_propias() {
		throw new UnsupportedOperationException();
	}
}