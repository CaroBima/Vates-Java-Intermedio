package com.curso.clase5.vehiculos;

import java.net.Inet4Address;

public class Motocicleta extends Vehiculo {
    private Integer velocidad;

    /**
     * Constructor protegido que permita inicializar los atributos mencionados anteriormente
     *
     * @param marca
     * @param modelo
     * @param anio
     */
    protected Motocicleta(String marca, String modelo, Integer anio) {
        super(marca, modelo, anio);
        this.velocidad = 1;
    }

    @Override
    public void acelerar() {
        velocidad+=20;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
