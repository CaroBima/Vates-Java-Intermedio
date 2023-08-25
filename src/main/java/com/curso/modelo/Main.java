package com.curso.modelo;


/*
* Buenas les dejo unos ejercicios practicos para complementar la clase de hoy:
- Diseña una clase "Empleado" que contenga propiedades como nombre, salario, y un método para calcular el aumento de salario.
- Crea una clase "Triángulo" con propiedades para los tres lados y un método para determinar si es equilátero, isósceles o escaleno.
- Extiende la clase "Círculo" para implementar una interfaz "FiguraGeometrica" con métodos para calcular el área y perímetro.
- Diseña una clase "Producto" con propiedades como nombre, precio y cantidad en inventario, y métodos para calcular el valor total.
- Crea una clase "EmpleadoHora" que calcule el salario semanal en base a las horas trabajadas y la tarifa por hora.
* */

public class Main{
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Pedro");
        persona.setApellido("Perez");
        System.out.println(persona.toString()); //esto no se usa, es con fines demostrativos


        Persona otraPersona = new Persona();

        otraPersona.setApellido("Juarez");
        otraPersona.setNombre("Paula");
        otraPersona.setDni(33333333);
        otraPersona.setEdad(35);
        otraPersona.setEmail("paulajuarez@gmail.com");
        otraPersona.setGenero("Femenino");

        System.out.println(otraPersona.toString());

    }
}