package com.curso.clase6.herencia.arboles;

public class Manzano extends Arbol {
    private String nombreFruta;



    public String mostrarInfo(){
        return super.mostrarInfo() + ", Nombre de la Fruta: " + nombreFruta;
    }

    public String mostrarFruta(){
        return nombreFruta;
    }

    public Manzano(String nombre, int edad) {
        super(nombre, edad);
        this.nombreFruta = "Manzano";
    }
}
