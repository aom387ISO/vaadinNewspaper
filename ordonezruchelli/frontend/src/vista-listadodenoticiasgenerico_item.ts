import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-listadodenoticiasgenerico_item')
export class VistaListadodenoticiasgenerico_item extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-text-area label="Título" placeholder="Add detailed explanation" id="titulo">
  Text
 </vaadin-text-area>
 <vaadin-text-area label="Resumen" placeholder="Add detailed explanation" id="resumen"></vaadin-text-area>
 <vaadin-text-area label="Cuerpo" placeholder="Add detailed explanation" id="cuerpo"></vaadin-text-area>
 <vaadin-text-area label="valoracionesPositivas" placeholder="Add detailed explanation" id="valoracionesPositivas"></vaadin-text-area>
 <vaadin-text-area label="valoracionesNegativas" placeholder="Add detailed explanation" id="valoracionesNegativas"></vaadin-text-area>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
