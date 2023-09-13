package com.curso.clase6.herencia.polimorfismo;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    @Override
    public double calcularArea(){
        return ancho * alto;
    }
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}
