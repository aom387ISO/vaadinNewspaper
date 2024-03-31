package interfaz;

public class Introducir_datos_noticia {
	//	private event _enviar_noticia;
	//	private event _volver_a_gestion;
	public Gestionar_noticia _gestionar_noticia;
	
	public Introducir_datos_noticia(Periodista periodista) {
		super();
		this._gestionar_noticia._periodista = periodista;
	}

	public void Enviar_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Volver_a_gestion() {
		throw new UnsupportedOperationException();
	}
}