package bbdd;

public interface iEditor extends iUsuario_general {

	public void eliminarPeriodista(int aAPeriodistaId);

	public void eliminarComentario(int aAIdComentario);

	public void anadirNoticiaSeccion(int aAIdNoticia, int aAIdSeccion);

	public void eliminarNoticiaSeccion(int aAIdNoticia, int aAIdSeccion);

	public void anadirAportada(int aAIdSeccion, int aIdNoticia);

	public void cambiarPosicion(int aAIdSeccion, int aANuevaPosicion);

	public void eliminarSeccion(int aAIdSeccion);

	public void crearPeriodista(String aACorreo, String aAContrasena, String aAApodo, String aADni, BD_Fotos aAFoto);

	public void crearSeccion(String aANombreSeccion);

	public void cambiarNombreSeccion(String aAIdSeccion, String aANuevoNombreSeccion);
}