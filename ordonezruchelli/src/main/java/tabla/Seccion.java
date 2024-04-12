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
@Table(name="Seccion")
public class Seccion implements Serializable {
	public Seccion() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Seccion))
			return false;
		Seccion seccion = (Seccion)aObj;
		if ((getIdSeccion() != null && !getIdSeccion().equals(seccion.getIdSeccion())) || (getIdSeccion() == null && seccion.getIdSeccion() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getIdSeccion() == null ? 0 : getIdSeccion().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SECCION_SE_ENCUENTRA) {
			return ORM_se_encuentra;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SECCION_INCLUYE) {
			this.incluye = (tabla.Tematica) owner;
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
	
	@Column(name="IdSeccion", nullable=false, length=255)	
	@Id	
	private String idSeccion;
	
	@Column(name="Portada", nullable=false, length=1)	
	private boolean portada;
	
	@ManyToMany(mappedBy="ORM_está_contenida", targetEntity=tabla.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_se_encuentra = new java.util.HashSet();
	
	@OneToOne(mappedBy="da_tematica", targetEntity=tabla.Tematica.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private tabla.Tematica incluye;
	
	public void setPortada(boolean value) {
		this.portada = value;
	}
	
	public boolean getPortada() {
		return portada;
	}
	
	public void setIdSeccion(String value) {
		this.idSeccion = value;
	}
	
	public String getIdSeccion() {
		return idSeccion;
	}
	
	public String getORMID() {
		return getIdSeccion();
	}
	
	private void setORM_Se_encuentra(java.util.Set value) {
		this.ORM_se_encuentra = value;
	}
	
	private java.util.Set getORM_Se_encuentra() {
		return ORM_se_encuentra;
	}
	
	@Transient	
	public final tabla.NoticiaSetCollection se_encuentra = new tabla.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_SECCION_SE_ENCUENTRA, ORMConstants.KEY_NOTICIA_ESTÁ_CONTENIDA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setIncluye(tabla.Tematica value) {
		if (this.incluye != value) {
			tabla.Tematica lincluye = this.incluye;
			this.incluye = value;
			if (value != null) {
				incluye.setDa_tematica(this);
			}
			if (lincluye != null && lincluye.getDa_tematica() == this) {
				lincluye.setDa_tematica(null);
			}
		}
	}
	
	public tabla.Tematica getIncluye() {
		return incluye;
	}
	
	public String toString() {
		return String.valueOf(getIdSeccion());
	}
	
}
