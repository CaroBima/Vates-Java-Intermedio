package com.curso.clase10.tiempo;

import java.time.LocalDate;

class Famoso {
    private String nombre;
    private LocalDate fechaCumpleaños;

    public Famoso(String nombre, int año, int mes, int día) {
        this.nombre = nombre;
        this.fechaCumpleaños = LocalDate.of(año, mes, día);
    }
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCumpleaños() {
        return fechaCumpleaños;
    }
}