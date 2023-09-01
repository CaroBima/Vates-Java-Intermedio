package com.curso.clase2.adivinanza;

import java.util.Random;
import java.util.Scanner;

/** Crea un juego de adivinanza donde la computadora elige una palabra al azar y muestra una serie de guiones
*   bajos representando las letras. El jugador debe adivinar la palabra letra por letra.
*/
public class Adivinanza {
    public static void main(String[] args) {
        String[] palabras = new String[11];
        Random random = new Random();

        palabras[0] = "escafandra";
        palabras[1] = "alicate";
        palabras[2] = "mezcla";
        palabras[3] = "palabra";
        palabras[4] = "pelado";
        palabras[5] = "añicos";
        palabras[6] = "josefina";
        palabras[7] = "familiares";
        palabras[8] = "mascota";
        palabras[9] = "skywalker";

        int numeroRandom = random.nextInt(9);

        generarTablero(palabras[numeroRandom]);
    }

    /**Muestra la longitud de la palabra y guiones bajos que son remplazados por las letras que acierta el usuario
     *
     * @param palabra
     */
    public static void generarTablero(String palabra){
        int cantidadLetras = palabra.length();
        int cantAdivinadas = 0;
        String[] vectorSolucion = new String[cantidadLetras];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adiviná la palabra (tiene " + cantidadLetras + " letras) : ");
        for(int i = 0; i < cantidadLetras; i++){
            vectorSolucion[i] = "_";
            System.out.print(vectorSolucion[i]);
        }

        do{
            System.out.println(" ");
            System.out.print("Ingresa una letra: ");
            String letra = scanner.next();
            letra = letra.toLowerCase();

            boolean letraAdivinada = false;

            for(int i = 0; i < cantidadLetras; i++){
                if(palabra.charAt(i) == letra.charAt(0) && vectorSolucion[i].equals("_")){
                    vectorSolucion[i] = letra;
                    letraAdivinada = true;
                    cantAdivinadas++;
                }
            }

            if (letraAdivinada) {
                System.out.println("La letra '" + letra + "' está en la palabra.");
            } else {
                System.out.print("La letra '" + letra + "' no está en la palabra. Ingresa otra:");
            }

            // Imprimir el estado actual del tablero
            for (String letraActual : vectorSolucion) {
                System.out.print(letraActual);
            }

        }while(cantAdivinadas != cantidadLetras);

        System.out.println("\nAdivinaste!! La palabra era " + palabra);
    }


}
