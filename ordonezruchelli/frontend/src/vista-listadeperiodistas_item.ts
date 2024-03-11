import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-listadeperiodistas_item')
export class VistaListadeperiodistas_item extends LitElement {
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
 <vaadin-text-area label="Apodo" placeholder="Add detailed explanation" id="apodo"></vaadin-text-area>
 <vaadin-text-area label="DNI" placeholder="Add detailed explanation" id="dni"></vaadin-text-area>
 <vaadin-text-area label="Estado" placeholder="Add detailed explanation" id="estado"></vaadin-text-area>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
