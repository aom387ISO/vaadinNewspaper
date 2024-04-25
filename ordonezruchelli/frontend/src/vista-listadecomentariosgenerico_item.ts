import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-listadecomentariosgenerico_item')
export class VistaListadecomentariosgenerico_item extends LitElement {
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
 <vaadin-text-area label="Nombre Usuario" placeholder="Add detailed explanation" id="nombreUsuario"></vaadin-text-area>
 <vaadin-text-area id="contenidoComentario" label="Contenido Comentario"></vaadin-text-area>
 <vaadin-text-area id="valoracionesPositivasComentario" label="Valoraciones Positivas Comentario"></vaadin-text-area>
 <vaadin-text-area id="valoracionesNegativasComentario" label="Valoraciones Negativas Comentario"></vaadin-text-area>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button id="MeGusta">
    Me Gusta 
  </vaadin-button>
  <vaadin-button id="NoMeGusta">
    No me gusta 
  </vaadin-button>
  <vaadin-button id="EliminarComentario">
    Eliminar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
