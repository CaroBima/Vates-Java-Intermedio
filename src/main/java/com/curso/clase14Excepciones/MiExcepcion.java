package com.curso.clase14Excepciones;

/**
 * Creacion de excepción personalizada
 */
public class MiExcepcion extends Exception{

    /**
     * Método constructor
     * @param mensaje
     */
    public MiExcepcion(String mensaje){
        super(mensaje);
    }
}
