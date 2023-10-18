package com.curso.clase14Excepciones.cuentaBancaria;

public class CuentaBancaria {
    private double saldo;
    public static void main(String[] args) throws SaldoInsuficienteException {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(1000);
        try{
            cuentaBancaria.retirarDinero(1400);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
            //hago cosas para procesar la info y el error
            throw e; //relanzo la excepción una vez hecho el procesamiento
        }
    }

    public CuentaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void retirarDinero(double cantidad) throws SaldoInsuficienteException{
        if(cantidad > saldo){
            throw new SaldoInsuficienteException("No tiene saldo suficiente");
        }
        saldo -= cantidad;
    }


}
