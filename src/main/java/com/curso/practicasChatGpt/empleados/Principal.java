package com.curso.practicasChatGpt.empleados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Tu tarea es realizar las siguientes operaciones utilizando programación funcional:

Filtrar los empleados que tienen un salario mayor o igual a $50,000.
Calcular el promedio de edad de los empleados que tienen un salario mayor o igual a $50,000.
Encontrar el empleado más joven entre aquellos que tienen un salario mayor o igual a $50,000.
Crear una lista de nombres de empleados que tienen edades entre 25 y 35 años (inclusive) y un salario mayor o igual a $50,000.
Imprimir en la consola el nombre y salario del empleado más joven con un salario mayor o igual a $50,000.
Puedes crear una lista de empleados de ejemplo y realizar estas operaciones siguiendo el estilo de programación
funcional que hemos estado utilizando.
 */
public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();

        cargarEmpleados(listaEmpleados);

        //Filtrar los empleados que tienen un salario mayor o igual a $50,000.
        List<Empleado> mayoresSalarios = listaEmpleados.stream()
                .filter(empleado -> {
                    return empleado.getSalario()>=50000.0;
                })
                .collect(Collectors.toList());

        //Calcular el promedio de edad de los empleados que tienen un salario mayor o igual a $50,000.
        Double promedio = listaEmpleados.stream()
                .mapToDouble(Empleado::getEdad)
                .average()
                .orElse(0.0);

        System.out.println("*********************************************************");
        System.out.println(" Promedio de edad de los empleados con salario >=$50000: " + promedio);

        //Encontrar el empleado más joven entre aquellos que tienen un salario mayor o igual a $50,000.
        Optional<Empleado> empleadoMasJoven = listaEmpleados.stream()
                .min(Comparator.comparingInt(empleMasJ -> empleMasJ.getEdad()));

        System.out.println("*********************************************************");
        System.out.println(" Empleado más joven con salario mayor o igual a $50.000");
        System.out.println("*********************************************************");
        empleadoMasJoven.ifPresent(emplMasJoven -> {
            System.out.println("Empleado menor: " + emplMasJoven.getNombre());
            System.out.println("Salario: " + emplMasJoven.getSalario());
            System.out.println("Edad: " + emplMasJoven.getEdad());
            }
        );

        //Crear una lista de nombres de empleados que tienen edades entre 25 y 35 años (inclusive) y un salario mayor o igual a $50,000.
        List<Empleado> listaEdadySalario = listaEmpleados.stream()
                .filter(empleado -> empleado.getEdad() > 24 && empleado.getEdad()< 36 && empleado.getSalario() >= 50000.0)
                .collect(Collectors.toList());

        System.out.println("*********************************************************");
        System.out.println("Empleados entre 25 y 35 años que cobran mas de $50.000");
        System.out.println("*********************************************************");
        listaEdadySalario.forEach(empleado -> {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("----------------------------------");
        });
    }

    /**
     * Método que carga la lista con datos de ejemplo para trabajar
     * @param empleados
     */
    private static void cargarEmpleados(List<Empleado> empleados){
        empleados.add(new Empleado("Empleado1", 30, 55000.0));
        empleados.add(new Empleado("Empleado2", 28, 60000.0));
        empleados.add(new Empleado("Empleado3", 35, 48000.0));
        empleados.add(new Empleado("Empleado4", 25, 52000.0));
        empleados.add(new Empleado("Empleado5", 32, 65000.0));
        empleados.add(new Empleado("Empleado6", 40, 70000.0));
        empleados.add(new Empleado("Empleado7", 27, 50000.0));
        empleados.add(new Empleado("Empleado8", 33, 58000.0));
        empleados.add(new Empleado("Empleado9", 29, 44000.0));
        empleados.add(new Empleado("Empleado10", 26, 56000.0));
        empleados.add(new Empleado("Empleado11", 31, 59000.0));
        empleados.add(new Empleado("Empleado12", 24, 53000.0));
        empleados.add(new Empleado("Empleado13", 36, 52000.0));
        empleados.add(new Empleado("Empleado14", 39, 58000.0));
        empleados.add(new Empleado("Empleado15", 28, 41000.0));
    }
}
