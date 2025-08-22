# Ejercicio: Préstamo de libros con excepciones personalizadas

## Enunciado
Prestar libros.  
- Si el libro no existe (checked) → lanzar excepción personalizada.  
- Si el libro está agotado (unchecked) → lanzar excepción personalizada.  

---

## BibliotecaApp.java
```java
public class BibliotecaApp {
    public static void main(String[] args) throws Exception {
        // TODO: Crear una instancia de Biblioteca.
        // Paso: Declarar variable 'biblioteca' del tipo Biblioteca.
        // Paso: Inicializarla con el constructor por defecto.

        // TODO: Agregar al menos un libro.
        // Paso: Crear un objeto Libro con título y cantidad inicial (p. ej., 1).
        // Paso: Llamar al método agregarLibro de Biblioteca para registrarlo.

        // TODO: Intentar prestar un libro existente (debe funcionar si hay stock).
        // Paso: Llamar a biblioteca.prestarLibro("TítuloExistente").

        // TODO: Intentar prestar el mismo libro otra vez (debe disparar agotado si ya no hay stock).
        // Paso: Llamar de nuevo a biblioteca.prestarLibro("TítuloExistente").

        // TODO: Intentar prestar un libro que no existe (debe lanzar checked).
        // Paso: Llamar a biblioteca.prestarLibro("TituloInexistente").

        // TODO: Envolver las llamadas de préstamo en try/catch.
        // Paso: Capturar LibroNoEncontradoException (checked) e imprimir el mensaje.
        // Paso: (Opcional) Capturar LibroAgotadoException (unchecked) e imprimir el mensaje.
    }
}
```

---

## Libro.java
```java
public class Libro {
    private String titulo;
    private int cantidad;

    public Libro(String titulo, int cantidad) {
        // TODO: Guardar parámetros en los campos.
       
    }

    public String getTitulo() {
        // TODO: Retornar el título del libro.
        
    }

    public int getCantidad() {
        // TODO: Retornar la cantidad disponible.
        
    }

    public void prestar() {
        // TODO: Implementar la lógica de préstamo.
        // Paso 1: Verificar si 'cantidad' es menor o igual a 0.
        // Paso 2: Si no hay ejemplares, lanzar new LibroAgotadoException("El libro 'X' está agotado").
        // Paso 3: Si hay ejemplares, restar 1 a 'cantidad'.
        //("Pendiente de implementar");
    }
}
```

---

## Biblioteca.java
```java
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Libro> libros = new HashMap<>();

    public void agregarLibro(Libro libro) {
        // TODO: Registrar el libro en el mapa 'libros'.
        // Paso 1: Obtener el título del libro.
        // Paso 2: Insertar en el mapa: clave = título, valor = libro.
    }

    public void prestarLibro(String titulo) throws LibroNoEncontradoException {
        // TODO: Buscar el libro y gestionar el préstamo.
        // Paso 1: Buscar en el mapa 'libros' usando el 'titulo'.
        // Paso 2: Si el resultado es null, lanzar new LibroNoEncontradoException("El libro 'X' no existe").
        // Paso 3: Si existe, invocar libro.prestar() para que verifique stock.
        // Paso 4: (Opcional) Imprimir un mensaje de éxito.
    }
}
```

---

## LibroNoEncontradoException.java
```java
public class LibroNoEncontradoException extends Exception {
    // TODO: Agregar constructor
    // Paso: Crear un constructor que reciba String mensaje y llame a super(mensaje).
}
```

---

## LibroAgotadoException.java
```java
public class LibroAgotadoException extends RuntimeException {
    // TODO: Agregar constructor.
    // Paso: Crear un constructor que reciba String mensaje y llame a super(mensaje).
}
```
