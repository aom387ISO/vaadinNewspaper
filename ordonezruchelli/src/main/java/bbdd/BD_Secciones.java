package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Secciones {
	public BDPrincipal _bd_prin_sec;
	public Vector<Seccion> _contiene_secciones = new Vector<Seccion>();

	public void anadirNoticiaSeccion(int aIdNoticia, String aIdSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Noticia noticia = NoticiaDAO.loadNoticiaByORMID(aIdNoticia);
			Seccion seccion = SeccionDAO.loadSeccionByORMID(aIdSeccion);
			if (noticia != null && seccion != null) {
				seccion.se_encuentra.add(noticia);
				SeccionDAO.save(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void eliminarNoticiaSeccion(int aIdNoticia, String aIdSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Noticia noticia = NoticiaDAO.loadNoticiaByORMID(aIdNoticia);
			Seccion seccion = SeccionDAO.loadSeccionByORMID(aIdSeccion);
			if (noticia != null && seccion != null) {
				seccion.se_encuentra.remove(noticia);
				SeccionDAO.save(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void crearSeccion(String aNombreSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Seccion seccion = SeccionDAO.createSeccion();
			seccion.setIdSeccion(aNombreSeccion);
			SeccionDAO.save(seccion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void anadirAportada(String aIdSeccion, int aIdNoticia) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Noticia noticia = NoticiaDAO.loadNoticiaByORMID(aIdNoticia);
			Seccion seccion = SeccionDAO.loadSeccionByQuery("nombre = 'portada'", null);
			if (noticia != null && seccion != null) {
				seccion.se_encuentra.add(noticia);
				SeccionDAO.save(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void cambiarPosicion(String aIdSeccion, int aNuevaPosicion) {
		throw new UnsupportedOperationException();
	}

	public void cambiarNombreSeccion(String aIdSeccion, String aNuevoNombreSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Seccion seccion = SeccionDAO.loadSeccionByORMID(aIdSeccion);
			if (seccion != null) {
				seccion.setIdSeccion(aNuevoNombreSeccion);
				SeccionDAO.save(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}

	public void eliminarSeccion(String aIdSeccion) throws PersistentException {
		PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
		try {
			Seccion seccion = SeccionDAO.loadSeccionByORMID(aIdSeccion);
			if (seccion != null) {
				SeccionDAO.deleteAndDissociate(seccion);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
		}
		ProyectofinalPersistentManager.instance().disposePersistentManager();

	}
}
