import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listadecomentariosgenerico_item';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-listadecomentariosgenerico')
export class VistaListadecomentariosgenerico extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="nuevoComentario">
  <vaadin-button id="Comentar">
    Comentar 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-text-area id="listadoComentarios" label="Listado Comentarios"></vaadin-text-area>
 <vaadin-horizontal-layout theme="spacing" id="comentariosBaner"></vaadin-horizontal-layout>
 <vista-listadecomentariosgenerico_item id="itemComentario"></vista-listadecomentariosgenerico_item>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
