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
@Table(name="ValoracionComentario")
public class ValoracionComentario implements Serializable {
	public ValoracionComentario() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_VALORACIONCOMENTARIO_VALORADO_POR) {
			this.valorado_por = (tabla.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_VALORACIONCOMENTARIO_LE_DA_VALORACION) {
			this.le_da_valoracion = (tabla.Comentario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdValoracionComentario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="TABLA_VALORACIONCOMENTARIO_IDVALORACIONCOMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TABLA_VALORACIONCOMENTARIO_IDVALORACIONCOMENTARIO_GENERATOR", strategy="native")	
	private int idValoracionComentario;
	
	@ManyToOne(targetEntity=tabla.Comentario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ComentarioIdComentario", referencedColumnName="IdComentario") }, foreignKey=@ForeignKey(name="FKValoracion253121"))	
	private tabla.Comentario le_da_valoracion;
	
	@ManyToOne(targetEntity=tabla.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario") }, foreignKey=@ForeignKey(name="FKValoracion448539"))	
	private tabla.Usuario valorado_por;
	
	@Column(name="Valoracion", nullable=false, length=1)	
	private boolean valoracion;
	
	private void setIdValoracionComentario(int value) {
		this.idValoracionComentario = value;
	}
	
	public int getIdValoracionComentario() {
		return idValoracionComentario;
	}
	
	public int getORMID() {
		return getIdValoracionComentario();
	}
	
	public void setValoracion(boolean value) {
		this.valoracion = value;
	}
	
	public boolean getValoracion() {
		return valoracion;
	}
	
	public void setValorado_por(tabla.Usuario value) {
		if (valorado_por != null) {
			valorado_por.va_a_valorar.remove(this);
		}
		if (value != null) {
			value.va_a_valorar.add(this);
		}
	}
	
	public tabla.Usuario getValorado_por() {
		return valorado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Valorado_por(tabla.Usuario value) {
		this.valorado_por = value;
	}
	
	private tabla.Usuario getORM_Valorado_por() {
		return valorado_por;
	}
	
	public void setLe_da_valoracion(tabla.Comentario value) {
		if (le_da_valoracion != null) {
			le_da_valoracion.valoracionComentario.remove(this);
		}
		if (value != null) {
			value.valoracionComentario.add(this);
		}
	}
	
	public tabla.Comentario getLe_da_valoracion() {
		return le_da_valoracion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Le_da_valoracion(tabla.Comentario value) {
		this.le_da_valoracion = value;
	}
	
	private tabla.Comentario getORM_Le_da_valoracion() {
		return le_da_valoracion;
	}
	
	public String toString() {
		return String.valueOf(getIdValoracionComentario());
	}
	
}
