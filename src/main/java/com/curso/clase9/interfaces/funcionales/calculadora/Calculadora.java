package com.curso.clase9.interfaces.funcionales.calculadora;

public class Calculadora {
    //programacion funcional
    public static int calcular(int a, int b, OperacionMatematica operacionMatematica){
        return operacionMatematica.operar(a, b);
    }

    public static void main(String[] args) {
        //a traves de la misma interfaz me da la posibilidad de hacer distintas operaciones
        OperacionMatematica suma = ((a,b) -> a+b);
        OperacionMatematica resta = ((a,b) -> a-b);
        OperacionMatematica multiplica = ((a,b) -> a*b);

        int resultadoSuma = calcular(4,5, suma);
        System.out.println("La suma es: " + resultadoSuma);

        int resultadoResta = calcular(4,5, resta);
        System.out.println("La resta es: " + resultadoResta);

        int resultadoMultip = calcular(4,5, multiplica);
        System.out.println("La multiplicación es: " + resultadoMultip);
    }
}
