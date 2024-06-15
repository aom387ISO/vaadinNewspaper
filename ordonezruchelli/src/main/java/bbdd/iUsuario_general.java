package bbdd;

public interface iUsuario_general {

	public void cambiarApodo(String aANuevoApodo, int aIdUsuario);

	public void noGustarNoticia(int aAIdNoticia, int aIdUsuario);

	public void gustarComentario(int aAIdUsuario, int aAIdComentario);

	public void noGustarComentario(int aAIdUsuario, int aAIdComentario);

	public void cambiarImagen(Foto aAFoto, int aIdUsuario);

	public void gustarNoticia(int aAIdNoticia, int aIdUsuario);

	public void comentar(int aAIdUsuario, int aAIdComentario, String aAContenido);
}