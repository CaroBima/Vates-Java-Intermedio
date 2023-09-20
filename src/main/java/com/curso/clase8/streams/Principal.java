package com.curso.clase8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Manzana", "Pera", "uva", "Maracuya", "Membrillo", "cereza", "frutilla");
        List<String> palabras2 = Arrays.asList("manzana", "pera", "uva", "uva", "maracuya","maracuya", "Maracuya", "membrillo", "cereza", "frutilla");

        List<String> palabrasDeCinco = palabras.stream()
                .filter(palabra -> palabra.length() >= 5)
                .collect(Collectors.toList());



        List<String> palabrasDeCincoMayus = palabras2.stream()
                .filter(palabra ->{
                    palabra.toUpperCase(Locale.ROOT);
                    System.out.println("Palabra en mayusculas: " + palabra.toUpperCase(Locale.ROOT));
                    return palabra.length()>= 5; //retorna las >=5

                })
                .collect(Collectors.toList());


        List<String> palabrasDeCincoMayus2 = palabras2.stream()
                .filter(palabra ->{
                    return palabra.toUpperCase(Locale.ROOT).length()>= 5; //retorna las >=5

                })
                .collect(Collectors.toList());



        //map

        List<Integer> longitudes = palabras.stream()
                .map(String::length)// arma una lista con la extención de cada palabra, indica para cada string cuantos caracteres tiene
                .collect(Collectors.toList());



        List<String> palabrasOrdenadas = palabras.stream()
                .sorted() //ordena las palabras alfabeticamente teniendo en cuenta mayusc y minusc (orden natural)
                .collect(Collectors.toList());

        System.out.println("Palabras ordenadas alfabeticamente: " + palabrasOrdenadas);

        List<String> palabrasOrdenadasXLongitud = palabras.stream()
                .sorted((str1, str2) -> Integer.compare(str1.length(), str2.length()))
                .collect(Collectors.toList());

        System.out.println("Palabras ordenadas por longitud: " + palabrasOrdenadas);

        List<String> palabrasDistintas = palabras2.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Palabras no repetidas: " + palabrasDistintas);

        //palabras unicas con set
        Set<String> palabrasUnicasConSet =  palabrasDistintas.stream()
                .collect(Collectors.toSet());


        System.out.println("Palabras unicas con set: " + palabrasUnicasConSet);


        //ejercicio:
        List<Integer> numeros = Arrays.asList(1,2,3,4,5, 7,8,9,10, 1, 3, 4, 8, 6);
        List<Integer> numerosParesXDos = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .map(n -> n*2)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numerosParesXDos);
    }




}
