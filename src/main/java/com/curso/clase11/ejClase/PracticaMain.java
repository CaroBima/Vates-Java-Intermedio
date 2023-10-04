package com.curso.clase11.ejClase;

import java.util.*;

public class PracticaMain {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        //encontrar el valor maximo en una lista de numeros:
        int max = numeroMaximo(numeros);
        System.out.println("El maximo es " + max);


        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Carolina");
        nombres.add("Pedro");
        nombres.add("Pedro");
        nombres.add("Julio");

        //mostrar la lista sin duplicados:
        Set<String> nombresSinDuplicados = new HashSet<>(nombres); //Set no admite duplicados

        System.out.println("nombres sin duplicados: " + nombresSinDuplicados);

        List<String> palabras = List.of("Manzana", "Banana", "Pera", "Mandarina", "Manzana", "Manzana", "Banana");

        System.out.println(conteoPalabras(palabras));

        //si es par lo muestra
        Optional<Integer> numero = Optional.of(8);
        numero.filter(n -> n % 2 == 0).ifPresent( n -> System.out.println(n + " es par"));
    }

    public static int numeroMaximo(List<Integer> lista){
        return lista.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
    }

    /**
     * dada una lista de palabras contar cuantas veces aparece una palabra y mostrar el resultado
     */

    public static Map<String, Integer> conteoPalabras(List<String> palabras){
        Map<String, Integer> resultado = new HashMap<>();

        for(String palabra : palabras){
            resultado.put(palabra, resultado.getOrDefault(palabra, 0)+1); //si no la encuentra pone 0 como default, si no pone el valor que tiene
        }

        return resultado;
    }
}
