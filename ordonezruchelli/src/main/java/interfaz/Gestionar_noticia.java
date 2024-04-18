package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarnoticia;

public class Gestionar_noticia extends VistaGestionarnoticia{
	public Periodista _periodista;
	public Ver_listado_propio_de_noticias _ver_listado_propio_de_noticias;
	public Introducir_datos_noticia _introducir_datos_noticia;
	public Modificar_noticia_previa _modificar_noticia_previa;
	
	public Gestionar_noticia (Periodista periodista) {
		super();
		this._periodista = periodista;		
		_ver_listado_propio_de_noticias = new Ver_listado_propio_de_noticias(this, this._periodista);
		this.getMostrarListadoNoticias().addClickListener(event->{
			this._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Ver_listado_propio_de_noticias();
		});
		
		
		_introducir_datos_noticia = new Introducir_datos_noticia(this, this._periodista);
		this.getRedactarNuevaNoticia().addClickListener(event->{
			this._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Introducir_datos_noticia();
		});
			
		_modificar_noticia_previa = new Modificar_noticia_previa(this, this._periodista);
		this.getModificarNoticiaPrevia().addClickListener(event->{
			this._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Modificar_noticia_previa();
		});
		
	}

	public void Ver_listado_propio_de_noticias() {
		this._periodista.getNoticiasBanner().as(VerticalLayout.class).add(_ver_listado_propio_de_noticias);

	}

	public void Introducir_datos_noticia() {
		this._periodista.getNoticiasBanner().as(VerticalLayout.class).add(_introducir_datos_noticia);
	}

	public void Modificar_noticia_previa() {
		this._periodista.getNoticiasBanner().as(VerticalLayout.class).add(_modificar_noticia_previa);
	}
}