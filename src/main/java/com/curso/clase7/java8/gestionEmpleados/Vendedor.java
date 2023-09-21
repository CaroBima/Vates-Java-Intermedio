package com.curso.clase7.java8.gestionEmpleados;

/*
Para la clase Vendedor, agrega las propiedades de comisión mensual y ventas mensuales. Sobrescribe el método
    calcularSalarioMensual() para calcular el salario base más la comisión en función de las ventas.
 */
public class Vendedor extends Empleado{
    private double comisionMensual;
    private int ventasMensuales;

    public double calcularSalarioMensual(){
        return super.getSalarioBase() + (comisionMensual * ventasMensuales);
    }

    //constructores:
    public Vendedor(String nombre, double salarioBase, double comisionMensual, int ventasMensuales) {
        super(nombre, salarioBase);
        this.comisionMensual = comisionMensual;
        this.ventasMensuales = ventasMensuales;
    }

}
