package com.dev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {    
      
        try {
            leerArchivo("datos.txt");
            System.out.println("Archivo leído correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("Fin del programa.");
    }

    public static void leerArchivo(String nombreArchivo) throws IOException{
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while((linea = lector.readLine()) != null) {
                 System.out.println(linea);
        }
        lector.close();
    }
}