package com.curso.clase5.vehiculos;

/*
En el programa principal (ProgramaPrincipal), crea instancias de objetos de tipo Automovil y Motocicleta. Asigna valores
 para la marca, modelo y año de fabricación utilizando los constructores definidos en las clases derivadas.

Utiliza los objetos creados para mostrar información sobre cada vehículo, como su descripción (marca, modelo y año) y
simular la acción de acelerar utilizando el método acelerar().
 */
public class Principal {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Fiat", "Cronos", 2023, 5);
        Motocicleta moto = new Motocicleta("Yamaha", "Z", 2023);

        System.out.println("Descripción del auto: " + automovil.getDescripcion());
        automovil.acelerar();

        System.out.println("Descripción de la moto: " + moto.getDescripcion());
        moto.acelerar();

    }
}
