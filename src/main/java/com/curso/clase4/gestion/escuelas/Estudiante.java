package com.curso.clase4.gestion.escuelas;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Estudiante:
 * * Atributos:
 *      nombre (String): El nombre del estudiante.
 *      edad (int): La edad del estudiante.
 *      cursosInscritos (ArrayList de tipo Curso): Una lista que almacena los cursos en los que está inscrito el estudiante.
 * * Métodos:
 *      Un constructor que tome el nombre y la edad del estudiante.
 *      Un método inscribirCurso(Curso curso) que inscriba al estudiante en un curso.
 *      Un método mostrarCursosInscritos() que muestre los nombres de los cursos en los que está inscrito el estudiante.
 */
public class Estudiante {
    private String nombre;
    private Integer edad;
    private List<Curso> cursosInscritos = new ArrayList<>();


    /**
     * Método inscribirCurso(Curso curso) que inscribe al estudiante en un curso.
     * @param curso
     *
     */
    public void inscribirCurso(Curso curso){
       this.cursosInscritos.add(curso);
    }

    /**
     * método mostrarCursosInscritos() que muestre los nombres de los cursos en los que está inscrito el estudiante
     *
     */
    public void mostrarCursosInscritos(){
        for(Curso curso : cursosInscritos){
            System.out.println(curso.getNombre());
        }
    }

    //Constructores
    public Estudiante(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante() {}

    public Estudiante(String nombre, Integer edad, List<Curso> cursosInscritos) {
        this.nombre = nombre;
        this.edad = edad;
        this.cursosInscritos = cursosInscritos;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    //toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", cursosInscritos=" + cursosInscritos +
                '}';
    }
}
