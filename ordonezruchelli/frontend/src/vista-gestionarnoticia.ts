import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-gestionarnoticia')
export class VistaGestionarnoticia extends LitElement {
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
 <vaadin-button id="redactarNuevaNoticia">
  Redactar nueva noticia 
 </vaadin-button>
 <vaadin-button id="modificarNoticiaPrevia">
  Modificar noticia previa
 </vaadin-button>
 <vaadin-button id="mostrarListadoNoticias">
  Mostrar listado de noticas
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
