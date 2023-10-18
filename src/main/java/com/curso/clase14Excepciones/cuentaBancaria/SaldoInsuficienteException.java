package com.curso.clase14Excepciones.cuentaBancaria;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
