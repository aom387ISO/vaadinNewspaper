package interfaz;

import vistas.VistaGestionarnoticia;

public class Gestionar_noticia extends VistaGestionarnoticia{
	public Periodista _periodista;
	public Ver_listado_propio_de_noticias _ver_listado_propio_de_noticias;
	public Introducir_datos_noticia _introducir_datos_noticia;
	public Modificar_noticia_previa _modificar_noticia_previa;
	
	public Gestionar_noticia (Periodista periodista) {
		super();
		this._periodista = periodista;
		
	}

	public void Ver_listado_propio_de_noticias() {
		throw new UnsupportedOperationException();
	}

	public void Introducir_datos_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Modificar_noticia_previa() {
		throw new UnsupportedOperationException();
	}
}