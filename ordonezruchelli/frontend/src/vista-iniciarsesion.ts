import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-iniciarsesion')
export class VistaIniciarsesion extends LitElement {
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
 <vaadin-form-layout style="align-self: center; background: #f5f5f5; border: 1px solid black; padding: 20px;">
  <vaadin-text-field label="Login" placeholder="usuario" id="login"></vaadin-text-field>
  <vaadin-password-field label="Password" placeholder="Enter password" value="secret1" id="password" has-value></vaadin-password-field>
  <vaadin-button id="botonLogin">
    Login 
  </vaadin-button>
 </vaadin-form-layout>
 <vaadin-form-layout style="align-self: center; background:#f5f5f5; border: 1px solid black; padding-top: var(--lumo-space-xs); padding-right: var(--lumo-space-xs); padding: 20%;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center; font-size: 1.875em;font-weight: bold;">
   <label style="height: 100%; width: 100%; padding: var(--lumo-space-m);">Suscribirse al periódico</label>
   <vaadin-button id="suscribirseIniciarSesion" style="align-self: center;">
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
