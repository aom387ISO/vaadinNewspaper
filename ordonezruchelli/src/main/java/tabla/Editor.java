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
@Table(name="Editor")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario")
public class Editor extends tabla.Usuario implements Serializable {
	public Editor() {
	}
	
	public String toString() {
		return super.toString();
	}
	
}
