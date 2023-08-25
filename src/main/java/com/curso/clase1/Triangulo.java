package com.curso.clase1;

/*

        - Crea una clase "Triángulo" con propiedades para los tres lados y un método para determinar si es equilátero, isósceles o escaleno.

 */
public class Triangulo {
    double lado1;
    double lado2;
    double lado3;

    public String clasificarTriangulo(){
        if(lado1 == lado2  && lado1== lado3){
            return "Equilatero";
        }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            return "Escaleno";
        }else return "Isósceles";

    }


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
}
