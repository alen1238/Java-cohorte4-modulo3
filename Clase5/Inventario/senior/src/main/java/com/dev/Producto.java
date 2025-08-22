package com.dev;

public class Producto {
    private String nombre;
    private int cantidadDisponible;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void reducirCantidad(int cantidad) throws StockInsuficienteException {
        if (this.cantidadDisponible < cantidad) {
            throw new StockInsuficienteException("Stock insuficiente para el producto: " + nombre);
        }
        this.cantidadDisponible -= cantidad;
    }
}
