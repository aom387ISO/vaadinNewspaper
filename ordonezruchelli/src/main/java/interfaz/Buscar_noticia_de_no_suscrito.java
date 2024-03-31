package interfaz;

import vistas.VistaBuscarnoticiadenosuscrito;

public class Buscar_noticia_de_no_suscrito  extends VistaBuscarnoticiadenosuscrito{
	public Usuario_no_suscrito _usuario_no_suscrito;
	public Listado_noticias_cortadas _listado_noticias_cortadas;
	
	public Buscar_noticia_de_no_suscrito (Usuario_no_suscrito _usuario_no_suscrito) {
		super();
		this._usuario_no_suscrito = _usuario_no_suscrito;
	}

	public void Listado_noticias_cortadas() {
		throw new UnsupportedOperationException();
	}
}