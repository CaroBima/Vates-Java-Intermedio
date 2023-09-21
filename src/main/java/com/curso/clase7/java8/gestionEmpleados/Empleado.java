package com.curso.clase7.java8.gestionEmpleados;

/*
Crea una clase Empleado con las siguientes propiedades: nombre, salario base mensual, y un método
calcularSalarioMensual() que devuelve el salario base.
 */
public class Empleado {
    private String nombre;
    private double salarioBase;


    public double calcularSalarioMensual(){
        return salarioBase;
    }

    //constructores
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public Empleado() {
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
