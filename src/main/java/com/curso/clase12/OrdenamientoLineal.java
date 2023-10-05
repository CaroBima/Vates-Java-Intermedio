package com.curso.clase12;

import java.util.*;
import java.util.stream.Collectors;

//ingresar una lista de numeros finitos y de esa lista buscar un determinado numero
public class OrdenamientoLineal {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        /*
        //si lo tenemos como una lista primitva lo tratamos asi para poder convertirlo a list y tratarlo con streams
        //con los primitivos no podemos usar el optional, se necesitan wrappers.
        int[] listaPrimitiva = new int[];
        List<int[]> listaConvertida = List.of(listaPrimitiva);
        */
        System.out.print("Ingrese la cantidad de numeros que contendrá la lista: ");
        int cantidadElementos = scan.nextInt();

        for(int i = 1; i <= cantidadElementos; i++){
            System.out.print("Número  " + i +": " );
            numeros.add(scan.nextInt());
        }

        System.out.print("Ingrese el número a buscar: ");
        int nroABuscar = scan.nextInt();

        //Ordenacion burbuja
        numeros.sort((a,b)-> a.compareTo(b));

        //busqueda binaria
        Optional<Integer> resultBinaria = numeros.stream()
                .sorted()
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    int index= Collections.binarySearch(list, nroABuscar);
                    return (index >= 0) ? Optional.of(list.get(index)): Optional.empty();
                }));

        if(resultBinaria.isPresent()) {
            System.out.println("El numero " + resultBinaria.get() + " está en la lista (Busqueda binaria)");
        }
        else{
            System.out.println("El número buscado no se encuentra en la lista (Busqueda binaria)");
        }

        //busqueda lineal: busca el primero
        Optional<Integer> resultado = numeros.stream()
                .filter(numero -> numero == nroABuscar)
                .findFirst();

        if(resultado.isPresent()) {
            System.out.println(resultado.get() + "está en la lista");
        }
        else{
            System.out.println("El número buscado no se encuentra en la lista");
        }


    }

    /*


    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero de elementos: ");
    int n = scanner.nextInt();

    List<Integer> numeros = new ArrayList<>();
        System.out.println("Ingresa los elementos uno por uno: ");

        for (int i = 0; i < n; i++) {
        numeros.add(scanner.nextInt());
    }
        System.out.println("Ingresa el numero a buscar: ");
    int numeroABuscar = scanner.nextInt();

    Optional<Integer> resultado = numeros.stream()
            .filter(numero -> numero == numeroABuscar)
            .findFirst();
        if (resultado.isPresent()) {
        System.out.println("Se encontro el numero: "+numeroABuscar);
    }else{
        System.out.println("No se encontro el numero: "+numeroABuscar);
    }
}
        }
                */
}
