import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listadodenoticiasgenerico';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" id="bannerAnuncios" style="width: 10%; height: 80%; justify-content: flex-start; align-self: flex-end;">
   <div id="anuncio">
     Anuncios 
    <vaadin-vertical-layout theme="spacing" id="anuncio1"></vaadin-vertical-layout>
   </div>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutBuscarNoSuscrito">
   <vaadin-button id="buscarNoticiaNoSuscrito" style="flex-shrink: 1;">
     Buscar noticia como no suscrito 
   </vaadin-button>
   <vaadin-text-field placeholder="Search" style="flex-grow: 1; flex-shrink: 0; align-self: flex-start;" id="barraBusqueda">
    <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
   </vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutIniciarSesion">
   <vaadin-button id="iniciarSesion">
     Iniciar sesión 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutVerSeccionNoSuscrito">
   <vaadin-button id="verSeccionNoSuscrito">
     Ver sección como usuario no suscrito 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-button id="verNoticiaCortada">
    Ver noticias cortadas 
  </vaadin-button>
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
