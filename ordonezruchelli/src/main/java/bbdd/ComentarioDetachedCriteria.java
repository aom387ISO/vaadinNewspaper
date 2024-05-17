/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package bbdd;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idComentario;
	public final IntegerExpression comentaId;
	public final AssociationExpression comenta;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	public final StringExpression contenido;
	public final IntegerExpression nValoracionesPositvas;
	public final IntegerExpression nValoracionesNegativas;
	public final CollectionExpression valoracionComentario;
	
	public ComentarioDetachedCriteria() {
		super(bbdd.Comentario.class, bbdd.ComentarioCriteria.class);
		idComentario = new IntegerExpression("idComentario", this.getDetachedCriteria());
		comentaId = new IntegerExpression("comenta.idNoticia", this.getDetachedCriteria());
		comenta = new AssociationExpression("comenta", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.idUsuario", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		nValoracionesPositvas = new IntegerExpression("nValoracionesPositvas", this.getDetachedCriteria());
		nValoracionesNegativas = new IntegerExpression("nValoracionesNegativas", this.getDetachedCriteria());
		valoracionComentario = new CollectionExpression("ORM_valoracionComentario", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.ComentarioCriteria.class);
		idComentario = new IntegerExpression("idComentario", this.getDetachedCriteria());
		comentaId = new IntegerExpression("comenta.idNoticia", this.getDetachedCriteria());
		comenta = new AssociationExpression("comenta", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.idUsuario", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		nValoracionesPositvas = new IntegerExpression("nValoracionesPositvas", this.getDetachedCriteria());
		nValoracionesNegativas = new IntegerExpression("nValoracionesNegativas", this.getDetachedCriteria());
		valoracionComentario = new CollectionExpression("ORM_valoracionComentario", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createComentaCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("comenta"));
	}
	
	public UsuarioDetachedCriteria createAutorCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("autor"));
	}
	
	public ValoracionComentarioDetachedCriteria createValoracionComentarioCriteria() {
		return new ValoracionComentarioDetachedCriteria(createCriteria("ORM_valoracionComentario"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

