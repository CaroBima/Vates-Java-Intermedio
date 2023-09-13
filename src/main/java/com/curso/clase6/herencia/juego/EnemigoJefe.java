package com.curso.clase6.herencia.juego;

public class EnemigoJefe extends Enemigo{
    @Override
    public void atacar(){
        System.out.println("Te ataca un enemigo jefe");
    }
}
