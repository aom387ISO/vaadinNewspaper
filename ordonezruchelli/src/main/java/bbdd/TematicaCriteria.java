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

public class TematicaCriteria extends AbstractORMCriteria {
	public final StringExpression idTematica;
	public final IntegerExpression da_tematicaId;
	public final AssociationExpression da_tematica;
	public final CollectionExpression da_tematica_a;
	
	public TematicaCriteria(Criteria criteria) {
		super(criteria);
		idTematica = new StringExpression("idTematica", this);
		da_tematicaId = new IntegerExpression("da_tematica.idSeccion", this);
		da_tematica = new AssociationExpression("da_tematica", this);
		da_tematica_a = new CollectionExpression("ORM_da_tematica_a", this);
	}
	
	public TematicaCriteria(PersistentSession session) {
		this(session.createCriteria(Tematica.class));
	}
	
	public TematicaCriteria() throws PersistentException {
		this(ProyectofinalPersistentManager.instance().getSession());
	}
	
	public SeccionCriteria createDa_tematicaCriteria() {
		return new SeccionCriteria(createCriteria("da_tematica"));
	}
	
	public NoticiaCriteria createDa_tematica_aCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_da_tematica_a"));
	}
	
	public Tematica uniqueTematica() {
		return (Tematica) super.uniqueResult();
	}
	
	public Tematica[] listTematica() {
		java.util.List list = super.list();
		return (Tematica[]) list.toArray(new Tematica[list.size()]);
	}
}

