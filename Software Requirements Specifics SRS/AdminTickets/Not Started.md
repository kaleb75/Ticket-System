# Especificación de Requisitos de Software (SRS) - NotStarted

## 1. Introducción
El software "NotStarted" es una aplicación de gestión de tickets que forma parte de un sistema más grande. Su objetivo principal es mostrar tickets con estado "Not Started", permitir la cancelación de tickets seleccionados y proporcionar acceso a una base de datos de tickets. Este documento describe los requisitos funcionales y no funcionales del software.

## 2. Requisitos Funcionales
### 2.1 Visualización de Tickets
- El sistema debe mostrar una tabla que incluye los siguientes campos:
  - IDTicket: Identificador único del ticket.
  - ClockNumber: Número de reloj asociado al ticket.
  - Date: Fecha de creación del ticket.
  - Title: Título del ticket.
  - Priority: Prioridad del ticket.
  - Status: Estado actual del ticket.
  - Assigned: Asignado a un usuario o grupo.
  - ETS: Fecha esperada de solución (puede estar en blanco o contener una fecha).
  - Description: Descripción detallada del ticket.
  - Documentacion: Documentación relacionada con el ticket.
- Los tickets mostrados deben tener el estado "Not Started".
- Los datos de la tabla deben cargarse desde una base de datos.

### 2.2 Cancelación de Tickets
- El sistema debe permitir la selección de uno o varios tickets en la tabla.
- Se debe proporcionar un botón de "Cancelar" que permita cancelar los tickets seleccionados.
- Al cancelar un ticket, su estado debe cambiarse a "Cancelled" en la base de datos.
- El sistema debe mostrar un mensaje de éxito después de cancelar los tickets.

### 2.3 Acceso a la Base de Datos
- La aplicación debe tener acceso a una base de datos de tickets ubicada en "C:\Users\imx078856\Documents\GitHub\Ticket-System\BD\BDTickets-System.accdb".
- Debe establecerse una conexión con la base de datos para cargar y actualizar los datos.

### 2.4 Interfaz de Usuario
- El sistema debe tener una interfaz de usuario que incluye la tabla de tickets y los botones de "Cancelar" y "Volver al Menú Principal".
- La interfaz debe maximizarse a pantalla completa, ser centrada en la pantalla y tener un título "Not Started Tickets".

## 3. Requisitos No Funcionales
### 3.1 Rendimiento
- La aplicación debe cargar y mostrar los datos de los tickets de manera eficiente incluso cuando la base de datos contiene una cantidad significativa de registros.

### 3.2 Fiabilidad
- La aplicación debe manejar errores de conexión a la base de datos de manera adecuada y mostrar mensajes de error al usuario en caso de fallas.

### 3.3 Usabilidad
- La interfaz de usuario debe ser intuitiva y fácil de usar para que los usuarios puedan realizar las acciones necesarias de manera eficiente.

## 4. Consideraciones de Desarrollo
- El software está desarrollado en Java y utiliza bibliotecas Swing para la interfaz de usuario.
- Se asume que la base de datos de tickets está en la ubicación especificada.

## 5. Conclusiones
La Especificación de Requisitos de Software (SRS) proporciona una descripción detallada de los requisitos funcionales y no funcionales del software "NotStarted". Este documento es fundamental para guiar el proceso de desarrollo y asegurar que el software cumpla con las expectativas y necesidades del usuario.
