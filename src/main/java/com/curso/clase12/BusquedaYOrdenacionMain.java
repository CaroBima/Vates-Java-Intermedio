package com.curso.clase12;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BusquedaYOrdenacionMain {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //busqueda lineal: busca el primero
        Optional<Integer> resultado = numeros.stream()
                .filter(numero -> numero == 4)
                .findFirst();

        //busqueda binaria
        Optional<Integer> resultBinaria = numeros.stream()
                .sorted()
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    int index= Collections.binarySearch(list, 6);
                    return (index >= 0) ? Optional.of(list.get(index)): Optional.empty();
                }));
    }

}
