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

public class NoticiaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idNoticia;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	public final StringExpression titulo;
	public final StringExpression imagenes;
	public final StringExpression cuerpo;
	public final StringExpression resumen;
	public final IntegerExpression nValoracionesPositivas;
	public final IntegerExpression nValoracionesNegativas;
	public final IntegerExpression posicionPortada;
	public final CollectionExpression esta_contenida;
	public final CollectionExpression comentada_por;
	public final CollectionExpression incluye;
	public final CollectionExpression contiene;
	public final CollectionExpression valoracionNoticias;
	
	public NoticiaCriteria(Criteria criteria) {
		super(criteria);
		idNoticia = new IntegerExpression("idNoticia", this);
		autorId = new IntegerExpression("autor.", this);
		autor = new AssociationExpression("autor", this);
		titulo = new StringExpression("titulo", this);
		imagenes = new StringExpression("imagenes", this);
		cuerpo = new StringExpression("cuerpo", this);
		resumen = new StringExpression("resumen", this);
		nValoracionesPositivas = new IntegerExpression("nValoracionesPositivas", this);
		nValoracionesNegativas = new IntegerExpression("nValoracionesNegativas", this);
		posicionPortada = new IntegerExpression("posicionPortada", this);
		esta_contenida = new CollectionExpression("ORM_esta_contenida", this);
		comentada_por = new CollectionExpression("ORM_comentada_por", this);
		incluye = new CollectionExpression("ORM_incluye", this);
		contiene = new CollectionExpression("ORM_contiene", this);
		valoracionNoticias = new CollectionExpression("ORM_valoracionNoticias", this);
	}
	
	public NoticiaCriteria(PersistentSession session) {
		this(session.createCriteria(Noticia.class));
	}
	
	public NoticiaCriteria() throws PersistentException {
		this(ProyectofinalPersistentManager.instance().getSession());
	}
	
	public PeriodistaCriteria createAutorCriteria() {
		return new PeriodistaCriteria(createCriteria("autor"));
	}
	
	public SeccionCriteria createEsta_contenidaCriteria() {
		return new SeccionCriteria(createCriteria("ORM_esta_contenida"));
	}
	
	public ComentarioCriteria createComentada_porCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_comentada_por"));
	}
	
	public TematicaCriteria createIncluyeCriteria() {
		return new TematicaCriteria(createCriteria("ORM_incluye"));
	}
	
	public FotoCriteria createContieneCriteria() {
		return new FotoCriteria(createCriteria("ORM_contiene"));
	}
	
	public ValoracionNoticiaCriteria createValoracionNoticiasCriteria() {
		return new ValoracionNoticiaCriteria(createCriteria("ORM_valoracionNoticias"));
	}
	
	public Noticia uniqueNoticia() {
		return (Noticia) super.uniqueResult();
	}
	
	public Noticia[] listNoticia() {
		java.util.List list = super.list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

