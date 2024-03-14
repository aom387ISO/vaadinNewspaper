import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import './vista-listadodenoticiasgenerico_item';

@customElement('vista-listadodenoticiasgenerico')
export class VistaListadodenoticiasgenerico extends LitElement {
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
 <vaadin-text-area label="listadoNoticias" placeholder="Add detailed explanation" id="listadoNoticias"></vaadin-text-area>
 <vista-listadodenoticiasgenerico_item style="height: 20%;"></vista-listadodenoticiasgenerico_item>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
