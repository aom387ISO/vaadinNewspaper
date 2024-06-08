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
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	public Usuario() {
	}
    public Usuario(int idUsuario) {
        setIdUsuario(idUsuario);
    }
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_TIENE_IMAGEN) {
			return ORM_tiene_imagen;
		}
		else if (key == ORMConstants.KEY_USUARIO_ESCRIBIR) {
			return ORM_escribir;
		}
		else if (key == ORMConstants.KEY_USUARIO_VALORA_A) {
			return ORM_valora_a;
		}
		else if (key == ORMConstants.KEY_USUARIO_VA_A_VALORAR) {
			return ORM_va_a_valorar;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdUsuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BBDD_USUARIO_IDUSUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BBDD_USUARIO_IDUSUARIO_GENERATOR", strategy="native")	
	private int idUsuario;
	
	@Column(name="CorreoElectronico", nullable=true, length=255)	
	private String correoElectronico;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="Apodo", nullable=true, length=255)	
	private String apodo;
	
	@Column(name="Dni", nullable=true, length=255)	
	private String dni;
	
	@Column(name="NTarjeta", nullable=true, length=255)	
	private String nTarjeta;
	
	@Column(name="FechaCaducidad", nullable=true, length=255)	
	private String fechaCaducidad;
	
	@Column(name="Cvv", nullable=true, length=255)	
	private String cvv;
	
	@OneToMany(mappedBy="le_da_imagen_a", targetEntity=bbdd.Foto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene_imagen = new java.util.HashSet();
	
	@OneToMany(mappedBy="autor", targetEntity=bbdd.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_escribir = new java.util.HashSet();
	
	@OneToMany(mappedBy="valorada_por", targetEntity=bbdd.ValoracionNoticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valora_a = new java.util.HashSet();
	
	@OneToMany(mappedBy="valorado_por", targetEntity=bbdd.ValoracionComentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_va_a_valorar = new java.util.HashSet();
	
	public void setCorreoElectronico(String value) {
		this.correoElectronico = value;
	}
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setApodo(String value) {
		this.apodo = value;
	}
	
	public String getApodo() {
		return apodo;
	}
	
	public void setDni(String value) {
		this.dni = value;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setnTarjeta(String value) {
		this.nTarjeta = value;
	}
	
	public String getnTarjeta() {
		return nTarjeta;
	}
	
	public void setFechaCaducidad(String value) {
		this.fechaCaducidad = value;
	}
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	
	public void setCvv(String value) {
		this.cvv = value;
	}
	
	public String getCvv() {
		return cvv;
	}
	
	private void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getORMID() {
		return getIdUsuario();
	}
	
	private void setORM_Tiene_imagen(java.util.Set value) {
		this.ORM_tiene_imagen = value;
	}
	
	private java.util.Set getORM_Tiene_imagen() {
		return ORM_tiene_imagen;
	}
	
	@Transient	
	public final bbdd.FotoSetCollection tiene_imagen = new bbdd.FotoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_TIENE_IMAGEN, ORMConstants.KEY_FOTO_LE_DA_IMAGEN_A, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Escribir(java.util.Set value) {
		this.ORM_escribir = value;
	}
	
	private java.util.Set getORM_Escribir() {
		return ORM_escribir;
	}
	
	@Transient	
	public final bbdd.ComentarioSetCollection escribir = new bbdd.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_ESCRIBIR, ORMConstants.KEY_COMENTARIO_AUTOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Valora_a(java.util.Set value) {
		this.ORM_valora_a = value;
	}
	
	private java.util.Set getORM_Valora_a() {
		return ORM_valora_a;
	}
	
	@Transient	
	public final bbdd.ValoracionNoticiaSetCollection valora_a = new bbdd.ValoracionNoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_VALORA_A, ORMConstants.KEY_VALORACIONNOTICIA_VALORADA_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Va_a_valorar(java.util.Set value) {
		this.ORM_va_a_valorar = value;
	}
	
	private java.util.Set getORM_Va_a_valorar() {
		return ORM_va_a_valorar;
	}
	
	@Transient	
	public final bbdd.ValoracionComentarioSetCollection va_a_valorar = new bbdd.ValoracionComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_VA_A_VALORAR, ORMConstants.KEY_VALORACIONCOMENTARIO_VALORADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void cambiarApodo(String nuevoApodo) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void cambiarImagen(bbdd.Foto foto) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
