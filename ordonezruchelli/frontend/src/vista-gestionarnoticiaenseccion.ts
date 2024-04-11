import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import './vista-anadirnoticiaaseccion';
import './vista-eliminarnoticiadeseccion';

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
  <vista-anadirnoticiaaseccion></vista-anadirnoticiaaseccion>
  <vista-eliminarnoticiadeseccion></vista-eliminarnoticiadeseccion>
 </vaadin-form-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
