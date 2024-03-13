import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-noticiasenbusqueda_item')
export class VistaNoticiasenbusqueda_item extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-text-area label="Nombre noticia" placeholder="Add detailed explanation" id="nombreNoticiaBusqueda"></vaadin-text-area>
 <vaadin-text-area label="Resumen noticia" placeholder="Add detailed explanation" id="resumenNoticiaBusqueda"></vaadin-text-area>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
