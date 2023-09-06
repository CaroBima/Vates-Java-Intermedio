package com.curso.clases.objetos;

public class Auto {
    private String nombre = new String("Hola"); // va al constructor de la clase String y crea el objeto


    /**
     * Constuctor
     */
    public Auto(){}

    public Auto(String nombre){
        this.nombre = nombre;
    }
}
