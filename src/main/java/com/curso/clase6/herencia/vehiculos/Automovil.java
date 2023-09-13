package com.curso.clase6.herencia.vehiculos;

public class Automovil extends Vehiculo{
    private String motor;
    private int cantPuertas;

    @Override
    public String mostrarInfo(){
        return "Motor: " + motor + " , cantPuertas: " + cantPuertas;
    }

    @Override
    public String obtenerTipoMotor(){
        return motor;
    }
    public Automovil(int cantidadRuedas,  int cantPuertas) {
        super(cantidadRuedas);
        this.motor = "Combustión interna";
        this.cantPuertas = cantPuertas;
    }
}
