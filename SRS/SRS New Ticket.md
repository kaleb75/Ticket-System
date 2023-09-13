# Especificación de Requisitos de Software (SRS)

## CreateTicket - Sistema de Tickets

### 1. Introducción

#### 1.1 Propósito

El propósito de este documento es definir los requisitos funcionales y no funcionales para el sistema "CreateTicket", que es parte de un sistema de tickets para el seguimiento de problemas y solicitudes en una organización.

#### 1.2 Alcance

El sistema "CreateTicket" permite a los usuarios crear nuevos tickets para informar sobre problemas o solicitar asistencia. Este sistema se enfoca en la creación de nuevos tickets y su registro en una base de datos.

### 2. Requisitos Funcionales

#### 2.1 Creación de Ticket

##### 2.1.1 Descripción

El sistema debe permitir a los usuarios crear nuevos tickets proporcionando la siguiente información:

- Número de Reloj (Clock Number): Un campo de texto donde el usuario ingresa su número de reloj.
- Título (Title): Un campo de texto para especificar el título del ticket.
- Prioridad (Priority): Un menú desplegable que permite al usuario seleccionar la prioridad del ticket.
- Tiempo Estimado (Estimated Time): Un campo donde se puede seleccionar la fecha y hora estimada de resolución.
- Descripción (Description): Un área de texto donde el usuario puede proporcionar detalles sobre el problema o la solicitud.

##### 2.1.2 Comportamiento

- El sistema debe permitir al usuario ingresar un número de reloj válido.
- El sistema debe validar que se haya proporcionado un título para el ticket.
- El sistema debe validar que se haya seleccionado una prioridad válida.
- El sistema debe permitir al usuario seleccionar una fecha y hora estimada válida.
- El sistema debe permitir al usuario proporcionar una descripción detallada del problema o la solicitud.
- Cuando se crea un nuevo ticket, se registra en una base de datos.

##### 2.1.3 Interfaz de Usuario

El sistema debe proporcionar una interfaz de usuario que incluye los siguientes elementos:

- Etiquetas y campos de entrada para el número de reloj, título, prioridad, tiempo estimado y descripción.
- Un botón "Generate" para crear el ticket.
- Un botón "<-Go Back Menu" para regresar al menú principal.
- Una etiqueta que muestra la fecha actual.

#### 2.2 Conexión a la Base de Datos

##### 2.2.1 Descripción

El sistema debe ser capaz de conectarse a una base de datos para registrar los tickets creados por los usuarios.

##### 2.2.2 Comportamiento

- El sistema debe establecer una conexión con la base de datos de Access.
- Debe insertar los detalles del ticket en la base de datos, incluyendo el número de reloj, título, prioridad, tiempo estimado y descripción.
- Debe asignar un identificador único al ticket.

#### 2.3 Obtener el Último ID de Ticket

##### 2.3.1 Descripción

El sistema debe ser capaz de obtener el último ID de ticket registrado en la base de datos.

##### 2.3.2 Comportamiento

- El sistema debe consultar la base de datos para obtener el último ID de ticket.
- Debe mostrar el último ID de ticket generado al usuario.

### 3. Requisitos No Funcionales

#### 3.1 Interfaz de Usuario

- La interfaz de usuario debe ser intuitiva y fácil de usar.
- Debe tener un diseño responsivo que se adapte a diferentes tamaños de pantalla.
- Debe proporcionar retroalimentación clara al usuario sobre la creación exitosa de un ticket.

#### 3.2 Conexión a la Base de Datos

- El sistema debe ser robusto y manejar conexiones a la base de datos de manera segura.
- Debe manejar errores de conexión y proporcionar mensajes de error claros en caso de problemas.

#### 3.3 Seguridad

- El sistema debe implementar medidas de seguridad para proteger la información de los usuarios.
- Debe autenticar a los usuarios antes de permitirles crear tickets.

### 4. Restricciones

- El sistema está diseñado para funcionar con una base de datos de Access ubicada en la ruta "C:\Users\imx078856\Documents\BDTickets.accdb".

### 5. Referencias

- Este sistema se basa en el código proporcionado.

### 6. Historial de Cambios

- [Fecha]: [Descripción del Cambio]

### 7. Aprobación

Este documento ha sido revisado y aprobado por:

[Firma del Responsable de Proyecto]

[Nombre del Responsable de Proyecto]

[Título del Responsable de Proyecto]

[Fecha de Aprobación]
