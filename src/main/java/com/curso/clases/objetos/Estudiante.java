package com.curso.clases.objetos;

import java.util.List;

public class Estudiante {
    private String nombre;
    private Integer edad;
    private Double promedio;

    /**
     * Metodo que indica si el alumno fue abrobado o no, se aprueba con 7 o mas
     *
     */
    public String aprobarExamen(){
        return (promedio > 7) ? nombre + " aprobo el exámen" : nombre + " reprobó";
    }


    /**
     *  Metodo que calcula el promedio general, recibe una lista de estudiantes y hace el promedio general
     */
    public static double promedioGeneral(List<Estudiante> listaEstudiantes){
        Double sumaPromedios = 0.0;
        if(listaEstudiantes.isEmpty()){
            return 0;
        }else{
            for(Estudiante estudiante : listaEstudiantes){
                sumaPromedios+= estudiante.getPromedio();
            }
            return sumaPromedios/listaEstudiantes.size();
        }


    }

    //constructores
    public Estudiante(){}

    public Estudiante(String nombre, int edad, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
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

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedio=" + promedio +
                '}';
    }
}

