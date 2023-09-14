# Especificación de Requisitos de Software (SRS) - Clase NotStarted

## Introducción
El objetivo de esta especificación de requisitos de software (SRS) es definir los requisitos funcionales y no funcionales para la implementación de la clase `NotStarted`. Esta clase tiene como finalidad filtrar los tickets de soporte con estado "Not Started" y sin asignar en una base de datos MS Access llamada "Test".

## Requisitos Funcionales

### RF01: Filtrar Tickets "Not Started"
La clase `NotStarted` deberá ser capaz de acceder a la base de datos "Test" y filtrar todos los tickets de soporte con estado "Not Started".

### RF02: Identificar Tickets Sin Asignar
La clase `NotStarted` deberá identificar los tickets de soporte que no tienen un ingeniero o técnico asignado.

### RF03: Mostrar Resultados
La clase `NotStarted` deberá mostrar los resultados del filtrado de tickets, lo que incluye la información de cada ticket encontrado.

### RF04: Interfaz de Usuario (UI)
La clase `NotStarted` deberá proporcionar una interfaz de usuario simple para que el usuario pueda interactuar con la funcionalidad de filtrado y visualización de tickets.

## Requisitos No Funcionales

### RNF01: Eficiencia
El proceso de filtrado y visualización de tickets deberá ser eficiente y no causar retrasos significativos en la respuesta al usuario.

### RNF02: Seguridad
La clase `NotStarted` deberá implementar medidas de seguridad para proteger la integridad de la base de datos y la información de los tickets.

### RNF03: Usabilidad
La interfaz de usuario deberá ser intuitiva y fácil de usar para los usuarios finales.

### RNF04: Portabilidad
La clase `NotStarted` deberá ser compatible con el entorno de ejecución de MS Access.

## Comentarios Adicionales
- La clase `NotStarted` deberá tener métodos y atributos adicionales según sea necesario para cumplir con los requisitos mencionados anteriormente.
- Se espera que la clase `NotStarted` pueda ser parte de un sistema más grande que gestiona tickets de soporte.

## Conclusiones
Esta especificación de requisitos de software (SRS) establece los requisitos clave para la implementación de la clase `NotStarted`. La implementación exitosa de esta clase permitirá filtrar y visualizar tickets de soporte "Not Started" y sin asignar en la base de datos "Test" de manera eficiente y segura.
