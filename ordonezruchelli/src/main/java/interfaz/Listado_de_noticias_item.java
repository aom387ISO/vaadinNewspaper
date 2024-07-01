package interfaz;

public class Listado_de_noticias_item extends Listado_de_noticias_generico_item {

	public Listado_de_noticias _listado_de_noticias;
	public Ver_noticia _ver_noticia;
	bbdd.Noticia _noticia;
	
	public Listado_de_noticias_item(Listado_de_noticias_generico _listado_de_noticias_generico, bbdd.Noticia noticia) {
		super(_listado_de_noticias_generico, noticia);
		this._noticia = noticia;

		Ver_noticia();
	}
    public Listado_de_noticias_item(Ver_noticia verNoticia, bbdd.Noticia noticia) {
        super(verNoticia, noticia);
        this._ver_noticia = verNoticia;
        this._noticia = noticia;

        Ver_noticia();
    }
	public void Ver_noticia() {
		System.out.println("Está en ver noticias de listado noticias item.");
		System.out.println(_noticia.getTitulo());
		this.getTitulo().setValue(_noticia.getTitulo());
		this.getResumen().setValue(_noticia.getResumen());
		this.getCuerpo().setValue(_noticia.getCuerpo());
		this.getValoracionesPositivas().setValue(Integer.toString(_noticia.getnValoracionesPositivas()));
		this.getValoracionesNegativas().setValue(Integer.toString(_noticia.getnValoracionesNegativas()));
	}
}