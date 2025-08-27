package com.devsenior;
import org.apache.logging.log4j.*;


public class Empleado {
    
    private static final Logger logger = LogManager.getLogger(Empleado.class);
   
    // Atributos: nombre, eddad, salario
    private String nombre;
    private int edad;   
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;

        if(edad < 18) {
            logger.warn("El empleado " + nombre + " es menor de edad.");
        }
    }

    //aumentrarSalario
    public void aumentarSalario(double cantidad) {
        if(cantidad < 0) {
            logger.warn("No se puede aumentar el salario en una cantidad negativa: " + cantidad);
            return;
        }
        
        this.salario += cantidad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
