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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Noticia")
public class Noticia implements Serializable {
	public Noticia() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_NOTICIA_ESTÁ_CONTENIDA) {
			return ORM_está_contenida;
		}
		else if (key == ORMConstants.KEY_NOTICIA_COMENTADA_POR) {
			return ORM_comentada_por;
		}
		else if (key == ORMConstants.KEY_NOTICIA_INCLUYE) {
			return ORM_incluye;
		}
		else if (key == ORMConstants.KEY_NOTICIA_CONTIENE) {
			return ORM_contiene;
		}
		else if (key == ORMConstants.KEY_NOTICIA_VALORACIONNOTICIAS) {
			return ORM_valoracionNoticias;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTICIA_AUTOR) {
			this.autor = (tabla.Periodista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdNoticia", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="TABLA_NOTICIA_IDNOTICIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TABLA_NOTICIA_IDNOTICIA_GENERATOR", strategy="native")	
	private int idNoticia;
	
	@ManyToOne(targetEntity=tabla.Periodista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PeriodistaUsuarioIdUsuario", referencedColumnName="UsuarioIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKNoticia896785"))	
	private tabla.Periodista autor;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Imagenes", nullable=true, length=255)	
	private String imagenes;
	
	@Column(name="Cuerpo", nullable=true, length=255)	
	private String cuerpo;
	
	@Column(name="Resumen", nullable=true, length=255)	
	private String resumen;
	
	@Column(name="NValoracionesPositivas", nullable=false, length=10)	
	private int nValoracionesPositivas;
	
	@Column(name="NValoracionesNegativas", nullable=false, length=10)	
	private int nValoracionesNegativas;
	
	@ManyToMany(targetEntity=tabla.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Seccion_Noticia", joinColumns={ @JoinColumn(name="NoticiaIdNoticia") }, inverseJoinColumns={ @JoinColumn(name="SeccionIdSeccion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_está_contenida = new java.util.HashSet();
	
	@OneToMany(mappedBy="comenta", targetEntity=tabla.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentada_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_da_tematica_a", targetEntity=tabla.Tematica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_incluye = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenece", targetEntity=tabla.Foto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuario_valora_a", targetEntity=tabla.ValoracionNoticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valoracionNoticias = new java.util.HashSet();
	
	private void setIdNoticia(int value) {
		this.idNoticia = value;
	}
	
	public int getIdNoticia() {
		return idNoticia;
	}
	
	public int getORMID() {
		return getIdNoticia();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setImagenes(String value) {
		this.imagenes = value;
	}
	
	public String getImagenes() {
		return imagenes;
	}
	
	public void setCuerpo(String value) {
		this.cuerpo = value;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public void setResumen(String value) {
		this.resumen = value;
	}
	
	public String getResumen() {
		return resumen;
	}
	
	public void setnValoracionesPositivas(int value) {
		this.nValoracionesPositivas = value;
	}
	
	public int getnValoracionesPositivas() {
		return nValoracionesPositivas;
	}
	
	public void setnValoracionesNegativas(int value) {
		this.nValoracionesNegativas = value;
	}
	
	public int getnValoracionesNegativas() {
		return nValoracionesNegativas;
	}
	
	private void setORM_Está_contenida(java.util.Set value) {
		this.ORM_está_contenida = value;
	}
	
	private java.util.Set getORM_Está_contenida() {
		return ORM_está_contenida;
	}
	
	@Transient	
	public final tabla.SeccionSetCollection está_contenida = new tabla.SeccionSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_ESTÁ_CONTENIDA, ORMConstants.KEY_SECCION_SE_ENCUENTRA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Comentada_por(java.util.Set value) {
		this.ORM_comentada_por = value;
	}
	
	private java.util.Set getORM_Comentada_por() {
		return ORM_comentada_por;
	}
	
	@Transient	
	public final tabla.ComentarioSetCollection comentada_por = new tabla.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_COMENTADA_POR, ORMConstants.KEY_COMENTARIO_COMENTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setAutor(tabla.Periodista value) {
		if (autor != null) {
			autor.publica.remove(this);
		}
		if (value != null) {
			value.publica.add(this);
		}
	}
	
	public tabla.Periodista getAutor() {
		return autor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Autor(tabla.Periodista value) {
		this.autor = value;
	}
	
	private tabla.Periodista getORM_Autor() {
		return autor;
	}
	
	private void setORM_Incluye(java.util.Set value) {
		this.ORM_incluye = value;
	}
	
	private java.util.Set getORM_Incluye() {
		return ORM_incluye;
	}
	
	@Transient	
	public final tabla.TematicaSetCollection incluye = new tabla.TematicaSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_INCLUYE, ORMConstants.KEY_TEMATICA_DA_TEMATICA_A, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final tabla.FotoSetCollection contiene = new tabla.FotoSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_CONTIENE, ORMConstants.KEY_FOTO_PERTENECE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_ValoracionNoticias(java.util.Set value) {
		this.ORM_valoracionNoticias = value;
	}
	
	private java.util.Set getORM_ValoracionNoticias() {
		return ORM_valoracionNoticias;
	}
	
	@Transient	
	public final tabla.ValoracionNoticiaSetCollection valoracionNoticias = new tabla.ValoracionNoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_VALORACIONNOTICIAS, ORMConstants.KEY_VALORACIONNOTICIA_USUARIO_VALORA_A, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdNoticia());
	}
	
}
