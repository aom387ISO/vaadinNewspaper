import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="gestionarLayout">
 <vaadin-button id="volverGestion">
   Volver a gestion 
 </vaadin-button>
 <vaadin-form-layout id="periodistasLayout">
  <vaadin-button id="bajaPeriodista">
    Dar de baja periodista 
  </vaadin-button>
  <vaadin-combo-box id="periodistaCombo"></vaadin-combo-box>
 </vaadin-form-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
