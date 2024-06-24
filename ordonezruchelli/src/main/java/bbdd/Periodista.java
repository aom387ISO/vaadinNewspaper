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
@Table(name="Periodista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario")
public class Periodista extends bbdd.Usuario implements Serializable {
	public Periodista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PERIODISTA_PUBLICA) {
			return ORM_publica;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Estado", nullable=false, length=1)	
	private boolean estado;
	
	@OneToMany(mappedBy="autor", targetEntity=bbdd.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publica = new java.util.HashSet();
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setORM_Publica(java.util.Set value) {
		this.ORM_publica = value;
	}
	
	public java.util.Set getORM_Publica() {
		return ORM_publica;
	}
	
	@Transient	
	public final bbdd.NoticiaSetCollection publica = new bbdd.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_PERIODISTA_PUBLICA, ORMConstants.KEY_NOTICIA_AUTOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
