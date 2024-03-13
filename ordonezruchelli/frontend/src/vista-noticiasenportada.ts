import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import './vista-noticiasenportada_item';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-noticiasenportada')
export class VistaNoticiasenportada extends LitElement {
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
 <vaadin-text-area label="Listado Noticias Portada" placeholder="Add detailed explanation" id="listadoNoticiasPortada"></vaadin-text-area>
 <vista-noticiasenportada_item></vista-noticiasenportada_item>
 <vaadin-button id="eliminarDePortada">
  Eliminar de portada
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
