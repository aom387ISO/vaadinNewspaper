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

public class NoticiaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public NoticiaDetachedCriteria() {
		super(bbdd.Noticia.class, bbdd.NoticiaCriteria.class);
		idNoticia = new IntegerExpression("idNoticia", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		imagenes = new StringExpression("imagenes", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		resumen = new StringExpression("resumen", this.getDetachedCriteria());
		nValoracionesPositivas = new IntegerExpression("nValoracionesPositivas", this.getDetachedCriteria());
		nValoracionesNegativas = new IntegerExpression("nValoracionesNegativas", this.getDetachedCriteria());
		posicionPortada = new IntegerExpression("posicionPortada", this.getDetachedCriteria());
		esta_contenida = new CollectionExpression("ORM_esta_contenida", this.getDetachedCriteria());
		comentada_por = new CollectionExpression("ORM_comentada_por", this.getDetachedCriteria());
		incluye = new CollectionExpression("ORM_incluye", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		valoracionNoticias = new CollectionExpression("ORM_valoracionNoticias", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.NoticiaCriteria.class);
		idNoticia = new IntegerExpression("idNoticia", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		imagenes = new StringExpression("imagenes", this.getDetachedCriteria());
		cuerpo = new StringExpression("cuerpo", this.getDetachedCriteria());
		resumen = new StringExpression("resumen", this.getDetachedCriteria());
		nValoracionesPositivas = new IntegerExpression("nValoracionesPositivas", this.getDetachedCriteria());
		nValoracionesNegativas = new IntegerExpression("nValoracionesNegativas", this.getDetachedCriteria());
		posicionPortada = new IntegerExpression("posicionPortada", this.getDetachedCriteria());
		esta_contenida = new CollectionExpression("ORM_esta_contenida", this.getDetachedCriteria());
		comentada_por = new CollectionExpression("ORM_comentada_por", this.getDetachedCriteria());
		incluye = new CollectionExpression("ORM_incluye", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		valoracionNoticias = new CollectionExpression("ORM_valoracionNoticias", this.getDetachedCriteria());
	}
	
	public PeriodistaDetachedCriteria createAutorCriteria() {
		return new PeriodistaDetachedCriteria(createCriteria("autor"));
	}
	
	public SeccionDetachedCriteria createEsta_contenidaCriteria() {
		return new SeccionDetachedCriteria(createCriteria("ORM_esta_contenida"));
	}
	
	public ComentarioDetachedCriteria createComentada_porCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_comentada_por"));
	}
	
	public TematicaDetachedCriteria createIncluyeCriteria() {
		return new TematicaDetachedCriteria(createCriteria("ORM_incluye"));
	}
	
	public FotoDetachedCriteria createContieneCriteria() {
		return new FotoDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public ValoracionNoticiaDetachedCriteria createValoracionNoticiasCriteria() {
		return new ValoracionNoticiaDetachedCriteria(createCriteria("ORM_valoracionNoticias"));
	}
	
	public Noticia uniqueNoticia(PersistentSession session) {
		return (Noticia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Noticia[] listNoticia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

