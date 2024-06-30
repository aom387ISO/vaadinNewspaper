import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-introducirdatosdeperiodista')
export class VistaIntroducirdatosdeperiodista extends LitElement {
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
 <vaadin-form-layout style="align-self: center; background: #f5f5f5; border: 1px solid black; padding: 20px;">
  <vaadin-vertical-layout theme="spacing">
   <label style="height: 100%; width: 100%; padding: var(--lumo-space-m); margin: var(--lumo-space-s); align-self: center;">Introducir datos del periodista</label>
   <vaadin-text-field label="Correo electrónico" placeholder="Correo electrónico" id="correoPeriodista"></vaadin-text-field>
   <vaadin-text-field label="Contraseña" placeholder="Contraseña" id="contrasenaPeriodista"></vaadin-text-field>
   <vaadin-text-field label="Apodo" placeholder="Apodo" id="apodoPeriodista"></vaadin-text-field>
   <vaadin-text-field label="DNI" placeholder="DNI" id="dniPeriodista"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" id="layoutFoto"></vaadin-horizontal-layout>
   <vaadin-button id="darAltaPeriodista">
     Dar de alta 
   </vaadin-button>
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
