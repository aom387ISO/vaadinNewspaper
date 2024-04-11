import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import './vista-crearnuevaseccion';
import './vista-eliminarunaseccion';
import './vista-cambiarnombreaseccion';

@customElement('vista-gestionarseccion')
export class VistaGestionarseccion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-form-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutCrear">
    Crear sección 
   <vista-crearnuevaseccion></vista-crearnuevaseccion>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutEliminar">
    Eliminar sección 
   <vista-eliminarunaseccion></vista-eliminarunaseccion>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutCambiar">
    Cambiar nombre de la sección 
   <vista-cambiarnombreaseccion></vista-cambiarnombreaseccion>
  </vaadin-vertical-layout>
 </vaadin-form-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
