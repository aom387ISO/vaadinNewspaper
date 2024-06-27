package interfaz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iEditor;
import vistas.VistaGestionarportada;

public class Gestionar_portada extends VistaGestionarportada{
	//	private event _volver_a_la_gestion_desde_gestion_portada;
	public Gestionar _gestionar;
	public Noticias_en_portada _noticias_en_portada;
	iEditor _ieditor = new BDPrincipal();
	
    public Gestionar_portada(Gestionar gestionar) {
		super();
        this._gestionar = gestionar;
		
		_noticias_en_portada = new Noticias_en_portada(this);
		Noticias_en_portada();
		
		getVolverParaGestion().addClickListener(event->{
			this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
			Volver_a_la_gestion_desde_gestion_portada();
		});
	}

	public void Noticias_en_portada() {
//		this.getListaPortadaLayout().as(VerticalLayout.class).add(_noticias_en_portada);
		try {
			bbdd.Noticia[] noticias = _ieditor.cargarNoticiasPorSeccionPortada();
			_noticias_en_portada.cargarNoticias(noticias);
//            List<Noticias_en_portada_item> items = Arrays.stream(noticias)
//                    .map(noticia -> new Noticias_en_portada_item(_noticias_en_portada, noticia))
//                    .collect(Collectors.toList());
		this.getListaPortadaLayout().as(VerticalLayout.class).add(_noticias_en_portada);
		}catch(Exception e) {
            e.printStackTrace();
		}
	}

	public void Volver_a_la_gestion_desde_gestion_portada() {
		this._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(_gestionar);
	}
}