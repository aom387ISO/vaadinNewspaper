import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import './vista-listadodeseccionesgenerico_item';

@customElement('vista-listadodeseccionesgenerico')
export class VistaListadodeseccionesgenerico extends LitElement {
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
 <vaadin-text-area label="Listado de secciones" placeholder="Add detailed explanation" id="listadoSecciones"></vaadin-text-area>
 <vista-listadodeseccionesgenerico_item></vista-listadodeseccionesgenerico_item>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
