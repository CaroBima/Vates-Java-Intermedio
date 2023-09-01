package com.curso.clase2.cajero;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
*-Desarrolla un programa que simule un cajero automático. Permite al usuario realizar  depósitos, retiros y
*consultar su saldo. Lleva un registro de las transacciones.
*
*- Escribe un programa que genere una tabla de multiplicar del 1 al 10 para un número ingresado por el usuario.
 */


public class CajeroAutomatico {
    private static List<Cuenta> movimientosCuenta = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionElegida = 0;


        do {
            opcionElegida = menuSeleccion(scanner);


            switch (opcionElegida) {
                case 1: //Consulta de saldo
                    consultaSaldo();
                    break;
                case 2:
                    depositar(scanner);
                    break;
                case 3:
                    retirarDinero(scanner);
                    break;
                case 4:
                    mostrarTransacciones();
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

    /** Permite realizar la consulta de saldo disponible en la cuenta
     *
     */
    public static void consultaSaldo(){
        if (movimientosCuenta.size() != 0) {
            System.out.println("******************************************");
            System.out.println("Saldo: " + movimientosCuenta.get(movimientosCuenta.size()-1).getTotalCuenta());
            System.out.println("******************************************");
        } else {
            System.out.println("******************************************");
            System.out.println(" No se registraron depósitos en su cuenta.");
            System.out.println("******************************************");
        }
    }
    /**Permite registrar depósitos en la cuenta
     * @Param scanner
     */
    public static void depositar(Scanner scanner){

        Cuenta nuevoDeposito = new Cuenta();
        Double importe = 0.0;

        System.out.print("Importe a depositar: $");

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
        nuevoDeposito.setIdTransaccion(movimientosCuenta.size());
        nuevoDeposito.setImporteTransaccion(importe);
        nuevoDeposito.setFechaTransaccion(new Date());
        if(movimientosCuenta.size()>0){
            nuevoDeposito.setTotalCuenta(movimientosCuenta.get(movimientosCuenta.size()-1).getTotalCuenta() + importe);
        }else{
            nuevoDeposito.setTotalCuenta(importe); //si es 0 es el primer registro y no hay total para sumar
        }
        nuevoDeposito.setTipoTransacción("Depósito");

        movimientosCuenta.add(nuevoDeposito);
        System.out.println("******************************************");
        System.out.println("     Se añadieron $" + importe);
        System.out.println("     Total en la cuenta: $"+ nuevoDeposito.getTotalCuenta());
        System.out.println("******************************************");
    }


    /** Permite registrar el retiro de dinero
     *
     * @Param scanner
     */
    private static void retirarDinero(Scanner scanner){
        double importeRetiro = 0.0;
        double totalCuenta = 0.0;
        Cuenta nuevoRetiro = new Cuenta();

        System.out.println("******************************************");
        System.out.println("               Retirar dinero             ");
        System.out.println("******************************************");


        if(movimientosCuenta.size() != 0)
        {
            if(movimientosCuenta.get(movimientosCuenta.size()-1).getTotalCuenta()!=0){//hay depositos
                totalCuenta = movimientosCuenta.get(movimientosCuenta.size()-1).getTotalCuenta();
                System.out.println("Total disponible: $" + totalCuenta);
                System.out.print(" Ingrese el importe que desea retirar: $");
                while (true) {//ingreso el importe a retirar
                    if (scanner.hasNextDouble()) {
                        importeRetiro = scanner.nextDouble();
                        break; // Salir del bucle si se ingresa un valor double
                    } else {
                        System.out.println("Entrada no válida. Inténtalo de nuevo.");
                        //scanner.next(); // Limpiar el búfer de entrada
                    }
                }
                if(importeRetiro > totalCuenta){
                    System.out.println("No te alcanza. Tenés $" + totalCuenta +", no podés retirar $" + importeRetiro);
                }else{
                    nuevoRetiro.setIdTransaccion(movimientosCuenta.size());
                    nuevoRetiro.setTipoTransacción("Extracción");
                    nuevoRetiro.setFechaTransaccion(new Date());
                    nuevoRetiro.setImporteTransaccion(importeRetiro);
                    nuevoRetiro.setTotalCuenta(totalCuenta - importeRetiro);

                    System.out.println("******************************************");
                    System.out.println("     Extracción $" + importeRetiro);
                    System.out.println("     Total en la cuenta: $"+ nuevoRetiro.getTotalCuenta());
                    System.out.println("******************************************");

                    movimientosCuenta.add(nuevoRetiro);
                }
            }
        }else{
            System.out.println("******************************************");
            System.out.println("        No tiene saldo disponible         ") ;
            System.out.println("******************************************");
        }



    }

    /** Muestra el historial transaccione
     *
     */
    private static void mostrarTransacciones(){
        System.out.println("******************************************");
        System.out.println("         Consulta de transacciones");
        System.out.println("******************************************");

        for (Cuenta cuentaMov : movimientosCuenta) {
            System.out.println("Id de transacción: " + cuentaMov.getIdTransaccion());
            System.out.println("Fecha: " + cuentaMov.getFechaTransaccion());
            System.out.println("Tipo: " + cuentaMov.getTipoTransacción());
            System.out.println("Importe transacción: " + cuentaMov.getImporteTransaccion());
            System.out.println("Total disponible: " + cuentaMov.getTotalCuenta());
            System.out.println("******************************************");
        }
    }

    /** Muestra el menú de y permite el ingreso de una opción
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
