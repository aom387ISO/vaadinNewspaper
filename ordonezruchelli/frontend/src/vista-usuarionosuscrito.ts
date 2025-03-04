import { LitElement, html, css, customElement } from 'lit-element';
import './vista-veranuncios';
import './vista-buscarnoticiadenosuscrito';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-noticiasenportada';

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
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-vertical-layout theme="spacing" style=" border: 1px solid black;">
   <img src="https://upload-static.hoyoverse.com/event/2023/03/28/77cb5426637574ba524ac458fa963da0_366369025300461262.png" alt="Descripción de la imagen" style="max-width: 100%; max-height: 100px;">
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="position: absolute; right: 0;">
   <vaadin-button id="iniciarSesion" style="margin-left: 20px;">
     Iniciar sesión 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 200%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 0;">
   <vista-buscarnoticiadenosuscrito id="buscarNoticiaNoSuscrito"></vista-buscarnoticiadenosuscrito>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 0;" id="banner">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
   <vaadin-button id="verNoticiaCortada">
     Ver noticias cortadas 
   </vaadin-button>
   <vaadin-button id="verSeccionNoSuscrito">
     Ver sección como usuario no suscrito 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing-l" style="flex-grow: 1;" id="paraNoticias">
  <vaadin-vertical-layout theme="spacing" id="bannerAnuncios">
   <vista-veranuncios id="verAnuncios"></vista-veranuncios>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="bannerNoticiasPortada">
   <vista-noticiasenportada id="noticiasPortada"></vista-noticiasenportada>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
}


  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
