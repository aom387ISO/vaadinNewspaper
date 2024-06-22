package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Periodistas {
	public BDPrincipal _bd_prin_per;
	public Vector<Periodista> _contiene_periodista = new Vector<Periodista>();

	public Periodista loginPeriodista(String aCorreo, String aContrasena) throws PersistentException {
		Periodista periodista = null;
		PersistentTransaction t = null;
		try {
			t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
			try {
				periodista = PeriodistaDAO.loadPeriodistaByQuery(
						"correoElectronico = '" + aCorreo + "' AND password = '" + aContrasena + "'", null);
				t.commit();
				return periodista;

			} catch (Exception e) {
				if (t != null) {
					t.rollback();
				}
				e.printStackTrace();
			}

		} catch (PersistentException e) {
			e.printStackTrace();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();
		return null;
	}

	public void crearPeriodista(String aCorreo, String aContrasena, String aApodo, String aDni, Foto aFoto)
			throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Periodista periodista = PeriodistaDAO.createPeriodista();
			periodista.setCorreoElectronico(aCorreo);
			periodista.setPassword(aContrasena);
			periodista.setApodo(aApodo);
			periodista.setDni(aDni);
			PeriodistaDAO.save(periodista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();
	}

	public void eliminarPeriodista(int aPeriodistaID) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Periodista periodista = PeriodistaDAO.loadPeriodistaByORMID(aPeriodistaID);
			if (periodista != null) {
//				PeriodistaDAO.deleteAndDissociate(periodista);
				periodista.setEstado(false);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();

		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}
	
	   public void crearNoticia(String aTitulo, Foto aImagenes, Tematica aTematica, String aCuerpo, String aResumen) throws PersistentException {
		    PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		    try {
		        Noticia nuevaNoticia = new Noticia();
		        nuevaNoticia.setTitulo(aTitulo);
		        nuevaNoticia.setCuerpo(aCuerpo);
		        nuevaNoticia.setResumen(aResumen);
//		        nuevaNoticia.setImagenes(aImagenes);
//		        nuevaNoticia.setTematica(aTematica);

		        NoticiaDAO.save(nuevaNoticia);
		        t.commit();
		    } catch (Exception e) {
		        t.rollback();
		    }
		    ProyectofinalPersistentManager.instance().disposePersistentManager();
		}
	
	    public Periodista[] cargarPeriodistas() throws PersistentException {
            PersistentTransaction t = null;
	        try {
	        	t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
	            PeriodistaCriteria criteria = new PeriodistaCriteria();
	            Periodista[] periodistas = PeriodistaDAO.listPeriodistaByCriteria(criteria);
	            t.commit();
	            return periodistas;
	        } catch (PersistentException e) {
	            e.printStackTrace();
	        }
	            ProyectofinalPersistentManager.instance().disposePersistentManager();
	        
	        return new Periodista[0];
	    }
	    
	    public Periodista buscarPeriodistaPorApodo(String apodo) {
	        try {
	            Periodista[] periodistas = PeriodistaDAO.listPeriodistaByQuery("Apodo = '" + apodo + "'", null);
	            if (periodistas.length > 0) {
	                return periodistas[0];
	            }
	        } catch (PersistentException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	    
}