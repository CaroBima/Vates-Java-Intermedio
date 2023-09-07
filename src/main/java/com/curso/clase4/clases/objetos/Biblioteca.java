package com.curso.clase4.clases.objetos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaLibros = new ArrayList<>();


    /**
     * Metodo que permite agregar un libro a la lista
     */
    public void agregarLibros(Libro libro){
        listaLibros.add(libro);
    }

    /**
     * Metodo que muestra la lista de libros
     *
     */
    public void mostrarListaLibros(){
        for(Libro libro : listaLibros){
            System.out.println(libro); //hace automaticamente el toString
        }
    }
    //constructores
    public Biblioteca() {
    }

    public Biblioteca(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    //getters y setters

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLibros=" + listaLibros +
                '}';
    }
}
