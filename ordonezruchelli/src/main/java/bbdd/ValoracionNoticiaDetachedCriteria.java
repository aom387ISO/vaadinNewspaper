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

public class ValoracionNoticiaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idValoracionNoticia;
	public final IntegerExpression usuario_valora_aId;
	public final AssociationExpression usuario_valora_a;
	public final IntegerExpression valorada_porId;
	public final AssociationExpression valorada_por;
	public final BooleanExpression valoracion;
	
	public ValoracionNoticiaDetachedCriteria() {
		super(bbdd.ValoracionNoticia.class, bbdd.ValoracionNoticiaCriteria.class);
		idValoracionNoticia = new IntegerExpression("idValoracionNoticia", this.getDetachedCriteria());
		usuario_valora_aId = new IntegerExpression("usuario_valora_a.idNoticia", this.getDetachedCriteria());
		usuario_valora_a = new AssociationExpression("usuario_valora_a", this.getDetachedCriteria());
		valorada_porId = new IntegerExpression("valorada_por.idUsuario", this.getDetachedCriteria());
		valorada_por = new AssociationExpression("valorada_por", this.getDetachedCriteria());
		valoracion = new BooleanExpression("valoracion", this.getDetachedCriteria());
	}
	
	public ValoracionNoticiaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.ValoracionNoticiaCriteria.class);
		idValoracionNoticia = new IntegerExpression("idValoracionNoticia", this.getDetachedCriteria());
		usuario_valora_aId = new IntegerExpression("usuario_valora_a.idNoticia", this.getDetachedCriteria());
		usuario_valora_a = new AssociationExpression("usuario_valora_a", this.getDetachedCriteria());
		valorada_porId = new IntegerExpression("valorada_por.idUsuario", this.getDetachedCriteria());
		valorada_por = new AssociationExpression("valorada_por", this.getDetachedCriteria());
		valoracion = new BooleanExpression("valoracion", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createUsuario_valora_aCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("usuario_valora_a"));
	}
	
	public UsuarioDetachedCriteria createValorada_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("valorada_por"));
	}
	
	public ValoracionNoticia uniqueValoracionNoticia(PersistentSession session) {
		return (ValoracionNoticia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ValoracionNoticia[] listValoracionNoticia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ValoracionNoticia[]) list.toArray(new ValoracionNoticia[list.size()]);
	}
}

