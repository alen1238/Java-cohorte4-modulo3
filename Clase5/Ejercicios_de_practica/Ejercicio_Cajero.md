# Ejercicio: Cajero automático con excepciones personalizadas

## Enunciado
Retirar dinero de una cuenta.  

- Si la cuenta no existe (**checked**) → lanzar excepción personalizada.  
- Si el saldo es insuficiente (**unchecked**) → lanzar excepción personalizada.  

---

## CajeroApp.java
```java
public class CajeroApp {
    public static void main(String[] args) throws Exception {
        // TODO: Crear una instancia de Banco.
        // Paso: Declarar variable 'banco' del tipo Banco.
        // Paso: Inicializarla con el constructor por defecto.

        // TODO: Agregar al menos una cuenta.
        // Paso: Crear un objeto Cuenta con número de cuenta y saldo inicial (p. ej., 500).
        // Paso: Llamar al método agregarCuenta de Banco para registrarla.

        // TODO: Intentar hacer un retiro válido.
        // Paso: Llamar a banco.retirar("NumeroCuenta", monto).

        // TODO: Intentar hacer un retiro con saldo insuficiente.
        // Paso: Llamar a banco.retirar("NumeroCuenta", montoMayorAlSaldo).

        // TODO: Intentar hacer un retiro de una cuenta inexistente.
        // Paso: Llamar a banco.retirar("CuentaInexistente", monto).

        // TODO: Envolver las llamadas en try/catch.
        // Paso: Capturar CuentaNoEncontradaException (checked) e imprimir el mensaje.
        // Paso: (Opcional) Capturar SaldoInsuficienteException (unchecked) e imprimir el mensaje.
    }
}
```

---

## Cuenta.java
```java
public class Cuenta {
    private String numero;
    private double saldo;

    public Cuenta(String numero, double saldo) {
        // TODO: Guardar parámetros en los campos.
    }

    public String getNumero() {
        // TODO: Retornar el número de la cuenta.
    }

    public double getSaldo() {
        // TODO: Retornar el saldo actual.
    }

    public void retirar(double monto) {
        // TODO: Implementar la lógica de retiro.
        // Paso 1: Verificar si saldo < monto.
        // Paso 2: Si no hay suficiente, lanzar new SaldoInsuficienteException("Saldo insuficiente en la cuenta X").
        // Paso 3: Si hay suficiente, restar el monto al saldo.
    }
}
```

---

## Banco.java
```java
import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Cuenta> cuentas = new HashMap<>();

    public void agregarCuenta(Cuenta cuenta) {
        // TODO: Registrar la cuenta en el mapa 'cuentas'.
        // Paso 1: Obtener el número de la cuenta.
        // Paso 2: Insertar en el mapa: clave = número, valor = cuenta.
    }

    public void retirar(String numeroCuenta, double monto) throws CuentaNoEncontradaException {
        // TODO: Buscar la cuenta y gestionar el retiro.
        // Paso 1: Buscar en el mapa 'cuentas' usando el númeroCuenta.
        // Paso 2: Si no existe, lanzar new CuentaNoEncontradaException("La cuenta 'X' no existe").
        // Paso 3: Si existe, invocar cuenta.retirar(monto).
        // Paso 4: (Opcional) Imprimir un mensaje de éxito.
    }
}
```

---

## CuentaNoEncontradaException.java
```java
public class CuentaNoEncontradaException extends Exception {
    // TODO: Agregar constructor
    // Paso: Crear un constructor que reciba String mensaje y llame a super(mensaje).
}
```

---

## SaldoInsuficienteException.java
```java
public class SaldoInsuficienteException extends RuntimeException {
    // TODO: Agregar constructor
    // Paso: Crear un constructor que reciba String mensaje y llame a super(mensaje).
}
```
