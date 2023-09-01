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
    private static List<Cuenta> cuenta = new ArrayList<>();

    public static void main(String[] args) {
        List<Cuenta> cuenta = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcionElegida = 0;


        do {
            opcionElegida = menuSeleccion(scanner);


            switch (opcionElegida) {
                case 1:
                    if (cuenta.size() != 0) {
                        System.out.println("Saldo:" + cuenta.get(cuenta.size()-1).getTotalCuenta());
                    } else {
                        System.out.println("******************************************");
                        System.out.println(" No se registraron depósitos en su cuenta.");
                        System.out.println("******************************************");
                    }
                    break;
                case 2:
                    depositar(scanner);
                    break;
                case 3:
                    System.out.println("******************************************");
                    System.out.println("               Retiro de money");
                    System.out.println("******************************************");
                    break;
                case 4:
                    System.out.println("******************************************");
                    System.out.println("         Consulta de transacciones");
                    System.out.println("******************************************");
                    break;
                case 5:
                    System.out.println("******************************************");
                    System.out.println("                  Chau");
                    System.out.println("******************************************");
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }while(opcionElegida != 5);

    }

    /**Permite registrar depósitos en la cuenta
     * @Param scanner
     */
    public static void depositar(Scanner scanner){

        Cuenta nuevoDeposito = new Cuenta();
        Double importe = 0.0;


        boolean entradaValida = false;

        System.out.print("Importe a depositar:");

        while (true) {
            if (scanner.hasNextDouble()) {
                importe = scanner.nextDouble();
                break; // Salir del bucle si se ingresa un valor double
            } else {
                System.out.println("Entrada no válida. Inténtalo de nuevo.");
                //scanner.next(); // Limpiar el búfer de entrada
            }
        }

        System.out.println(importe);
        nuevoDeposito.setIdTransaccion(cuenta.size());
        nuevoDeposito.setImporteTransaccion(importe);
        nuevoDeposito.setFechaTransaccion(new Date());
        if(cuenta.size()>0){
            nuevoDeposito.setTotalCuenta(cuenta.get(cuenta.size()-1).getTotalCuenta() + importe);
        }else{
            nuevoDeposito.setTotalCuenta(importe);//si es 0 es el primer registro
        }
        nuevoDeposito.setTipoTransacción("Depósito");

        cuenta.add(nuevoDeposito);
        System.out.println("Se añadieron $" + importe);
        System.out.println("Total en la cuenta: $"+ nuevoDeposito.getTotalCuenta());

    }


    /**Muestra el menú de y permite el ingreso de una opción
     *
     * @return opcionElegida
     */
    public static int  menuSeleccion(Scanner scanner){
        int opcionElegida = 0;


        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depósito");
        System.out.println("3 - Retiro");
        System.out.println("4 - Consultar transacciones");
        System.out.println("5 - Salir");
        System.out.print("Ingrese el número de opción: ");
        while (true) {
            if (scanner.hasNextInt()) {
                opcionElegida = scanner.nextInt();
                if (opcionElegida >= 1 && opcionElegida <= 5) {
                    break; // Salir del bucle si la entrada es válida
                } else {
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("No es un valor numérico válido. Inténtalo de nuevo.");
                //scanner.next(); // Limpiar el búfer de entrada
            }
        }

        return opcionElegida;
    }
}
