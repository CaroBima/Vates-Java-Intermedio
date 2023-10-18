package com.curso.clase14Collections;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections {
    //List, Set, Map, Queue
    //implementaciones concretas: ArrayList, LinkedList
    //List por ej es una interfaz, ArrayList es una implementacion
    //Colecciones de comparacion y clasificacion: TreeSet, TreeMap
    //Colecciones de clave/valor: Map, HashMap, TreeMap


    //crear una lista de tareas que permita agregar, mostrar y eliminar tareas
    public static void main(String[] args) {
        List<String> listaDeTareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Lista de tareas: ");
            for(int i=0; i<listaDeTareas.size(); i++){
                System.out.println((i+1) + ". " + listaDeTareas.get(i));
            }
            System.out.println("Opciones: ");
            System.out.println("1 - Agregar tarea: ");
            System.out.println("2 - Eliminar Tarea: ");
            System.out.println("3 - Salir: ");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    System.out.print("Ingrese la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    listaDeTareas.add(nuevaTarea);
                    System.out.println("Tarea agregada");
                    break;
                case 2:
                    if(listaDeTareas.isEmpty()){
                        System.out.println("La lista está vacía");
                    }else{
                        System.out.print("Ingrese el número de tarea a eliminar");
                        int numeroTarea = scanner.nextInt();
                        if(numeroTarea >=1 && numeroTarea<= listaDeTareas.size()){
                            String tareaEliminada = listaDeTareas.remove(numeroTarea-1);
                            System.out.println("Tarea eliminada: " + tareaEliminada);
                        }else{
                            System.out.println("Numero de tarea invalida");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    System.exit(0);
                default:
                    System.out.println("Opcion Invalida. Intente nuevamente...");
            }
        }
    }
}
