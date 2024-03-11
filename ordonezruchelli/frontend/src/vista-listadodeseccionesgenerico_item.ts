import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import './vista-listadodenoticiasgenerico';

@customElement('vista-listadodeseccionesgenerico_item')
export class VistaListadodeseccionesgenerico_item extends LitElement {
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
 <vaadin-text-area label="nombreSección" placeholder="Add detailed explanation" id="nombreSeccion"></vaadin-text-area>
 <vista-listadodenoticiasgenerico></vista-listadodenoticiasgenerico>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
