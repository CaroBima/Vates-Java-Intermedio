package com.curso.operadores;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int numeroTope = scanner.nextInt();
        adivinaNumero(numeroTope);
        */
        //calculaPotencia();
        //calcularFactorial();

        System.out.println(sonNrosAmigos());
    }

    /**recibir dos numeros y decir si son numeros amigos
     *
     */
    public static boolean sonNrosAmigos(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nro 1: ");
        int nro1 = scanner.nextInt();


        System.out.print("Ingrese el nro 2: ");
        int nro2 = scanner.nextInt();
        scanner.close();


        return (sumaDivisoresPropios(nro1)== nro2) && (sumaDivisoresPropios(nro2)==nro1);
    }

    public static int sumaDivisoresPropios(int numero){
        int sumaDivisores = 0;
        for(int i=1; i<=numero/2; i++){
            if(numero % i == 0){
                sumaDivisores += i;
            }
        }
        return sumaDivisores;
    }


    /**Calcular el factorial desde 1 al nro ingresado por el usuario
     *
     */
    public static void calcularFactorial(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero:");
        int nroFactorial = scanner.nextInt();
        scanner.close();
        int resultFactorial = 1;

        for(int i=1; i<=nroFactorial; i++){
            resultFactorial *= i;
        }
        System.out.printf("resultado: " + resultFactorial);
    }

    /**Con dos numeros ingresados por el usuario calcula la potencia
     *
     */
    public static void calculaPotencia(){
        Scanner scanner = new Scanner(System.in);
        int resultado = 1;

        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();


        System.out.print("Ingrese la potencia: ");
        int potencia = scanner.nextInt();
        scanner.close();

        for(int i= 0; i<potencia; i++){
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);
    }


    /**Permite al usuario adivinar un numero generado de manera aleatoria
     *
     * @param numeroTope
     */
    public static void adivinaNumero(int numeroTope){
        Random random = new Random();
        int numeroIngresado = 0;
        int numeroRandom = random.nextInt(numeroTope)+1;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Ingrese un valor: ");
            numeroIngresado = scanner.nextInt();
            scanner.next();

            if(numeroIngresado>numeroRandom){
                System.out.println("El numero ingresado es mayor al numero random");
            }else if(numeroIngresado<numeroRandom){
                System.out.println("El numero ingresado es menor al numero random");
            }else{
                System.out.println("Acertaste, el numero es " + numeroRandom);
            }
        }while(numeroIngresado != numeroRandom);

    }



    /**pide dos numeros y hace suma, resta, multiplicacion y division y muestre resultados
     *
     */
    public void calculos(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        Long num1 = scanner.nextLong();
        scanner.next();
        System.out.print("Ingrese el segundo valor: ");
        Long num2 = scanner.nextLong();
        scanner.close();

        System.out.println("Suma= " + (num1+num2) );
        System.out.println("Resta= " + (num1-num2));
        System.out.println("Multiplicación= " + (num1*num2));
        if(num2>0){
            System.out.println("División= " + (num1/num2));
        }else{
        System.out.println("División por cero");
        }

    }












    /**Ejemplo de condicionales anidados
     *
     */
    public void condicionalesAnidados(){
        int nota = 85;

        if(nota>=90){
            System.out.println("A");
        }else if(nota>=80){
            System.out.println("B");
        }else{
            if(nota>=50){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
        }

    }


}
