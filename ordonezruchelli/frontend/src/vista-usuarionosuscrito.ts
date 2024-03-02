import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-usuarionosuscrito')
export class VistaUsuarionosuscrito extends LitElement {
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
 <vaadin-button id="vaadinButton" style="flex-shrink: 1;">
  Buscar noticia como no suscrito
 </vaadin-button>
 <vaadin-button>
  Iniciar sesión
 </vaadin-button>
 <vaadin-button>
  Ver anuncios
 </vaadin-button>
 <vaadin-button>
  Ver noticia cortada
 </vaadin-button>
 <vaadin-button>
  Ver sección como usuario no suscrito
 </vaadin-button>
 <vaadin-button>
  Ver comentarios como usuario no suscrito
 </vaadin-button>
 <vaadin-button>
  Registrarse
 </vaadin-button>
 <vaadin-button>
  Ver secciones cortadas
 </vaadin-button>
 <vaadin-button>
  Ver noticias cortadas
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
