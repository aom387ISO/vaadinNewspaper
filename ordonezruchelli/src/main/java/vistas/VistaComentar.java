package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("vista-comentar")
@JsModule("./src/vista-comentar.ts")
public class VistaComentar extends LitTemplate {

    public VistaComentar() {
        // You can initialise any data required for the connected UI components here.
    }

}