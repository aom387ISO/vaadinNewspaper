package interfaz;

import vistas.VistaListadeperiodistas_item;

public class Lista_de_periodistas_item extends VistaListadeperiodistas_item{
	public Lista_de_periodistas _lista_de_periodistas;
	tabla.Periodista _periodista;
	public Lista_de_periodistas_item(Lista_de_periodistas _lista_de_periodistas, tabla.Periodista periodista) {
		super();
		this._periodista = periodista;
		this._lista_de_periodistas = _lista_de_periodistas;
	}
}