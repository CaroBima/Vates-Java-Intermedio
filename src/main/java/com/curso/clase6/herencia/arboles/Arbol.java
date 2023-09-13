package com.curso.clase6.herencia.arboles;

public class Arbol {
    private String nombre;
    private int edad;

    public String mostrarInfo(){
        return "Arbol: " + nombre + ", edad: " + edad;
    }

    public String mostrarFruta(){
        return null;
    }

    public Arbol(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
