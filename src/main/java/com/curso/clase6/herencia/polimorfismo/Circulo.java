package com.curso.clase6.herencia.polimorfismo;

public class Circulo extends Figura{
    private double radio;

    @Override
    public double calcularArea(){
        return Math.PI + radio + radio;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
}
