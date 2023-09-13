package com.curso.clase6.herencia.polimorfismo;

public class Vendedor extends Empleado{
    public double comision;

    @Override
    public  double calcularSalario(){
        return super.calcularSalario() + comision;
    }
    public Vendedor(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
}
