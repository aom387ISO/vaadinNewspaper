import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
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
 <vaadin-text-field label="Título de la noticia" placeholder="Título de la noticia" id="tituloNoticia"></vaadin-text-field>
 <vaadin-text-field label="Imágenes y vídeos" placeholder="Imágenes y vídeos" id="imagenesNoticia"></vaadin-text-field>
 <vaadin-text-field label="Temática" placeholder="Temática" id="tematicaNoticia"></vaadin-text-field>
 <vaadin-text-field label="Noticia" placeholder="Noticia" id="cuerpoNoticia"></vaadin-text-field>
 <vaadin-text-field label="Resumen" placeholder="Resumen" id="resumenNoticia"></vaadin-text-field>
 <vaadin-button id="enviarNoticia">
  Enviar noticia
 </vaadin-button>
 <vaadin-button id="volverGestionNoticia">
  Volver a la gestión
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
