package com.dev;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("Laptop", 10));
        inventario.agregarProducto(new Producto("Smartphone", 20)); 
        inventario.agregarProducto(new Producto("Tablet", 15));
        inventario.agregarProducto(new Producto("Monitor", 5));
        inventario.agregarProducto(new Producto("Teclado", 25));
        inventario.agregarProducto(new Producto("Ratón", 30));

        
        try {
            inventario.procesarProducto("Laptop", 20);
            inventario.procesarProducto("Smartphone", 5);
            inventario.procesarProducto("Tablet", 1);
            inventario.procesarProducto("Monitor", 3);
            inventario.procesarProducto("Teclado", 10);
            inventario.procesarProducto("Ratón", 15);
            inventario.procesarProducto("Cámara", 1); // Producto no existente
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println(e.getMessage());
        }

    }
}