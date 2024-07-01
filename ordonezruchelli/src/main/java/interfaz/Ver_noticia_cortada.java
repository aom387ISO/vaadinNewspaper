package interfaz;

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
		
		this._ir_a_comentarios = new Ir_a_comentarios(this);
        this.getComentariosNoSuscrito().addAttachListener(event -> {
			this._usuario_no_suscrito.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
        	Ir_a_comentarios();
        });
        
		this.getBannerNoticiasPortada().as(VerticalLayout.class).removeAll();
		Listado_noticias_cortadas lista = new Listado_noticias_cortadas(_usuario_no_suscrito, "");
		for (bbdd.Noticia noticiaPortada : _usuario_no_suscrito.iUsuarioGeneral.cargarNoticiasPorSeccionPortada()) {
			Listado_noticias_cortadas_item item = new Listado_noticias_cortadas_item(lista, noticiaPortada);
			this._listado_noticias_cortadas = item;
			this._listado_noticias_cortadas._listado_noticias_cortadas = lista;
			this.getBannerNoticiasPortada().as(VerticalLayout.class).add(item);
		}
	}

	public void Ir_a_comentarios() {
		this._usuario_no_suscrito.getBannerNoticiasPortada().as(VerticalLayout.class).add(_ir_a_comentarios);
		this._usuario_no_suscrito.MainView.add(_ir_a_comentarios);
	}
}