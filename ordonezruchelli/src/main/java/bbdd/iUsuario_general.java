package bbdd;

public interface iUsuario_general {

	public void cambiarApodo(String aANuevoApodo, int aIdUsuario);

	public void noGustarNoticia(int aAIdNoticia, int aIdUsuario);

	public void gustarComentario(int aAIdUsuario, int aAIdComentario);

	public void noGustarComentario(int aAIdUsuario, int aAIdComentario);

	public void cambiarImagen(BD_Fotos aAFoto, int aIdUsuario);

	public void gustarNoticia(Bd_Noticias aAIdNoticia, int aIdUsuario);

	public void comentar(int aAIdUsuario, int aAIdComentario, String aAContenido);
}