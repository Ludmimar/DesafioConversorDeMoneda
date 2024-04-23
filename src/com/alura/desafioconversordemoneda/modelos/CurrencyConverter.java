package com.alura.desafioconversordemoneda.modelos;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int opcion = Menu.mostrarMenu(scanner);

            if (opcion == 13) {
                System.out.println("Saliendo...");
                continuar = false;
                break;
            }

            double cantidad = Menu.obtenerCantidad(scanner);

            CurrencyConversion currencyConversion = new CurrencyConversion();
            currencyConversion.convertir(opcion, cantidad);
        }

        scanner.close();
        System.out.println("Gracias por usar el conversor de monedas.");
    }
}