package com.curso.clase10.tiempo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//calcular horas de trabajo entre dos fechas por ejemplo
//- Crea un programa que verifique si hoy es el cumpleaños de alguna celebridad en una lista
// de fechas de cumpleaños.
//- Crea un programa que muestre la hora actual en diferentes zonas horarias.
public class Ejercicios {
    public static void main(String[] args) {
        List<Famoso> famosos = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();

        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();

        agregarFamosos(famosos); // carga la lista de famosos

       /* List<Famoso> cumplenHoy = famosos.stream()
                .filter(famoso -> {


                })
                .collect(Collectors.toList());

        cumplenHoy.forEach(System.out::println);*/
    }



    private static void agregarFamosos(List<Famoso> famosos){
        // Agregar famosos a la lista
        // Agregar famosos a la lista
        famosos.add(new Famoso("Famoso 1", 1990, 8, 15));
        famosos.add(new Famoso("Famoso 2", 1985, 3, 25));
        famosos.add(new Famoso("Famoso 3", 1978, 11, 5));
        famosos.add(new Famoso("Famoso 4", 1995, 6, 10));
        famosos.add(new Famoso("Famoso 5", 1982, 2, 28));
        famosos.add(new Famoso("Famoso 6", 1992, 9, 28));
        famosos.add(new Famoso("Famoso 7", 1987, 12, 20));
        famosos.add(new Famoso("Famoso 8", 1976, 4, 14));
        famosos.add(new Famoso("Famoso 9", 1991, 7, 3));
        famosos.add(new Famoso("Famoso 10", 1980, 1, 12));
        famosos.add(new Famoso("Famoso 11", 1998, 10, 7));
        famosos.add(new Famoso("Famoso 12", 1979, 5, 18));
        famosos.add(new Famoso("Famoso 13", 1994, 8, 22));
        famosos.add(new Famoso("Famoso 14", 1983, 6, 30));
        famosos.add(new Famoso("Famoso 15", 1975, 9, 28));


       /* famosos.add(new Famoso("Famoso 1", LocalDate.of(1990, Month.AUGUST, 15)));
        famosos.add(new Famoso("Famoso 2", LocalDate.of(1985, Month.MARCH, 25)));
        famosos.add(new Famoso("Famoso 3", LocalDate.of(1978, Month.NOVEMBER, 5)));
        famosos.add(new Famoso("Famoso 4", LocalDate.of(1995, Month.JUNE, 10)));
        famosos.add(new Famoso("Famoso 5", LocalDate.of(1982, Month.FEBRUARY, 28)));
        famosos.add(new Famoso("Famoso 6", LocalDate.of(1992, Month.SEPTEMBER, 28)));
        famosos.add(new Famoso("Famoso 7", LocalDate.of(1987, Month.DECEMBER, 20)));
        famosos.add(new Famoso("Famoso 8", LocalDate.of(1976, Month.APRIL, 14)));
        famosos.add(new Famoso("Famoso 9", LocalDate.of(1991, Month.JULY, 3)));
        famosos.add(new Famoso("Famoso 10", LocalDate.of(1980, Month.JANUARY, 12)));
        famosos.add(new Famoso("Famoso 11", LocalDate.of(1998, Month.OCTOBER, 7)));
        famosos.add(new Famoso("Famoso 12", LocalDate.of(1979, Month.MAY, 18)));
        famosos.add(new Famoso("Famoso 13", LocalDate.of(1994, Month.AUGUST, 22)));
        famosos.add(new Famoso("Famoso 14", LocalDate.of(1983, Month.JUNE, 30)));
        famosos.add(new Famoso("Famoso 15", LocalDate.of(1975, Month.SEPTEMBER, 28)));

        */
    }


}
