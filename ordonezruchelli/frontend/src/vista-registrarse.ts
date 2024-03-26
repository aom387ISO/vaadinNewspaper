import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

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
 <vaadin-form-layout>
  <vaadin-text-field label="Correo" placeholder="Placeholder" id="nuevoCorreo"></vaadin-text-field>
  <vaadin-text-field label="Contraseña" placeholder="Placeholder" id="nuevaPassword"></vaadin-text-field>
  <vaadin-text-field label="Apodo" placeholder="Placeholder" id="nuevoApodo"></vaadin-text-field>
  <vaadin-text-field label="DNI" placeholder="Placeholder" id="nuevoDNI"></vaadin-text-field>
  <vaadin-text-field label="Foto de Perfil" placeholder="Placeholder" id="nuevaFoto"></vaadin-text-field>
  <vaadin-button id="anadirFoto">
   Añadir foto
  </vaadin-button>
  <vaadin-text-field label="Número de tarjeta" placeholder="Placeholder" id="anadirTarjeta"></vaadin-text-field>
  <vaadin-text-field label="Fecha de caducidad" placeholder="Placeholder" id="anadirFechaCaducidad"></vaadin-text-field>
  <vaadin-text-field label="CVV" placeholder="Placeholder" id="anadirCVV"></vaadin-text-field>
  <vaadin-button id="terminarSuscripcion">
   Suscribirse
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
