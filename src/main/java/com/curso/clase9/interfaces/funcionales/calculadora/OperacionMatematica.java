package com.curso.clase9.interfaces.funcionales.calculadora;

//la interfaz funcional puede tener solo un metodo
@FunctionalInterface
public interface OperacionMatematica {
    int operar(int a, int b);
}
