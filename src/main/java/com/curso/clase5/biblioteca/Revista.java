package com.curso.clase5.biblioteca;

/*
4. En la clase `Revista`, agrega un atributo adicional:
   - Número de edición

 */
public class Revista extends ItemBiblioteca{
    private Integer nroEdicion;


   @Override
   public void imprimirDetalles() {
       super.imprimirDetalles();
       System.out.println("Nro Edición: " + this.nroEdicion);
       System.out.println("----------------------------");

   }

    public Revista(String titulo, Long id, int anioPublicacion, Integer nroEdicion) {
        super(titulo, id, anioPublicacion);
        this.nroEdicion = nroEdicion;
    }
}
