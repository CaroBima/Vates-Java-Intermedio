package com.curso.clase10.tiempo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Practica {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(1987, 9, 22); //se le asigna la fecha directamente
        LocalDate fecha2 = LocalDate.of(1984, 10, 13);

        System.out.println(diferenciaFechas(fecha1, fecha2));

        LocalDate fechaNacimiento = LocalDate.of(1980, Month.NOVEMBER, 11); //otra forma de hacerlo
        LocalDate fechaActual = LocalDate.now();

        LocalDate proximoCumple = fechaNacimiento.withYear(fechaActual.getYear());
        if(proximoCumple.isBefore(fechaActual) || proximoCumple.isEqual(fechaActual)){
            proximoCumple = proximoCumple.plusYears(1); //si ya paso le suma un año
        }
        Period periodo = Period.between(fechaActual, proximoCumple);
        System.out.println("Tu cumple es en: " + periodo.getMonths() + " mes y " + periodo.getDays() + "dias");

        //cant dias:
        System.out.println(diasParaCumple() + " días");

        //conocer un dia de la semana
        LocalDate fecha = LocalDate.of(2023, 9, 13);
        System.out.println("El día de la semana fue: " + fecha.getDayOfWeek());

        //edad de una persona en años, meses y días
        LocalDate fechaNacimiento1 = LocalDate.of(1980, 11, 11);
        Period periodo1 = Period.between(fechaNacimiento1, fechaActual);
        System.out.println("Tienes " + periodo1.getYears() + " años, " + periodo1.getMonths() + " meseses, " + periodo1.getDays() + " días" );


        //calcular edad promedio de una lista de fecha de nacimientos que tenemos
        List<LocalDate> fechasNacimiento = new ArrayList<>();
        fechasNacimiento.add(LocalDate.of(1990, 5, 20));
        fechasNacimiento.add(LocalDate.of(1985, 3, 15));
        fechasNacimiento.add(LocalDate.of(1992, 9, 5));
        fechasNacimiento.add(LocalDate.of(1988, 11, 10));

        Double promedio = fechasNacimiento.stream()
                .mapToInt(fechaNac -> Period.between(fechaNac, LocalDate.now()).getYears())
                .average()
                .orElse(0.0); //devuelve un Optional, puede devolverlo vacio si esta vacia la lista, entonces para evitar un null pointer se hace el orElse mandando cero

        System.out.println("El promedio de edades es de " + promedio + " años");

        //calcular horas de trabajo entre dos fechas por ejemplo

        //
    }


    //calcula dos fechas y la muestra en pantalla
    public static long diferenciaFechas(LocalDate fecha1, LocalDate fecha2){
        long diferencia = ChronoUnit.DAYS.between(fecha1, fecha2);
        return diferencia;
    }

    //calcule la fecha de cumpleaños dada la fecha actual y la fecha de nacimiento de la persdona
    public static int diasParaCumple(){
        LocalDate fechaNacimiento = LocalDate.of(1980, Month.NOVEMBER, 11); //otra forma de hacerlo
        LocalDate fechaActual = LocalDate.now();

        LocalDate proximoCumple = fechaNacimiento.withYear(fechaActual.getYear());
        if(proximoCumple.isBefore(fechaActual) || proximoCumple.isEqual(fechaActual)){
            proximoCumple = proximoCumple.plusYears(1); //si ya paso le suma un año
        }

        Period periodo = Period.between(fechaActual, proximoCumple);
        int diasMonth = periodo.getMonths()*30;
        int dias = periodo.getDays();

        return (diasMonth + dias);
    }
}
