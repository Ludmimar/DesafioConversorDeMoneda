package com.alura.desafioconversordemoneda.modelos;

import java.util.Scanner;

public class Menu {
    public static int mostrarMenu(Scanner scanner) {
        System.out.println("\u001B[32m" + "***********************************");
        System.out.println("\u001B[31m" + "Bienvenido al conversor de monedas.");
        System.out.println("\u001B[32m" + "1. Dolar => " + "\u001B[34m" + "Peso argentino");
        System.out.println("\u001B[32m" + "2. Peso argentino =>" + "\u001B[34m" + "Dolar");
        System.out.println("\u001B[32m" + "3. Dolar => " + "\u001B[34m" + "Real brasileño");
        System.out.println("\u001B[32m" + "4. Real brasileño => " + "\u001B[34m" + "Dolar");
        System.out.println("\u001B[32m" + "5. Dolar => " + "\u001B[34m" + "Peso Boliviano");
        System.out.println("\u001B[32m" + "6. Peso Boliviano => " + "\u001B[34m" + "Dolar");
        System.out.println("\u001B[32m" + "7. Dolar => " + "\u001B[34m" + "Boliviano boliviano");
        System.out.println("\u001B[32m" + "8. Boliviano boliviano => " + "\u001B[34m" + "Dolar");
        System.out.println("\u001B[32m" + "9. Dolar => " + "\u001B[34m" + "Peso chileno");
        System.out.println("\u001B[32m" + "10. Peso chileno => " + "\u001B[34m" + "Dolar");
        System.out.println("\u001B[32m" + "11. Dolar => " + "\u001B[34m" + "Peso colombiano");
        System.out.println("\u001B[32m" + "12. Peso colombiano => " + "\u001B[34m" + "Dolar");
        System.out.println("\u001B[31m" + "13. Salir");
        System.out.println("\u001B[32m" + "***********************************");

        int opcion = 0;

        while (opcion < 1 || opcion > 13) {
            System.out.println("\u001B[36m" +"Selecciona una opción entre 1 y 13:");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion < 1 || opcion > 13) {
                    System.out.println("\u001B[31m" + "Opción inválida. Por favor, elige un número entre 1 y 13.");
                }
            } else {
                System.out.println("\u001B[31m" + "Entrada no válida. Por favor, ingresa un número entre 1 y 13.");
                scanner.next();
            }
        }

        return opcion;
    }

    public static double obtenerCantidad(Scanner scanner) {
        double cantidad = 0;

        while (cantidad <= 0) {
            System.out.println("\u001B[34m" + "Ingresa la cantidad que deseas convertir:");
            if (scanner.hasNextDouble()) {
                cantidad = scanner.nextDouble();
                if (cantidad <= 0) {
                    System.out.println("\u001B[31m" + "La cantidad debe ser mayor que cero.");
                }
            } else {
                System.out.println("\u001B[31m" + "Entrada no válida. Por favor, ingresa un número decimal.");
                scanner.next();
            }
        }

        return cantidad;
    }
}