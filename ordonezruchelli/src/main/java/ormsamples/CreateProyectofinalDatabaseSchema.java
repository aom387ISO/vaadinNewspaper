/**
 * Licensee: Alberto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectofinalDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(tabla.ProyectofinalPersistentManager.instance());
			tabla.ProyectofinalPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
