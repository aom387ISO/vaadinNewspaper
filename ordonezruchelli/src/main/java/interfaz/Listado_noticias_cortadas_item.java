package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;

public class Listado_noticias_cortadas_item extends Listado_de_noticias_generico_item {
	public Listado_noticias_cortadas _listado_noticias_cortadas;
	public Ver_noticia_cortada _ver_noticia_cortada;
	bbdd.Noticia _noticia;

	public Listado_noticias_cortadas_item(Listado_de_noticias_generico _listado_de_noticias_generico, bbdd.Noticia noticia) {
		super(_listado_de_noticias_generico, noticia);
		this._noticia = noticia;
//		this.getComentar().setVisible(false);
		this.getMeGusta().addClickListener(event -> {
	        Notification notification = Notification.show("Es necesario iniciar sesion para valorar");
	        notification.addThemeVariants(NotificationVariant.LUMO_PRIMARY);
		});
		this.getNoMeGusta().addClickListener(event -> {
	        Notification notification = Notification.show("Es necesario iniciar sesion para valorar");
	        notification.addThemeVariants(NotificationVariant.LUMO_PRIMARY);
		});
//		this._ver_noticia._ver_comentarios._lista_comentarios_valorables.getComentar().setVisible(false);
		Ver_noticia_cortada();
	}
	
	public void Ver_noticia_cortada() {
		this.getTitulo().setValue(_noticia.getTitulo());
		this.getResumen().setValue(_noticia.getResumen());
		this.getCuerpo().setVisible(false);
		this.getValoracionesPositivas().setValue(Integer.toString(_noticia.getnValoracionesPositivas()));
		this.getValoracionesNegativas().setValue(Integer.toString(_noticia.getnValoracionesNegativas()));
	}
}