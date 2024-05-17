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

public class PeriodistaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression correoElectronico;
	public final StringExpression password;
	public final StringExpression apodo;
	public final StringExpression dni;
	public final StringExpression nTarjeta;
	public final StringExpression fechaCaducidad;
	public final StringExpression cvv;
	public final CollectionExpression tiene_imagen;
	public final CollectionExpression escribir;
	public final CollectionExpression valora_a;
	public final CollectionExpression va_a_valorar;
	public final BooleanExpression estado;
	public final CollectionExpression publica;
	
	public PeriodistaDetachedCriteria() {
		super(bbdd.Periodista.class, bbdd.PeriodistaCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		dni = new StringExpression("dni", this.getDetachedCriteria());
		nTarjeta = new StringExpression("nTarjeta", this.getDetachedCriteria());
		fechaCaducidad = new StringExpression("fechaCaducidad", this.getDetachedCriteria());
		cvv = new StringExpression("cvv", this.getDetachedCriteria());
		tiene_imagen = new CollectionExpression("ORM_tiene_imagen", this.getDetachedCriteria());
		escribir = new CollectionExpression("ORM_escribir", this.getDetachedCriteria());
		valora_a = new CollectionExpression("ORM_valora_a", this.getDetachedCriteria());
		va_a_valorar = new CollectionExpression("ORM_va_a_valorar", this.getDetachedCriteria());
		estado = new BooleanExpression("estado", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
	}
	
	public PeriodistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.PeriodistaCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		dni = new StringExpression("dni", this.getDetachedCriteria());
		nTarjeta = new StringExpression("nTarjeta", this.getDetachedCriteria());
		fechaCaducidad = new StringExpression("fechaCaducidad", this.getDetachedCriteria());
		cvv = new StringExpression("cvv", this.getDetachedCriteria());
		tiene_imagen = new CollectionExpression("ORM_tiene_imagen", this.getDetachedCriteria());
		escribir = new CollectionExpression("ORM_escribir", this.getDetachedCriteria());
		valora_a = new CollectionExpression("ORM_valora_a", this.getDetachedCriteria());
		va_a_valorar = new CollectionExpression("ORM_va_a_valorar", this.getDetachedCriteria());
		estado = new BooleanExpression("estado", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createPublicaCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_publica"));
	}
	
	public FotoDetachedCriteria createTiene_imagenCriteria() {
		return new FotoDetachedCriteria(createCriteria("ORM_tiene_imagen"));
	}
	
	public ComentarioDetachedCriteria createEscribirCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_escribir"));
	}
	
	public ValoracionNoticiaDetachedCriteria createValora_aCriteria() {
		return new ValoracionNoticiaDetachedCriteria(createCriteria("ORM_valora_a"));
	}
	
	public ValoracionComentarioDetachedCriteria createVa_a_valorarCriteria() {
		return new ValoracionComentarioDetachedCriteria(createCriteria("ORM_va_a_valorar"));
	}
	
	public Periodista uniquePeriodista(PersistentSession session) {
		return (Periodista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Periodista[] listPeriodista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Periodista[]) list.toArray(new Periodista[list.size()]);
	}
}

