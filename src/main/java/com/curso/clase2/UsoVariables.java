package com.curso.clase2;

public class UsoVariables {
    public static void main(String[] args){
        int edad = 18;
        String resp = "";

        if (edad >=18){
            resp = "Eres mayor de edad";
        }else{
            resp = "Estas muy chico";
        }

        System.out.println(resp);


        //operador ternario:
                                //true           :  false
        resp = (edad>=18) ? "Eres mayor de edad" : "Estas muy chico";

        System.out.println(resp);
    }
}
