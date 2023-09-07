package com.curso.clase4.gestion.escuelas;

/**
 * Clase Profesor:
 *  *
 *  * Atributos:
 *  *
 *  * nombre (String): El nombre del profesor.
 *  * cursoDictado (Curso): El curso que el profesor está dictando.
 *  * Métodos:
 *  *
 *  * Un constructor que tome el nombre del profesor.
 *  * Un método asignarCurso(Curso curso) que asigne un curso al profesor.
 */
public class Profesor {
    private String nombre;
    private Curso cursoDictado;

    /**
     * Asigna un curso al profesor
     * @param curso
     * @return boolean
     */
    public boolean asignarCurso(Curso curso){
        if(curso != null){
            this.cursoDictado = curso;
            return true;
        }else{
            return false;
        }

    }

    //Constructores:
    public Profesor(String nombre){
        this.nombre = nombre;
    }
    public Profesor (){}
    public Profesor(String nombre, Curso cursoDictado) {
        this.nombre = nombre;
        this.cursoDictado = cursoDictado;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso getCursoDictado() {
        return cursoDictado;
    }

    public void setCursoDictado(Curso cursoDictado) {
        this.cursoDictado = cursoDictado;
    }

    //toString

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", cursoDictado=" + cursoDictado +
                '}';
    }
}
