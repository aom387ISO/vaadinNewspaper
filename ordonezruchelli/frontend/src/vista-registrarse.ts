import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
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
   <vaadin-text-field label="Correo" placeholder="Placeholder" id="nuevoCorreo"></vaadin-text-field>
   <vaadin-text-field label="Contraseña" placeholder="Placeholder" id="nuevaPassword"></vaadin-text-field>
   <vaadin-text-field label="Apodo" placeholder="Placeholder" id="nuevoApodo"></vaadin-text-field>
   <vaadin-text-field label="DNI" placeholder="Placeholder" id="nuevoDNI"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" id="layoutFoto"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field label="Número de tarjeta" placeholder="Placeholder" id="anadirTarjeta"></vaadin-text-field>
    <vaadin-text-field label="Fecha de caducidad" placeholder="Placeholder" id="anadirFechaCaducidad"></vaadin-text-field>
    <vaadin-text-field label="CVV" placeholder="Placeholder" id="anadirCVV"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-button id="terminarSuscripcion" style="align-self: center;">
     Suscribirse 
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
