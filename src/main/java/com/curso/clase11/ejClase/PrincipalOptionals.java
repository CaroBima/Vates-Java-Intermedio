package com.curso.clase11.ejClase;

import java.util.Optional;

public class PrincipalOptionals {
    public static void main(String[] args) throws Exception {
        Optional<String> cadenaOptional = Optional.of("Hola mundo");

        String nombre = null;

        Optional<String> nombreOptional = Optional.ofNullable(nombre);

        Optional<String> optionalVacio = Optional.empty();

        if(cadenaOptional.isPresent()){
            System.out.println("Is present");
        }

        //otra forma sin if edesde java 8:
        cadenaOptional.ifPresent(valor -> System.out.println("Valor is present") );

        String valor = optionalVacio.orElse("Estaba vacio");
        System.out.println(valor);

        String valor2 = optionalVacio.orElseGet(()-> obtenerValorPorDefecto());//uso del suplier con el orElseGet(). Ejecuta la funcion que va a asignar el valor
        System.out.println(valor2);

        try {
            String valor3 = optionalVacio.orElseThrow(() -> new Exception("No se encontro")); //tira excepcion
        }catch(Exception e){
            System.out.println("Dio exception " + e.getMessage());
        }

        Optional<String> optionalFiltrado = cadenaOptional.filter(valorX -> valorX.startsWith("H")); //valida si comienza con h
        optionalFiltrado.ifPresent(System.out::println); //si esta presente el dato lo muestra por pantalla

        //optional con map
        Optional<Integer> optionalLongitud = cadenaOptional.map( z -> z.length());
        optionalLongitud = cadenaOptional.map(String::length); //otra forma
        System.out.println(optionalLongitud);
        System.out.println(optionalLongitud.isPresent()); //imprime true or false
    }

    private static String obtenerValorPorDefecto() {
        return "Desde el orElseGet";
    }
}
