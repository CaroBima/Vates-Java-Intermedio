package com.curso.clase5;

//Define una clase Empleado con varios atributos. Implementa tres constructores diferentes
// para esta clase, cada uno con un conjunto diferente de argumentos.
public class Empleado {
    private String nombre;
    private String apellido;
    private Long legajo;
    private Long dni;
    private String cargo;
    private double sueldo;
    private Integer edad;

    public Empleado(){}

    public Empleado(Long dni){
        this.dni = dni;
    }
    public Empleado(Long legajo, Long dni, String nombre, String apellido){
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado ( Long dni, String nombre, String apellido, int edad){
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Empleado(String nombre, String apellido, Long legajo, Long dni, String cargo, double sueldo, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.dni = dni;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getLegajo() {
        return legajo;
    }

    public void setLegajo(Long legajo) {
        this.legajo = legajo;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
