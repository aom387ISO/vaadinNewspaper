import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-usuarionosuscrito')
export class VistaUsuarionosuscrito extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" id="anuncios" style="width: 10%; height: 80%; justify-content: flex-start; align-self: flex-end;">
  <div id="anuncio">
    Div 
  </div>
  <vaadin-vertical-layout theme="spacing" id="anuncio1"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 90%; height: 100%;">
  <vaadin-button id="buscarNoticiaNoSuscrito" style="flex-shrink: 1;">
    Buscar noticia como no suscrito 
  </vaadin-button>
  <vaadin-button id="iniciarSesion">
    Iniciar sesión 
  </vaadin-button>
  <vaadin-button id="verSeccionNoSuscrito">
    Ver sección como usuario no suscrito 
  </vaadin-button>
  <vaadin-button id="verNoticiaCortada">
    Ver noticias cortadas 
  </vaadin-button>
  <vaadin-text-area label="Write a description" placeholder="Add detailed explanation"></vaadin-text-area>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
