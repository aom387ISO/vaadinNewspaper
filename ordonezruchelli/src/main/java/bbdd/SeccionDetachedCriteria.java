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

public class SeccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idSeccion;
	public final BooleanExpression portada;
	public final CollectionExpression se_encuentra;
	public final StringExpression incluyeId;
	public final AssociationExpression incluye;
	
	public SeccionDetachedCriteria() {
		super(bbdd.Seccion.class, bbdd.SeccionCriteria.class);
		idSeccion = new StringExpression("idSeccion", this.getDetachedCriteria());
		portada = new BooleanExpression("portada", this.getDetachedCriteria());
		se_encuentra = new CollectionExpression("ORM_se_encuentra", this.getDetachedCriteria());
		incluyeId = new StringExpression("incluye.idSeccion", this.getDetachedCriteria());
		incluye = new AssociationExpression("incluye", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.SeccionCriteria.class);
		idSeccion = new StringExpression("idSeccion", this.getDetachedCriteria());
		portada = new BooleanExpression("portada", this.getDetachedCriteria());
		se_encuentra = new CollectionExpression("ORM_se_encuentra", this.getDetachedCriteria());
		incluyeId = new StringExpression("incluye.idSeccion", this.getDetachedCriteria());
		incluye = new AssociationExpression("incluye", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createSe_encuentraCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_se_encuentra"));
	}
	
	public TematicaDetachedCriteria createIncluyeCriteria() {
		return new TematicaDetachedCriteria(createCriteria("incluye"));
	}
	
	public Seccion uniqueSeccion(PersistentSession session) {
		return (Seccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Seccion[] listSeccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

