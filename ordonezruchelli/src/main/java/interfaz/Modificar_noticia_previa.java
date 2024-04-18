package interfaz;

import vistas.VistaModificarnoticiaprevia;

public class Modificar_noticia_previa extends VistaModificarnoticiaprevia{
	public Gestionar_noticia _gestionar_noticia;
	public Noticias_propias _noticias_propias;

	public Modificar_noticia_previa(Gestionar_noticia gestionar_noticia, Periodista periodista) {
	    super();
	    this._gestionar_noticia = gestionar_noticia;
	    this._gestionar_noticia._periodista = periodista;
	}

	
	public void Noticias_propias() {
		throw new UnsupportedOperationException();
	}
}