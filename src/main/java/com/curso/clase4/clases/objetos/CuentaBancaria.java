package com.curso.clase4.clases.objetos;

public class CuentaBancaria {
    private Integer numeroCuenta;
    private Double saldo;


    /**
     * Toma una cantidad como argumento y la agrega al saldo de la cuenta
     */
    public void depositar(double cantidad){
        saldo += cantidad;
    }

    /**
     * Toma una cantidad como argumento y la resta al saldo de la cuenta
     * Si no hay suficiente saldo no permite el retiro
     */
    public boolean retirar(double importe){
        if (saldo >= importe){
            saldo -=importe;
            return true;
        }else {
            //System.out.println("Fondos insuficientes");
            return false;
        }
    }

    /**
     *Devuelve el saldo actual de la cuenta
     */
    public double consultarSaldo(){
        return saldo;
    }
    //constructores

    /**
     * Constructor que toma un numero de cuenta e inicializa el saldo en 0
     * @param numeroCuenta
     */
    public CuentaBancaria(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }
    public CuentaBancaria() {
    }

    public CuentaBancaria(Integer numeroCuenta, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }



    //getters y setters

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
