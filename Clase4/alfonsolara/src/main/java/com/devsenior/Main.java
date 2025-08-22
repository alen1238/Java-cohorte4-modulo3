package com.devsenior;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DivisionInvalidadException {
        
        ejemplo2();
    }

    public static void ejemplo1() {
       Scanner scanner = new Scanner(System.in);
        boolean lecturaExitosa = false;
        

       do {
            try {
            System.out.println("Ingrese un numerador:");
            int numerador = scanner.nextInt();// excepción si no es un entero

            System.out.println("Ingrese un denominador:");
            int denominador = scanner.nextInt(); // excepción si no es un entero
            int resultado = numerador / denominador; // excepción si denominador es cero
            System.out.println("El resultado de la división es: " + resultado);
            lecturaExitosa = true; // Si llegamos aquí, la lectura fue exitosa
            
        } catch (ArithmeticException e) {
            System.out.println("Error: La división por cero no es posible" + e.getMessage());
             scanner.nextLine(); // Limpiar el buffer del scanner
            scanner.nextLine(); // Limpiar el buffer del scanner
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese números enteros.");
             scanner.nextLine(); // Limpiar el buffer del scanner
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
             scanner.nextLine(); // Limpiar el buffer del scanner
        } 
       } while (lecturaExitosa== false);
      
        
        scanner.close();
    }

    public static void ejemplo2()  {
       Scanner scanner = new Scanner(System.in);

       
        System.out.println("Ingrese un numerador:");
        int numerador = scanner.nextInt(); // excepción si no es un entero

        System.out.println("Ingrese un denominador:");
        int denominador = scanner.nextInt(); // excepción si no es un entero

        if (denominador == 0) {
            throw new DivisionInvalidadException("El denominador no puede ser cero.");
        }

        int resultado = numerador / denominador; // excepción si denominador es cero
        System.out.println("El resultado de la división es: " + resultado);
      
    }
}