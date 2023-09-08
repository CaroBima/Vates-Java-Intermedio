package com.curso.clase5.biblioteca;

/*
3. En la clase `Libro`, agrega un atributo adicional:
   - Autor del libro
 */
public class Libro extends ItemBiblioteca{
    private String autor;


    public Libro(String titulo, Long id, int anioPublicacion, String autor) {
        super(titulo, id, anioPublicacion);
        this.autor = autor;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();

        System.out.println("Autor: " + this.autor);
        System.out.println("----------------------------");
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
