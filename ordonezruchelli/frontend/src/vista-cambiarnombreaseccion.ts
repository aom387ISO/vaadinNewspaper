import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import './vista-listadodeseccionesgenerico';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cambiarnombreaseccion')
export class VistaCambiarnombreaseccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="generalAnadir">
 <vaadin-combo-box id="seccionBox">
  <vista-listadodeseccionesgenerico></vista-listadodeseccionesgenerico>
 </vaadin-combo-box>
 <vaadin-text-field label="Nuevo nombre seccion" placeholder="Nuevo nombre" id="nuevoNombreSeccion"></vaadin-text-field>
 <vaadin-button id="cambiarNombreSeccion">
   Cambiar nombre 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
