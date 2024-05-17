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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ComentarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idComentario;
	public final IntegerExpression comentaId;
	public final AssociationExpression comenta;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	public final StringExpression contenido;
	public final IntegerExpression nValoracionesPositvas;
	public final IntegerExpression nValoracionesNegativas;
	public final CollectionExpression valoracionComentario;
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		idComentario = new IntegerExpression("idComentario", this);
		comentaId = new IntegerExpression("comenta.idNoticia", this);
		comenta = new AssociationExpression("comenta", this);
		autorId = new IntegerExpression("autor.idUsuario", this);
		autor = new AssociationExpression("autor", this);
		contenido = new StringExpression("contenido", this);
		nValoracionesPositvas = new IntegerExpression("nValoracionesPositvas", this);
		nValoracionesNegativas = new IntegerExpression("nValoracionesNegativas", this);
		valoracionComentario = new CollectionExpression("ORM_valoracionComentario", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(ProyectofinalPersistentManager.instance().getSession());
	}
	
	public NoticiaCriteria createComentaCriteria() {
		return new NoticiaCriteria(createCriteria("comenta"));
	}
	
	public UsuarioCriteria createAutorCriteria() {
		return new UsuarioCriteria(createCriteria("autor"));
	}
	
	public ValoracionComentarioCriteria createValoracionComentarioCriteria() {
		return new ValoracionComentarioCriteria(createCriteria("ORM_valoracionComentario"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

