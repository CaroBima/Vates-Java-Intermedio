package com.curso.clase12;

import java.util.*;
import java.util.stream.Collectors;

public class OrdenamientoString {
    public static void main(String[] args) {
        //Crea un programa que permita al usuario ingresar una lista de nombres y
        // luego ordene esa lista alfabéticamente
        List<String> nombres = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de nombres que contendrá la lista: ");
        int cantidadElementos = scan.nextInt();

        for(int i = 1; i <= cantidadElementos; i++){
            System.out.print("Nombre  " + i +": " );
            nombres.add(scan.next());
        }

        //Ordenacion burbuja
        nombres.sort((a,b)-> a.compareTo(b));

        nombres.forEach(System.out::println);

        System.out.print("Nombre a buscar: ");
        String nombreABuscar = scan.next();


        //busqueda binaria
        Optional<String> resultBinaria = nombres.stream()
                .sorted()
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    int index= Collections.binarySearch(list, nombreABuscar);
                    return (index >= 0) ? Optional.of(list.get(index)): Optional.empty();
                }));


        if(resultBinaria.isPresent()) {
            System.out.println("El nombre " + resultBinaria.get() + " está en la lista (Busqueda binaria)");
        }
        else{
            System.out.println("El nombre buscado no se encuentra en la lista (Busqueda binaria)");
        }
    }
}
