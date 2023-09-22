# Especificación de Requisitos de Software (SRS) - Ticket Management System

## Introducción

El sistema de gestión de tickets es una aplicación diseñada para administrar el flujo de tickets de soporte técnico. Permite a los usuarios crear, actualizar y consultar tickets de soporte para rastrear problemas y su resolución. El propósito de este SRS es definir los requisitos funcionales y no funcionales del sistema.

### Objetivos

El objetivo principal del sistema de gestión de tickets es proporcionar una plataforma eficiente para la gestión de problemas y solicitudes de soporte técnico. Los objetivos específicos incluyen:

1. Permitir a los usuarios crear nuevos tickets con información detallada sobre el problema.
2. Facilitar la actualización y seguimiento de los tickets a través de diferentes estados.
3. Proporcionar una interfaz de usuario intuitiva y fácil de usar.
4. Registrar y mantener un historial de todos los tickets y sus cambios.
5. Asignar tickets a miembros del equipo de soporte técnico.
6. Generar informes y métricas relacionados con la gestión de tickets.

## Requisitos Funcionales

### Registro de Usuario

- **RF-1**: El sistema debe permitir a los usuarios registrarse proporcionando información básica, como nombre de usuario, contraseña, dirección de correo electrónico y detalles de contacto.

### Inicio de Sesión

- **RF-2**: Los usuarios registrados deben poder iniciar sesión en el sistema utilizando su nombre de usuario y contraseña.

### Creación de Tickets

- **RF-3**: Los usuarios autenticados deben poder crear nuevos tickets proporcionando información como título, descripción, prioridad y categoría del problema.

### Actualización de Tickets

- **RF-4**: Los usuarios deben poder actualizar los detalles de un ticket existente, incluyendo su estado y asignación.

### Consulta de Tickets

- **RF-5**: Los usuarios deben poder buscar y consultar tickets existentes utilizando criterios como número de ticket, estado, prioridad, asignación y fecha de creación.

### Cambio de Estado de Tickets

- **RF-6**: Los usuarios autorizados deben poder cambiar el estado de un ticket entre los siguientes: "Not Started," "In Progress," "Pending Customer," "Pending Vendor," "Validated," "Escalated," "Closed."

### Asignación de Tickets

- **RF-7**: Los usuarios con privilegios adecuados deben poder asignar tickets a miembros específicos del equipo de soporte técnico.

### Generación de Informes

- **RF-8**: El sistema debe permitir la generación de informes y métricas relacionados con la gestión de tickets.

## Requisitos No Funcionales

### Usabilidad

- **RNF-1**: La interfaz de usuario debe ser intuitiva y fácil de usar, con una curva de aprendizaje mínima.
- **RNF-2**: El sistema debe ser accesible desde múltiples dispositivos y navegadores web modernos.

### Rendimiento

- **RNF-3**: El sistema debe ser capaz de manejar una carga de trabajo significativa sin degradación del rendimiento.
- **RNF-4**: Las consultas de búsqueda de tickets deben ser eficientes y proporcionar resultados rápidos.

### Seguridad

- **RNF-5**: Los datos de usuario y los tickets deben estar protegidos mediante autenticación y autorización adecuadas.
- **RNF-6**: Se deben implementar medidas de seguridad para prevenir ataques de seguridad, como inyección SQL y ataques de fuerza bruta.

## Conclusiones

Este SRS define los requisitos funcionales y no funcionales del sistema de gestión de tickets. Se espera que el sistema proporcione una solución eficiente para la gestión de tickets de soporte técnico y contribuya a la mejora de la eficiencia y la satisfacción del cliente.
