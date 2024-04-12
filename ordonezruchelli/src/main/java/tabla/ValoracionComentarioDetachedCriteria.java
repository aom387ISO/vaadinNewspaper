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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ValoracionComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idValoracionComentario;
	public final IntegerExpression le_da_valoracionId;
	public final AssociationExpression le_da_valoracion;
	public final IntegerExpression valorado_porId;
	public final AssociationExpression valorado_por;
	public final BooleanExpression valoracion;
	
	public ValoracionComentarioDetachedCriteria() {
		super(tabla.ValoracionComentario.class, tabla.ValoracionComentarioCriteria.class);
		idValoracionComentario = new IntegerExpression("idValoracionComentario", this.getDetachedCriteria());
		le_da_valoracionId = new IntegerExpression("le_da_valoracion.idComentario", this.getDetachedCriteria());
		le_da_valoracion = new AssociationExpression("le_da_valoracion", this.getDetachedCriteria());
		valorado_porId = new IntegerExpression("valorado_por.idUsuario", this.getDetachedCriteria());
		valorado_por = new AssociationExpression("valorado_por", this.getDetachedCriteria());
		valoracion = new BooleanExpression("valoracion", this.getDetachedCriteria());
	}
	
	public ValoracionComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tabla.ValoracionComentarioCriteria.class);
		idValoracionComentario = new IntegerExpression("idValoracionComentario", this.getDetachedCriteria());
		le_da_valoracionId = new IntegerExpression("le_da_valoracion.idComentario", this.getDetachedCriteria());
		le_da_valoracion = new AssociationExpression("le_da_valoracion", this.getDetachedCriteria());
		valorado_porId = new IntegerExpression("valorado_por.idUsuario", this.getDetachedCriteria());
		valorado_por = new AssociationExpression("valorado_por", this.getDetachedCriteria());
		valoracion = new BooleanExpression("valoracion", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria createLe_da_valoracionCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("le_da_valoracion"));
	}
	
	public UsuarioDetachedCriteria createValorado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("valorado_por"));
	}
	
	public ValoracionComentario uniqueValoracionComentario(PersistentSession session) {
		return (ValoracionComentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ValoracionComentario[] listValoracionComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ValoracionComentario[]) list.toArray(new ValoracionComentario[list.size()]);
	}
}

