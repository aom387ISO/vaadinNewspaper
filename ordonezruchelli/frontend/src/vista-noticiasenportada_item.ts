import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-noticiasenportada_item')
export class VistaNoticiasenportada_item extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-text-area label="Título noticia en portada" placeholder="Add detailed explanation" id="noticiaPortada"></vaadin-text-area>
 <vaadin-text-area label="Resumen Noticia Portada" placeholder="Add detailed explanation" id="resumenNoticiaPortada"></vaadin-text-area>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-text-area label="Posición actual" placeholder="Add detailed explanation" id="posicionEnPortada"></vaadin-text-area>
  <vaadin-button id="EliminarDePortada">
    Eliminar de portada 
  </vaadin-button>
  <vaadin-text-field label="Nueva Posición" placeholder="Nueva Posición" id="cambiarPosicionCuadro"></vaadin-text-field>
  <vaadin-button id="cambiarPosicionBoton">
   Cambiar posición
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
