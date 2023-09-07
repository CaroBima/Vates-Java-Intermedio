package com.curso.clase4.clases.objetos;

public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(1);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria(2);


        cuentaBancaria1.depositar(1000);
        cuentaBancaria2.depositar(500);
        cuentaBancaria1.retirar(200);

        System.out.println(cuentaBancaria1.consultarSaldo());
        System.out.println(cuentaBancaria2.consultarSaldo());

        /*
        Estudiante estudiante1 = new Estudiante("Pablo", 24, 7.8);

        Estudiante estudiante2 = new Estudiante("Mariela", 36, 10);
        Estudiante estudiante3 = new Estudiante("Jose", 83, 3.2);
        Estudiante estudiante4 = new Estudiante("Alicia", 33, 5.2);

        System.out.println("Estudiante 1: " + estudiante1.toString());
        System.out.println("Estudiante 2: " + estudiante2.toString());
        System.out.println("Estudiante 3: " + estudiante3.toString());
        System.out.println("Estudiante 4: " + estudiante4.toString());

        System.out.println("Estudiante 1: " + estudiante1.aprobarExamen());
        System.out.println("Estudiante 2: " + estudiante2.aprobarExamen());
        System.out.println("Estudiante 3: " + estudiante3.aprobarExamen());
        System.out.println("Estudiante 4: " + estudiante4.aprobarExamen());

        List<Estudiante> listaEstudiantes = new ArrayList<>();

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);



        double promedioGeneral = Estudiante.promedioGeneral(listaEstudiantes);

        System.out.println("El promedio general es: " + promedioGeneral);

        estudiante3.setPromedio(7.6);
        estudiante4.setPromedio(9.1);

        System.out.println("Estudiante 1: " + estudiante1.aprobarExamen());
        System.out.println("Estudiante 2: " + estudiante2.aprobarExamen());
        System.out.println("Estudiante 3: " + estudiante3.aprobarExamen());
        System.out.println("Estudiante 4: " + estudiante4.aprobarExamen());

        double promedioGeneral2 = Estudiante.promedioGeneral(listaEstudiantes);
        System.out.println("El promedio general es: " + promedioGeneral2);
        */
       /* Libro libro1 = new Libro("Cien años de soledad", "Garcia Marquez", 1965);
        Libro libro2 = new Libro("Las malas", "Camila Sosa Villada", 2021);
        Libro libro3 = new Libro("Las olas", "Virginia Wolf", 1935);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibros(libro1);
        biblioteca.agregarLibros(libro2);
        biblioteca.agregarLibros(libro3);

        biblioteca.mostrarListaLibros();

        */
    }
}
