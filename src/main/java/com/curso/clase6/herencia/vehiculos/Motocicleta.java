package com.curso.clase6.herencia.vehiculos;

public class Motocicleta extends Vehiculo{
    private String motor;
    private int cilindrada;

    @Override
    public String mostrarInfo(){
        return "Motor: " + motor + " , cilindrada: " + cilindrada;
    }

    @Override
    public String obtenerTipoMotor(){
        return motor;
    }
    public Motocicleta(int cantidadRuedas, int cilindrada) {
        super(cantidadRuedas);
        this.cilindrada = cilindrada;
        this.motor = "Dos tiempos";
    }
}
