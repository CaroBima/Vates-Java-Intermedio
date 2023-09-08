package com.curso.clase5.vehiculos;

public class Automovil extends Vehiculo{
    private Integer cantPuertas;
    private Integer velocidad;


    /**
     * Constructor protegido que permita inicializar los atributos mencionados anteriormente
     *
     * @param marca
     * @param modelo
     * @param anio
     * @param cantPuertas
     */
    public Automovil(String marca, String modelo, Integer anio, Integer cantPuertas) {
        super(marca, modelo, anio);
        this.cantPuertas = cantPuertas;
        this.velocidad = 1;
    }

    @Override
    public void acelerar(){
        velocidad+=10;
    }

    public Integer getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(Integer cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
