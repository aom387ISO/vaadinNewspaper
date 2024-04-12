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
package tabla;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ValoracionComentarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idValoracionComentario;
	public final IntegerExpression le_da_valoracionId;
	public final AssociationExpression le_da_valoracion;
	public final IntegerExpression valorado_porId;
	public final AssociationExpression valorado_por;
	public final BooleanExpression valoracion;
	
	public ValoracionComentarioCriteria(Criteria criteria) {
		super(criteria);
		idValoracionComentario = new IntegerExpression("idValoracionComentario", this);
		le_da_valoracionId = new IntegerExpression("le_da_valoracion.idComentario", this);
		le_da_valoracion = new AssociationExpression("le_da_valoracion", this);
		valorado_porId = new IntegerExpression("valorado_por.idUsuario", this);
		valorado_por = new AssociationExpression("valorado_por", this);
		valoracion = new BooleanExpression("valoracion", this);
	}
	
	public ValoracionComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(ValoracionComentario.class));
	}
	
	public ValoracionComentarioCriteria() throws PersistentException {
		this(ProyectofinalPersistentManager.instance().getSession());
	}
	
	public ComentarioCriteria createLe_da_valoracionCriteria() {
		return new ComentarioCriteria(createCriteria("le_da_valoracion"));
	}
	
	public UsuarioCriteria createValorado_porCriteria() {
		return new UsuarioCriteria(createCriteria("valorado_por"));
	}
	
	public ValoracionComentario uniqueValoracionComentario() {
		return (ValoracionComentario) super.uniqueResult();
	}
	
	public ValoracionComentario[] listValoracionComentario() {
		java.util.List list = super.list();
		return (ValoracionComentario[]) list.toArray(new ValoracionComentario[list.size()]);
	}
}

