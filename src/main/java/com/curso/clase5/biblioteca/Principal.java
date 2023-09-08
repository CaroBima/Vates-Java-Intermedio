package com.curso.clase5.biblioteca;

/*
Imagina que estás desarrollando un sistema de gestión de una biblioteca. Debes crear una jerarquía de clases que
represente los diferentes tipos de elementos de la biblioteca, como libros y revistas. Aquí tienes los requisitos:

1. Crea una clase base llamada `ItemBiblioteca` que tenga los siguientes atributos:
   - Título del elemento
   - Número de identificación
   - Año de publicación

2. Crea dos subclases: `Libro` y `Revista`, que hereden de `ItemBiblioteca`.

3. En la clase `Libro`, agrega un atributo adicional:
   - Autor del libro

4. En la clase `Revista`, agrega un atributo adicional:
   - Número de edición

5. Implementa un constructor en la clase base `ItemBiblioteca` para inicializar los atributos comunes.

6. Implementa constructores en las subclases `Libro` y `Revista` para inicializar sus atributos específicos, además de
 llamar al constructor de la clase base.

7. En todas las clases, agrega un método `imprimirDetalles` que muestre por pantalla los detalles específicos de cada
tipo de elemento de la biblioteca, incluyendo los atributos comunes.

8. En el programa principal (el método `main`), crea varios objetos de tipo `Libro` y `Revista`, utilizando los
constructores de las clases respectivas. Luego, llama al método `imprimirDetalles` de cada objeto para mostrar sus detalles.
 */
public class Principal {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", 1L, 1965, "Gabriel Garcia Marquez");
        Libro libro2 = new Libro("Las malas", 2L, 2020, "Camila Sosa Villada");
        Libro libro3 = new Libro("El principito", 3L, 1943, "Antoine de Saint-Exupéry");
        Libro libro4 = new Libro("Lo que me costó el amor de Laura", 4L, 1983, "Alejandro Dolina");

        Revista revista1 = new Revista("Revistuli", 1L, 2023, 12 );
        Revista revista2 = new Revista("Revistacea", 2L, 1975, 1 );
        Revista revista3 = new Revista("Otra revista", 8L, 2021, 123 );
        Revista revista4 = new Revista("Otra revista más", 1654L, 2023, 45 );

        libro1.imprimirDetalles();
        libro2.imprimirDetalles();
        libro3.imprimirDetalles();
        libro4.imprimirDetalles();

        revista1.imprimirDetalles();
        revista2.imprimirDetalles();
        revista3.imprimirDetalles();
        revista4.imprimirDetalles();
    }


}
