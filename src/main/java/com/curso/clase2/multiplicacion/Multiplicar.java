package com.curso.clase2.multiplicacion;

import java.util.Scanner;

/**- Escribe un programa que genere una tabla de multiplicar del 1 al 10 para un número ingresado por el usuario.
 *
 */
public class Multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.print("Ingrese un número entero: ");

        while (true) {
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break; // Sale del bucle si ingresa un int
            } else {
                System.out.print("Entrada no válida. Ingresa un número entero: ");
                scanner.next(); // Limpia el búfer de entrada
            }
        }

        for(int i = 1; i<=10; i++ ){
            System.out.println("Resultado " + numero + " * " + i + " = " + (numero*i));
        }
    }
}
