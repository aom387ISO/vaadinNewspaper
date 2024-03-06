import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

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
  <vaadin-button id="personalizar">
    Personalizar perfil 
  </vaadin-button>
  <vaadin-button id="buscarNoticia">
    Buscar noticia 
  </vaadin-button>
  <vaadin-button id="verSeccion">
    Ver sección 
  </vaadin-button>
  <vaadin-button id="verNoticia">
    Ver noticia 
  </vaadin-button>
  <vaadin-button id="verComentarios">
    Ver comentarios 
  </vaadin-button>
  <vaadin-button id="verListadoSec">
    Ver listado secciones 
  </vaadin-button>
  <vaadin-button id="verListadoNot">
    Ver listado noticias 
  </vaadin-button>
  <vaadin-text-area label="Write a description" placeholder="Add detailed explanation" id="textoBuscar"></vaadin-text-area>
 </vaadin-vertical-layout>
 <div>
   Div 
 </div>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button id="personalizarSuscrito">
    Personalizar perfil como usuario suscrito 
  </vaadin-button>
 </vaadin-vertical-layout>
 <div>
   Div 
 </div>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button id="gestionPeriodista">
    Gestión periodista 
  </vaadin-button>
  <vaadin-button id="introducirDatosNoticia">
    Introducir datos noticia 
  </vaadin-button>
  <vaadin-button id="verNoticiasPropias">
    Ver noticias propias 
  </vaadin-button>
  <vaadin-button id="modificarNoticiasPrevias">
    Modificar noticias previas 
  </vaadin-button>
  <vaadin-button id="modificarNoticiaIndividual">
    Modificiar noticia individual 
  </vaadin-button>
  <vaadin-button id="elegirNoticia">
    Elegir noticia 
  </vaadin-button>
 </vaadin-vertical-layout>
 <div>
   Div 
 </div>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button id="gestionEditor">
    Gestión editor 
  </vaadin-button>
  <vaadin-button id="gestionarComoEditor">
    Gestionar noticia como editor 
  </vaadin-button>
  <vaadin-button id="agregarNoticiaSeccion">
    Añadir noticia a sección 
  </vaadin-button>
  <vaadin-button id="eliminarNoticiaSeccion">
    Eliminar noticia de sección 
  </vaadin-button>
  <vaadin-button id="gestionarSeccion">
    Gestionar sección 
  </vaadin-button>
  <vaadin-button id="crearSeccion">
    Crear sección 
  </vaadin-button>
  <vaadin-button id="eliminarSeccion">
    Eliminar sección 
  </vaadin-button>
  <vaadin-button id="cambiarNombreSeccion">
    Cambiar nombre a sección 
  </vaadin-button>
  <vaadin-button id="gestionPeriodistas">
    Gestión periodistas 
  </vaadin-button>
  <vaadin-button id="verPeriodistas">
    Ver lista de periodistas 
  </vaadin-button>
  <vaadin-button id="agregarDatosPeriodista">
    Añadir datos periodista 
  </vaadin-button>
  <vaadin-button id="gestionarPortada">
    Gestionar portada 
  </vaadin-button>
  <vaadin-button id="posicionPortada">
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
