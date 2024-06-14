package bbdd;

public interface iEditor extends iUsuario_general {

	public void eliminarPeriodista(int aAPeriodistaId);

	public void eliminarComentario(int aAIdComentario);

	public void anadirNoticiaSeccion(int aAIdNoticia, String aAIdSeccion);

	public void eliminarNoticiaSeccion(int aAIdNoticia, String aAIdSeccion);

	public void anadirAportada(String aAIdSeccion, int aIdNoticia);

	public void cambiarPosicion(String aAIdSeccion, int aANuevaPosicion);

	public void eliminarSeccion(String aAIdSeccion);

	public void crearPeriodista(String aACorreo, String aAContrasena, String aAApodo, String aADni, BD_Fotos aAFoto);

	public void crearSeccion(String aANombreSeccion);

	public void cambiarNombreSeccion(String aAIdSeccion, String aANuevoNombreSeccion);
	
	public Editor loginEditor(String aCorreo, String aContrasena);
}