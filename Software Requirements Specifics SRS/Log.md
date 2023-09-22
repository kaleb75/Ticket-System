# Especificación de Requisitos de Software (SRS)

## Introducción
El Sistema de Inicio de Sesión es una aplicación diseñada para gestionar el acceso de usuarios a una plataforma. Permite a los usuarios ingresar sus credenciales, validarlas en una base de datos y otorgar acceso a diferentes niveles de usuarios según su rol. Este documento describe los requisitos funcionales y no funcionales del Sistema de Inicio de Sesión.

## Requisitos Funcionales

### RF01: Interfaz de Inicio de Sesión
El sistema debe proporcionar una interfaz de usuario que permita a los usuarios ingresar sus credenciales.

### RF02: Validación de Credenciales
El sistema debe verificar las credenciales del usuario (nombre de usuario y contraseña) en una base de datos.

### RF03: Acceso a Niveles de Usuario
El sistema debe permitir el acceso a diferentes niveles de usuario según su rol. Los niveles de usuario son "Administrador" y "Usuario".

### RF04: Mensajes de Acceso
El sistema debe mostrar mensajes de acceso concedido o denegado según la validación de las credenciales.

### RF05: Seguridad de Contraseñas
El sistema debe garantizar la seguridad de las contraseñas almacenadas en la base de datos utilizando técnicas de almacenamiento seguro.

### RF06: Bloqueo de Acceso
El sistema debe bloquear el acceso después de un número específico de intentos fallidos de inicio de sesión.

## Requisitos No Funcionales

### RNF01: Interfaz de Usuario Intuitiva
La interfaz de usuario debe ser intuitiva y fácil de usar para los usuarios.

### RNF02: Rendimiento
El sistema debe tener un rendimiento eficiente al validar las credenciales y al mostrar mensajes de acceso.

### RNF03: Seguridad
El sistema debe garantizar la seguridad de las credenciales almacenadas y de las comunicaciones durante el proceso de inicio de sesión.

### RNF04: Portabilidad
El sistema debe ser compatible con múltiples plataformas y navegadores web.

## Conclusiones
Este documento de Especificación de Requisitos de Software (SRS) describe los requisitos funcionales y no funcionales del Sistema de Inicio de Sesión. El sistema proporciona una interfaz de usuario intuitiva, valida las credenciales de los usuarios, otorga acceso a diferentes niveles de usuario y garantiza la seguridad de las contraseñas almacenadas. Además, cumple con requisitos de rendimiento, seguridad y portabilidad.
