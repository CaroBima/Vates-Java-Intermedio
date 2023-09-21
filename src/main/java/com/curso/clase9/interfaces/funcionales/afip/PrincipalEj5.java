package com.curso.clase9.interfaces.funcionales.afip;

/*
calculador de impuestos
recibe un monto y devuelve un monto (decimal)
metodo calcular impuestos
implementacion: calcula impuestos quitandole un 17%
*/
public class PrincipalEj5 {
    public static void main(String[] args) {
        Afip impuestos = salario -> salario * 0.17;

        double salarioConDescuentos = impuestos.calcularImpuestos(350000);

        System.out.println();
        System.out.println(salarioConDescuentos);

        // hacer impuesto a las ganancias arriba de 1000 se le descuenta un 5% adicional (17 + 5)
        //array para verlo
    }



}
