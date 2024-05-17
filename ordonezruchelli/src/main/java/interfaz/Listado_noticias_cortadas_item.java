package interfaz;

public class Listado_noticias_cortadas_item extends Listado_de_noticias_generico_item {
	public Listado_noticias_cortadas _listado_noticias_cortadas;
	public Ver_noticia_cortada _ver_noticia_cortada;
	bbdd.Noticia _noticia;

	public Listado_noticias_cortadas_item(Listado_de_noticias_generico _listado_de_noticias_generico, bbdd.Noticia noticia) {
		super(_listado_de_noticias_generico, noticia);
		this._noticia = noticia;

		this.getMegusta().setVisible(false);
		this.getNomegusta().setVisible(false);
	}
	
	public void Ver_noticia_cortada() {
		throw new UnsupportedOperationException();
	}
}