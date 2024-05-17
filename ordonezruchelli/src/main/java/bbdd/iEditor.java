package bbdd;


public interface iEditor extends iUsuario_general {

	public void crearPeriodista(String aCorreo, String aContrasena, String aApodo, String aDni, BD_Fotos aFoto);

	public void eliminarPeriodista(int aPeriodistaId);

	public void eliminarComentario(int aIdComentario);

	public void anadirNoticiaSeccion(int aIdNoticia, int aIdSeccion);

	public void eliminarNoticiaSeccion(int aIdNoticia, int aIdSeccion);

	public void crearSeccion(String aNombreSeccion);

	public void anadirAportada(int aIdSeccion);

	public void cambiarPosicion(int aIdSeccion, int aNuevaPosicion);

	public void cambiarNombreSeccion(String aIdSeccion, String aNuevoNombreSeccion);

	public void eliminarSeccion(int aIdSeccion);
}