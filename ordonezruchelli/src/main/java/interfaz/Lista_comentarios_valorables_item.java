package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;

public class Lista_comentarios_valorables_item extends Lista_de_comentarios_generico_item {
	//	private event _dar_me_gusta_a_comentario;
	//	private event _dar_no_me_gusta_a_comentario;
	public Lista_comentarios_valorables _lista_comentarios_valorables;
	public Comentar _comentar;
	public Lista_de_comentarios_generico _lista_de_comentarios_generico;
	bbdd.Comentario _comentario;
	bbdd.Noticia _noticia;
	iUsuario_general _iUsuario_general = new BDPrincipal();
	
	public Lista_comentarios_valorables_item(Lista_de_comentarios_generico lista_de_comentarios_generico, bbdd.Noticia noticia,bbdd.Comentario comentario) {
		super(lista_de_comentarios_generico, comentario);
		
		this._noticia = noticia;
		this._comentario = comentario;
		this._lista_de_comentarios_generico = lista_de_comentarios_generico;
		this.getEliminar().setVisible(false);
		System.out.println("eeeeeeeeeeeeeeeeeeeeh");
		getMegusta().addClickListener(event->{Dar_me_gusta_a_comentario();});
		getNomegusta().addClickListener(event->{Dar_no_me_gusta_a_comentario();});
		getComentar().addClickListener(event->{Comentar();});

	}
	

	public void Dar_me_gusta_a_comentario() {
		if(this._comentario != null)
			this._lista_comentarios_valorables._ver_comentarios._ver_noticia._iUsuario_general.gustarComentario(this._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general._usuario.getIdUsuario(), this._comentario.getIdComentario());
	}

	public void Comentar() {
//		
		System.out.println("holaaaa");
		this._lista_de_comentarios_generico.getComentariosBaner().removeAll();
		this._comentar = new Comentar(this._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general);
		this._lista_de_comentarios_generico.getComentariosBaner().add(this._comentar);
	}

	public void Dar_no_me_gusta_a_comentario() {
		if(this._comentario != null)
			this._lista_comentarios_valorables._ver_comentarios._ver_noticia._iUsuario_general.noGustarComentario(this._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general._usuario.getIdUsuario(), this._comentario.getIdComentario());
	}
}