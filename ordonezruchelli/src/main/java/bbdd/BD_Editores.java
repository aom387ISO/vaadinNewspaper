package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

public class BD_Editores {
	public BDPrincipal _bd_prin_edit;
	public Vector<Editor> _contiene_editor = new Vector<Editor>();

	public Editor loginEditor(String aCorreo, String aContrasena)throws PersistentException  {
		Editor editor = null;
		PersistentTransaction t = null;
		try {
			t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
			try {
				editor = EditorDAO.loadEditorByQuery(
						"correoElectronico = '" + aCorreo + "' AND password = '" + aContrasena + "'", null);
				t.commit();
				if(editor == null) {
					Notification.show("Editor null");

				}
				else {
					Notification.show("Editor not null");

				}
				return editor;

			} catch (Exception e) {
				if (t != null) {
					t.rollback();
				}
				e.printStackTrace();
			}
			ProyectofinalPersistentManager.instance().disposePersistentManager();

		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}
}
