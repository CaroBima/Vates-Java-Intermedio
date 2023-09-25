package com.curso.practicasChatGpt.estudiantes;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Tienes una lista de estudiantes
Tu tarea es realizar las siguientes operaciones utilizando programación funcional:

Filtrar los estudiantes que tienen al menos 18 años.
Calcular el promedio de calificaciones de los estudiantes mayores de 18 años.
Encontrar el estudiante con la calificación más alta entre los mayores de 18 años.
Crear una lista de nombres de estudiantes que tienen calificaciones por encima del promedio calculado en el paso 2.
Imprimir en la consola el nombre del estudiante con la calificación más alta.
 */
public class Principal {
    public static void main(String[] args) {
        List<Estudiante> listaEstudiantes = new ArrayList<>();

        cargarListado(listaEstudiantes);

        //Filtrar los estudiantes que tienen al menos 18 años.
        List<Estudiante> estudiantesMayores = listaEstudiantes.stream()
                .filter(estudiante -> {return estudiante.getEdad()>=18;})
                .collect(Collectors.toList());

        //Muestro el listado de estudiantes mayores de 18 años
        System.out.println("**************************************");
        System.out.println("Estudiantes mayores de 18 años: ");
        System.out.println("**************************************");
        estudiantesMayores.forEach(estudiante -> {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Promedio: " + estudiante.getCalificacion());
            System.out.println("**************************************");
        });

        //Calcular el promedio de calificaciones de los estudiantes mayores de 18 años.

    }

    
    /**
     * Carga los valores dentro del ArrayList de estudiantes
     * @param listaEstudiantes
     */
    private static void cargarListado(List<Estudiante> listaEstudiantes){
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Pablo Pablin");
        estudiante.setCalificacion(10);
        estudiante.setEdad(35);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();

        estudiante.setNombre("Eugenio Salenstein");
        estudiante.setCalificacion(3);
        estudiante.setEdad(18);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();

        estudiante.setNombre("Marta Minujin");
        estudiante.setCalificacion(7);
        estudiante.setEdad(43);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();

        estudiante.setNombre("Pedro Páramo");
        estudiante.setCalificacion(6);
        estudiante.setEdad(28);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();

        estudiante.setNombre("Mariela Menendez");
        estudiante.setCalificacion(4);
        estudiante.setEdad(11);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();

        estudiante.setNombre("Miguel Estevanez");
        estudiante.setCalificacion(8);
        estudiante.setEdad(27);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();

        estudiante.setNombre("Archivaldo Gomez");
        estudiante.setCalificacion(8);
        estudiante.setEdad(54);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();

        estudiante.setNombre("Mariela Benitez");
        estudiante.setCalificacion(9.5);
        estudiante.setEdad(41);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();

        estudiante.setNombre("Eugenia De Montijo");
        estudiante.setCalificacion(10);
        estudiante.setEdad(25);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();

        estudiante.setNombre("Pinguino Rodriguez");
        estudiante.setCalificacion(1);
        estudiante.setEdad(14);
        listaEstudiantes.add(estudiante);
        estudiante = new Estudiante();



    }
}
