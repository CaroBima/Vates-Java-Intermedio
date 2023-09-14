package com.curso.clase6.herencia.vehiculos;

public class Camion extends Vehiculo{

    private double capacidadCarga;
    private String motor;

    @Override
    public String mostrarInfo(){
        return "Motor: " + motor + " , capacidad de carga: " + capacidadCarga;
    }

    @Override
    public String obtenerTipoMotor(){
        return motor;
    }

    public Camion(int cantidadRuedas,  double capacidadCarga) {
        super(cantidadRuedas);
        this.capacidadCarga = capacidadCarga;
        this.motor = "Motor tipo camion";
    }


    @Override
    public double calcularImpuestos(double valorBase){
        return valorBase * 0.5;
    }
}
