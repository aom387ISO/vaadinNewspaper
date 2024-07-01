package bbdd;

import bbdd.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Fotos {
	public BDPrincipal _bd_prin_fot;
	public Vector<Foto> _contiene_fotos = new Vector<Foto>();
	
	public void subirFotoUsuario(int idUsuario, String uploadedImageUrl) throws PersistentException {
        PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
        try {
            Foto foto = FotoDAO.createFoto();
            foto.setUrl(uploadedImageUrl);
            Usuario usuario = UsuarioDAO.getUsuarioByORMID(idUsuario);
            Noticia noticia = NoticiaDAO.loadNoticiaByQuery("Titulo = 'noticiaFotos'", null);
            foto.setORM_Pertenece(noticia);
            foto.setORM_Le_da_imagen_a(usuario);
            
            FotoDAO.save(foto);
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProyectofinalPersistentManager.instance().disposePersistentManager();
        
	}

	public String cargarFoto(Usuario usuario)throws PersistentException {
        PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
        try {
        	
        	Foto foto = FotoDAO.loadFotoByQuery("UsuarioIdUsuario = '"+usuario.getIdUsuario()+"'", null);
        	t.commit();
        	return foto.getUrl();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    ProyectofinalPersistentManager.instance().disposePersistentManager();
        
		return null;
	}

	public void borrarFotoUsuario(int idUsuario)throws PersistentException {
        PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
        try {
        	Foto foto = FotoDAO.loadFotoByQuery("UsuarioIdUsuario = '"+idUsuario+"'", null);
        	FotoDAO.deleteAndDissociate(foto);
        	t.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    ProyectofinalPersistentManager.instance().disposePersistentManager();
        
	}

	public void subirFotoNoticia(int idNoticia, String urlFoto)throws PersistentException {
        PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
        try {
            Foto foto = FotoDAO.createFoto();
            foto.setUrl(urlFoto);
            Usuario usuario = UsuarioDAO.loadUsuarioByQuery("CorreoElectronico = 'usuarioFotos'", null);
            Noticia noticia = NoticiaDAO.getNoticiaByORMID(idNoticia);
            foto.setORM_Pertenece(noticia);
            foto.setORM_Le_da_imagen_a(usuario);
            
            FotoDAO.save(foto);
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProyectofinalPersistentManager.instance().disposePersistentManager();
        
	}

	public String cargarFotoNoticia(Noticia noticia)throws PersistentException {
        PersistentTransaction t = ProyectofinalPersistentManager.instance().getSession().beginTransaction();
        try {
        	
        	Foto foto = FotoDAO.loadFotoByQuery("NoticiaIdNoticia = '"+noticia.getIdNoticia()+"'", null);
        	t.commit();
        	if(foto != null) {
        		String url = foto.getUrl();
        		if(url != null) return url;
        	}
        	return "";
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    ProyectofinalPersistentManager.instance().disposePersistentManager();
        
		return null;
	}


}