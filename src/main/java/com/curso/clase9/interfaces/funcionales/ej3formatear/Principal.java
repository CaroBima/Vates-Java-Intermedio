package com.curso.clase9.interfaces.funcionales.ej3formatear;

//formateador que tome una cadena y devuelva una cadena

import java.util.Locale;

public class Principal {

    public void aplicarFormato(String texto, FormateadorTexto formateador){
        // cuando hay mas de un uso se crea la funcion que recibe la instancia para que se aplique lo que se necesita realizar
        String textoFormateado = formateador.formatear(texto);
        System.out.println( " Texto formateado>: " + textoFormateado);
    }
    public static void main(String[] args) {
        FormateadorTexto todoMayusculas = texto -> texto.toUpperCase(Locale.ROOT);
        FormateadorTexto todoMinusculas = texto -> texto.toLowerCase(Locale.ROOT);
        String texto = "Este es un texto para comprobar las interfaces funcionales";

        String textoMayusculas = todoMayusculas.formatear(texto);
        String textoMinusculas = todoMinusculas.formatear(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto en mayusculas: " + textoMayusculas);
        System.out.println("Texto en minúsculas: " + textoMinusculas);


    }
}
