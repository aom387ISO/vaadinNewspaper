import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import './vista-buscarnoticia';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-noticiasenportada';

@customElement('vista-usuariogeneral')
export class VistaUsuariogeneral extends LitElement {
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
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-vertical-layout theme="spacing">
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-button id="personalizar">
        Personalizar perfil 
      </vaadin-button>
      <vaadin-button id="personalizarSuscrito" style="flex-grow: 0; flex-shrink: 0;">
        Personalizar perfil como usuario suscrito 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-button id="gestionPeriodista">
        Gestión periodista 
      </vaadin-button>
      <vaadin-button id="gestionEditor">
        Gestión editor 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing-xs" style="height: 10%; align-self: flex-start; flex-grow: 0; flex-shrink: 0; width: 100%;" id="bannerGeneral">
  <vaadin-button id="verNoticia">
    Ver noticia 
  </vaadin-button>
  <vaadin-button id="buscarNoticia">
    Buscar noticia 
  </vaadin-button>
  <vaadin-text-field placeholder="noticia" id="barraBusqueda"></vaadin-text-field>
  <vaadin-button id="verSeccion">
    Ver sección 
  </vaadin-button>
  <vista-buscarnoticia id="buscarSuscrito"></vista-buscarnoticia>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="noticiasBanner">
  <vista-noticiasenportada></vista-noticiasenportada>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
