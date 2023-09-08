package com.curso.clase5;

import java.util.Date;

//Crea una clase Configuracion que represente la configuración de una aplicación. Implementa un constructor
// privado en Configuracion y un método estático de fábrica para crear instancias de Configuracion.
public class Configuracion {
    private String nombreApp;
    private boolean modoDebug;
    private Date fechaDeploy;

    private Configuracion(String nombreApp, boolean modoDebug, Date fechaDeploy) {
        this.nombreApp = nombreApp;
        this.modoDebug = modoDebug;
        this.fechaDeploy = fechaDeploy;
    }

    public static Configuracion crearConfig(String nombreApp, boolean modoDebug, Date fechaDeploy){
        return new Configuracion(nombreApp, modoDebug, fechaDeploy);
    }
}
