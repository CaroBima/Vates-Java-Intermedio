package com.curso.clase5.vehiculos;

import java.util.Date;

/*
Crea una jerarquía de clases que modele diferentes tipos de vehículos, como automóviles y motocicletas.

Define una clase base abstracta llamada Vehiculo con los siguientes atributos privados:

marca (String): la marca del vehículo.
modelo (String): el modelo del vehículo.
año (int): el año de fabricación del vehículo.

En la clase base Vehiculo, define un constructor protegido que permita inicializar los atributos mencionados anteriormente.

Agrega un método abstracto llamado acelerar() en la clase base Vehiculo. Este método debe representar la acción de acelerar
el vehículo. No es necesario proporcionar una implementación en la clase base. public abstract void acelerar();

Crea dos clases derivadas: Automovil y Motocicleta. Ambas deben heredar de la clase base Vehiculo.

Para cada una de las clases derivadas (Automovil y Motocicleta), define un constructor público que permita inicializar los
 atributos específicos de cada tipo de vehículo.

En las clases derivadas (Automovil y Motocicleta), implementa el método acelerar() de acuerdo con las características de
 cada tipo de vehículo. Por ejemplo, puedes simular un aumento de velocidad en kilómetros por hora.

En el programa principal (ProgramaPrincipal), crea instancias de objetos de tipo Automovil y Motocicleta. Asigna valores
 para la marca, modelo y año de fabricación utilizando los constructores definidos en las clases derivadas.

Utiliza los objetos creados para mostrar información sobre cada vehículo, como su descripción (marca, modelo y año) y
simular la acción de acelerar utilizando el método acelerar().
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anio;

    /**
     * Constructor protegido que permita inicializar los atributos mencionados anteriormente
     */
    protected Vehiculo(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    /**
     * Agrega un método abstracto llamado acelerar() en la clase base Vehiculo. Este método debe representar la acción de acelerar
     * el vehículo. No es necesario proporcionar una implementación en la clase base.
     */
    public abstract void acelerar();

    public String getDescripcion(){
        return anio + ", " + modelo + ", " + marca;
    }
}
