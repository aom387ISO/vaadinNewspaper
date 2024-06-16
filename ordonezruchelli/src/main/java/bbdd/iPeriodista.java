package bbdd;

public interface iPeriodista extends iUsuario_general {

	public void eliminarNoticia(int aAIdNoticia);

	public void crearNoticia(String aATitulo, Foto aAImagenes, Tematica aATematica, String aACuerpo, String aAResumen, Periodista periodista);

	public void cambiarDatosNoticia(int idNoticia, String aATitulo, Foto aAImagenes, Tematica aATematica, String aACuerpo,
			String aAResumen);

	public Periodista loginPeriodista(String aCorreo, String aContrasena);
}