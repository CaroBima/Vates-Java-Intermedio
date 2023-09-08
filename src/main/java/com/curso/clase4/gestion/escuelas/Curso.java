package com.curso.clase4.gestion.escuelas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Curso:
 *  *
 *  * Atributos:
 *  *
 *  * nombre (String): El nombre del curso.
 *  * profesor (Profesor): El profesor que dicta el curso.
 *  * estudiantesInscritos (ArrayList de tipo Estudiante): Una lista que almacena los estudiantes inscritos en el curso.
 *  * Métodos:
 *  *
 *  * Un constructor que tome el nombre y el profesor del curso.
 *  * Un método agregarEstudiante(Estudiante estudiante) que agregue un estudiante al curso.
 *  * Un método mostrarEstudiantesInscritos() que muestre los nombres de los estudiantes inscritos en el curso.
 *
 */
public class Curso {
    private String nombre;
    private Profesor profesor;
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();

    /**
     * agrega un estudiante al curso.
     * @param estudiante
     * @return boolean
     */
    public boolean agregarEstudiante(Estudiante estudiante){
        if(estudiante != null){
            estudiantesInscritos.add(estudiante);
            return true;
        }else{
            return false;
        }
    }

    /**
     * Muestra los nombres de los estudiantes inscritos en el curso
     */
    public void mostrarEstudiantesInscritos(){
        if(estudiantesInscritos.isEmpty()){
            System.out.println("No hay estudiantes inscriptos en el curso");
        }else{
            System.out.println("Estudiantes inscriptos en " + this.nombre +": ");
            for(Estudiante estudiante : estudiantesInscritos){
                System.out.println(estudiante.getNombre());
            }
        }

    }

    //constructores
    public Curso(String nombre, Profesor profesor){
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public Curso(){}

    public Curso(String nombre, Profesor profesor, List<Estudiante> estuiantesInscritos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantesInscritos = estuiantesInscritos;
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstuiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstuiantesInscritos(List<Estudiante> estuiantesInscritos) {
        this.estudiantesInscritos = estuiantesInscritos;
    }

    //toString
    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                ", estuiantesInscritos=" + estudiantesInscritos +
                '}';
    }
}
