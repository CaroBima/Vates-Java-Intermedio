package com.curso.clase5;

//Define una clase Producto que represente un producto en un sistema de inventario. Implementa varios constructores
// que permitan crear instancias de Producto con diferentes niveles de detalle (nombre, precio, cantidad en stock, etc.).
public class Producto {
    private Long codProducto;
    private String nombre;
    private String marca;
    private Double precioVta;
    private Double precioLista;
    private Integer stock;

    public Producto() {
    }

    public Producto(String nombre, String marca, Integer stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.stock = stock;
    }

    public Producto(Long codProducto, Double precioVta, Integer stock) {
        this.codProducto = codProducto;
        this.precioVta = precioVta;
        this.stock = stock;
    }

    public Producto(Long codProducto, String nombre, String marca, Double precioVta, Double precioLista, Integer stock) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.precioVta = precioVta;
        this.precioLista = precioLista;
        this.stock = stock;
    }

    public Long getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Long codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecioVta() {
        return precioVta;
    }

    public void setPrecioVta(Double precioVta) {
        this.precioVta = precioVta;
    }

    public Double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(Double precioLista) {
        this.precioLista = precioLista;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codProducto=" + codProducto +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precioVta=" + precioVta +
                ", precioLista=" + precioLista +
                ", stock=" + stock +
                '}';
    }
}
