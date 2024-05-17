package bbdd;


public interface iPeriodista extends iUsuario_general {

	public void crearNoticia(String aTitulo, BD_Fotos aImagenes, BD_Tematicas aTematica, String aCuerpo, String aResumen);

	public void cambiarDatosNoticia(String aTitulo, BD_Fotos aImagenes, BD_Tematicas aTematica, String aCuerpo, String aResumen);

	public void eliminarNoticia(int aIdNoticia);
}