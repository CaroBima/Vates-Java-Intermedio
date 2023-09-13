package com.curso.clase6.herencia.polimorfismo;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public  double calcularSalario(){
        return super.calcularSalario() + bono;
    }
}

