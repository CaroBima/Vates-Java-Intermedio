package com.curso.clase1;
/*
 - Diseña una clase "Empleado" que contenga propiedades como nombre, salario, y un método para calcular el aumento de salario.
 */


public class Empleado {
    private Long idEmpleado;
    private String nombre;
    private Double salario;

    public double calcularAumento(int porcentajeAumento){
        return salario * porcentajeAumento/100;
    }

    //getters y setters
    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //constructores

    public Empleado(Long idEmpleado, String nombre, Double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado() {
    }
}
