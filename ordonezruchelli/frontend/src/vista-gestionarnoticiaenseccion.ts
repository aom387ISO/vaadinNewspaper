import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';

@customElement('vista-gestionarnoticiaenseccion')
export class VistaGestionarnoticiaenseccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutGeneral">
 <vaadin-form-layout style="width: 100%; height: 100%;" id="layoutForm">
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; padding: var(--lumo-space-s); margin: var(--lumo-space-s); width: 100%;">
   <vaadin-form-layout style="align-self: center; background: #f5f5f5; border: 1px solid black; padding: 30px; height: 100%; margin: var(--lumo-space-xl); width: 40%;">
    <vaadin-button id="anadirNoticia">
      Añadir noticia 
    </vaadin-button>
    <vaadin-button id="eliminarNoticia">
      Eliminar noticia 
    </vaadin-button>
   </vaadin-form-layout>
   <vaadin-button id="volverGestion" style="flex-shrink: 0; flex-grow: 0;">
    Volver a Gestion
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-form-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
