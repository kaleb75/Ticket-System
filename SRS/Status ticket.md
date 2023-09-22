# Especificación de Requisitos de Software (SRS) - StatusTicket

## 1. Introducción
La aplicación "StatusTicket" es una herramienta de visualización de información de tickets que forma parte de un sistema de gestión de tickets más amplio. El propósito principal de esta aplicación es mostrar detalles específicos de un ticket seleccionado por su número de identificación. Este documento describe los requisitos funcionales y no funcionales del software "StatusTicket".

## 2. Requisitos Funcionales
### 2.1 Visualización de Detalles de Tickets
- El sistema debe mostrar los detalles de un ticket específico seleccionado por su número de identificación (IDTicket).
- Los detalles a mostrar incluyen:
  - Título del ticket (Title).
  - Estado actual del ticket (Status).
  - Fecha esperada de solución (ETS) o un campo en blanco si no está especificada.
  - Documentación relacionada con el ticket.

### 2.2 Búsqueda de Ticket
- La aplicación debe permitir al usuario ingresar el número de ticket que desea buscar.
- Al presionar el botón "Search", se deben mostrar los detalles del ticket correspondiente.

### 2.3 Interfaz de Usuario
- La interfaz de usuario debe contener elementos como etiquetas de texto, campos de texto y botones para facilitar la búsqueda y visualización de detalles del ticket.
- Debe haber un botón "MENU" para permitir al usuario regresar al menú principal de usuario.

## 3. Requisitos No Funcionales
### 3.1 Interfaz de Usuario Intuitiva
- La interfaz de usuario debe ser fácil de entender y utilizar, incluso para usuarios no técnicos.
- Los elementos de la interfaz deben estar claramente etiquetados.

### 3.2 Rendimiento
- La aplicación debe responder de manera rápida y eficiente al buscar y mostrar detalles de los tickets.
- Debe manejar adecuadamente la conexión a la base de datos y mostrar mensajes de error en caso de problemas.

## 4. Consideraciones de Desarrollo
- El software está desarrollado en Java utilizando el framework Swing para la interfaz de usuario.
- Se asume que la base de datos de tickets está ubicada en "C:\Users\imx078856\Documents\GitHub\Ticket-System\BD\BDTickets-System.accdb".

## 5. Conclusiones
Esta Especificación de Requisitos de Software (SRS) proporciona una descripción detallada de los requisitos funcionales y no funcionales del software "StatusTicket". El documento sirve como guía para el desarrollo y asegura que la aplicación cumple con las necesidades del usuario.
