# Guía de Pruebas Unitarias para Plataforma de Gestión de Cursos

Apreciado estudiante, aquí tienes una guía para realizar las pruebas unitarias de las clases de servicios del proyecto **Plataforma de Gestión de Cursos en Línea** usando **JUnit 5**. Se presentan los métodos de prueba sugeridos y los comentarios para que los estudiantes implementen sus propios tests.

## 1. CursoServiceTest.java

```java
// Importar dependencias necesarias
// import org.junit.jupiter.api.*;
// import static org.junit.jupiter.api.Assertions.*;

public class CursoServiceTest {

    // Prueba: agregar un curso correctamente
    // - Crear instancia de CursoService
    // - Agregar un curso
    // - Usar assertEquals para validar que la lista de cursos aumentó en 1

    // Prueba: buscar un curso existente por código
    // - Crear instancia de CursoService y agregar un curso
    // - Buscar el curso por código
    // - Usar assertNotNull para confirmar que se encontró el curso

    // Prueba: buscar un curso que no existe
    // - Crear instancia de CursoService sin agregar cursos
    // - Intentar buscar un curso inexistente
    // - Usar assertThrows para verificar que se lance CursoLlenoException

    // Prueba: listar todos los cursos
    // - Crear instancia de CursoService y agregar varios cursos
    // - Usar assertEquals para validar la cantidad de cursos listados
}
```

## 2. InscripcionServiceTest.java

```java
// Importar dependencias necesarias
// import org.junit.jupiter.api.*;
// import static org.junit.jupiter.api.Assertions.*;

public class InscripcionServiceTest {

    // Prueba: inscribir un estudiante en un curso disponible
    // - Crear CursoService y agregar un curso
    // - Crear InscripcionService
    // - Crear un estudiante y realizar la inscripción
    // - Usar assertEquals para validar que la lista de inscripciones aumentó en 1

    // Prueba: intentar inscribir un estudiante en un curso lleno
    // - Crear curso con capacidad limitada
    // - Inscribir estudiantes hasta llenar la capacidad
    // - Usar assertThrows(CursoLlenoException.class, ...) para validar la excepción

    // Prueba: buscar inscripciones por un estudiante con inscripciones
    // - Crear curso, estudiante y realizar inscripción
    // - Buscar inscripciones por el estudiante
    // - Usar assertFalse para validar que la lista no está vacía

    // Prueba: buscar inscripciones por un estudiante sin inscripciones
    // - Crear un estudiante que no tenga inscripciones
    // - Intentar buscar sus inscripciones
    // - Usar assertThrows(EstudianteNoEncontradoException.class, ...) para validar la excepción

    // Prueba: listar todas las inscripciones
    // - Crear varias inscripciones
    // - Usar assertEquals para validar la cantidad de inscripciones listadas
}
```

## Notas adicionales

* Cada prueba debe ejecutarse de manera **independiente**, creando sus propios datos de prueba.
* Se recomienda usar los métodos **assertEquals, assertNotNull, assertTrue, assertFalse y assertThrows** para validar los resultados.
* Mantener los tests simples y claros para facilitar la comprensión de la lógica de negocio.
* Registrar eventos importantes usando Log4j 2 no es obligatorio en los tests, pero puede ayudar a depurar fallos.
