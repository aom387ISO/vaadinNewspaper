import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listadodenoticiasgenerico';
import './vista-vercomentarios';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-vernoticia')
export class VistaVernoticia extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="bannerPortada">
 <vaadin-horizontal-layout theme="spacing" id="fotos"></vaadin-horizontal-layout>
 <vista-listadodenoticiasgenerico></vista-listadodenoticiasgenerico>
 <vista-vercomentarios id="verComentarioGeneral"></vista-vercomentarios>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
