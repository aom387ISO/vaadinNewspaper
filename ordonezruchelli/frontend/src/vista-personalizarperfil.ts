import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-personalizarperfil')
export class VistaPersonalizarperfil extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" id="Perfil">
  <vaadin-form-layout style="align-self: center; background: #f5f5f5; border: 1px solid black; padding: 20px;">
   <vaadin-horizontal-layout theme="spacing" id="layoutFotos"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing"></vaadin-horizontal-layout>
   <vaadin-text-field label="Nuevo apodo" placeholder="Nuevo apodo" id="nuevoApodo"></vaadin-text-field>
   <vaadin-button id="cambiarApodo">
     Cambiar apodo 
   </vaadin-button>
   <vaadin-horizontal-layout theme="spacing" style="justify-content: center;">
    <vaadin-vertical-layout theme="spacing-l" style="justify-content: center; flex-grow: 1; height: 100%; width: 100%; margin: var(--lumo-space-s); padding: var(--lumo-space-s);">
     <vaadin-button id="bajaUsuarioSuscrito" style="flex-grow: 1; align-self: flex-end;">
       Darse de baja 
     </vaadin-button>
     <vaadin-button id="cerrarSesion" style="align-self: flex-end; flex-grow: 1;">
       Cerrar sesión 
     </vaadin-button>
     <vaadin-button id="volverPortada" style="align-self: flex-end; flex-grow: 1;">
       Volver a la portada 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-form-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
