package com.curso.clase8;

public class Perro extends Animal implements Mascota{
    private String raza;

    @Override
    public String hablar() {
        return null;
    }

    //constructor
    public Perro(String nombre, String especie, String raza) {
        super(nombre, especie);
        this.raza = raza;
    }


}
