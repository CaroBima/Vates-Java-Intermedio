package com.curso.clase1;

//- Diseña una clase "Producto" con propiedades como nombre, precio y cantidad en inventario, y métodos para calcular el valor total.

public class Producto {
    private String nombre;
    private Double precio;
    private int stock;

    public double calcularValorTotal(int cantidad){
        return precio * cantidad;
    }

    public double calcularValorStock(){
        return precio + stock;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //constructores
    public Producto() {
    }

    public Producto(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

