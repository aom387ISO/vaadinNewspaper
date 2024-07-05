//package interfaz;
//
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//
//import bbdd.BDPrincipal;
//import vistas.VistaComentar;
//
//public class Comentar extends VistaComentar{
//	//	private event _escribir_comentario;
//	public static int numComentarios = 0;
//	public Lista_comentarios_valorables_item _lista_comentarios_valorables;
//	bbdd.iUsuario_general iusuarioGeneral = new BDPrincipal();
//	Usuario_general usuario_general;
//	
//	public Comentar (Usuario_general usuarioGeneral) {
//		super();
//		this._lista_comentarios_valorables._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general = usuarioGeneral;
//	}
//
//	public void Escribir_comentario() {
//		//no se que hacer con la id del comentario aqui buscar mejor solucion
//		iusuarioGeneral.comentar(this._lista_comentarios_valorables._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general._usuario.getIdUsuario(), numComentarios, this._lista_comentarios_valorables.getContenidoComentario().getValue());
//		numComentarios++;
//		
//		this._lista_comentarios_valorables._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general.getBannerGeneral().removeAll();
//		this._lista_comentarios_valorables._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general.getBannerGeneral().add(_lista_comentarios_valorables._lista_comentarios_valorables);
//	}
//}

package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iUsuario_general;
import vistas.VistaComentar;

public class Comentar extends VistaComentar {
    public static int numComentarios = 0;
    public Lista_comentarios_valorables _lista_comentarios_valorables;
    bbdd.iUsuario_general usuarioGeneral = new BDPrincipal();
	Usuario_general usuario_general;
	bbdd.Noticia _noticia;

    public Comentar(Usuario_general usuarioGeneral, Lista_comentarios_valorables lista_comentarios_valorables, bbdd.Noticia noticia) {
        super();
        this.usuario_general = usuarioGeneral;
        this._noticia = noticia;
        this._lista_comentarios_valorables = lista_comentarios_valorables;
//  	  	Escribir_comentario();
  	  	getEnviarComentario().addClickListener(event->{
    	  Escribir_comentario();
    });
    }

    public void Escribir_comentario() {
        usuarioGeneral.comentar(this._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general._usuario.getIdUsuario(), _noticia.getIdNoticia(), this.getIntroducirComentario().getValue());
        numComentarios++;
        this._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).removeAll();
        this._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(this._lista_comentarios_valorables._ver_comentarios._ver_noticia);
//        this._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general.getNoticiasBanner().as(VerticalLayout.class).add(_lista_comentarios_valorables);
    }
}
