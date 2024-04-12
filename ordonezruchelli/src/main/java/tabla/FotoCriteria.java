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

public class FotoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idFoto;
	public final IntegerExpression perteneceId;
	public final AssociationExpression pertenece;
	public final IntegerExpression le_da_imagen_aId;
	public final AssociationExpression le_da_imagen_a;
	public final StringExpression url;
	
	public FotoCriteria(Criteria criteria) {
		super(criteria);
		idFoto = new IntegerExpression("idFoto", this);
		perteneceId = new IntegerExpression("pertenece.idNoticia", this);
		pertenece = new AssociationExpression("pertenece", this);
		le_da_imagen_aId = new IntegerExpression("le_da_imagen_a.idUsuario", this);
		le_da_imagen_a = new AssociationExpression("le_da_imagen_a", this);
		url = new StringExpression("url", this);
	}
	
	public FotoCriteria(PersistentSession session) {
		this(session.createCriteria(Foto.class));
	}
	
	public FotoCriteria() throws PersistentException {
		this(ProyectofinalPersistentManager.instance().getSession());
	}
	
	public NoticiaCriteria createPerteneceCriteria() {
		return new NoticiaCriteria(createCriteria("pertenece"));
	}
	
	public UsuarioCriteria createLe_da_imagen_aCriteria() {
		return new UsuarioCriteria(createCriteria("le_da_imagen_a"));
	}
	
	public Foto uniqueFoto() {
		return (Foto) super.uniqueResult();
	}
	
	public Foto[] listFoto() {
		java.util.List list = super.list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

