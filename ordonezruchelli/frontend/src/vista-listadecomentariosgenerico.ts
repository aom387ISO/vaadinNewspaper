import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listadecomentariosgenerico_item';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
 <vaadin-text-area id="listadoComentarios" label="Listado Comentarios"></vaadin-text-area>
 <vista-listadecomentariosgenerico_item></vista-listadecomentariosgenerico_item>
 <vaadin-button id="valorarNegativamenteComentario">
  Valorar negativamente
 </vaadin-button>
 <vaadin-button id="valorarPositivamenteComentario">
  Valorar positivamente
 </vaadin-button>
 <vaadin-button id="eliminarComentario">
  Eliminar comentario
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
