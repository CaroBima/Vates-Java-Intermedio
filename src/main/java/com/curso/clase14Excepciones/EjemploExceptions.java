package com.curso.clase14Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploExceptions {
    public static void main(String[] args) throws MiExcepcion {
        int numerador = 10;
        int denominador = 0;
        try{
            int resultado = numerador /denominador;
        }catch (ArithmeticException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error en la división");
        }

    }

    /**
     * Excepción personalizada
     * @throws MiExcepcion
     */
    void metodoConMiExcepcion() throws MiExcepcion{
        //codigo ...
        if(true){
            throw new MiExcepcion("Descripción del error que ocurrió");
        }
    }
    void supressedExceptions(){
        //esto se usa para que la ultima excepcion quede "oculta" al tirarse por el finally
        //puede usarse cuando hay datos sensibles que no deben ser mostrados por ejemplo
        try{
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            //se puede capturar la excepcion y hacer cosas para salvarla, entonces no se muestra la excepcion aca
        } finally {
            //close.conn
            throw new ArithmeticException();
        }
    }
    void ExceptionWithResources(){
        try(BufferedReader br = new BufferedReader(new FileReader("arhivo.txt"))){
            // en este ejemplo captura tres excepciones de manera diferente, las excepciones tienen que ser manejadas
            // en el orden en el que pueden aparecer, por ejemplo, la generica deberian evitarse o si se ponen
            // tiene que ir al final
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }catch (Exception e){} // excepcion generica al final, si no da error
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
