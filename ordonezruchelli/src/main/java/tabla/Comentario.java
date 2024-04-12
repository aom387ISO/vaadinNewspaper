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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_COMENTARIO_VALORACIONCOMENTARIO) {
			return ORM_valoracionComentario;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMENTARIO_AUTOR) {
			this.autor = (tabla.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIO_COMENTA) {
			this.comenta = (tabla.Noticia) owner;
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
	
	@Column(name="IdComentario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="TABLA_COMENTARIO_IDCOMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TABLA_COMENTARIO_IDCOMENTARIO_GENERATOR", strategy="native")	
	private int idComentario;
	
	@ManyToOne(targetEntity=tabla.Noticia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="NoticiaIdNoticia", referencedColumnName="IdNoticia", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario575157"))	
	private tabla.Noticia comenta;
	
	@ManyToOne(targetEntity=tabla.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario476"))	
	private tabla.Usuario autor;
	
	@Column(name="Contenido", nullable=false, length=10)	
	private int contenido;
	
	@Column(name="NValoracionesPositvas", nullable=false, length=10)	
	private int nValoracionesPositvas;
	
	@Column(name="NValoracionesNegativas", nullable=false, length=10)	
	private int nValoracionesNegativas;
	
	@OneToMany(mappedBy="le_da_valoracion", targetEntity=tabla.ValoracionComentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valoracionComentario = new java.util.HashSet();
	
	private void setIdComentario(int value) {
		this.idComentario = value;
	}
	
	public int getIdComentario() {
		return idComentario;
	}
	
	public int getORMID() {
		return getIdComentario();
	}
	
	public void setContenido(int value) {
		this.contenido = value;
	}
	
	public int getContenido() {
		return contenido;
	}
	
	public void setnValoracionesPositvas(int value) {
		this.nValoracionesPositvas = value;
	}
	
	public int getnValoracionesPositvas() {
		return nValoracionesPositvas;
	}
	
	public void setnValoracionesNegativas(int value) {
		this.nValoracionesNegativas = value;
	}
	
	public int getnValoracionesNegativas() {
		return nValoracionesNegativas;
	}
	
	public void setAutor(tabla.Usuario value) {
		if (autor != null) {
			autor.escribir.remove(this);
		}
		if (value != null) {
			value.escribir.add(this);
		}
	}
	
	public tabla.Usuario getAutor() {
		return autor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Autor(tabla.Usuario value) {
		this.autor = value;
	}
	
	private tabla.Usuario getORM_Autor() {
		return autor;
	}
	
	private void setORM_ValoracionComentario(java.util.Set value) {
		this.ORM_valoracionComentario = value;
	}
	
	private java.util.Set getORM_ValoracionComentario() {
		return ORM_valoracionComentario;
	}
	
	@Transient	
	public final tabla.ValoracionComentarioSetCollection valoracionComentario = new tabla.ValoracionComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_COMENTARIO_VALORACIONCOMENTARIO, ORMConstants.KEY_VALORACIONCOMENTARIO_LE_DA_VALORACION, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setComenta(tabla.Noticia value) {
		if (comenta != null) {
			comenta.comentada_por.remove(this);
		}
		if (value != null) {
			value.comentada_por.add(this);
		}
	}
	
	public tabla.Noticia getComenta() {
		return comenta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Comenta(tabla.Noticia value) {
		this.comenta = value;
	}
	
	private tabla.Noticia getORM_Comenta() {
		return comenta;
	}
	
	public String toString() {
		return String.valueOf(getIdComentario());
	}
	
}
