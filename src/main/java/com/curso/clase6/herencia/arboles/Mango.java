package com.curso.clase6.herencia.arboles;

public class Mango extends Arbol{
    private String nombreFruta;



    public String mostrarInfo(){
        return super.mostrarInfo() + ", Nombre de la Fruta: " + nombreFruta;
    }

    public String mostrarFruta(){
        return nombreFruta;
    }

    public Mango(String nombre, int edad) {
        super(nombre, edad);
        this.nombreFruta = "Manzano";
    }
}
