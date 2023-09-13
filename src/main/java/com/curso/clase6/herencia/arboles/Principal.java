package com.curso.clase6.herencia.arboles;

public class Principal {
    public static void main(String[] args) {
        Arbol limonero = new Limonero("limonero", 200);

        System.out.println(limonero.mostrarInfo());
        System.out.println(limonero.mostrarFruta());
    }
}
