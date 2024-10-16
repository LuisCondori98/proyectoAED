# Proyecto de Investigación - Sistema de Ventas

## Curso: Algoritmos y Estructura de Datos
- **Semestre**: 2024
- **Ciclo**: Segundo
- **Secciones**: Todas

## 1. Fundamentos
El curso de Algoritmos y Estructura de Datos proporciona a los alumnos las herramientas para diseñar algoritmos eficientes que resuelvan problemas de manera óptima, teniendo en cuenta el uso de recursos como la memoria y el tiempo de procesamiento.

## 2. Objetivo del Proyecto
El objetivo de este proyecto es aplicar los conceptos aprendidos en el curso para resolver un problema computacional específico. En este caso, se desarrollará un **Sistema de Ventas** para una tienda. El proyecto se iniciará con el diseño de la solución algorítmica y concluirá con la implementación en el lenguaje de programación Java.

## 3. Integrantes
El proyecto será desarrollado en grupos. Cada grupo estará compuesto por varios integrantes que trabajarán en conjunto hasta la finalización del curso, sin posibilidad de cambios. Cada grupo elegirá un coordinador.

## 4. Definición del Proyecto: Sistema de Ventas
El sistema de ventas incluirá los siguientes módulos principales:
- **Mantenimiento**: Gestión de clientes y productos.
- **Ventas**: Registro y gestión de ventas.
- **Almacén**: Control de stock.
- **Reportes**: Generación de reportes diversos.

### 4.1. Clases del Proyecto
El proyecto contará con las siguientes clases principales:

#### Clase Cliente
| Atributo       | Tipo   | Observación                                |
| -------------- | ------ | ------------------------------------------ |
| codigoCliente  | int    | Autogenerado, comienza en 1001              |
| nombres        | String |                                            |
| apellidos      | String |                                            |
| dirección      | String |                                            |
| teléfono       | String |                                            |
| dni            | String |                                            |

#### Clase Producto
| Atributo       | Tipo   | Observación                                |
| -------------- | ------ | ------------------------------------------ |
| codigoProducto | int    | Autogenerado, comienza en 2001              |
| nombre         | String |                                            |
| precio         | double |                                            |
| stockActual    | int    |                                            |
| stockMinimo    | int    |                                            |
| stockMaximo    | int    |                                            |

#### Clase Venta
| Atributo       | Tipo   | Observación                                |
| -------------- | ------ | ------------------------------------------ |
| codigoVenta    | int    | Autogenerado, comienza en 3001              |
| codigoCliente  | int    |                                            |
| codigoProducto | int    |                                            |
| cantidad       | int    |                                            |
| precio         | double |                                            |
| fecha          | String | Formato: mm/dd/aaaa                        |

### 4.2. Menú Principal
El sistema contará con un menú principal que ofrecerá las siguientes opciones:
- Mantenimiento
- Ventas
- Almacén
- Reportes

### 4.3. Mantenimiento
En la sección de mantenimiento, se podrán realizar las siguientes operaciones tanto para **Clientes** como para **Productos**:
- Ingreso
- Modificación
- Consulta
- Eliminación
- Listado

## 5. Implementación
El sistema será implementado en **Java**, aplicando los principios y estructuras de datos estudiados durante el curso.

## 6. Colaboradores
- [Nombre del Coordinador]
- [Nombres de los demás integrantes del grupo]
