package com.curso.clase7.java8.gestionEmpleados;

/*
Ejercicio: Gestión de Empleados
Crea una clase Empleado con las siguientes propiedades: nombre, salario base mensual, y un método
calcularSalarioMensual() que devuelve el salario base.
Luego, crea dos subclases de Empleado: Gerente y Vendedor.
    * Para la clase Gerente, agrega las propiedades de bono mensual y número de subordinados. Sobrescribe el método
    calcularSalarioMensual() para que incluya el bono en el salario.
    * Para la clase Vendedor, agrega las propiedades de comisión mensual y ventas mensuales. Sobrescribe el método
    calcularSalarioMensual() para calcular el salario base más la comisión en función de las ventas.
Finalmente, en la clase principal (Main), crea instancias de varios empleados, incluyendo gerentes y vendedores, y
calcula sus salarios mensuales. Luego, muestra los detalles de todos los empleados y resalta quiénes ganaron más
de $5,000 al mes.
Este ejercicio permite practicar la herencia, la sobrescritura de métodos y el uso de clases abstractas o interfaces
para representar a los empleados y calcular sus salarios.
 */
public class Principal {
    public static void main(String[] args) {
        Empleado[] gerentes = new Gerente[2];
        Empleado[] vendedores = new Vendedor[4];

        gerentes[0] = new Gerente("Paula", 450000.59, 100000, 10 );
        gerentes[1] = new Gerente("Miguel", 400000, 105000, 5 );

        vendedores[0] =  new Vendedor("José", 275000, 5000, 135 );
        vendedores[1] = new Vendedor("Mariela", 375000, 10000, 1 );
        vendedores[2] = new Vendedor("Luis", 500, 5000, 0 );
        vendedores[3] = new Vendedor("Carolina", 375000, 1500, 1000 );


        System.out.println("Salarios mensuales de gerentes: ");
        System.out.println("Gerente: " + gerentes[0].getNombre() + "\nSalario mensual: " + gerentes[0].calcularSalarioMensual());
        System.out.println("             **************               ");
        System.out.println("Gerente: " + gerentes[1].getNombre() + "\nSalario mensual: " + gerentes[1].calcularSalarioMensual());

        System.out.println("\nSalarios mensuales de Empleados: ");
        for (Empleado vendedor : vendedores){
            System.out.println("\nNombre:" + vendedor.getNombre() + "\nSalario mensual: " + vendedor.calcularSalarioMensual());
            if(vendedor.calcularSalarioMensual() > 5000){
                System.out.println("El vendedor superó los 5000 mensuales");
            }
            System.out.println("             **************               ");
        }
    }
}
