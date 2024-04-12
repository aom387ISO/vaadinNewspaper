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

public class ValoracionNoticiaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idValoracionNoticia;
	public final IntegerExpression usuario_valora_aId;
	public final AssociationExpression usuario_valora_a;
	public final IntegerExpression valorada_porId;
	public final AssociationExpression valorada_por;
	public final BooleanExpression valoracion;
	
	public ValoracionNoticiaCriteria(Criteria criteria) {
		super(criteria);
		idValoracionNoticia = new IntegerExpression("idValoracionNoticia", this);
		usuario_valora_aId = new IntegerExpression("usuario_valora_a.idNoticia", this);
		usuario_valora_a = new AssociationExpression("usuario_valora_a", this);
		valorada_porId = new IntegerExpression("valorada_por.idUsuario", this);
		valorada_por = new AssociationExpression("valorada_por", this);
		valoracion = new BooleanExpression("valoracion", this);
	}
	
	public ValoracionNoticiaCriteria(PersistentSession session) {
		this(session.createCriteria(ValoracionNoticia.class));
	}
	
	public ValoracionNoticiaCriteria() throws PersistentException {
		this(ProyectofinalPersistentManager.instance().getSession());
	}
	
	public NoticiaCriteria createUsuario_valora_aCriteria() {
		return new NoticiaCriteria(createCriteria("usuario_valora_a"));
	}
	
	public UsuarioCriteria createValorada_porCriteria() {
		return new UsuarioCriteria(createCriteria("valorada_por"));
	}
	
	public ValoracionNoticia uniqueValoracionNoticia() {
		return (ValoracionNoticia) super.uniqueResult();
	}
	
	public ValoracionNoticia[] listValoracionNoticia() {
		java.util.List list = super.list();
		return (ValoracionNoticia[]) list.toArray(new ValoracionNoticia[list.size()]);
	}
}

