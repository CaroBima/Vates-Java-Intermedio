package com.curso.clase1;

// Extiende la clase "Círculo" para implementar una interfaz "FiguraGeometrica" con métodos para calcular el área y perímetro.
public class Circulo implements FiguraGeometrica{

    private double radio;
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    //getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //constructores
    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }
}
