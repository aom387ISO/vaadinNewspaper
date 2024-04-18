import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-introducirdatosnoticia')
export class VistaIntroducirdatosnoticia extends LitElement {
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
 <vaadin-form-layout style="align-self: center; background: #f5f5f5; border: 1px solid black; padding: var(--lumo-space-xl); height: 100%; width: 80%;">
  <vaadin-vertical-layout theme="spacing">
   <vaadin-text-field label="Título de la noticia" placeholder="Título de la noticia" id="tituloNoticia"></vaadin-text-field>
   <vaadin-upload id="imagenesYvideos"></vaadin-upload>
   <vaadin-text-field label="Temática" placeholder="Temática" id="tematicaNoticia" style="width: 100%;"></vaadin-text-field>
   <vaadin-text-field label="Noticia" placeholder="Noticia" id="cuerpoNoticia" style="width: 100%; height: 100%;"></vaadin-text-field>
   <vaadin-text-field label="Resumen" placeholder="Resumen" id="resumenNoticia" style="width: 100%;"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button id="enviarNoticia">
      Enviar noticia 
    </vaadin-button>
    <vaadin-button id="volverGestionNoticia">
      Volver a la gestión 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-form-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
