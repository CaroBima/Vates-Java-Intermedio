package com.curso.clase7.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Programación funcional
public class ClaseDeEjemplo {
    static Function<Integer, Long> factorial;

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /*Suma los pares sin utilizar lambdas
        for (int i= 0; i <= numeros.size(); i++){
            if(numeros[i] %2 == 0) {
            //logica para sumar los pares
            }
        }*/

        // ************************  Funciones lambda usando streams  **************************

        //lo mismo hecho con funciones lambda
        int sumaDePares = numeros.stream()
                .filter(n -> n % 2 == 0) //filtra los pares
                .reduce(0, Integer::sum); // reduce esta dentro de string, suma comenzando de cero los valores que se van ingresando (que son filtrados con el filter)

        System.out.println("La suma es de pares es: " + sumaDePares);

        //guardar los valores pares en otro arreglo
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0) //filtra los pares
                .collect(Collectors.toList()); //guarda el resultado del filter en una lista


        //Function, declarado fuera del main
        factorial = n ->{
            if(n == 0){
                return 1L;
            }else{
                return n * factorial.apply(n-1); //recursividad, llamo a la funciona factorial dentro de si misma
            }
        };

        int numero = 5;
        long res = factorial.apply(numero);
        System.out.println("El factorial de " + numero + " es: " + res);

    }
}
