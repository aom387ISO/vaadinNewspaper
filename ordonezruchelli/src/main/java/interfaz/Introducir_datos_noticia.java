package interfaz;

import vistas.VistaIntroducirdatosnoticia;

public class Introducir_datos_noticia extends VistaIntroducirdatosnoticia{
	//	private event _enviar_noticia;
	//	private event _volver_a_gestion;
	public Gestionar_noticia _gestionar_noticia;
	
    public Introducir_datos_noticia(Gestionar_noticia gestionar_noticia, Periodista periodista) {
		super();
        this._gestionar_noticia = gestionar_noticia;
        this._gestionar_noticia._periodista = periodista;		
		
		
	}

	public void Enviar_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Volver_a_gestion() {
		throw new UnsupportedOperationException();
	}
}