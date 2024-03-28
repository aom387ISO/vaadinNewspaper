import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import './vista-listadodenoticiasgenerico';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-elegirnoticia')
export class VistaElegirnoticia extends LitElement {
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
  <vista-listadodenoticiasgenerico></vista-listadodenoticiasgenerico>
  <vaadin-button id="elegirNoticia">
    Elegir Noticia 
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
