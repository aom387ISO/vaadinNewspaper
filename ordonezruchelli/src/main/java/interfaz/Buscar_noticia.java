package interfaz;

import vistas.VistaBuscarnoticia;

public class Buscar_noticia extends VistaBuscarnoticia {
	public Usuario_general _usuario_general;
	public Noticias_en_busqueda _noticias_en_busqueda;
	
	public Buscar_noticia (Usuario_general _usuario_general) {
		super();
		this._usuario_general = _usuario_general;
	}

	public void Noticias_en_busqueda() {
		throw new UnsupportedOperationException();
	}
}