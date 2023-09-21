package com.curso.clase7.java8.gestionEmpleados;

/*
* Para la clase Gerente, agrega las propiedades de bono mensual y número de subordinados. Sobrescribe el método
    calcularSalarioMensual() para que incluya el bono en el salario.
 */
public class Gerente extends Empleado{
    private double bonoMensual;
    private int numeroSubordinados;


    public double calcularSalarioMensual(){
        return super.getSalarioBase() + bonoMensual;
    }

    //constructores
    public Gerente(String nombre, double salarioBase, double bonoMensual, int numeroSubordinados) {
        super(nombre, salarioBase);
        this.bonoMensual = bonoMensual;
        this.numeroSubordinados = numeroSubordinados;
    }

}
