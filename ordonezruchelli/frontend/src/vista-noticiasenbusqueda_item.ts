import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="bannerFotos"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-text-area label="Nombre noticia" placeholder="Nombre de la noticia" id="nombreNoticiaBusqueda"></vaadin-text-area>
  <vaadin-text-area label="Resumen noticia" placeholder="Resumen de la noticia" id="resumenNoticiaBusqueda"></vaadin-text-area>
  <vaadin-button id="verNoticia">
    Ver Noticia 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
