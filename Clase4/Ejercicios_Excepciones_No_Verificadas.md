# Ejercicios de Excepciones Personalizadas No Verificadas en Java

Este documento contiene **dos ejercicios prácticos** para que trabajen con **excepciones personalizadas no verificadas**
(`RuntimeException`) en Java.\
Cada ejercicio está planteado con un **enunciado claro** y un
**esqueleto de código con TODOs** para guiar su implementación.

------------------------------------------------------------------------

## Ejercicio 1: Inscripción a un Curso Universitario

### Enunciado

Una universidad desea controlar el proceso de inscripción a sus cursos.\
Cada curso tiene un número limitado de cupos disponibles.

Crea un programa en Java que:\
1. Defina una **excepción personalizada no verificada**
(`CupoNoDisponibleException`) que se lance cuando un estudiante intente
inscribirse en un curso que ya no tenga cupos disponibles.\
2. Modele una clase `Curso` que tenga un atributo `cuposDisponibles` y
un método `inscribir(int cantidad)` para disminuir los cupos.\
3. Desde la clase `Main`, simula varias inscripciones y prueba el caso
en que se lance la excepción.

### Archivo sugerido: `InscripcionCurso.java`

``` java
// Paso 1: Crear la excepción personalizada
class CupoNoDisponibleException extends RuntimeException {
    // TODO: Crear un constructor que reciba un mensaje y lo envíe a la superclase
}

// Paso 2: Clase Curso
class Curso {
    // TODO: Crear un atributo privado para los cupos disponibles

    // TODO: Crear un constructor que reciba los cupos disponibles iniciales

    // TODO: Implementar un método inscribir(int cantidad) que:
    // - Verifique si la cantidad solicitada es mayor que los cupos disponibles
    // - Si es así, lance la excepción personalizada
    // - Si no, reste la cantidad y muestre los cupos restantes
}

// Paso 3: Clase principal
public class InscripcionCurso {
    public static void main(String[] args) {
        // TODO: Crear un objeto Curso con cupos iniciales
        // TODO: Probar una inscripción válida
        // TODO: Probar una inscripción inválida que dispare la excepción
    }
}
```

------------------------------------------------------------------------

##  Ejercicio 2: Sistema de Inventario de Tienda

### Enunciado

Una tienda en línea desea gestionar su inventario de productos.\
Cada producto tiene una cantidad limitada en stock.

Crea un programa en Java que:\
1. Defina una **excepción personalizada no verificada**
(`StockInsuficienteException`) que se lance cuando se intente vender más
unidades de un producto de las que hay disponibles.\
2. Modele una clase `Producto` que tenga un atributo `stock` y un método
`vender(int cantidad)` para disminuir el stock.\
3. Desde la clase `Main`, simula varias ventas y prueba el caso en que
se lance la excepción.

### Archivo sugerido: `InventarioTienda.java`

``` java
// Paso 1: Crear la excepción personalizada
class StockInsuficienteException extends RuntimeException {
    // TODO: Crear un constructor que reciba un mensaje y lo envíe a la superclase
}

// Paso 2: Clase Producto
class Producto {
    // TODO: Crear un atributo privado para el stock disponible

    // TODO: Crear un constructor que reciba el stock inicial

    // TODO: Implementar un método vender(int cantidad) que:
    // - Verifique si la cantidad solicitada es mayor que el stock disponible
    // - Si es así, lance la excepción personalizada
    // - Si no, reste la cantidad y muestre el stock restante
}

// Paso 3: Clase principal
public class InventarioTienda {
    public static void main(String[] args) {
        // TODO: Crear un objeto Producto con stock inicial
        // TODO: Probar una venta válida
        // TODO: Probar una venta inválida que dispare la excepción
    }
}
```
