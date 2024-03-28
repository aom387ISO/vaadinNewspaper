import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import './vista-listadodenoticiasgenerico';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscarnoticiadenosuscrito')
export class VistaBuscarnoticiadenosuscrito extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-form-layout>
  <vista-listadodenoticiasgenerico></vista-listadodenoticiasgenerico>
  <vaadin-button id="accederNoticiaBusquedaNoSuscrito">
   Acceder a Noticia
  </vaadin-button>
 </vaadin-form-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
