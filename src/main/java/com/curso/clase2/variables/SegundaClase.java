package com.curso.clase2.variables;

import java.util.Scanner;

public class SegundaClase {

    public static void main(String[] args) {
   //devuelve par si es par e impar si es impar
        System.out.println("El numero " + esPar(4));

        cambiarMayusMinus("Es UNa CaDEna");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número");
        int numero = scanner.nextInt();
        scanner.close();
        esPrimo(numero);

    }

    /**
     * Detecta si es número primo
     * @param numero
     */
    public static void esPrimo(int numero){

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if(esPrimo){
            System.out.println("Número primo");
        }else{
            System.out.println("No es primo");
        }
    }

    /**
     * Recibe una cadena de caracteres y la muestra en mayusculas y en minusculas
     * muestra además el tamaño de la cadena
     * @param cadena
     *
     */
    public static void cambiarMayusMinus(String cadena){
        System.out.println("Minúscula: " + cadena.toLowerCase());
        System.out.println("Mayúscula: " + cadena.toUpperCase());
        System.out.println("Longitud de la cadena: " + cadena.length());
    }


    /**
     * Metodo que recibe un numero y devuelve si es par o impar
     * @param num
     * @return String
     */
    public static String esPar(int num){
        return (num % 2 == 0) ? "Es Par" : "Es impar";
    }


    //javaDocs que permite ver que hace cada metodo
    /**
    * Método que concatena el nombre
    */
    public void concatenarNombre(){
        String nombre = "Caro";
        String apellido = "Bima";

        System.out.println(nombre + " " + apellido);


    }

    /**
     * Calcula la sumatoria de elementos de un array y el promedio
     */
    public void promedioArray(){
        int[] arrayNumerico = new int[5];
        int total = 0;

        arrayNumerico[0] = 1;
        arrayNumerico[1] = 2;
        arrayNumerico[2] = 3;
        arrayNumerico[3] = 4;
        arrayNumerico[4] = 5;


        for(int i=0; i<arrayNumerico.length; i++){
            total += arrayNumerico[i];
        }

        System.out.println("Total: " + total); //aca se suele usar loggers, no sout
        System.out.println("Promedio: " + total/arrayNumerico.length);
    }
}
