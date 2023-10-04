package com.curso.clase11.ejClase;

import java.util.*;

public class ColeccionesMain {
    public static void main(String[] args) {
        //List<String>  lista = new ArrayList<>();
        List<String>  lista = new LinkedList<>(); //se crea de la misma forma que el arrayList y se añaden items igual

        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Mandarina");

        Set<String> conjuntoSet = new HashSet<>(); // lo mismo se puede hacer con new TreeSet<>();

        conjuntoSet.add("Manzana");
        conjuntoSet.add("Pera");
        conjuntoSet.add("Mandarina");

        for(String fruta : conjuntoSet){
            System.out.println("La fruta es " + fruta); //los muestra sin orden
        }

        //Maps
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Manzana", 1);
        mapa.put("Pera", 2);
        mapa.put("Mandarina", 3);

        System.out.println("*************************");
        System.out.println("*           Map         *");
        System.out.println("*************************");
        for(String fruta : mapa.keySet()){
            System.out.println("La fruta es " + fruta + ", Cantidad: " + mapa.get(fruta));
        }

    }
}
