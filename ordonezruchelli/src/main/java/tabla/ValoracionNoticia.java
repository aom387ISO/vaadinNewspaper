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
@Table(name="ValoracionNoticia")
public class ValoracionNoticia implements Serializable {
	public ValoracionNoticia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_VALORACIONNOTICIA_VALORADA_POR) {
			this.valorada_por = (tabla.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_VALORACIONNOTICIA_USUARIO_VALORA_A) {
			this.usuario_valora_a = (tabla.Noticia) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdValoracionNoticia", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="TABLA_VALORACIONNOTICIA_IDVALORACIONNOTICIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TABLA_VALORACIONNOTICIA_IDVALORACIONNOTICIA_GENERATOR", strategy="native")	
	private int idValoracionNoticia;
	
	@ManyToOne(targetEntity=tabla.Noticia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="NoticiaIdNoticia", referencedColumnName="IdNoticia") }, foreignKey=@ForeignKey(name="FKValoracion98732"))	
	private tabla.Noticia usuario_valora_a;
	
	@ManyToOne(targetEntity=tabla.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario") }, foreignKey=@ForeignKey(name="FKValoracion476901"))	
	private tabla.Usuario valorada_por;
	
	@Column(name="Valoracion", nullable=false, length=1)	
	private boolean valoracion;
	
	private void setIdValoracionNoticia(int value) {
		this.idValoracionNoticia = value;
	}
	
	public int getIdValoracionNoticia() {
		return idValoracionNoticia;
	}
	
	public int getORMID() {
		return getIdValoracionNoticia();
	}
	
	public void setValoracion(boolean value) {
		this.valoracion = value;
	}
	
	public boolean getValoracion() {
		return valoracion;
	}
	
	public void setValorada_por(tabla.Usuario value) {
		if (valorada_por != null) {
			valorada_por.valora_a.remove(this);
		}
		if (value != null) {
			value.valora_a.add(this);
		}
	}
	
	public tabla.Usuario getValorada_por() {
		return valorada_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Valorada_por(tabla.Usuario value) {
		this.valorada_por = value;
	}
	
	private tabla.Usuario getORM_Valorada_por() {
		return valorada_por;
	}
	
	public void setUsuario_valora_a(tabla.Noticia value) {
		if (usuario_valora_a != null) {
			usuario_valora_a.valoracionNoticias.remove(this);
		}
		if (value != null) {
			value.valoracionNoticias.add(this);
		}
	}
	
	public tabla.Noticia getUsuario_valora_a() {
		return usuario_valora_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario_valora_a(tabla.Noticia value) {
		this.usuario_valora_a = value;
	}
	
	private tabla.Noticia getORM_Usuario_valora_a() {
		return usuario_valora_a;
	}
	
	public String toString() {
		return String.valueOf(getIdValoracionNoticia());
	}
	
}
