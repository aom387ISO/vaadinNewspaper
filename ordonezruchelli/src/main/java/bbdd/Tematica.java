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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Tematica")
public class Tematica implements Serializable {
	public Tematica() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Tematica))
			return false;
		Tematica tematica = (Tematica)aObj;
		if ((getIdTematica() != null && !getIdTematica().equals(tematica.getIdTematica())) || (getIdTematica() == null && tematica.getIdTematica() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getIdTematica() == null ? 0 : getIdTematica().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TEMATICA_DA_TEMATICA_A) {
			return ORM_da_tematica_a;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TEMATICA_DA_TEMATICA) {
			this.da_tematica = (bbdd.Seccion) owner;
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
	
	@Column(name="IdTematica", nullable=false, length=255)	
	@Id	
	private String idTematica;
	
	@OneToOne(targetEntity=bbdd.Seccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="SeccionIdSeccion", referencedColumnName="IdSeccion") }, foreignKey=@ForeignKey(name="FKTematica458824"))	
	private bbdd.Seccion da_tematica;
	
	@ManyToMany(targetEntity=bbdd.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Noticia_Tematica", joinColumns={ @JoinColumn(name="TematicaIdTematica") }, inverseJoinColumns={ @JoinColumn(name="NoticiaIdNoticia") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_tematica_a = new java.util.HashSet();
	
	public void setIdTematica(String value) {
		this.idTematica = value;
	}
	
	public String getIdTematica() {
		return idTematica;
	}
	
	public String getORMID() {
		return getIdTematica();
	}
	
	private void setORM_Da_tematica_a(java.util.Set value) {
		this.ORM_da_tematica_a = value;
	}
	
	private java.util.Set getORM_Da_tematica_a() {
		return ORM_da_tematica_a;
	}
	
	@Transient	
	public final bbdd.NoticiaSetCollection da_tematica_a = new bbdd.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_TEMATICA_DA_TEMATICA_A, ORMConstants.KEY_NOTICIA_INCLUYE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setDa_tematica(bbdd.Seccion value) {
		if (this.da_tematica != value) {
			bbdd.Seccion lda_tematica = this.da_tematica;
			this.da_tematica = value;
			if (value != null) {
				da_tematica.setIncluye(this);
			}
			if (lda_tematica != null && lda_tematica.getIncluye() == this) {
				lda_tematica.setIncluye(null);
			}
		}
	}
	
	public bbdd.Seccion getDa_tematica() {
		return da_tematica;
	}
	
	public String toString() {
		return String.valueOf(getIdTematica());
	}
	
}
