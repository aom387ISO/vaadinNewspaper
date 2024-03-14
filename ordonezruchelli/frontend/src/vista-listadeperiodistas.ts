import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listadeperiodistas_item';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-listadeperiodistas')
export class VistaListadeperiodistas extends LitElement {
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
<vaadin-vertical-layout theme="spacing">
 <vaadin-text-area label="Listado de periodistas" placeholder="Add detailed explanation" id="listaPeriodistas" style="flex-grow: 1; flex-shrink: 1; padding: var(--lumo-space-xs); height: 10%;"></vaadin-text-area>
 <vista-listadeperiodistas_item></vista-listadeperiodistas_item>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
