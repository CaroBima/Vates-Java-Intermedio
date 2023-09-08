package com.curso.clase5.biblioteca;
/*
1. Crea una clase base llamada `ItemBiblioteca` que tenga los siguientes atributos:
        - Título del elemento
        - Número de identificación
        - Año de publicación

5. Implementa un constructor en la clase base `ItemBiblioteca` para inicializar los atributos comunes.
*/
public abstract class ItemBiblioteca {
    private String titulo;
    private Long id;
    private  int anioPublicacion;

    public void imprimirDetalles(){
        System.out.println("ID: " + this.id);
        System.out.println("Título: " + this.titulo);
        System.out.println("Año de publicación: " + this.anioPublicacion);
    }

    //constructores
    public ItemBiblioteca(String titulo, Long id, int anioPublicacion) {
        this.titulo = titulo;
        this.id = id;
        this.anioPublicacion = anioPublicacion;
    }
}
