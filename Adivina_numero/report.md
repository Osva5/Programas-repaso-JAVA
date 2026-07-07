# Reporte - Adivina el Número

---

## Introducción

Juego interactivo de consola donde el jugador selecciona un nivel de dificultad (Fácil: 1-10, Medio: 1-50, Difícil: 1-100) y debe adivinar un número aleatorio generado por el programa. Recibe pistas de "mayor" o "menor" en cada intento hasta acertar, mostrando el número de intentos realizados.

---

## Entorno y requisitos

- **JDK:** Java 8 o superior
- **Compilación:** `javac Main.java controlJuego.java levelPlays.java`
- **Ejecución:** `java Main`
- **Editor:** VS Code, NetBeans, IntelliJ IDEA o cualquier editor de texto

---

## Archivos del programa

| Archivo | Descripción |
|---|---|
| `controlJuego.java` | Utilidades de validación de entrada: `validaEntrada()` asegura entrada entera, `rangoEntrada()` valida rangos y `volverJugar()` consulta si desea repetir |
| `levelPlays.java` | Lógica principal del juego: genera número aleatorio, solicita intentos, da pistas y cuenta intentos |
| `Main.java` | Punto de entrada: muestra menú de dificultades, procesa la elección y orquesta el flujo del juego |

---

## controlJuego.java

Proporciona métodos de validación de entrada:
- `validaEntrada()`: Lee un entero desde consola, rechazando letras o caracteres no numéricos.
- `rangoEntrada()`: Valida que un número esté dentro de un rango específico.
- `volverJugar()`: Pregunta al usuario si desea jugar otra partida y valida la respuesta.

## levelPlays.java

Implementa el ciclo principal del juego mediante el método `level()`. Genera un número aleatorio entre 1 y un máximo configurable (`nummax`), luego solicita intentos al jugador proporcionando pistas de "mayor" o "menor" hasta que acierta. Lleva el conteo de intentos y utiliza `controlJuego` para validar las entradas.

## Main.java

Punto de entrada del programa. Muestra un menú con tres niveles de dificultad más una opción para salir. Crea instancias de `controlJuego` y `levelPlays`, procesa la elección del usuario y se repite hasta que el jugador decide salir.

---

## Conclusión

Se implementó un juego completo de adivinanza con tres niveles de dificultad, validación de entrada robusta y ciclo de repetición, demostrando el uso de clases auxiliares, generación de números aleatorios y control de flujo en Java.
