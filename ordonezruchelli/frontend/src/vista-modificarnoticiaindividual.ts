import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-modificarnoticiaindividual')
export class VistaModificarnoticiaindividual extends LitElement {
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
 <vaadin-text-field label="Imágenes" placeholder="Imágenes" id="imagenes"></vaadin-text-field>
 <vaadin-text-field label="Temática" placeholder="Temática" id="tematica"></vaadin-text-field>
 <vaadin-text-field label="Noticia" placeholder="Noticia" id="noticia"></vaadin-text-field>
 <vaadin-text-field label="Resumen noticia" placeholder="Resumen noticia" id="resumen"></vaadin-text-field>
 <vaadin-button id="cambiarNoticia">
  Cambiar Noticia
 </vaadin-button>
 <vaadin-button id="eliminarNoticia">
  Eliminar Noticia
 </vaadin-button>
 <vaadin-button id="volverGestion">
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
