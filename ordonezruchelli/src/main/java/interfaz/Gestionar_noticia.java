package interfaz;

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarnoticia;
import bbdd.BDPrincipal;
import bbdd.iPeriodista;
public class Gestionar_noticia extends VistaGestionarnoticia{
	public Periodista _periodista;
	public Ver_listado_propio_de_noticias _ver_listado_propio_de_noticias;
	public Introducir_datos_noticia _introducir_datos_noticia;
	public Modificar_noticia_previa _modificar_noticia_previa;
	iPeriodista _iperiodista = new BDPrincipal();

	public Gestionar_noticia (Periodista periodista) {
		super();
		this._periodista = periodista;		
		_ver_listado_propio_de_noticias = new Ver_listado_propio_de_noticias(this);
		this.getMostrarListadoNoticias().addClickListener(event->{
			this._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Ver_listado_propio_de_noticias();
		});
		
		
		_introducir_datos_noticia = new Introducir_datos_noticia(this);
		this.getRedactarNuevaNoticia().addClickListener(event->{
			this._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Introducir_datos_noticia();
		});
			
		_modificar_noticia_previa = new Modificar_noticia_previa(this);
		this.getModificarNoticiaPrevia().addClickListener(event->{
			this._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Modificar_noticia_previa();
		});
		
	}

	public void Ver_listado_propio_de_noticias() {
		ListBox<String> noticiasListBox = new ListBox<>();
		try {
			bbdd.Noticia[] noticias = _iperiodista.mostrarNoticiasAutor(_periodista._periodista);
			_ver_listado_propio_de_noticias.cargarNoticias(noticias);
            List<String> noticiasTitulos = java.util.Arrays.stream(noticias)
                    .map(bbdd.Noticia::getTitulo)
                    .collect(Collectors.toList());
//            this.getNotici().setItems(noticiasTitulos);
//            noticiasListBox = new ListBox<>();
            noticiasListBox.setItems(noticiasTitulos);
    		this._periodista.getNoticiasBanner().as(VerticalLayout.class).add(noticiasListBox);

            noticiasListBox.addValueChangeListener(event -> {
                String selectedTitulo = event.getValue();
                if (selectedTitulo != null) {
                    bbdd.Noticia selectedNoticia = java.util.Arrays.stream(noticias)
                            .filter(noticia -> noticia.getTitulo().equals(selectedTitulo))
                            .findFirst()
                            .orElse(null);
                    if (selectedNoticia != null) {
                        mostrarNoticiaCompleta(selectedNoticia);
                    }
                }
            });
		}catch (Exception e) {
            e.printStackTrace();
	        Notification notification = Notification.show("No se han cargado las secciones");
	        notification.addThemeVariants(NotificationVariant.LUMO_ERROR);	
		}
//		this._periodista.getNoticiasBanner().as(VerticalLayout.class).add(noticiasListBox);

	}
    public void mostrarNoticiaCompleta(bbdd.Noticia noticia) {
        VerticalLayout noticiaLayout = new VerticalLayout();
        noticiaLayout.add("Titulo: " + noticia.getTitulo());
        noticiaLayout.add("Cuerpo: " + noticia.getCuerpo());
        noticiaLayout.add("Resumen: " + noticia.getResumen());
        noticiaLayout.add("Imágenes: " + noticia.getImagenes());
        noticiaLayout.add("Valoraciones Positivas: " + noticia.getnValoracionesPositivas());
        noticiaLayout.add("Valoraciones Negativas: " + noticia.getnValoracionesNegativas());

        this._periodista.getNoticiasBanner().as(VerticalLayout.class).removeAll();
        this._periodista.getNoticiasBanner().as(VerticalLayout.class).add(noticiaLayout);
    }
	public void Introducir_datos_noticia() {
		this._periodista.getNoticiasBanner().as(VerticalLayout.class).add(_introducir_datos_noticia);
	}

	public void Modificar_noticia_previa() {
		this._modificar_noticia_previa._noticias_propias = new Noticias_propias(_modificar_noticia_previa);
		this._periodista.getNoticiasBanner().as(VerticalLayout.class).add(this._modificar_noticia_previa._noticias_propias);
	}
}