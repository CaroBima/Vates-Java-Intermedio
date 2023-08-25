package com.curso.clase1;

//- Crea una clase "EmpleadoHora" que calcule el salario semanal en base a las horas trabajadas y la tarifa por hora.
public class EmpleadoHora extends Empleado {
    private int horasTrabajadas;
    private double tarifaXHora;


    //getters y setters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaXHora() {
        return tarifaXHora;
    }

    public void setTarifaXHora(double tarifaXHora) {
        this.tarifaXHora = tarifaXHora;
    }

    //constructores
    public EmpleadoHora(Long idEmpleado, String nombre, Double salario, int horasTrabajadas, double tarifaXHora) {
        super(idEmpleado, nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaXHora = tarifaXHora;
    }

    public EmpleadoHora(int horasTrabajadas, double tarifaXHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaXHora = tarifaXHora;
    }


}
