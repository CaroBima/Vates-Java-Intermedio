package com.curso.clase14Excepciones;

public class EjemploExceptions {
    public static void main(String[] args) {

    }

    void multipleException(){
        try{
            //codigo
        }catch(ArithmeticException | NumberFormatException e){//se pueden capturar varias excepciones de esta forma
            //manejo de la excepcion
            e.printStackTrace();
            //log.error... lo ideal es loguearlo, log.error para error, tambien se puede usar log.info
        }finally{
            //opcional
            //close.conn por ejemplo para cerrar una conexion
        }
    }
}
