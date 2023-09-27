package com.curso.clase10;

@FunctionalInterface
public interface Calculadora {
    Double calcular(Double a, Double b);

    //metodo default, hace algo
    default Double sumar(Double a, Double b){
        return a - b;
    }

}