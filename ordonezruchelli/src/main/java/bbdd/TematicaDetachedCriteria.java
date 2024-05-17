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

public class TematicaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idTematica;
	public final StringExpression da_tematicaId;
	public final AssociationExpression da_tematica;
	public final CollectionExpression da_tematica_a;
	
	public TematicaDetachedCriteria() {
		super(bbdd.Tematica.class, bbdd.TematicaCriteria.class);
		idTematica = new StringExpression("idTematica", this.getDetachedCriteria());
		da_tematicaId = new StringExpression("da_tematica.idSeccion", this.getDetachedCriteria());
		da_tematica = new AssociationExpression("da_tematica", this.getDetachedCriteria());
		da_tematica_a = new CollectionExpression("ORM_da_tematica_a", this.getDetachedCriteria());
	}
	
	public TematicaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.TematicaCriteria.class);
		idTematica = new StringExpression("idTematica", this.getDetachedCriteria());
		da_tematicaId = new StringExpression("da_tematica.idSeccion", this.getDetachedCriteria());
		da_tematica = new AssociationExpression("da_tematica", this.getDetachedCriteria());
		da_tematica_a = new CollectionExpression("ORM_da_tematica_a", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria createDa_tematicaCriteria() {
		return new SeccionDetachedCriteria(createCriteria("da_tematica"));
	}
	
	public NoticiaDetachedCriteria createDa_tematica_aCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_da_tematica_a"));
	}
	
	public Tematica uniqueTematica(PersistentSession session) {
		return (Tematica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tematica[] listTematica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tematica[]) list.toArray(new Tematica[list.size()]);
	}
}

