package com.curso.clase6.herencia.polimorfismo;

import org.w3c.dom.css.Rect;

public class FigurasGeometricas {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        double areaCirculo = circulo.calcularArea();
        double areaRectangulo = rectangulo.calcularArea();

        System.out.println("Area del circulo: " + areaCirculo);
        System.out.println("Area del rectángulo: " + areaRectangulo);
    }
}
