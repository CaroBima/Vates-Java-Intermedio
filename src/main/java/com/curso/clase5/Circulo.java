package com.curso.clase5;

public class Circulo extends Figura{
    private Double radio;

    public Circulo(String color, Double tamanio, Double radio){
        super(color, tamanio);
        this.radio = radio;
    }

    public Circulo() {
        super();
    }


    //getters y setters
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
