package bbdd;

import java.util.List;

public interface iUsuario_general {

	public void cambiarApodo(String aANuevoApodo, int aIdUsuario);

	public void noGustarNoticia(int aAIdNoticia, int aIdUsuario);

	public void gustarComentario(int aAIdUsuario, int aAIdComentario);

	public void noGustarComentario(int aAIdUsuario, int aAIdComentario);

	public void cambiarImagen(Foto aAFoto, int aIdUsuario);

	public void gustarNoticia(int aAIdNoticia, int aIdUsuario);

	public void comentar(int aAIdUsuario, int aAIdComentario, String aAContenido);
	
    public Noticia[] cargarNoticiasPorSeccionPortada();
    
    public Seccion[] cargarSecciones();
    
    public Noticia[] cargarNoticias();
    
    public Noticia[] cargarNoticiasContenidasEnSeccion(String nombreSeccion);
    
    public Noticia[] cargarNoticiasNoContenidasEnSeccion(String nombreSeccion);

	public List<Noticia> buscarNoticia(String busqueda);
    
	public void subirFotoUsuario(int idUsuario, String uploadedImageUrl);
	
	public Usuario buscarUsuarioPorCorreo(String correoElectronico);

	public String cargarFoto(Usuario usuario);

	public void borrarFotoUsuario(int idUsuario);
}