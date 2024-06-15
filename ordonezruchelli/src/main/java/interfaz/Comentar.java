package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import vistas.VistaComentar;

public class Comentar extends VistaComentar{
	//	private event _escribir_comentario;
	public static int numComentarios = 0;
	public Lista_comentarios_valorables_item _lista_comentarios_valorables;
	bbdd.iUsuario_general usuarioGeneral = new BDPrincipal();
	
	public Comentar (Usuario_general usuarioGeneral) {
		super();
		this._lista_comentarios_valorables._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general = usuarioGeneral;
	}

	public void Escribir_comentario() {
		//no se que hacer con la id del comentario aqui buscar mejor solucion
		usuarioGeneral.comentar(this._lista_comentarios_valorables._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general._usuario.getIdUsuario(), numComentarios, this._lista_comentarios_valorables.getContenidoComentario().getValue());
		numComentarios++;
		
		this._lista_comentarios_valorables._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general.getBannerGeneral().removeAll();
		this._lista_comentarios_valorables._lista_comentarios_valorables._ver_comentarios._ver_noticia._usuario_general.getBannerGeneral().add(_lista_comentarios_valorables._lista_comentarios_valorables);
	}
}