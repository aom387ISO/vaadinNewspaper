import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="generalAnadir">
 <vaadin-combo-box id="comboListadoSeccion">
  <vista-listadenoticiasquenoestanenlaseccion></vista-listadenoticiasquenoestanenlaseccion>
 </vaadin-combo-box>
 <vaadin-combo-box id="comboListadoNoticias">
  <vista-listadodeseccionesgenerico></vista-listadodeseccionesgenerico>
 </vaadin-combo-box>
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
