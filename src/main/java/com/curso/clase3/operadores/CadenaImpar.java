package com.curso.clase3.operadores;

/** Dado un array de string mostrar solo la cadena de caracteres que sean impares
 *
 */
public class CadenaImpar {
    public static void main(String[] args) {
        String[] vectorPalabras = new String[10];

        vectorPalabras[0] = "Gato";
        vectorPalabras[1] = "Perro";
        vectorPalabras[2] = "Milagro";
        vectorPalabras[3] = "Guns'n'Roses";
        vectorPalabras[4] = "Mate";
        vectorPalabras[5] = "tiburon";
        vectorPalabras[6] = "termo";
        vectorPalabras[7] = "java";
        vectorPalabras[8] = "palabra";
        vectorPalabras[9] = "impar";

        System.out.println("Palabras con cantidad de caracteres impares:");
        for(int i = 0; i<10; i++){
            if(vectorPalabras[i].length()%2!=0){
                System.out.println(vectorPalabras[i]);
            }
        }

    }
}
