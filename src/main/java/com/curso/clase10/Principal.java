package com.curso.clase10;

public class Principal{
    public static void main(String[] args) {
        Calculadora resta = (a, b) -> a-b;

        double sumaDefault = resta.sumar(10.0, 4.0);

        System.out.println(sumaDefault);
    }


}
