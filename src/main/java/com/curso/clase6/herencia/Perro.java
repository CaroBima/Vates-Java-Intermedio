package com.curso.clase6.herencia;

public class Perro extends Animal{
    String raza;


    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
}
