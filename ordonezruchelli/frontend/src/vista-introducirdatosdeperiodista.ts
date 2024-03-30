import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
 Introducir datos del periodista
 <vaadin-text-field label="Correo electrónico" placeholder="Correo electrónico" id="correoPeriodista"></vaadin-text-field>
 <vaadin-text-field label="Contraseña" placeholder="Contraseña" id="contrasenaPeriodista"></vaadin-text-field>
 <vaadin-text-field label="Apodo" placeholder="Apodo" id="apodoPeriodista"></vaadin-text-field>
 <vaadin-text-field label="DNI" placeholder="DNI" id="dniPeriodista"></vaadin-text-field>
 <vaadin-text-field label="Foto de Perfil" placeholder="Foto de Perfil" id="fotoPeriodista"></vaadin-text-field>
 <vaadin-button id="anadirFotoPeriodista">
  Añadir Foto
 </vaadin-button>
 <vaadin-button id="darAltaPeriodista">
  Dar de alta
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
