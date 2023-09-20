package com.curso.clase8;

public class Aguila extends Animal implements Aereos, Mascota{ //el aguila vuela y emite sonidos, implementa ambos


    @Override
    public void volar() {

    }

    @Override
    public String hablar() {
        return null;
    }


    public Aguila(String nombre, String especie) {
        super(nombre, especie);
    }
}
