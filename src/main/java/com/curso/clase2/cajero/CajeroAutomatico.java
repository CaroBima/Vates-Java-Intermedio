package com.curso.clase2.cajero;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
-Desarrolla un programa que simule un cajero automático. Permite al usuario realizar  depósitos, retiros y
consultar su saldo. Lleva un registro de las transacciones.

- Crea un juego de adivinanza donde la computadora elige una palabra al azar y muestra una serie de guiones
bajos representando las letras. El jugador debe adivinar la palabra letra por letra.

- Escribe un programa que genere una tabla de multiplicar del 1 al 10 para un número ingresado por el usuario.
 */
public class CajeroAutomatico {
    public static void main(String[] args) {
        List<Cuenta> cuenta = new ArrayList<>();


        cuenta = depositar(350, cuenta);
        cuenta = depositar(650, cuenta);

    }

    /**
     * Permite registrar depósitos en la cuenta
     * @param importe
     * @param cuenta
     * @return
     */
    public static List<Cuenta> depositar(double importe, List<Cuenta> cuenta){

        Cuenta nuevoDeposito = new Cuenta();

        nuevoDeposito.setIdTransaccion(cuenta.size());
        nuevoDeposito.setImporteTransaccion(importe);
        nuevoDeposito.setFechaTransaccion(new Date());
        nuevoDeposito.setTotalCuenta(nuevoDeposito.getTotalCuenta() + importe);
        nuevoDeposito.setTipoTransacción("Depósito");

        cuenta.add(nuevoDeposito);

        return cuenta;
    }


    /**Muestra el menú de y permite el ingreso de una opción
     *
     * @return opcionElegida
     */
    public int  menuSeleccion(){
        int opcionElegida = 0;
        Scanner scanner = new Scanner(System.in);

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Retiro");
            System.out.println("4 - Consultar transacciones");
            System.out.println("5 - Salir");

            while (!scanner.hasNextDouble() || opcionElegida <1 || opcionElegida>5) {
                System.out.println("No es un valor numérico válido. Inténtalo de nuevo.");
                scanner.next();
            }

            opcionElegida = scanner.nextInt();
            scanner.close();

        return opcionElegida;
    }
}
