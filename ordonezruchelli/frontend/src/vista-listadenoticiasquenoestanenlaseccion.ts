import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import './vista-listadenoticiasquenoestanenlaseccion_item';

@customElement('vista-listadenoticiasquenoestanenlaseccion')
export class VistaListadenoticiasquenoestanenlaseccion extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-text-area label="Listado noticias que no están" placeholder="Add detailed explanation" id="listadoNoticiasSecciones"></vaadin-text-area>
 <vista-listadenoticiasquenoestanenlaseccion_item></vista-listadenoticiasquenoestanenlaseccion_item>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
