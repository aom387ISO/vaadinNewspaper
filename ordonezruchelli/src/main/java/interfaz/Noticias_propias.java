package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iPeriodista;

public class Noticias_propias extends Listado_de_noticias_generico {
	public Modificar_noticia_previa _modificar_noticia_previa;
	public Visualizar_noticia_propias _visualizar_noticia_propias;
	public Vector<Noticias_propias_item> _item = new Vector<Noticias_propias_item>();
	iPeriodista _iPeriodista = new BDPrincipal();
	
	public Noticias_propias(Modificar_noticia_previa modificar_noticia_previa) {
		super();
		this._modificar_noticia_previa = modificar_noticia_previa;
//		this._modificar_noticia_previa._gestionar_noticia._periodista = periodista;
		
	}

	public Noticias_propias(Periodista periodista) {
		super();
		this._modificar_noticia_previa._gestionar_noticia._periodista = periodista;
	}
	
    public void cargarNoticias(bbdd.Noticia[] noticias) {
        for (bbdd.Noticia noticia : noticias) {
            Noticias_propias_item item = new Noticias_propias_item(this,this, noticia);
            _item.add(item);
			this._modificar_noticia_previa._gestionar_noticia._periodista.getNoticiasBanner().as(VerticalLayout.class).add(item);
        }
    }
}