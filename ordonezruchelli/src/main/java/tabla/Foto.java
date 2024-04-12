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
@Table(name="Foto")
public class Foto implements Serializable {
	public Foto() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FOTO_PERTENECE) {
			this.pertenece = (tabla.Noticia) owner;
		}
		
		else if (key == ORMConstants.KEY_FOTO_LE_DA_IMAGEN_A) {
			this.le_da_imagen_a = (tabla.Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdFoto", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="TABLA_FOTO_IDFOTO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TABLA_FOTO_IDFOTO_GENERATOR", strategy="native")	
	private int idFoto;
	
	@ManyToOne(targetEntity=tabla.Noticia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="NoticiaIdNoticia", referencedColumnName="IdNoticia", nullable=false) }, foreignKey=@ForeignKey(name="FKFoto588782"))	
	private tabla.Noticia pertenece;
	
	@ManyToOne(targetEntity=tabla.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKFoto986850"))	
	private tabla.Usuario le_da_imagen_a;
	
	@Column(name="Url", nullable=true, length=255)	
	private String url;
	
	private void setIdFoto(int value) {
		this.idFoto = value;
	}
	
	public int getIdFoto() {
		return idFoto;
	}
	
	public int getORMID() {
		return getIdFoto();
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setPertenece(tabla.Noticia value) {
		if (pertenece != null) {
			pertenece.contiene.remove(this);
		}
		if (value != null) {
			value.contiene.add(this);
		}
	}
	
	public tabla.Noticia getPertenece() {
		return pertenece;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece(tabla.Noticia value) {
		this.pertenece = value;
	}
	
	private tabla.Noticia getORM_Pertenece() {
		return pertenece;
	}
	
	public void setLe_da_imagen_a(tabla.Usuario value) {
		if (le_da_imagen_a != null) {
			le_da_imagen_a.tiene_imagen.remove(this);
		}
		if (value != null) {
			value.tiene_imagen.add(this);
		}
	}
	
	public tabla.Usuario getLe_da_imagen_a() {
		return le_da_imagen_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Le_da_imagen_a(tabla.Usuario value) {
		this.le_da_imagen_a = value;
	}
	
	private tabla.Usuario getORM_Le_da_imagen_a() {
		return le_da_imagen_a;
	}
	
	public String toString() {
		return String.valueOf(getIdFoto());
	}
	
}
