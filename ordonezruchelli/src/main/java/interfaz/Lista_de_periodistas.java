package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListadeperiodistas;

public class Lista_de_periodistas extends VistaListadeperiodistas{
	public Gestionar_periodistas _gestionar_periodistas;
	public Vector<Lista_de_periodistas_item> _item = new Vector<Lista_de_periodistas_item>();
	public Editor editor;
	
	public Lista_de_periodistas(Gestionar_periodistas gestionar_periodistas) {
		super();
		this._gestionar_periodistas = gestionar_periodistas;
	}
    public void cargarPeriodistas(bbdd.Periodista[] periodistas) {
//		this._gestionar_periodistas._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).removeAll();
        for (bbdd.Periodista periodista : periodistas) {
            Lista_de_periodistas_item item = new Lista_de_periodistas_item(this, periodista);
            _item.add(item);
//    		this._gestionar_periodistas._gestionar._editor.getNoticiasBanner().as(VerticalLayout.class).add(item);
        }
    }
}