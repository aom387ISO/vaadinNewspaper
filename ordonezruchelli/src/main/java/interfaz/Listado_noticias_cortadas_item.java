package interfaz;

public class Listado_noticias_cortadas_item extends Listado_de_noticias_generico_item {
	public Listado_noticias_cortadas _listado_noticias_cortadas;
	public Ver_noticia_cortada _ver_noticia_cortada;

	public Listado_noticias_cortadas_item(Listado_de_noticias_generico _listado_de_noticias_generico) {
		super(_listado_de_noticias_generico);
		this.getMegusta().setVisible(false);
		this.getNomegusta().setVisible(false);
	}
	
	public void Ver_noticia_cortada() {
		throw new UnsupportedOperationException();
	}
}