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

public class PeriodistaCriteria extends AbstractORMCriteria {
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
	
	public PeriodistaCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		correoElectronico = new StringExpression("correoElectronico", this);
		password = new StringExpression("password", this);
		apodo = new StringExpression("apodo", this);
		dni = new StringExpression("dni", this);
		nTarjeta = new StringExpression("nTarjeta", this);
		fechaCaducidad = new StringExpression("fechaCaducidad", this);
		cvv = new StringExpression("cvv", this);
		tiene_imagen = new CollectionExpression("ORM_tiene_imagen", this);
		escribir = new CollectionExpression("ORM_escribir", this);
		valora_a = new CollectionExpression("ORM_valora_a", this);
		va_a_valorar = new CollectionExpression("ORM_va_a_valorar", this);
		estado = new BooleanExpression("estado", this);
		publica = new CollectionExpression("ORM_publica", this);
	}
	
	public PeriodistaCriteria(PersistentSession session) {
		this(session.createCriteria(Periodista.class));
	}
	
	public PeriodistaCriteria() throws PersistentException {
		this(ProyectofinalPersistentManager.instance().getSession());
	}
	
	public NoticiaCriteria createPublicaCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_publica"));
	}
	
	public FotoCriteria createTiene_imagenCriteria() {
		return new FotoCriteria(createCriteria("ORM_tiene_imagen"));
	}
	
	public ComentarioCriteria createEscribirCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_escribir"));
	}
	
	public ValoracionNoticiaCriteria createValora_aCriteria() {
		return new ValoracionNoticiaCriteria(createCriteria("ORM_valora_a"));
	}
	
	public ValoracionComentarioCriteria createVa_a_valorarCriteria() {
		return new ValoracionComentarioCriteria(createCriteria("ORM_va_a_valorar"));
	}
	
	public Periodista uniquePeriodista() {
		return (Periodista) super.uniqueResult();
	}
	
	public Periodista[] listPeriodista() {
		java.util.List list = super.list();
		return (Periodista[]) list.toArray(new Periodista[list.size()]);
	}
}

