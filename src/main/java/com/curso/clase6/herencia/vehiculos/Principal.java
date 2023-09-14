package com.curso.clase6.herencia.vehiculos;

public class Principal {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[4];

        vehiculos[0] = new Automovil(4, 5);
        vehiculos[1] = new Camion(6,3000);
        vehiculos[2] = new Motocicleta(2, 150);
        vehiculos[3] = new Motocicleta(2, 900);

        for(Vehiculo vehiculo : vehiculos){
            System.out.println("Impuestos: " + vehiculo.calcularImpuestos(250000.0));
            System.out.println("Info: " + vehiculo.mostrarInfo());
            System.out.println("Tipo motor: " + vehiculo.obtenerTipoMotor());



        }
    }
}
