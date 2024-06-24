import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';

@customElement('vista-visualizarseccion')
export class VistaVisualizarseccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutSecciones">
 <vaadin-form-layout style="align-self: center; background:#f5f5f5; border: 1px solid black; padding-top: var(--lumo-space-xs); padding-right: var(--lumo-space-xs); padding: 20%;" id="formSecciones"></vaadin-form-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
