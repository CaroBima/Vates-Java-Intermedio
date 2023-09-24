package com.curso.practicasChatGpt.tiendaOnline;

/*
Supongamos que estás desarrollando un programa para una tienda en línea que vende productos electrónicos.
Tienes una lista de objetos Producto que representan los productos en stock. Cada objeto Producto  tiene
los siguientes atributos:

nombre (String): El nombre del producto.
precio (double): El precio del producto.
categoria (String): La categoría a la que pertenece el producto (por ejemplo, "smartphone", "laptop",
* "tablet", etc.).
disponible (boolean): Un indicador de si el producto está disponible para la venta.
Tu tarea es realizar las siguientes operaciones utilizando programación funcional:

Filtrar los productos disponibles y que pertenecen a la categoría "smartphone".
Calcular el precio promedio de los smartphones disponibles.
Crear una lista de los nombres de los smartphones disponibles y ordenarla alfabéticamente.
Eliminar los nombres duplicados de los smartphones disponibles.
Contar cuántos smartphones únicos están disponibles.
Imprimir en la consola los nombres de los smartphones disponibles en orden alfabético.
* */
public class Producto {
    private String nombreProducto;
    private Double precioProducto;
    private String categoria;
    private boolean disponible;


    //constructores
    public Producto(String nombreProducto, Double precioProducto, String categoria, boolean disponible) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public Producto() {
    }

    //getters y setters

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
