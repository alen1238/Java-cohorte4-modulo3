package com.devsenior;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
       
        CuentaBancaria cuenta = new CuentaBancaria(100);

        try {
            cuenta.Retirar(20);
        } catch (SaldoInsuficienteException e) {
            // TODO Auto-generated catch block
            
        } 


    }






    private static void ejemplo1() {
        int a = 12;
        int b =3;
        int variableInutil = 3;

        System.out.println(a/b);
        System.out.println("Fin del programa");
    }

     private static void ejemplo2() {
         
       try {
             String texto = "abc";
             int numero = Integer.parseInt(texto);

            int resultado = 10/0;

            int[] arreglo = {1,2,3};
            System.out.println(arreglo[5]);

            FileReader archivo = new FileReader("archivo.txt");

       } catch (NumberFormatException e) {
            System.out.println("Error en el formato del número " + e.getMessage());
       } catch (ArithmeticException e) {
            System.out.println("Error de división por cero");
       } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de los límites del arreglo");
       } catch(Exception e) {
            System.out.println("Archivo no encontrado");
       } 

       System.out.println("Fin del programa");
     }

}