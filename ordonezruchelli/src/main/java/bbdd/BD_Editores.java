package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Editores {
    public BDPrincipal _bd_prin_edit;
    public Vector<Editor> _contiene_editor = new Vector<Editor>();

    public Editor loginEditor(String aCorreo, String aContrasena) {
        Editor editor = null;
        PersistentTransaction t = null;
        try {
            t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
            try {
                editor = EditorDAO.loadEditorByQuery(
                    "correoElectronico = '" + aCorreo + "' AND password = '" + aContrasena + "'", null);
                t.commit();
            } catch (Exception e) {
                if (t != null) {
                    t.rollback();
                }
                e.printStackTrace();
            } finally {
                ProyectofinalPersistentManager.instance().disposePersistentManager();
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return editor;
    }
}
