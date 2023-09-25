package com.curso.practicasChatGpt.tiendaOnline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
public class Principal {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        cargaProductos(listaProductos);

        //Filtrar los productos disponibles y que pertenecen a la categoría "smartphone".
        List<Producto> smartphonesDisponibles = listaProductos.stream()
                .filter(producto -> {
                    return producto.isDisponible() && producto.getCategoria().equals("Smartphone");
                })
                .collect(Collectors.toList());

        smartphonesDisponibles.forEach(producto -> {
            System.out.println("Nombre: " + producto.getNombreProducto());
            System.out.println("Precio: " + producto.getPrecioProducto());
            System.out.println("Categoría: " + producto.getCategoria());
            System.out.println("Disponible: " + producto.isDisponible());
            System.out.println("*******************************");
        });



        //Calcular el promedio de precios de los smartphones disponibles
        double promedioPrecios = smartphonesDisponibles.stream()
                .mapToDouble(Producto::getPrecioProducto)
                .average()
                .orElse(0.0);

        /*
        //otra forma:
        double totalPrecios = smartphonesDisponibles.stream().
                mapToDouble(Producto::getPrecioProducto).sum();

        double promedioPrecios = totalPrecios / smartphonesDisponibles.toArray().length;
        */
        System.out.println("Promedio de precios: " + promedioPrecios);


        //Crear una lista de los nombres de los smartphones disponibles y ordenarla alfabéticamente.
        List<String> disponiblesOrdenados = listaProductos.stream()
                .filter(producto -> {
                    return producto.isDisponible() && producto.getCategoria().equals("Smartphone");
                })
                .map(Producto::getNombreProducto)
                .sorted()
                .collect(Collectors.toList());

        //Imprimir en la consola los nombres de los smartphones disponibles en orden alfabético.
        System.out.print("Lista de nombres de smarthpones ordenada alfabeticamente: ");
        disponiblesOrdenados.forEach(producto -> {
                    System.out.print(producto + ", ");
        });

        //Eliminar los nombres duplicados de los smartphones disponibles.
        List<Producto> listaUnicos = listaProductos.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nLista de equipos sin repeticiones: ");
        listaUnicos.forEach(producto -> {
            System.out.println("Nombre: " + producto.getNombreProducto());
            System.out.println("Precio: " + producto.getPrecioProducto());
            System.out.println("Categoría: " + producto.getCategoria());
            System.out.println("Disponible: " + producto.isDisponible());
            System.out.println("*******************************");
        });

        System.out.println("Total de dispostivos unicos: " + listaUnicos.stream().count());
    }




    /**
     * Carga un listado de dispositivos en una lista
     * @param listaProductos
     */
    private static void cargaProductos(List<Producto> listaProductos){
        Producto cargaProducto = new Producto();

        cargaProducto.setNombreProducto("Mouse logitech");
        cargaProducto.setPrecioProducto(1500.50);
        cargaProducto.setCategoria("Perifércos");
        cargaProducto.setDisponible(true);
        listaProductos.add(cargaProducto);
        cargaProducto= new Producto();

        cargaProducto.setNombreProducto("Teclado");
        cargaProducto.setPrecioProducto(15500.50);
        cargaProducto.setCategoria("Perifércos");
        cargaProducto.setDisponible(false);
        listaProductos.add(cargaProducto);
        cargaProducto= new Producto();

        cargaProducto.setNombreProducto("Samsung a23");
        cargaProducto.setPrecioProducto(100500.50);
        cargaProducto.setCategoria("Smartphone");
        cargaProducto.setDisponible(true);
        listaProductos.add(cargaProducto);
        cargaProducto= new Producto();

        cargaProducto.setNombreProducto("Equipo audio sony");
        cargaProducto.setPrecioProducto(120500.50);
        cargaProducto.setCategoria("Audio");
        cargaProducto.setDisponible(true);
        listaProductos.add(cargaProducto);

        cargaProducto= new Producto();
        cargaProducto.setNombreProducto("Nokia 1100");
        cargaProducto.setPrecioProducto(150500.50);
        cargaProducto.setCategoria("Smartphone");
        cargaProducto.setDisponible(false);
        listaProductos.add(cargaProducto);
        listaProductos.add(cargaProducto);

        cargaProducto= new Producto();
        cargaProducto.setNombreProducto("Xiaomi modelo pulenta");
        cargaProducto.setPrecioProducto(250500.50);
        cargaProducto.setCategoria("Smartphone");
        cargaProducto.setDisponible(true);
        listaProductos.add(cargaProducto);
        listaProductos.add(cargaProducto);

        cargaProducto= new Producto();
        cargaProducto.setNombreProducto("Nokia 5300");
        cargaProducto.setPrecioProducto(95500.50);
        cargaProducto.setCategoria("Smartphone");
        cargaProducto.setDisponible(true);
        listaProductos.add(cargaProducto);

        cargaProducto= new Producto();
        cargaProducto.setNombreProducto("Motorola G545");
        cargaProducto.setPrecioProducto(1250500.50);
        cargaProducto.setCategoria("Smartphone");
        cargaProducto.setDisponible(true);
        listaProductos.add(cargaProducto);
        listaProductos.add(cargaProducto);
    }
}
