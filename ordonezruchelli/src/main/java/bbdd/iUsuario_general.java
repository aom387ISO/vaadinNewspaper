package bbdd;


public interface iUsuario_general {

	public void cambiarApodo(String aNuevoApodo);

	public void cambiarImagen(BD_Fotos aFoto);

	public void gustarNoticia(Bd_Noticias aIdNoticia);

	public void noGustarNoticia(int aIdNoticia);

	public void comentar(int aIdUsuario, int aIdComentario, String aContenido);

	public void gustarComentario(int aIdUsuario, int aIdComentario);

	public void noGustarComentario(int aIdUsuario, int aIdComentario);
}