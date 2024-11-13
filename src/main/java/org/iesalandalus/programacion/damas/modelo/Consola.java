package org.iesalandalus.programacion.damas.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    //2-Constructor privado para evitar la creación de instancias ya que sólo contendrá métodos estáticos
    private Consola() {
    }
    //3-Menú para las opciones de la aplicación
    public static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear dama por defecto");
        System.out.println("2. Crear dama eligiendo el color");
        System.out.println("3. Mover dama");
        System.out.println("4. Salir");
    }

    //4-Elegir opción y verificar que esté en el rango
    private static int elegirOpcionMenu() {
        int opcion;

        do {
            System.out.print("Elige una opción (1-4): ");
            opcion = Entrada.entero();
            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción inválida. Debe ser un número entre 1 y 4.");
            }
        } while (opcion < 1 || opcion > 4);

        return opcion;
    }

    //4-Elegir opción de color y verificar que sea válido
    private static Color elegirColor()
    {
        int opcionColor;
        Color color=Color.BLANCO;

        do
        {
            System.out.println("Elige un color para la dama:");
            System.out.println("1. Blanca");
            System.out.println("2. Negra");
            System.out.print("Introduce el color (1 o 2): ");
            opcionColor = Entrada.entero();

            if (opcionColor != 1 && opcionColor != 2) {
                System.out.println("Opción inválida. Debes elegir 1 (Blanco) o 2 (Negro).");
            }
        }while (opcionColor<1 || opcionColor>2);

        if (opcionColor==1) {
            color=Color.BLANCO;
        } else color=Color.NEGRO;

        return color;
    }




}
