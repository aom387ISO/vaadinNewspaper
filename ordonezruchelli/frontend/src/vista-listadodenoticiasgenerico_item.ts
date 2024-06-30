import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-listadodenoticiasgenerico_item')
export class VistaListadodenoticiasgenerico_item extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
  <vaadin-text-area label="Título" placeholder="Título de la noticia" id="titulo">
   Título de la noticia
  </vaadin-text-area>
  <vaadin-text-area label="Resumen" placeholder="Resumen de la noticia" id="resumen"></vaadin-text-area>
  <vaadin-text-area label="Cuerpo" placeholder="Cuerpo de la noticia" id="cuerpo"></vaadin-text-area>
  <vaadin-text-area label="valoracionesPositivas" placeholder="Valoraciones positivas de la noticia" id="valoracionesPositivas"></vaadin-text-area>
  <vaadin-text-area label="valoracionesNegativas" placeholder="Valoraciones negativas de la noticia" id="valoracionesNegativas"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-button id="MeGusta">
   Me gusta 
 </vaadin-button>
 <vaadin-button id="NoMeGusta">
   No me gusta 
 </vaadin-button>
</vaadin-vertical-layout>
<vaadin-horizontal-layout theme="spacing" id="modificarNoticia" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
