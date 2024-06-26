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

public class SeccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idSeccion;
	public final BooleanExpression portada;
	public final StringExpression nombre;
	public final CollectionExpression se_encuentra;
	public final IntegerExpression incluyeId;
	public final AssociationExpression incluye;
	
	public SeccionCriteria(Criteria criteria) {
		super(criteria);
		idSeccion = new IntegerExpression("idSeccion", this);
		portada = new BooleanExpression("portada", this);
		nombre = new StringExpression("nombre", this);
		se_encuentra = new CollectionExpression("ORM_se_encuentra", this);
		incluyeId = new IntegerExpression("incluye.idSeccion", this);
		incluye = new AssociationExpression("incluye", this);
	}
	
	public SeccionCriteria(PersistentSession session) {
		this(session.createCriteria(Seccion.class));
	}
	
	public SeccionCriteria() throws PersistentException {
		this(ProyectofinalPersistentManager.instance().getSession());
	}
	
	public NoticiaCriteria createSe_encuentraCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_se_encuentra"));
	}
	
	public TematicaCriteria createIncluyeCriteria() {
		return new TematicaCriteria(createCriteria("incluye"));
	}
	
	public Seccion uniqueSeccion() {
		return (Seccion) super.uniqueResult();
	}
	
	public Seccion[] listSeccion() {
		java.util.List list = super.list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

