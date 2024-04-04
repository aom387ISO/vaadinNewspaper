import { LitElement, html, css, customElement } from 'lit-element';
import './vista-listadodenoticiasgenerico';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-buscarnoticiadenosuscrito';

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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="banner">
  <vaadin-vertical-layout theme="spacing" id="bannerAnuncios" style="width: 10%; height: 80%; justify-content: flex-start; align-self: flex-end;">
   <div id="anuncio">
     Anuncios 
    <vaadin-vertical-layout theme="spacing" id="anuncio1"></vaadin-vertical-layout>
   </div>
  </vaadin-vertical-layout>
  <vaadin-button id="iniciarSesion">
    Iniciar sesión 
  </vaadin-button>
  <vaadin-button id="verNoticiaCortada">
    Ver noticias cortadas 
  </vaadin-button>
  <vaadin-button id="verSeccionNoSuscrito">
    Ver sección como usuario no suscrito 
  </vaadin-button>
  <vista-buscarnoticiadenosuscrito id="buscarNoticiaNoSuscrito"></vista-buscarnoticiadenosuscrito>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing">
  <vista-listadodenoticiasgenerico></vista-listadodenoticiasgenerico>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
