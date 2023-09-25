# Especificación de Requisitos de Software (SRS)

---

## 1. Introducción

El presente documento describe los requisitos de software para la aplicación "User Manager" desarrollada en Java. Esta aplicación proporciona una interfaz de usuario para la gestión de usuarios en un sistema.

## 2. Requisitos Funcionales

### 2.1. Creación de Usuarios

- **Descripción:** La aplicación permite la creación de nuevos usuarios.
- **Entradas:**
  - Nombre del usuario
  - Apellido del usuario
  - Nombre de usuario
  - Contraseña
  - Número de reloj
  - Departamento
- **Proceso:**
  - Los datos del nuevo usuario se ingresan a través de la interfaz de usuario.
- **Salida:** El nuevo usuario se crea y almacena en la base de datos.

### 2.2. Búsqueda de Usuarios

- **Descripción:** La aplicación permite buscar usuarios en la base de datos.
- **Entradas:** Se pueden utilizar varios criterios para la búsqueda, incluyendo:
  - Nombre
  - Apellido
  - Número de reloj
- **Proceso:**
  - La aplicación realiza una búsqueda en la base de datos según los criterios especificados.
- **Salida:** Los resultados de la búsqueda se muestran en la interfaz de usuario.

### 2.3. Edición de Usuarios

- **Descripción:** La aplicación permite editar la información de un usuario existente.
- **Entradas:**
  - Datos actualizados del usuario
- **Proceso:**
  - Se selecciona un usuario existente y se actualizan sus datos a través de la interfaz de usuario.
- **Salida:** Los datos del usuario se actualizan en la base de datos.

### 2.4. Eliminación de Usuarios

- **Descripción:** La aplicación permite eliminar usuarios existentes.
- **Entradas:**
  - Selección de usuarios a eliminar
- **Proceso:**
  - Se seleccionan los usuarios que se desean eliminar y se confirma la eliminación.
- **Salida:** Los usuarios seleccionados se eliminan de la base de datos.

## 3. Requisitos No Funcionales

### 3.1. Interfaz de Usuario

- La interfaz de usuario debe ser intuitiva y fácil de usar.
- Debe seguir las prácticas de diseño de usuario.

### 3.2. Rendimiento

- La aplicación debe tener un rendimiento eficiente al realizar búsquedas y operaciones de edición/eliminación de usuarios.

### 3.3. Seguridad

- Los datos de los usuarios, incluyendo contraseñas, deben almacenarse de manera segura en la base de datos.

## 4. Requisitos de Sistema

- Sistema Operativo: Plataformas compatibles con Java.
- Base de Datos: Se utiliza una base de datos Microsoft Access.

## 5. Conclusiones

Este documento describe los requisitos funcionales y no funcionales de la aplicación "User Manager". Estos requisitos son la base para el desarrollo exitoso de la aplicación.

---

# Software Requirements Specification (SRS)

---

## 1. Introduction

This document describes the software requirements for the "User Manager" application developed in Java. This application provides a user interface for user management within a system.

## 2. Functional Requirements

### 2.1. User Creation

- **Description:** The application allows the creation of new users.
- **Inputs:**
  - User's first name
  - User's last name
  - Username
  - Password
  - Clock number
  - Department
- **Process:**
  - New user data is entered through the user interface.
- **Output:** The new user is created and stored in the database.

### 2.2. User Search

- **Description:** The application allows users to be searched in the database.
- **Inputs:** Various criteria can be used for the search, including:
  - First name
  - Last name
  - Clock number
- **Process:**
  - The application performs a search in the database based on the specified criteria.
- **Output:** Search results are displayed in the user interface.

