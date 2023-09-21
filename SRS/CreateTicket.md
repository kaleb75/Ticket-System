# Especificación de Requisitos de Software (SRS)

## Introducción
El Sistema de Creación de Tickets es una aplicación diseñada para permitir a los usuarios administradores crear nuevos tickets para seguimiento y resolución. Este documento describe los requisitos funcionales y no funcionales del Sistema de Creación de Tickets.

## Requisitos Funcionales

### RF01: Interfaz de Usuario de Creación de Tickets
El sistema debe proporcionar una interfaz de usuario intuitiva y fácil de usar para la creación de tickets.

### RF02: Campos de Creación de Tickets
El sistema debe permitir a los usuarios ingresar la siguiente información al crear un ticket:
- Número de Reloj (Clock Number)
- Título del Ticket
- Prioridad del Ticket
- Tiempo Estimado de Solución (ETS)
- Descripción del Ticket

### RF03: Validación de Datos
El sistema debe realizar validaciones en los datos ingresados por el usuario, incluyendo la verificación de campos obligatorios y formatos válidos.

### RF04: Generación de Tickets
El sistema debe permitir a los usuarios administradores generar un nuevo ticket con la información proporcionada.

### RF05: Registro de Fecha y Hora
El sistema debe registrar automáticamente la fecha y hora de creación de cada ticket.

## Requisitos No Funcionales

### RNF01: Interfaz de Usuario Intuitiva
La interfaz de usuario del sistema debe ser intuitiva y fácil de usar para los usuarios administradores.

### RNF02: Rendimiento
El sistema debe tener un rendimiento eficiente al crear y registrar tickets, incluso cuando se trabaja con una gran cantidad de datos.

### RNF03: Seguridad
El sistema debe garantizar la seguridad de los datos almacenados, evitando accesos no autorizados a la información de los tickets.

### RNF04: Portabilidad
El sistema debe ser compatible con múltiples plataformas y navegadores web.

## Conclusiones
Este documento de Especificación de Requisitos de Software (SRS) describe los requisitos funcionales y no funcionales del Sistema de Creación de Tickets. El sistema permite a los usuarios administradores crear tickets con información detallada, registrando automáticamente la fecha y hora de creación, y realizando validaciones de datos para garantizar la integridad de la información.
