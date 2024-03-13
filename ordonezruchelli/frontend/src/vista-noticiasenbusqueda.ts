import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import './vista-noticiasenbusqueda_item';

@customElement('vista-noticiasenbusqueda')
export class VistaNoticiasenbusqueda extends LitElement {
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
 <vaadin-text-area label="Listado noticias en búsqueda" placeholder="Add detailed explanation" id="listadoNoticiasBusqueda"></vaadin-text-area>
 <vista-noticiasenbusqueda_item></vista-noticiasenbusqueda_item>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
