import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-gestionar')
export class VistaGestionar extends LitElement {
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
 <vaadin-form-layout style="align-self: center; background: #f5f5f5; border: 1px solid black; padding: 20px;">
  <vaadin-button id="gestionarSeccion">
    Gestionar sección 
  </vaadin-button>
  <vaadin-button id="gestionarNoticia">
    Gestionar noticia 
  </vaadin-button>
  <vaadin-button id="gestionarPeriodistas">
    Gestionar periodistas 
  </vaadin-button>
  <vaadin-button id="gestionarPortada">
    Gestionar portada 
  </vaadin-button>
 </vaadin-form-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
