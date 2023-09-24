# Vates-Java-Intermedio
Repositorio del curso de Java Intermedio realizado en Vates, dictado por Luis Soto (Decode Programación)

## Temario
### Módulo I: Reforzando Fundamentos y Practicando en Java
1. Repaso de Programación Orientada a Objetos (POO) con ejercicios
2. Uso avanzado de variables y tipos de datos
3. Operadores y control de flujo con ejemplos prácticos
4. Trabajo con clases y objetos: ejercicios de aplicación
5. Métodos constructores y sobrecarga: ejemplos y práctica
6. Herencia y relaciones de clases en ejercicios
### Módulo II: Dominando la Programación en Java 8
1. Introducción a las características de Java 8 (streams, lambdas, etc.)
2. Uso de expresiones lambda en aplicaciones prácticas
3. Trabajo con Streams y operaciones de colecciones
4. Aplicación de interfaces funcionales en ej
5. Uso de API de fecha y tiempo en Java 8
### Módulo III: Optimización y Prácticas Avanzadas
1. Utilización de colecciones avanzadas: Listas, conjuntos y mapas
2. Implementación de algoritmos de búsqueda y ordenación
3. Mejora de código y prácticas de limpieza
4. Manejo avanzado de excepciones y estrategias de manejo
5. Uso de Java Collections Framework en ejercicios
### Módulo IV: Construyendo Aplicaciones Prácticas con Spring Boot
1. Introducción a Spring Boot y sus ventajas
2. Creación de proyectos Spring Boot y configuración básica
3. Desarrollo de controladores y endpoints REST
4. Uso de anotaciones como @RequestMapping y @RestController
5. Manejo de peticiones HTTP con Spring MVC
### Módulo V: Conectando con el Mundo Exterior usando Spring Boot
1. Uso de Spring Data para interactuar con bases de datos
2. Introducción a la lectura y escritura en bases de datos con JPA
3. Interacción con APIs externas a través de llamadas HTTP
4. Uso de librerías externas y manejo de dependencias en Spring Boot
5. Creación de aplicaciones prácticas utilizando Spring Boot y conectividad externa

## Ejercicios:

| Clase|                                                          Solicitado                                                  |                                                                                                Solución                                                                                         |
|:---:|:--------------------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
|  1  | - Diseña una clase "Empleado" que contenga propiedades como nombre, salario, y un método para calcular el aumento de salario. </br> - Crea una clase "Triángulo" con propiedades para los tres lados y un método para determinar si es equilátero, isósceles o escaleno. </br> - Extiende la clase "Círculo" para implementar una interfaz "FiguraGeometrica" con métodos para calcular el área y perímetro. </br> - Diseña una clase "Producto" con propiedades como nombre, precio y cantidad en inventario, y métodos para calcular el valor total. </br> - Crea una clase "EmpleadoHora" que calcule el salario semanal en base a las horas trabajadas y la tarifa por hora. | [Solución](https://github.com/CaroBima/Vates-Java-Intermedio/tree/main/src/main/java/com/curso/clase1)                |
|  2 |  - Desarrolla un programa que simule un cajero automático. Permite al usuario realizar  depósitos, retiros y consultar su saldo. Lleva un registro de las transacciones. </br> - Crea un juego de adivinanza donde la computadora elige una palabra al azar y muestra una serie de guiones bajos representando las letras. El jugador debe adivinar la palabra letra por letra. </br> - Escribe un programa que genere una tabla de multiplicar del 1 al 10 para un número ingresado por el usuario. | [Solución](https://github.com/CaroBima/Vates-Java-Intermedio/tree/main/src/main/java/com/curso/clase2)  |
|  3 | - Dado un array de string mostrar solo la cadena de caracteres que sean impares | [Solución](https://github.com/CaroBima/Vates-Java-Intermedio/tree/main/src/main/java/com/curso/clase3/operadores) |
| 4 | - Crea un sistema simple de gestión de cursos para una escuela. Deberás definir tres clases: Estudiante, Curso, y Profesor. En el programa principal (el método main), crea varios objetos de tipo Estudiante, Curso, y Profesor, y realiza las siguientes operaciones:</br>Crea al menos 3 estudiantes, 2 profesores y 4 cursos.</br>Inscribe a los estudiantes en los cursos.</br>Asigna cursos a los profesores.</br>Muestra la información de los cursos y de los estudiantes. | [Solución](https://github.com/CaroBima/Vates-Java-Intermedio/tree/main/src/main/java/com/curso/clase4/gestion/escuelas) |
| 5 | Imagina que estás desarrollando un sistema de gestión de una biblioteca. Debes crear una jerarquía de clases que represente los diferentes tipos de elementos de la biblioteca, como libros y revistas. Aquí tienes los requisitos:</br>1. Crea una clase base llamada `ItemBiblioteca` que tenga los siguientes atributos:</br>     - Título del elemento</br>     - Número de identificación</br>     - Año de publicación</br>2. Crea dos subclases: `Libro` y `Revista`, que hereden de `ItemBiblioteca`.</br> 3. En la clase `Libro`, agrega un atributo adicional:</br>- Autor del libro</br>4. En la clase `Revista`, agrega un atributo adicional:</br>     - Número de edición</br>5. Implementa un constructor en la clase base `ItemBiblioteca` para inicializar los atributos comunes.</br>6. Implementa constructores en las subclases `Libro` y `Revista` para inicializar sus atributos específicos, además de llamar al constructor de la clase base.</br>7. En todas las clases, agrega un método `imprimirDetalles` que muestre por pantalla los detalles específicos de cada tipo de elemento de la biblioteca, incluyendo los atributos comunes.</br>8. En el programa principal (el método `main`), crea varios objetos de tipo `Libro` y `Revista`, utilizando los constructores de las clases respectivas. Luego, llama al método `imprimirDetalles` de cada objeto para mostrar sus detalles.|[Solución](https://github.com/CaroBima/Vates-Java-Intermedio/tree/main/src/main/java/com/curso/clase5/biblioteca)|
| 7 | Gestión de Empleados</br>Crea una clase Empleado con las siguientes propiedades: nombre, salario base mensual, y un método calcularSalarioMensual() que devuelve el salario base. Luego, crea dos subclases de Empleado: Gerente y Vendedor. </br>Para la clase Gerente, agrega las propiedades de bono mensual y número de subordinados. Sobrescribe el método calcularSalarioMensual() para que incluya el bono en el salario.</br>Para la clase Vendedor, agrega las propiedades de comisión mensual y ventas mensuales. Sobrescribe el método calcularSalarioMensual() para calcular el salario base más la comisión en función de las ventas.</br>Finalmente, en la clase principal (Main), crea instancias de varios empleados, incluyendo gerentes y vendedores, y calcula sus salarios mensuales. Luego, muestra los detalles de todos los empleados y resalta quiénes ganaron más de $5,000 al mes.</br>Este ejercicio permite practicar la herencia, la sobrescritura de métodos y el uso de clases abstractas o interfaces para representar a los empleados y calcular sus salarios. | [Solución](https://github.com/CaroBima/Vates-Java-Intermedio/tree/main/src/main/java/com/curso/clase7/java8/gestionEmpleados) |
| 9 | Cálculo de Impuestos con Streams, Lambdas y Operaciones Ternarias.</br>Crea una clase CalculadorImpuestos que contenga un programa principal (main). En este programa, tienes una lista de montos representados como valores decimales en dólares (por ejemplo, 1000.0, 2500.0, 800.0, 4500.0, ...., 4567.00) almacenados en una lista. </br>Debes utilizar Java 8 Streams, expresiones lambda y operaciones ternarias para realizar el cálculo de impuestos sobre los montos de la siguiente manera:</br>- Si el monto es igual o menor a $1000, se aplica una tasa de impuestos del 17%. </br>- Si el monto es mayor a $1000, se aplica la misma tasa de 17% y sobre el resultado una tasa de impuestos adicional del 5%. | [Solución](https://github.com/CaroBima/Vates-Java-Intermedio/tree/main/src/main/java/com/curso/clase9/interfaces/funcionales/calculadorImpuestos) |

## Ejercicios extra
| Clase|                                                          Solicitado                                                  |                                                                                                Solución                                                                                         |
|:---:|:--------------------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
|  1  | -Supongamos que estás desarrollando un programa para una tienda en línea que vende productos electrónicos. Tienes una lista de objetos Producto que representan los productos en stock. Cada objeto Producto  tiene los siguientes atributos:<br/> - nombre (String): El nombre del producto.<br/> - precio (double): El precio del producto.<br/> - categoria (String): La categoría a la que pertenece el producto (por ejemplo, "smartphone", "laptop", "tablet", etc.).<br/> - disponible (boolean): Un indicador de si el producto está disponible para la venta.<br/>Tu tarea es realizar las siguientes operaciones utilizando programación funcional:<br/>-Filtrar los productos disponibles y que pertenecen a la categoría "smartphone".<br/>-Calcular el precio promedio de los smartphones disponibles.<br/>-Crear una lista de los nombres de los smartphones disponibles y ordenarla alfabéticamente.<br/>-Eliminar los nombres duplicados de los smartphones disponibles.<br/>-Contar cuántos smartphones únicos están disponibles.<br/>-Imprimir en la consola los nombres de los smartphones disponibles en orden alfabético. | [Solución](https://github.com/CaroBima/Vates-Java-Intermedio/tree/main/src/main/java/com/curso/practicasChatGpt/tiendaOnline)                |
