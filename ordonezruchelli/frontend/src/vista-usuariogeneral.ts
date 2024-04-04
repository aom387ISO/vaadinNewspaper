import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
 <vaadin-horizontal-layout theme="spacing-xs" style="height: 10%; align-self: flex-start; flex-grow: 0; flex-shrink: 0; width: 100%;">
  <vaadin-button id="personalizar">
    Personalizar perfil 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" id="layoutBuscarNoticiaSuscrito">
   <vaadin-button id="buscarNoticia">
     Buscar noticia 
   </vaadin-button>
   <vaadin-text-field placeholder="noticia" id="barraBusqueda"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutSeccionSuscrito">
   <vaadin-button id="verSeccion">
     Ver sección 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-button id="verNoticia">
    Ver noticia 
  </vaadin-button>
  <vaadin-button id="personalizarSuscrito" style="flex-grow: 0; flex-shrink: 0;">
    Personalizar perfil como usuario suscrito 
  </vaadin-button>
  <vaadin-button id="gestionPeriodista">
    Gestión periodista 
  </vaadin-button>
  <vaadin-button id="gestionEditor">
    Gestión editor 
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
