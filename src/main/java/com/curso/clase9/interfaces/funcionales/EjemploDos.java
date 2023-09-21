package com.curso.clase9.interfaces.funcionales;

public class EjemploDos {
    public static void main(String[] args) {
        Accion saludar = () ->{
            System.out.println("Hola mundo!");
        };

        saludar.ejecutar();

        Accion despedirse = () -> {
            System.out.println("Adios");
        };

        despedirse.ejecutar();
    }
}
