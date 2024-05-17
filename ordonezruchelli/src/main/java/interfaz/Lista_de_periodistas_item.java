package interfaz;

import vistas.VistaListadeperiodistas_item;

public class Lista_de_periodistas_item extends VistaListadeperiodistas_item{
	public Lista_de_periodistas _lista_de_periodistas;
	public bbdd.Periodista _periodista;
	public Lista_de_periodistas_item(Lista_de_periodistas _lista_de_periodistas, bbdd.Periodista periodista) {
		super();
		this._periodista = periodista;
		this.getApodo().setValue(_periodista.getApodo());
		this.getDni().setValue(_periodista.getDni());
		this.getEstado().setValue(_periodista.getEstado() ? "Alta" : "Baja");
		this._lista_de_periodistas = _lista_de_periodistas;
	}
}