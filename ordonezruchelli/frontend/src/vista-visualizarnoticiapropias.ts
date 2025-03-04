import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listadodenoticiasgenerico';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-visualizarnoticiapropias')
export class VistaVisualizarnoticiapropias extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="noticiasPropiasLayout">
 <vaadin-button id="volverGestion">
  Volver a gestión
 </vaadin-button>
 <vista-listadodenoticiasgenerico></vista-listadodenoticiasgenerico>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
