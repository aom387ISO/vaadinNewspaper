import { LitElement, html, css, customElement } from 'lit-element';
import './vista-listadodenoticiasgenerico';
import './vista-vercomentarios';

@customElement('vista-vernoticiacortada')
export class VistaVernoticiacortada extends LitElement {
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
  Imagen noticia 
 <vista-listadodenoticiasgenerico></vista-listadodenoticiasgenerico>
 <vista-vercomentarios id="comentariosNoSuscrito"></vista-vercomentarios>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
