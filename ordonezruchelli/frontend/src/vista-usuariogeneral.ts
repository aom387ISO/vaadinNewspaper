import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-usuariogeneral')
export class VistaUsuariogeneral extends LitElement {
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
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button>
   Personalizar perfil
  </vaadin-button>
  <vaadin-button>
   Buscar noticia
  </vaadin-button>
  <vaadin-button>
   Ver sección
  </vaadin-button>
  <vaadin-button>
   Ver noticia
  </vaadin-button>
  <vaadin-button>
   Ver comentarios
  </vaadin-button>
  <vaadin-button>
   Ver listado secciones
  </vaadin-button>
  <vaadin-button>
   Ver listado noticias
  </vaadin-button>
 </vaadin-vertical-layout>
 <div>
   Div 
 </div>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button>
   Personalizar perfil como usuario suscrito
  </vaadin-button>
 </vaadin-vertical-layout>
 <div>
   Div 
 </div>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button>
   Gestión periodista
  </vaadin-button>
  <vaadin-button>
   Introducir datos noticia
  </vaadin-button>
  <vaadin-button>
   Ver noticias propias
  </vaadin-button>
  <vaadin-button>
   Modificar noticias previas
  </vaadin-button>
  <vaadin-button>
   Modificiar noticia individual
  </vaadin-button>
  <vaadin-button>
   Elegir noticia
  </vaadin-button>
 </vaadin-vertical-layout>
 <div>
   Div 
 </div>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button>
   Gestión editor
  </vaadin-button>
  <vaadin-button>
   Gestionar noticia como editor
  </vaadin-button>
  <vaadin-button>
   Añadir noticia a sección
  </vaadin-button>
  <vaadin-button>
   Eliminar noticia de sección
  </vaadin-button>
  <vaadin-button>
   Gestionar sección
  </vaadin-button>
  <vaadin-button>
   Crear sección
  </vaadin-button>
  <vaadin-button>
   Eliminar sección
  </vaadin-button>
  <vaadin-button>
   Cambiar nombre a sección
  </vaadin-button>
  <vaadin-button>
   Gestión periodistas
  </vaadin-button>
  <vaadin-button>
   Ver lista de periodistas
  </vaadin-button>
  <vaadin-button>
   Añadir datos periodista
  </vaadin-button>
  <vaadin-button>
   Gestionar portada
  </vaadin-button>
  <vaadin-button>
   Añadir nueva posición portada
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
