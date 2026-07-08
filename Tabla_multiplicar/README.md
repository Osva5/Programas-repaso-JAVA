# Reporte - Tabla de Multiplicar

---

## Introducción

Programa de consola que solicita un número al usuario e imprime su tabla de multiplicar del 1 al 10. Incluye validación de entrada para asegurar que solo se ingresen números enteros y permite al usuario repetir el proceso con otro número.

---

## Entorno y requisitos

- **JDK:** Java 8 o superior
- **Compilación:** `javac Main.java validacion.java`
- **Ejecución:** `java Main`
- **Editor:** VS Code, NetBeans, IntelliJ IDEA o cualquier editor de texto

---

## Archivos del programa

| Archivo | Descripción |
|---|---|
| `validacion.java` | Utilidades de validación de entrada: `validaEntrada()` y `repetir()` para confirmar repetición |
| `Main.java` | Punto de entrada: solicita el número, genera la tabla y pregunta si desea continuar |

---

## validacion.java

Proporciona métodos de validación:
- `validaEntrada()`: Lee un entero desde consola, rechazando caracteres no numéricos (letras).
- `repetir()`: Valida que la respuesta a la pregunta de repetición sea 1 (sí) o 2 (no).
- `validaString()`: Método adicional para validar cadenas de texto (no utilizado directamente en `Main`).

## Main.java

Punto de entrada del programa. Solicita al usuario un número entero mediante `validaEntrada()`, luego imprime su tabla de multiplicar del 1 al 10 usando un bucle `for`. Al finalizar, pregunta si desea probar con otro número, repitiendo el ciclo en caso afirmativo.

---

## Conclusión

Se implementó un programa que genera tablas de multiplicar con validación de entrada robusta y ciclo de repetición, demostrando el uso de bucles `for`, entrada de usuario validada y separación de responsabilidades en clases auxiliares en Java.
