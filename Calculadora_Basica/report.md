# Reporte - Calculadora Básica

---

## Introducción

Calculadora básica de consola que realiza las cuatro operaciones aritméticas fundamentales: suma, resta, multiplicación y división. El usuario selecciona la operación desde un menú, ingresa dos números y obtiene el resultado, con opción de repetir la operación.

---

## Entorno y requisitos

- **JDK:** Java 8 o superior
- **Compilación:** `javac Main.java operaciones.java`
- **Ejecución:** `java Main`
- **Editor:** VS Code, NetBeans, IntelliJ IDEA o cualquier editor de texto

---

## Archivos del programa

| Archivo | Descripción |
|---|---|
| `operaciones.java` | Lógica aritmética con métodos para suma, resta, multiplicación y división, más validación de entrada |
| `Main.java` | Punto de entrada: menú interactivo que delega en la clase `operaciones` |

---

## operaciones.java

Contiene la lógica aritmética del programa:
- `pedirNumero()`: Lee dos números enteros desde teclado.
- `suma()`: Realiza la suma y muestra el resultado, con opción a repetir.
- `resta()`: Realiza la resta y muestra el resultado, con opción a repetir.
- `multiplicacion()`: Realiza la multiplicación y muestra el resultado, con opción a repetir.
- `division()`: Realiza la división con validación de división entre cero, evitando `ArithmeticException`.
- `validacion()`: Método auxiliar que estandariza la pregunta de repetición para cada operación.

## Main.java

Punto de entrada del programa. Muestra un menú con cinco opciones (Sumar, Restar, Multiplicar, Dividir, Salir), lee la elección del usuario mediante `Scanner` y delega en el método correspondiente de `operaciones`. El ciclo se repite hasta que el usuario elige salir.

---

## Conclusión

Se implementó una calculadora funcional con las cuatro operaciones básicas, validación de entrada y manejo de división entre cero, demostrando el uso de menús interactivos, delegación de responsabilidades en clases auxiliares y control de bucles en Java.
