package com.curso.clase9.interfaces.funcionales.ej4;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

//Filtrar solo los nombres que contengan la letra A o a
//a esos nombres convertirlos todos a mayusculas o minusculas
public class Principal {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Pablo", "Caro", "Lorena", "Eduardo", "Julio", "Rodrigo", "Luis", "Juan", "Maria");

        //filtro los nombres que contienen a
        List<String> nombresFiltrados = nombres.stream()
                .filter(nombre -> nombre.contains("a") || nombre.contains("A"))
                .collect(Collectors.toList());

        //formatear a mayusculas
        FormateadorTexto formateadorMayusculas = texto -> texto.toUpperCase(Locale.ROOT);
        List<String> nombresMayusculas = nombresFiltrados.stream() //se usa streams porque el formateador espera un string
                .map(formateadorMayusculas::formatear) //usa el metodo formatear que esta dentro de formateadorMayusculas
                .collect(Collectors.toList());

        System.out.println(nombresMayusculas); //imprime el array

        nombresMayusculas.forEach(System.out::println); //dentro del forEach hace referencia al metodo println del System.out

    }
}
