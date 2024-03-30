import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-introducirdatosdeperiodista';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import './vista-listadeperiodistas';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-gestionarperiodistas')
export class VistaGestionarperiodistas extends LitElement {
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
 <vista-introducirdatosdeperiodista></vista-introducirdatosdeperiodista>
 <vaadin-form-layout>
  <vista-listadeperiodistas></vista-listadeperiodistas>
  <vaadin-button id="bajaPeriodista">
   Dar de baja periodista
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
