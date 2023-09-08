package com.curso.clase4.gestion.escuelas;

/**
 *  * Crea un sistema simple de gestión de cursos para una escuela. Deberás definir tres clases: Estudiante, Curso, y Profesor.
 *  *
 * * En el programa principal (el método main), crea varios objetos de tipo Estudiante, Curso, y Profesor, y realiza las siguientes operaciones:
 *  *
 *  * Crea al menos 3 estudiantes, 2 profesores y 4 cursos.
 *  * Inscribe a los estudiantes en los cursos.
 *  * Asigna cursos a los profesores.
 *  * Muestra la información de los cursos y de los estudiantes.
 */
public class Principal {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Carlos Pereyra", 23);
        Estudiante estudiante2 = new Estudiante("Carla Juarez", 83);
        Estudiante estudiante3 = new Estudiante("Marcelina Lopez", 47);
        Estudiante estudiante4 = new Estudiante("Nicole Newman", 31);

        Profesor profesor1 = new Profesor("Carlos Juarez");
        Profesor profesor2 = new Profesor("Mariela Montoya");
        Profesor profesor3 = new Profesor("Billy Puertas");

        Curso curso1 = new Curso("Java I", profesor1);
        Curso curso2 = new Curso("POO", profesor2);
        Curso curso3 = new Curso("Diseño de sistemas", profesor3);
        Curso curso4 = new Curso("Analisis de sistemas", profesor3);

        estudiante1.inscribirCurso(curso1);
        estudiante1.inscribirCurso(curso2);
        estudiante1.inscribirCurso(curso3);
        estudiante2.inscribirCurso(curso1);
        estudiante3.inscribirCurso(curso2);
        estudiante3.inscribirCurso(curso4);
        estudiante4.inscribirCurso(curso4);
        estudiante4.inscribirCurso(curso3);

        profesor1.setCursoDictado(curso1);
        profesor2.setCursoDictado(curso2);
        profesor3.setCursoDictado(curso3);


        System.out.println("Curso 1: " + curso1.getNombre() + ", Profesor: " + curso1.getProfesor() + ", Alumnos: ");

    }
}
