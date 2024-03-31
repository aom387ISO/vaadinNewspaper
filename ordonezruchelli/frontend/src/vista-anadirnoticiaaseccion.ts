import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import './vista-listadenoticiasquenoestanenlaseccion';
import './vista-listadodeseccionesgenerico';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-anadirnoticiaaseccion')
export class VistaAnadirnoticiaaseccion extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-select value="Item one" id="seccion">
  <template>
   <vaadin-list-box selected="0">
    <vaadin-item selected>
      Item one 
    </vaadin-item>
    <vaadin-item>
      Item two 
    </vaadin-item>
    <vaadin-item>
      Item three 
    </vaadin-item>
    <vista-listadenoticiasquenoestanenlaseccion></vista-listadenoticiasquenoestanenlaseccion>
   </vaadin-list-box>
  </template>
 </vaadin-select>
 <vaadin-select value="Item one" id="noticia">
  <template>
   <vaadin-list-box>
    <vaadin-item selected>
      Item one 
    </vaadin-item>
    <vaadin-item>
      Item two 
    </vaadin-item>
    <vaadin-item>
      Item three 
    </vaadin-item>
   </vaadin-list-box>
  </template>
  <vista-listadodeseccionesgenerico></vista-listadodeseccionesgenerico>
 </vaadin-select>
 <vaadin-button id="anadirNoticiaSeccion">
   Añadir 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
