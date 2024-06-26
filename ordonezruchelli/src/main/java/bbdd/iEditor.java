package bbdd;

public interface iEditor extends iUsuario_general {

	public void eliminarPeriodista(int aAPeriodistaId);

	public void eliminarComentario(int aAIdComentario);

	public void anadirNoticiaSeccion(int aAIdNoticia, int aAIdSeccion);

	public void eliminarNoticiaSeccion(int aAIdNoticia, int aAIdSeccion);

	public void anadirAportada(String aAIdSeccion, int aIdNoticia);

	public void cambiarPosicion(String aAIdSeccion, int aIdNoticia, int aANuevaPosicion);

	public void eliminarSeccion(String aAIdSeccion);

	public void crearPeriodista(String aACorreo, String aAContrasena, String aAApodo, String aADni, Foto aAFoto);

	public void crearSeccion(String aANombreSeccion);

	public void cambiarNombreSeccion(String aAIdSeccion, String aANuevoNombreSeccion);
	
	public Editor loginEditor(String aCorreo, String aContrasena);
	
	public Periodista[] cargarPeriodistas();
	
    public Periodista buscarPeriodistaPorApodo(String apodo);
    
    public Noticia[] cargarNoticiasPorSeccionPortada();
    
    public Seccion[] cargarSecciones();
    
    public Noticia[] cargarNoticiasNoContenidasEnSeccion(int idSeccion);
    
    public Noticia obtenerNoticiaPorTitulo(String titulo);

}