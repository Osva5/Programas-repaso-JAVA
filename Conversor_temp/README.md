# Reporte - Conversor de Temperatura

---

## Introducción

Conversor de temperatura entre grados Fahrenheit y Celsius mediante un menú interactivo de consola. El usuario elige la dirección de la conversión, ingresa el valor y obtiene el resultado formateado con dos decimales, con opción a realizar otra conversión.

---

## Entorno y requisitos

- **JDK:** Java 8 o superior
- **Compilación:** `javac Main.java conversiones.java`
- **Ejecución:** `java Main`
- **Editor:** VS Code, NetBeans, IntelliJ IDEA o cualquier editor de texto

---

## Archivos del programa

| Archivo | Descripción |
|---|---|
| `conversiones.java` | Lógica de conversión con métodos Fahrenheit-Celsius, validación de entrada y menú |
| `Main.java` | Punto de entrada: bucle principal que muestra el menú y ejecuta la conversión seleccionada |

---

## conversiones.java

Proporciona toda la lógica de conversión y utilidades:
- `valiLetras()`: Lee un número `double` desde consola, rechazando entradas no numéricas.
- `validar()`: Pregunta al usuario si desea realizar otra conversión y valida la respuesta.
- `menu()`: Muestra el menú principal (F→C, C→F, Salir) y valida la elección.
- `fahACel()`: Convierte Fahrenheit a Celsius usando la fórmula `(F - 32) / 1.8`.
- `celAFah()`: Convierte Celsius a Fahrenheit usando la fórmula `(C * 9/5) + 32`.

Ambos métodos de conversión imprimen el resultado formateado a dos decimales.

## Main.java

Punto de entrada del programa. Crea una instancia de `conversiones`, itera sobre el menú y llama al método de conversión correspondiente según la opción del usuario. Finaliza cuando el usuario selecciona la opción de salir.

---

## Conclusión

Se implementó un conversor de temperatura funcional con validación de entrada robusta, formato de salida con precisión decimal y un menú interactivo, demostrando el manejo de operaciones matemáticas y control de flujo en Java.
