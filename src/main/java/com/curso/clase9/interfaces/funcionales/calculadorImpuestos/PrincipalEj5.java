package com.curso.clase9.interfaces.funcionales.calculadorImpuestos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Cálculo de Impuestos con Streams, Lambdas y Operaciones Ternarias.
Crea una clase CalculadorImpuestos que contenga un programa principal (main). En este programa, tienes una
lista de montos representados como valores decimales en dólares (por ejemplo, 1000.0, 2500.0, 800.0, 4500.0, ...., 4567.00)
almacenados en una lista.
Debes utilizar Java 8 Streams, expresiones lambda y operaciones ternarias para realizar el cálculo de impuestos sobre
los montos de la siguiente manera:
- Si el monto es igual o menor a $1000, se aplica una tasa de impuestos del 17%.
- Si el monto es mayor a $1000, se aplica la misma tasa de 17% y sobre el resultado una tasa de impuestos adicional del 5%.
*/
public class PrincipalEj5 {

    public static double impuestos(double monto, CalculadorImpuestos calculo){
        return calculo.calcularImpuestos(monto);
    }

    public static void main(String[] args) {
        List<Double> montos = Arrays.asList(1000.0, 2500.0, 800.0, 4500.0, 250.0, 4567.00, 357.25, 9000.0, 800.5, 850.0, 150.0, 450.7, 2500.5, 235.0, 4550.2, 532.0, 456.22,1500.0, 3255.5);

        CalculadorImpuestos impuestoSinGanancia = monto -> monto - (monto * 0.17);
        CalculadorImpuestos impuestoConGanancia = monto -> monto - ((monto * 0.17)*0.05);

        //ejemplo visto en clase
        double salarioConDescuentos = impuestoSinGanancia.calcularImpuestos(350000);
        System.out.println(salarioConDescuentos);

        //parte que faltaba resolver en clase:
        List<Double> salarios = montos.stream()
                .map( monto -> monto >1000 ? impuestos(monto, impuestoConGanancia) : impuestos(monto, impuestoSinGanancia))
                .collect(Collectors.toList());

        salarios.forEach(System.out::println);

    }



}
