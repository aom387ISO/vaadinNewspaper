import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import './vista-listadodeseccionesgenerico';

@customElement('vista-visualizarseccion')
export class VistaVisualizarseccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutSecciones">
 <vaadin-tabs orientation="horizontal" selected="0">
  <vista-listadodeseccionesgenerico></vista-listadodeseccionesgenerico>
  <vista-listadodeseccionesgenerico></vista-listadodeseccionesgenerico>
 </vaadin-tabs>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
