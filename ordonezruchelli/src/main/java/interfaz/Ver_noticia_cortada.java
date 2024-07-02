package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVernoticiacortada;

public class Ver_noticia_cortada extends VistaVernoticiacortada{
	public Usuario_no_suscrito _usuario_no_suscrito;
	public Listado_noticias_cortadas_item _listado_noticias_cortadas;
	public Ir_a_comentarios _ir_a_comentarios;
	
	public Ver_noticia_cortada(Usuario_no_suscrito usuarioNoSuscrito) {
		super();
		this._usuario_no_suscrito = usuarioNoSuscrito;
        
		this.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
		Listado_noticias_cortadas noticiaLista = new Listado_noticias_cortadas(_usuario_no_suscrito, new Vector<bbdd.Noticia>());
		for (bbdd.Noticia noticiaPortada : _usuario_no_suscrito.iUsuarioGeneral.cargarNoticiasPorSeccionPortada()) {
        	Listado_noticias_cortadas_item item = new Listado_noticias_cortadas_item(noticiaLista, noticiaPortada);
        	this._listado_noticias_cortadas = item;
        	this._listado_noticias_cortadas._listado_noticias_cortadas = noticiaLista;
			this._listado_noticias_cortadas._listado_noticias_cortadas._item.add(item);
			this.getBannerNoticiasPortada().as(VerticalLayout.class).add(item);
		}
		
		this._ir_a_comentarios = new Ir_a_comentarios(this);
        this.getComentariosNoSuscrito().addAttachListener(event -> {
//			this._usuario_no_suscrito.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
        	Ir_a_comentarios();
        });
	}

	public void Ir_a_comentarios() {
		this._usuario_no_suscrito.getBannerNoticiasPortada().as(VerticalLayout.class).add(_ir_a_comentarios);
		this._usuario_no_suscrito.MainView.add(_ir_a_comentarios);
	}
}