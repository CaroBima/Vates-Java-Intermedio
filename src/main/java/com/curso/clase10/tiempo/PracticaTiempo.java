package com.curso.clase10.tiempo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PracticaTiempo {
    public static void main(String[] args) {
        //Manejo de tiempo: LocalDate, LocalTime, LocalDateTime, ZoneDateTime, Instant, Period

        LocalDate fechaActual = LocalDate.now(); //fecha actual
        LocalTime horaActual = LocalTime.now(); //hora actual
        LocalDateTime fechaYHoraActual = LocalDateTime.now();// fecha y hora actual

        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Hora actual: " + horaActual);
        System.out.println("Fecha y hora actual: " + fechaYHoraActual);

        LocalDate fechaFutura = fechaActual.plusDays(7); // da la fecha dentro de 7 días
        System.out.println("Fecha futura: " + fechaFutura);

        LocalDate fechaPasada = fechaActual.minusMonths(4); //fecha actual menos 4 meses
        System.out.println("Fecha actual menos cuatro meses: " + fechaPasada);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formato);
        System.out.println("Fecha formateada: " + fechaFormateada);

        LocalDate fechaParseada = LocalDate.parse(fechaFormateada, formato); //convierte string a fecha
        //LocalDate fechaParseada = LocalDate.parse("22/05/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("String parseado a fecha: " + fechaParseada);


    }
}
