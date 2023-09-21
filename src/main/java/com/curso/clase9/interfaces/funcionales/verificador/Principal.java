package com.curso.clase9.interfaces.funcionales.verificador;

public class Principal {

    //ejemplo 2
    public static void realizarVerificacion(int num, Verificador verificador){
        if(verificador.verificar(num)){
            System.out.println(num + " cumple con la verificacion");
        }else{
            System.out.println(num + " no cumple con la verificacion");
        }
    }
    public static void main(String[] args) {

        int num = 11; //ejemplo 2

        Verificador esPar = (a -> a%2 == 0); //ejemplo 1 y 2
        Verificador esImpar = (a -> a%2 != 0); //ejemplo 1 y 2


    /*
    //Ejemplo 1
        int a = 5;
        if(esPar.verificar(a)){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    */

        //Ejemplo 2
        realizarVerificacion(num, esImpar);
        realizarVerificacion(num, esPar);
    }
}
