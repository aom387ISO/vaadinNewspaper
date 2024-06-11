package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Tematicas {
	public BDPrincipal _bd_prin_tem;
	public Vector<Tematica> _contiene_Tematicas = new Vector<Tematica>();

	public void crearTematica(String aIdTematica) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Tematica tematica = TematicaDAO.createTematica();
			tematica.setIdTematica(aIdTematica);
			TematicaDAO.save(tematica);
			t.commit();
		} catch (Exception e) {
			t.rollback();

		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();
	}
}