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

public class FotoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idFoto;
	public final IntegerExpression perteneceId;
	public final AssociationExpression pertenece;
	public final IntegerExpression le_da_imagen_aId;
	public final AssociationExpression le_da_imagen_a;
	public final StringExpression url;
	
	public FotoDetachedCriteria() {
		super(bbdd.Foto.class, bbdd.FotoCriteria.class);
		idFoto = new IntegerExpression("idFoto", this.getDetachedCriteria());
		perteneceId = new IntegerExpression("pertenece.idNoticia", this.getDetachedCriteria());
		pertenece = new AssociationExpression("pertenece", this.getDetachedCriteria());
		le_da_imagen_aId = new IntegerExpression("le_da_imagen_a.idUsuario", this.getDetachedCriteria());
		le_da_imagen_a = new AssociationExpression("le_da_imagen_a", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public FotoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.FotoCriteria.class);
		idFoto = new IntegerExpression("idFoto", this.getDetachedCriteria());
		perteneceId = new IntegerExpression("pertenece.idNoticia", this.getDetachedCriteria());
		pertenece = new AssociationExpression("pertenece", this.getDetachedCriteria());
		le_da_imagen_aId = new IntegerExpression("le_da_imagen_a.idUsuario", this.getDetachedCriteria());
		le_da_imagen_a = new AssociationExpression("le_da_imagen_a", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createPerteneceCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("pertenece"));
	}
	
	public UsuarioDetachedCriteria createLe_da_imagen_aCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("le_da_imagen_a"));
	}
	
	public Foto uniqueFoto(PersistentSession session) {
		return (Foto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Foto[] listFoto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

