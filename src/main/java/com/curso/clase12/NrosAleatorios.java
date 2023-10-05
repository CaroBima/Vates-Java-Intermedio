package com.curso.clase12;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class NrosAleatorios {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.print("Cantidad de números a generar: ");
        int cantNumeros = scan.nextInt();

        for(int i = 1; i<= cantNumeros; i++){
            numeros.add(new Random().nextInt(100));
        }

        numeros.sort((a,b)-> a.compareTo(b));
        //otra forma es Collections.sort(numeros);

        numeros.forEach(System.out::println);

        //numero a buscar y lo muestra:
        System.out.print("Numero a buscar: ");
        int numeroABuscar = scan.nextInt();

        int indice = Collections.binarySearch(numeros, numeroABuscar);

        if(indice >=0){
            System.out.println("El numero se encuentra en la lsita");
        }else{
            System.out.println("El numero no se encuentra en la lsita");
        }

    }
}
